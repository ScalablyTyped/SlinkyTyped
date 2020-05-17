package typingsSlinky.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout extends js.Object {
  var layout: IsFullscreen = js.native
  var selectedPanel: js.Any = js.native
  var theme: js.Any = js.native
  var ui: DocsMode = js.native
}

object Layout {
  @scala.inline
  def apply(layout: IsFullscreen, selectedPanel: js.Any, theme: js.Any, ui: DocsMode): Layout = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], selectedPanel = selectedPanel.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  implicit class LayoutOps[Self <: Layout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayout(value: IsFullscreen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedPanel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTheme(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUi(value: DocsMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

