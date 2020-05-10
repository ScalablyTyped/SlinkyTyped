package typingsSlinky.vsoNodeApi.notificationInterfacesMod

import typingsSlinky.vsoNodeApi.formInputInterfacesMod.InputValue
import typingsSlinky.vsoNodeApi.formInputInterfacesMod.InputValues
import typingsSlinky.vsoNodeApi.formInputInterfacesMod.InputValuesError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldInputValues extends InputValues {
  var operators: js.Array[Double] = js.native
}

object FieldInputValues {
  @scala.inline
  def apply(
    defaultValue: String,
    error: InputValuesError,
    inputId: String,
    isDisabled: Boolean,
    isLimitedToPossibleValues: Boolean,
    isReadOnly: Boolean,
    operators: js.Array[Double],
    possibleValues: js.Array[InputValue]
  ): FieldInputValues = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], inputId = inputId.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isLimitedToPossibleValues = isLimitedToPossibleValues.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], operators = operators.asInstanceOf[js.Any], possibleValues = possibleValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInputValues]
  }
  @scala.inline
  implicit class FieldInputValuesOps[Self <: FieldInputValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperators(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operators")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

