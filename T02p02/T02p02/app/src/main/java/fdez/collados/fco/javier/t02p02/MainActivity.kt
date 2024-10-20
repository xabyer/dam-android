package fdez.collados.fco.javier.t02p02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import fdez.collados.fco.javier.t02p02.ui.theme.T02p02Theme
import fdez.collados.fco.javier.t02p02.views.HomeView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            T02p02Theme {
                HomeView()
            }
        }
    }
}
