package typingsSlinky.wordpressBlockEditor.urlPopoverMod.URLPopover

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props
  extends typingsSlinky.wordpressComponents.popoverMod.Popover.Props {
  var additionalControls: js.UndefOr[ReactElement] = js.native
  /**
    * Callback used to return the React Elements that will be rendered inside the settings
    * drawer. When this function is provided, a toggle button will be rendered in the popover
    * that allows the user to open and close the settings drawer.
    */
  var renderSettings: js.UndefOr[js.Function0[ReactElement]] = js.native
}

object Props {
  @scala.inline
  def apply(Props: typingsSlinky.wordpressComponents.popoverMod.Popover.Props): Props = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Props)
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdditionalControlsReactElement(value: ReactElement): Self = this.set("additionalControls", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditionalControls(value: ReactElement): Self = this.set("additionalControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalControls: Self = this.set("additionalControls", js.undefined)
    @scala.inline
    def setRenderSettings(value: () => ReactElement): Self = this.set("renderSettings", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderSettings: Self = this.set("renderSettings", js.undefined)
  }
  
}

