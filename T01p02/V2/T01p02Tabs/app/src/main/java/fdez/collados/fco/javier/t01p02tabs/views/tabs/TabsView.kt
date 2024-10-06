package fdez.collados.fco.javier.t01p02tabs.views.tabs

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import fdez.collados.fco.javier.t01p02tabs.R
import fdez.collados.fco.javier.t01p02tabs.views.article.ArticleView
import fdez.collados.fco.javier.t01p02tabs.views.quadrant.QuadrantView
import fdez.collados.fco.javier.t01p02tabs.views.taskmanager.TaskManagerView

@Composable
fun TabsView(@Suppress("UNUSED_PARAMETER") modifier: Modifier = Modifier) {

    var selectedTab by remember { mutableIntStateOf(0) }
    val tabs = listOf("Article", "Quadrant", "Task Manager")

    Column {

        TabRow(
            selectedTabIndex = selectedTab,
            contentColor = Color.Black,
            containerColor = Color.LightGray,
            indicator = { tabPositions ->

                TabRowDefaults.SecondaryIndicator(
                    Modifier.tabIndicatorOffset( tabPositions[selectedTab] )
                )
            }
        ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTab == index,
                    onClick = {
                        selectedTab = index
                    },
                    text = {
                        Text( text = title )
                    }
                )
            }
        }

        when(selectedTab) {

            0 -> ArticleView(
                painterResource(R.drawable.bg_compose_background),
                stringResource(R.string.title),
                stringResource(R.string.short_paragraph),
                stringResource(R.string.paragraph_compose_ui)
            )
            1 -> QuadrantView()
            2 -> TaskManagerView(
                painterResource(R.drawable.ic_task_completed),
                stringResource(R.string.tasks_completed),
                stringResource(R.string.nice_work)
            )
        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TabsViewPreview() {
    TabsView()
}