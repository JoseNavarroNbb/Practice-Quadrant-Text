package com.example.practicequadranttext
// Importaciones necesarias para la aplicación Android
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practicequadranttext.ui.theme.PracticeQuadrantTextTheme

// Clase principal que hereda de ComponentActivity para la actividad principal de Android
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Establecer el contenido de la actividad con la función setContent de Compose
        setContent {
            PracticeQuadrantTextTheme {
                // Crear un contenedor Surface que ocupa toda la pantalla
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    // El color del fondo es obtenido del tema MaterialTheme
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Llamar a la función ComposeQuadrantApp para construir la interfaz de usuario
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

// Función principal para construir la interfaz de usuario con Compose
@Composable
fun ComposeQuadrantApp() {
    // Columna principal que contiene dos filas de tarjetas
    Column(Modifier.fillMaxWidth()) {
        // Primera fila de tarjetas
        Row(Modifier.weight(1f)) {
            // Llamar a la función ComposableInfoCard para mostrar la primera tarjeta
            ComposableInfoCard(
                title = stringResource(R.string.first_title),
                description = stringResource(R.string.first_description),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            // Llamar a la función ComposableInfoCard para mostrar la segunda tarjeta
            ComposableInfoCard(
                title = stringResource(R.string.second_title),
                description = stringResource(R.string.second_description),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        // Segunda fila de tarjetas
        Row(Modifier.weight(1f)) {
            // Llamar a la función ComposableInfoCard para mostrar la tercera tarjeta
            ComposableInfoCard(
                title = stringResource(R.string.third_title),
                description = stringResource(R.string.third_description),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            // Llamar a la función ComposableInfoCard para mostrar la cuarta tarjeta
            ComposableInfoCard(
                title = stringResource(R.string.fourth_title),
                description = stringResource(R.string.fourth_description),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

// Función privada para mostrar una tarjeta de información
@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    // Columna que representa la tarjeta, con fondo y relleno específicos
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Texto del título con estilo negrita
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        // Texto de la descripción justificado en el centro
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

// Función de vista previa para ComposeQuadrantApp
@Preview(showBackground = true)
@Composable
fun ComposeQuadrantAppPreview() {
    PracticeQuadrantTextTheme {
        ComposeQuadrantApp()
    }
}
