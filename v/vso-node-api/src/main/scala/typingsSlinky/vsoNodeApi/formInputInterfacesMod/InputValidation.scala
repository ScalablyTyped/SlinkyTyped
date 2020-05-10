package typingsSlinky.vsoNodeApi.formInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputValidation extends js.Object {
  var dataType: InputDataType = js.native
  var isRequired: Boolean = js.native
  var maxLength: Double = js.native
  var maxValue: Double = js.native
  var minLength: Double = js.native
  var minValue: Double = js.native
  var pattern: String = js.native
  var patternMismatchErrorMessage: String = js.native
}

object InputValidation {
  @scala.inline
  def apply(
    dataType: InputDataType,
    isRequired: Boolean,
    maxLength: Double,
    maxValue: Double,
    minLength: Double,
    minValue: Double,
    pattern: String,
    patternMismatchErrorMessage: String
  ): InputValidation = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], isRequired = isRequired.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], patternMismatchErrorMessage = patternMismatchErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValidation]
  }
  @scala.inline
  implicit class InputValidationOps[Self <: InputValidation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataType(value: InputDataType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatternMismatchErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patternMismatchErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

