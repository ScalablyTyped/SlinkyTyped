package typingsSlinky.shopifyPrime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Greaterthanorequalto extends js.Object {
  var greater_than_or_equal_to: Double = js.native
}

object Greaterthanorequalto {
  @scala.inline
  def apply(greater_than_or_equal_to: Double): Greaterthanorequalto = {
    val __obj = js.Dynamic.literal(greater_than_or_equal_to = greater_than_or_equal_to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Greaterthanorequalto]
  }
  @scala.inline
  implicit class GreaterthanorequaltoOps[Self <: Greaterthanorequalto] (val x: Self) extends AnyVal {
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

