package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFail extends js.Object {
  var fail: Double = js.native
  var omit: Double = js.native
}

object AnonFail {
  @scala.inline
  def apply(fail: Double, omit: Double): AnonFail = {
    val __obj = js.Dynamic.literal(fail = fail.asInstanceOf[js.Any], omit = omit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFail]
  }
  @scala.inline
  implicit class AnonFailOps[Self <: AnonFail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFail(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOmit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

