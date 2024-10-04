package fdez.collados.fco.javier.t01p02.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import fdez.collados.fco.javier.t01p02.R
import fdez.collados.fco.javier.t01p02.views.article.Article
import fdez.collados.fco.javier.t01p02.views.taskmanager.TaskManager

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

    /*TaskManager(
        painterResource(R.drawable.ic_task_completed),
        stringResource(R.string.tasks_completed),
        stringResource(R.string.nice_work)
    )*/

}