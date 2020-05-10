package typingsSlinky.winrt.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEnclosureLocation extends js.Object {
  var inDock: Boolean = js.native
  var inLid: Boolean = js.native
  var panel: Panel = js.native
}

object IEnclosureLocation {
  @scala.inline
  def apply(inDock: Boolean, inLid: Boolean, panel: Panel): IEnclosureLocation = {
    val __obj = js.Dynamic.literal(inDock = inDock.asInstanceOf[js.Any], inLid = inLid.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnclosureLocation]
  }
  @scala.inline
  implicit class IEnclosureLocationOps[Self <: IEnclosureLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInDock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInLid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inLid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanel(value: Panel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

