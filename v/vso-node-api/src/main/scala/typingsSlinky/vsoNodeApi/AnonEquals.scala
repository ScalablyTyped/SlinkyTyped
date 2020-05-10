package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEquals extends js.Object {
  @JSName("equals")
  var equals_FAnonEquals: Double = js.native
  var notEquals: Double = js.native
}

object AnonEquals {
  @scala.inline
  def apply(equals: Double, notEquals: Double): AnonEquals = {
    val __obj = js.Dynamic.literal(equals = equals.asInstanceOf[js.Any], notEquals = notEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEquals]
  }
  @scala.inline
  implicit class AnonEqualsOps[Self <: AnonEquals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEquals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotEquals(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notEquals")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

