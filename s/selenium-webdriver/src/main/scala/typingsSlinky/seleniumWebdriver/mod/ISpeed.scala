package typingsSlinky.seleniumWebdriver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpeed extends js.Object {
  var xspeed: Double = js.native
  var yspeed: Double = js.native
}

object ISpeed {
  @scala.inline
  def apply(xspeed: Double, yspeed: Double): ISpeed = {
    val __obj = js.Dynamic.literal(xspeed = xspeed.asInstanceOf[js.Any], yspeed = yspeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpeed]
  }
  @scala.inline
  implicit class ISpeedOps[Self <: ISpeed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXspeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xspeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYspeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yspeed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

