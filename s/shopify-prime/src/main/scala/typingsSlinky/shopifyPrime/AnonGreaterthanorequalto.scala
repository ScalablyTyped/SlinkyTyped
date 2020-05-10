package typingsSlinky.shopifyPrime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGreaterthanorequalto extends js.Object {
  var greater_than_or_equal_to: Double = js.native
}

object AnonGreaterthanorequalto {
  @scala.inline
  def apply(greater_than_or_equal_to: Double): AnonGreaterthanorequalto = {
    val __obj = js.Dynamic.literal(greater_than_or_equal_to = greater_than_or_equal_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGreaterthanorequalto]
  }
  @scala.inline
  implicit class AnonGreaterthanorequaltoOps[Self <: AnonGreaterthanorequalto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGreater_than_or_equal_to(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greater_than_or_equal_to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

