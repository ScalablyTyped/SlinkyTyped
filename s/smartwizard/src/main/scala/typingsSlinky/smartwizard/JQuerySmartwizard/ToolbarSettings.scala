package typingsSlinky.smartwizard.JQuerySmartwizard

import typingsSlinky.smartwizard.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarSettings extends js.Object {
  var showNextButton: js.UndefOr[Boolean] = js.native
  var showPreviousButton: js.UndefOr[Boolean] = js.native
  var toolbarButtonPosition: js.UndefOr[ToolbarButtonPosition] = js.native
  var toolbarExtraButtons: js.UndefOr[js.Array[JQuery]] = js.native
  var toolbarPosition: js.UndefOr[ToolbarPosition] = js.native
}

object ToolbarSettings {
  @scala.inline
  def apply(): ToolbarSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarSettings]
  }
  @scala.inline
  implicit class ToolbarSettingsOps[Self <: ToolbarSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowNextButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNextButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNextButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNextButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPreviousButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreviousButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPreviousButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreviousButton")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarButtonPosition(value: ToolbarButtonPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarButtonPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarButtonPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarButtonPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarExtraButtons(value: js.Array[JQuery]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarExtraButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarExtraButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarExtraButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarPosition(value: ToolbarPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarPosition")(js.undefined)
        ret
    }
  }
  
}

