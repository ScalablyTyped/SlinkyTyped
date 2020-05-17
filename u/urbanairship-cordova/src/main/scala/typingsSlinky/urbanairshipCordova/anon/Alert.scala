package typingsSlinky.urbanairshipCordova.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alert extends js.Object {
  var alert: Double = js.native
  var badge: Double = js.native
  var none: Double = js.native
  var sound: Double = js.native
}

object Alert {
  @scala.inline
  def apply(alert: Double, badge: Double, none: Double, sound: Double): Alert = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alert]
  }
  @scala.inline
  implicit class AlertOps[Self <: Alert] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlert(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSound(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

