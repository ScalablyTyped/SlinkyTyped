package typingsSlinky.storybookApi

import typingsSlinky.storybookApi.layoutMod.PanelPositions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsFullscreen extends js.Object {
  var isFullscreen: Boolean = js.native
  var isToolshown: Boolean = js.native
  var panelPosition: PanelPositions = js.native
  var showNav: Boolean = js.native
  var showPanel: Boolean = js.native
}

object AnonIsFullscreen {
  @scala.inline
  def apply(
    isFullscreen: Boolean,
    isToolshown: Boolean,
    panelPosition: PanelPositions,
    showNav: Boolean,
    showPanel: Boolean
  ): AnonIsFullscreen = {
    val __obj = js.Dynamic.literal(isFullscreen = isFullscreen.asInstanceOf[js.Any], isToolshown = isToolshown.asInstanceOf[js.Any], panelPosition = panelPosition.asInstanceOf[js.Any], showNav = showNav.asInstanceOf[js.Any], showPanel = showPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsFullscreen]
  }
  @scala.inline
  implicit class AnonIsFullscreenOps[Self <: AnonIsFullscreen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsToolshown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isToolshown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanelPosition(value: PanelPositions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowPanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPanel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

