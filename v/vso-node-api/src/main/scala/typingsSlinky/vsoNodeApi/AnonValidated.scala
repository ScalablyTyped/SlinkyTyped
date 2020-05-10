package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonValidated extends js.Object {
  var none: Double = js.native
  var validated: Double = js.native
}

object AnonValidated {
  @scala.inline
  def apply(none: Double, validated: Double): AnonValidated = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValidated]
  }
  @scala.inline
  implicit class AnonValidatedOps[Self <: AnonValidated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

