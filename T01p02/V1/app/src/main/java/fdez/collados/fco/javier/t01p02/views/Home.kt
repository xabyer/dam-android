package fdez.collados.fco.javier.t01p02.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import fdez.collados.fco.javier.t01p02.R
import fdez.collados.fco.javier.t01p02.views.article.Article

@Composable
fun Home(@Suppress("UNUSED_PARAMETER") modifier: Modifier = Modifier) {
    val title = stringResource(R.string.title)
    val shortParagraph = stringResource(R.string.short_paragraph)
    val paragraphComposeUi = stringResource(R.string.paragraph_compose_ui)

    Article(
        painterResource(R.drawable.bg_compose_background),
        title,
        shortParagraph,
        paragraphComposeUi
    )

}