package typingsSlinky.storybookReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddonSelected extends js.Object {
  var addonSelected: String = js.native
}

object AnonAddonSelected {
  @scala.inline
  def apply(addonSelected: String): AnonAddonSelected = {
    val __obj = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddonSelected]
  }
  @scala.inline
  implicit class AnonAddonSelectedOps[Self <: AnonAddonSelected] (val x: Self) extends AnyVal {
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
  }
  
}

