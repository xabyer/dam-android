package fdez.collados.fco.javier.t01p02tabs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import fdez.collados.fco.javier.t01p02tabs.ui.theme.T01p02TabsTheme
import fdez.collados.fco.javier.t01p02tabs.views.tabs.TabsView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            T01p02TabsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TabsView(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
