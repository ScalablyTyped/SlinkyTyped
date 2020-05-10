package typingsSlinky.storybookReactNative.wrapperMod

import typingsSlinky.storybookAddons.distMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var addonSelected: String = js.native
  var panels: Collection = js.native
}

object Props {
  @scala.inline
  def apply(addonSelected: String, panels: Collection): Props = {
    val __obj = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddonSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addonSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanels(value: Collection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

