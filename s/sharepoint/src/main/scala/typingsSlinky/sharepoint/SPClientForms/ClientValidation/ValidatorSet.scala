package typingsSlinky.sharepoint.SPClientForms.ClientValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorSet extends js.Object {
  def RegisterValidator(validator: IValidator): Unit = js.native
}

object ValidatorSet {
  @scala.inline
  def apply(RegisterValidator: IValidator => Unit): ValidatorSet = {
    val __obj = js.Dynamic.literal(RegisterValidator = js.Any.fromFunction1(RegisterValidator))
    __obj.asInstanceOf[ValidatorSet]
  }
  @scala.inline
  implicit class ValidatorSetOps[Self <: ValidatorSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegisterValidator(value: IValidator => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegisterValidator")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

