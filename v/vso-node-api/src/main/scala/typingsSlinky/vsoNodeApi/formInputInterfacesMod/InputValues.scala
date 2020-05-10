package typingsSlinky.vsoNodeApi.formInputInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputValues extends js.Object {
  /**
    * The default value to use for this input
    */
  var defaultValue: String = js.native
  /**
    * Errors encountered while computing dynamic values.
    */
  var error: InputValuesError = js.native
  /**
    * The id of the input
    */
  var inputId: String = js.native
  /**
    * Should this input be disabled
    */
  var isDisabled: Boolean = js.native
  /**
    * Should the value be restricted to one of the values in the PossibleValues (True) or are the values in PossibleValues just a suggestion (False)
    */
  var isLimitedToPossibleValues: Boolean = js.native
  /**
    * Should this input be made read-only
    */
  var isReadOnly: Boolean = js.native
  /**
    * Possible values that this input can take
    */
  var possibleValues: js.Array[InputValue] = js.native
}

object InputValues {
  @scala.inline
  def apply(
    defaultValue: String,
    error: InputValuesError,
    inputId: String,
    isDisabled: Boolean,
    isLimitedToPossibleValues: Boolean,
    isReadOnly: Boolean,
    possibleValues: js.Array[InputValue]
  ): InputValues = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], inputId = inputId.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isLimitedToPossibleValues = isLimitedToPossibleValues.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], possibleValues = possibleValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValues]
  }
  @scala.inline
  implicit class InputValuesOps[Self <: InputValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: InputValuesError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLimitedToPossibleValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLimitedToPossibleValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPossibleValues(value: js.Array[InputValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("possibleValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

