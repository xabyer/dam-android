package fdez.collados.fco.javier.t01p02tabs.views.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter

@Composable
fun ArticleImage(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painter,
            contentDescription = contentDescription
        )
    }

}