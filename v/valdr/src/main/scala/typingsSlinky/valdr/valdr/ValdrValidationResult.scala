package typingsSlinky.valdr.valdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValdrValidationResult extends js.Object {
  var valid: Boolean = js.native
  var validationResults: js.Array[ValdrViolation] = js.native
  var violations: js.Array[ValdrViolation] = js.native
}

object ValdrValidationResult {
  @scala.inline
  def apply(valid: Boolean, validationResults: js.Array[ValdrViolation], violations: js.Array[ValdrViolation]): ValdrValidationResult = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any], validationResults = validationResults.asInstanceOf[js.Any], violations = violations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValdrValidationResult]
  }
  @scala.inline
  implicit class ValdrValidationResultOps[Self <: ValdrValidationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationResults(value: js.Array[ValdrViolation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViolations(value: js.Array[ValdrViolation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

