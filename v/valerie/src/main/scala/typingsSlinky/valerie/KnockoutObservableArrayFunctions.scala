package typingsSlinky.valerie

import typingsSlinky.valerie.Valerie_.ValidatableModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableArrayFunctions[T] extends js.Object {
  /**
    * Creates and sets a model validation state on a Knockout observable array.<br/>
    * <i>[fluent]</i>
    * @name ko.observableArray#validateAsModel
    * @method
    * @fluent
    * @param {valerie.ModelValidationState.options} [validationOptions] the options to use when creating the
    * validation state
    * @return {valerie.ModelValidationState} the validation state belonging to the observable array
    */
  def validateAsModel(): ValidatableModel[KnockoutObservableArray[T]] = js.native
}

object KnockoutObservableArrayFunctions {
  @scala.inline
  def apply[T](validateAsModel: () => ValidatableModel[KnockoutObservableArray[T]]): KnockoutObservableArrayFunctions[T] = {
    val __obj = js.Dynamic.literal(validateAsModel = js.Any.fromFunction0(validateAsModel))
    __obj.asInstanceOf[KnockoutObservableArrayFunctions[T]]
  }
  @scala.inline
  implicit class KnockoutObservableArrayFunctionsOps[Self[t] <: KnockoutObservableArrayFunctions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withValidateAsModel(value: () => ValidatableModel[KnockoutObservableArray[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateAsModel")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

