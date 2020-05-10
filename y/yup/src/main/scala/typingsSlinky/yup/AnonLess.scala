package typingsSlinky.yup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLess extends js.Object {
  var less: Double = js.native
}

object AnonLess {
  @scala.inline
  def apply(less: Double): AnonLess = {
    val __obj = js.Dynamic.literal(less = less.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLess]
  }
  @scala.inline
  implicit class AnonLessOps[Self <: AnonLess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLess(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

