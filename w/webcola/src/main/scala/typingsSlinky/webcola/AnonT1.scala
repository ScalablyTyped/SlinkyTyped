package typingsSlinky.webcola

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonT1 extends js.Object {
  var t1: Double = js.native
  var t2: Double = js.native
}

object AnonT1 {
  @scala.inline
  def apply(t1: Double, t2: Double): AnonT1 = {
    val __obj = js.Dynamic.literal(t1 = t1.asInstanceOf[js.Any], t2 = t2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonT1]
  }
  @scala.inline
  implicit class AnonT1Ops[Self <: AnonT1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withT1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

