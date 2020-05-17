package typingsSlinky.winrtUwp.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the option for the number of printed copies. */
@js.native
trait PrintCopiesOptionDetails extends js.Object {
  /** Gets or sets the string for an error condition. */
  var errorText: String = js.native
  /** Gets the value for the maximum number of printed copies allowed. */
  var maxValue: Double = js.native
  /** Gets the value for the minimum number of printed copies allowed. */
  var minValue: Double = js.native
  /** Gets the ID for the option for the number of printed copies. */
  var optionId: String = js.native
  /** Gets the option type for the option for the number of printed copies. */
  var optionType: PrintOptionType = js.native
  /** Gets or sets the state of the option for the number of printed copies. */
  var state: PrintOptionStates = js.native
  /** Gets or sets the number of copies for a print task. */
  var value: js.Any = js.native
  /**
    * Sets the value for the print copies option.
    * @param value Value for the print copies option.
    * @return Boolean value that indicates TRUE for a successful Get or Set, and FALSE for a failed Get or Set.
    */
  def trySetValue(value: js.Any): Boolean = js.native
}

object PrintCopiesOptionDetails {
  @scala.inline
  def apply(
    errorText: String,
    maxValue: Double,
    minValue: Double,
    optionId: String,
    optionType: PrintOptionType,
    state: PrintOptionStates,
    trySetValue: js.Any => Boolean,
    value: js.Any
  ): PrintCopiesOptionDetails = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], optionId = optionId.asInstanceOf[js.Any], optionType = optionType.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], trySetValue = js.Any.fromFunction1(trySetValue), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCopiesOptionDetails]
  }
  @scala.inline
  implicit class PrintCopiesOptionDetailsOps[Self <: PrintCopiesOptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionType(value: PrintOptionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: PrintOptionStates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrySetValue(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trySetValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

