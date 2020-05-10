package typingsSlinky.valerie.Valerie_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationResultStatic extends js.Object {
  var passedInstance: ValidationResult = js.native
  // static method to create validatio failed message
  def createFailedResult(message: String): ValidationResult = js.native
}

object ValidationResultStatic {
  @scala.inline
  def apply(createFailedResult: String => ValidationResult, passedInstance: ValidationResult): ValidationResultStatic = {
    val __obj = js.Dynamic.literal(createFailedResult = js.Any.fromFunction1(createFailedResult), passedInstance = passedInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationResultStatic]
  }
  @scala.inline
  implicit class ValidationResultStaticOps[Self <: ValidationResultStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateFailedResult(value: String => ValidationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFailedResult")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPassedInstance(value: ValidationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passedInstance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

