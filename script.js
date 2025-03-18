document.addEventListener("DOMContentLoaded", () => {
    // Objeto que almacena referencias a los elementos del DOM
    const elements = {
        taskDesc: document.getElementById("task-desc"),
        taskDate: document.getElementById("task-date"),
        taskTime: document.getElementById("task-time"),
        taskStatus: document.getElementById("task-status"),
        addTaskBtn: document.getElementById("addTaskBtn"),
        taskLists: {
            pendiente: document.getElementById("pendientes"),
            "en-proceso": document.getElementById("en-proceso"),
            realizada: document.getElementById("realizadas"),
        },
    };

    // Verifica si los contenedores de tareas están presentes en el DOM
    if (!Object.values(elements.taskLists).every(el => el)) return console.error("❌ ERROR: Faltan contenedores");
    
    // Agrega un evento al botón para agregar tareas
    elements.addTaskBtn.addEventListener("click", addTask);
    
    // Carga las tareas almacenadas en localStorage al cargar la página
    loadTasks();

    // Función para agregar una nueva tarea
    function addTask() {
        const { taskDesc, taskDate, taskTime, taskStatus } = elements;
        
        // Crea un objeto con los datos de la nueva tarea
        const newTask = {
            description: taskDesc.value.trim(), 
            date: taskDate.value, 
            time: taskTime.value, 
            status: taskStatus.value
        };
        
        // Verifica si los campos obligatorios están completos
        if (!newTask.description || !newTask.date || !newTask.time) {
            return alert("⚠️ Completa todos los campos.");
        }
        
        // Guarda la tarea en localStorage y la muestra en pantalla
        saveTask(newTask);
        renderTask(newTask);
        
        // Limpia los campos del formulario después de agregar la tarea
        [taskDesc, taskDate, taskTime].forEach(input => input.value = "");
    }

    // Función para guardar una tarea en localStorage
    function saveTask(task) {
        const tasks = JSON.parse(localStorage.getItem("tasks")) || [];
        localStorage.setItem("tasks", JSON.stringify([...tasks, task]));
    }

    // Función para cargar las tareas almacenadas en localStorage
    function loadTasks() {
        (JSON.parse(localStorage.getItem("tasks")) || []).forEach(renderTask);
    }

    // Función para renderizar (mostrar) una tarea en la lista correspondiente
    function renderTask(task) {
        const taskContainer = elements.taskLists[task.status];
        if (!taskContainer) return console.error(`❌ ERROR: No existe el contenedor '${task.status}'`);

        // Crea el elemento de tarea en la lista
        const taskElement = document.createElement("li");
        taskElement.className = `task-item ${task.status}`;
        taskElement.innerHTML = `
            <strong>${task.description}</strong> - ${task.date} ${task.time}
            <span class="task-time">${calculateRemainingTime(task)}</span>
            <select class="status-select">
                ${["pendiente", "en-proceso", "realizada"].map(s => `<option value="${s}" ${task.status === s ? "selected" : ""}>${s.replace("-", " ")}</option>`).join("")}
            </select>
            <button class="delete-btn">Eliminar</button>
        `;
        
        // Agrega eventos para cambiar el estado de la tarea y eliminarla
        taskElement.querySelector(".status-select").addEventListener("change", e => updateTaskStatus(task, e.target.value, taskElement));
        taskElement.querySelector(".delete-btn").addEventListener("click", () => deleteTask(task, taskElement));
        
        // Agrega la tarea al contenedor correspondiente
        taskContainer.appendChild(taskElement);
    }

    // Función para calcular el tiempo restante hasta la fecha y hora de la tarea
    function calculateRemainingTime({ date, time }) {
        const diffMs = new Date(`${date}T${time}`) - new Date();
        return diffMs <= 0 ? "Expirado" : `${Math.floor(diffMs / 3600000)}h ${Math.floor((diffMs % 3600000) / 60000)}m restantes`;
    }

    // Función para actualizar el estado de una tarea
    function updateTaskStatus(task, newStatus, element) {
        task.status = newStatus;
        saveTasks(getTasks().map(t => isSameTask(t, task) ? task : t)); // Actualiza en localStorage
        element.remove(); // Elimina el elemento actual
        renderTask(task); // Vuelve a mostrarlo en la lista correspondiente
    }

    // Función para eliminar una tarea
    function deleteTask(task, element) {
        saveTasks(getTasks().filter(t => !isSameTask(t, task))); // Elimina de localStorage
        element.remove(); // Elimina la tarea de la lista visualmente
    }

    // Función para obtener todas las tareas almacenadas en localStorage
    function getTasks() {
        return JSON.parse(localStorage.getItem("tasks")) || [];
    }

    // Función para guardar una lista de tareas en localStorage
    function saveTasks(tasks) {
        localStorage.setItem("tasks", JSON.stringify(tasks));
    }

    // Función para verificar si dos tareas son iguales
    function isSameTask(a, b) {
        return a.description === b.description && a.date === b.date && a.time === b.time;
    }
});



