package typingsSlinky.valerieBrowser

import typingsSlinky.valerieBrowser.Valerie.ValidatableModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutObservableArrayFunctions[T] extends StObject {
  
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
  implicit class KnockoutObservableArrayFunctionsMutableBuilder[Self <: KnockoutObservableArrayFunctions[_], T] (val x: Self with KnockoutObservableArrayFunctions[T]) extends AnyVal {
    
    @scala.inline
    def setValidateAsModel(value: () => ValidatableModel[KnockoutObservableArray[T]]): Self = StObject.set(x, "validateAsModel", js.Any.fromFunction0(value))
  }
}
