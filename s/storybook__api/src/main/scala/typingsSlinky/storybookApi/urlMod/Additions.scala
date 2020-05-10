package typingsSlinky.storybookApi.urlMod

import typingsSlinky.storybookApi.layoutMod.PanelPositions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Additions extends js.Object {
  var isFullscreen: js.UndefOr[Boolean] = js.native
  var panelPosition: js.UndefOr[PanelPositions] = js.native
  var selectedPanel: js.UndefOr[String] = js.native
  var showNav: js.UndefOr[Boolean] = js.native
  var showPanel: js.UndefOr[Boolean] = js.native
  var viewMode: js.UndefOr[String] = js.native
}

object Additions {
  @scala.inline
  def apply(): Additions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Additions]
  }
  @scala.inline
  implicit class AdditionsOps[Self <: Additions] (val x: Self) extends AnyVal {
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
    def withoutIsFullscreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullscreen")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelPosition(value: PanelPositions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedPanel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNav")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPanel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPanel")(js.undefined)
        ret
    }
    @scala.inline
    def withViewMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(js.undefined)
        ret
    }
  }
  
}

