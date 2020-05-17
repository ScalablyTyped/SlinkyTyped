package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validated extends js.Object {
  var none: scala.Double = js.native
  var validated: scala.Double = js.native
}

object Validated {
  @scala.inline
  def apply(none: scala.Double, validated: scala.Double): Validated = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validated]
  }
  @scala.inline
  implicit class ValidatedOps[Self <: Validated] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidated(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

