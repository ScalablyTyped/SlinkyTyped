package typingsSlinky.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLayout extends js.Object {
  var layout: AnonIsFullscreen = js.native
  var selectedPanel: js.Any = js.native
  var theme: js.Any = js.native
  var ui: AnonDocsMode = js.native
}

object AnonLayout {
  @scala.inline
  def apply(layout: AnonIsFullscreen, selectedPanel: js.Any, theme: js.Any, ui: AnonDocsMode): AnonLayout = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], selectedPanel = selectedPanel.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLayout]
  }
  @scala.inline
  implicit class AnonLayoutOps[Self <: AnonLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayout(value: AnonIsFullscreen): Self = {
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
    def withUi(value: AnonDocsMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

