package fdez.collados.fco.javier.t01p02.views.article

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import fdez.collados.fco.javier.t01p02.R

@Composable
fun ArticleImage(
    painter: Painter,
    contentDescription: String?, modifier:
    Modifier = Modifier
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


@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ArticleImagePreview() {
    ArticleImage(
        painterResource(R.drawable.bg_compose_background),
        null,
    )
}