package fdez.collados.fco.javier.simpletextapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import fdez.collados.fco.javier.simpletextapp.ui.theme.SimpleTextAppTheme
import fdez.collados.fco.javier.simpletextapp.views.Home

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleTextAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val message = stringResource(R.string.message)
                    val from = stringResource(R.string.signature)
                    Home(
                        message,
                        from,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}