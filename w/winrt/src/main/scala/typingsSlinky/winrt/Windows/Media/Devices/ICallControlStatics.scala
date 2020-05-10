package typingsSlinky.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICallControlStatics extends js.Object {
  def fromId(deviceInterfaceId: String): CallControl = js.native
  def getDefault(): CallControl = js.native
}

object ICallControlStatics {
  @scala.inline
  def apply(fromId: String => CallControl, getDefault: () => CallControl): ICallControlStatics = {
    val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getDefault = js.Any.fromFunction0(getDefault))
    __obj.asInstanceOf[ICallControlStatics]
  }
  @scala.inline
  implicit class ICallControlStaticsOps[Self <: ICallControlStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromId(value: String => CallControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDefault(value: () => CallControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefault")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

