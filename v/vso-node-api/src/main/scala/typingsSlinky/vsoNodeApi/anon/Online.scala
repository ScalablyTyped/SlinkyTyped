package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Online extends js.Object {
  var offline: scala.Double = js.native
  var online: scala.Double = js.native
}

object Online {
  @scala.inline
  def apply(offline: scala.Double, online: scala.Double): Online = {
    val __obj = js.Dynamic.literal(offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any])
    __obj.asInstanceOf[Online]
  }
  @scala.inline
  implicit class OnlineOps[Self <: Online] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffline(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnline(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("online")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

