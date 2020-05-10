package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOffline extends js.Object {
  var offline: Double = js.native
  var online: Double = js.native
}

object AnonOffline {
  @scala.inline
  def apply(offline: Double, online: Double): AnonOffline = {
    val __obj = js.Dynamic.literal(offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffline]
  }
  @scala.inline
  implicit class AnonOfflineOps[Self <: AnonOffline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("online")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

