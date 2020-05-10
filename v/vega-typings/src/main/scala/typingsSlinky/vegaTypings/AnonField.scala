package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.encodeMod.BaseValueRef
import typingsSlinky.vegaTypings.encodeMod.Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonField
  extends BaseValueRef[js.Any] {
  var field: Field = js.native
}

object AnonField {
  @scala.inline
  def apply(field: Field): AnonField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonField]
  }
  @scala.inline
  implicit class AnonFieldOps[Self <: AnonField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

