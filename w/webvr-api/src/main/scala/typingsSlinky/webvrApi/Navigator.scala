package typingsSlinky.webvrApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator extends js.Object {
  val activeVRDisplays: js.Array[VRDisplay] = js.native
  def getVRDisplays(): js.Promise[js.Array[VRDisplay]] = js.native
}

object Navigator {
  @scala.inline
  def apply(activeVRDisplays: js.Array[VRDisplay], getVRDisplays: () => js.Promise[js.Array[VRDisplay]]): Navigator = {
    val __obj = js.Dynamic.literal(activeVRDisplays = activeVRDisplays.asInstanceOf[js.Any], getVRDisplays = js.Any.fromFunction0(getVRDisplays))
    __obj.asInstanceOf[Navigator]
  }
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveVRDisplays(value: js.Array[VRDisplay]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeVRDisplays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetVRDisplays(value: () => js.Promise[js.Array[VRDisplay]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVRDisplays")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

