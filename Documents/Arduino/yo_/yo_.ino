#define RELE_DERECHA 7     // Pin del relé para giro a la derecha
#define RELE_IZQUIERDA 8   // Pin del relé para giro a la izquierda
#define BOTON_INICIAR 2    // Pin del botón para iniciar la secuencia
#define BOTON_DETENER 3    // Pin del botón para detener la secuencia

bool motor_encendido = false; // Estado del motor (apagado al inicio)

void setup() {
  // Configurar pines de los relés como salida
  pinMode(RELE_DERECHA, OUTPUT);
  pinMode(RELE_IZQUIERDA, OUTPUT);

  // Configurar pines de los botones como entrada con resistencia pull-up
  pinMode(BOTON_INICIAR, INPUT_PULLUP);
  pinMode(BOTON_DETENER, INPUT_PULLUP);

  // Asegurarse de que los relés estén apagados al inicio
  digitalWrite(RELE_DERECHA, LOW);
  digitalWrite(RELE_IZQUIERDA, LOW);
}

void loop() {
  // Leer el estado de los botones
  bool estado_boton_iniciar = digitalRead(BOTON_INICIAR);
  bool estado_boton_detener = digitalRead(BOTON_DETENER);

  // Si se presiona el botón de iniciar, activar el motor
  if (estado_boton_iniciar == LOW) {
    motor_encendido = true;
  }

  // Si se presiona el botón de detener, apagar el motor inmediatamente
  if (estado_boton_detener == LOW) {
    motor_encendido = false;
    // Asegurarse de que ambos relés estén apagados
    digitalWrite(RELE_DERECHA, LOW);
    digitalWrite(RELE_IZQUIERDA, LOW);
  }

  // Ejecutar la secuencia del motor si está encendido
  if (motor_encendido) {
    // Giro a la derecha (2 veces, 5 segundos cada vez)
    for (int i = 0; i < 2; i++) {
      if (!motor_encendido) break; // Verificar si se detuvo el motor
      digitalWrite(RELE_DERECHA, HIGH); // Activa el relé de la derecha
      delay(5000);                     // Espera 5 segundos
      digitalWrite(RELE_DERECHA, LOW); // Desactiva el relé
      delay(1000);                     // Pausa entre giros
    }

    // Giro a la izquierda (2 veces, 5 segundos cada vez)
    for (int i = 0; i < 2; i++) {
      if (!motor_encendido) break; // Verificar si se detuvo el motor
      digitalWrite(RELE_IZQUIERDA, HIGH); // Activa el relé de la izquierda
      delay(5000);                        // Espera 5 segundos
      digitalWrite(RELE_IZQUIERDA, LOW);  // Desactiva el relé
      delay(1000);                        // Pausa entre giros
    }

    // Detener el motor al finalizar la secuencia
    motor_encendido = false;
  }
}
