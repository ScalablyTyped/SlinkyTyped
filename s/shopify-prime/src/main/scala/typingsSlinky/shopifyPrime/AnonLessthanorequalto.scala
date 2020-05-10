package typingsSlinky.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLessthanorequalto extends js.Object {
  var less_than_or_equal_to: Double = js.native
}

object AnonLessthanorequalto {
  @scala.inline
  def apply(less_than_or_equal_to: Double): AnonLessthanorequalto = {
    val __obj = js.Dynamic.literal(less_than_or_equal_to = less_than_or_equal_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLessthanorequalto]
  }
  @scala.inline
  implicit class AnonLessthanorequaltoOps[Self <: AnonLessthanorequalto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLess_than_or_equal_to(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less_than_or_equal_to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

