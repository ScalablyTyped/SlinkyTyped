package typingsSlinky.valerieBrowser.Valerie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Static methods on valerie namespace
//
@js.native
trait Static extends js.Object {
  
  // Validation result class
  var ValidationResult: ValidationResultStatic = js.native
  
  // additional namespaces for static methods:
  var converters: ConvertersStatic = js.native
  
  /**
    * Maps a source model to a destination model, including only applicable properties
    * @param {Object|Array} sourceModel the source model
    * @return {*} the destination model
    */
  def mapApplicableModel(sourceModel: js.Any): js.Any = js.native
  
  /**
    * Maps a source model to a destination model.
    * @param {Object|Array} sourceModel the source model
    * @param {valerie.includePropertyCallback} [includeWrappedFunction] a function called before each source model
    * property is unwrapped, the result of which determines if the property is included in the destination model
    * @param {valerie.includePropertyCallback} [includeUnwrappedFunction] a function called after each source
    * model property is unwrapped, the result of which determines if the property is included in the destination model
    * @return {*} the destination model
    */
  def mapModel(sourceModel: js.Any): js.Any = js.native
  def mapModel(
    sourceModel: js.Any,
    includeWrappedFunction: js.UndefOr[scala.Nothing],
    includeUnwrappedFunction: IncludePropertyCallback
  ): js.Any = js.native
  def mapModel(sourceModel: js.Any, includeWrappedFunction: IncludePropertyCallback): js.Any = js.native
  def mapModel(
    sourceModel: js.Any,
    includeWrappedFunction: IncludePropertyCallback,
    includeUnwrappedFunction: IncludePropertyCallback
  ): js.Any = js.native
  
  /*
    //TODO: additional namespaces/statics not yet used
    dom: DomStatic;
    formatting: FormattingStatic;
    koBindingsHelper: KoBindingsHelperStatic;
    koExtras: KoExtrasStatic;
    rules: RulesStatic;
    */
  var utils: UtilsStatic = js.native
  
  /**
    * Makes the passed-in model validatable. After invocation the model will have a validation state.
    * <br/><b>fluent</b>
    * @param {object|function} model the model to make validatable
    * @param {valerie.ModelValidationState.options} [options] the options to use when creating the model's validation
    * state
    * @return {valerie.ModelValidationState} the validation state belonging to the model
    */
  def validatableModel(model: js.Any): ModelValidationState = js.native
  def validatableModel(model: js.Any, options: ValidationOptions): ModelValidationState = js.native
  
  // Makes the passed-in property validatable. After invocation the property will have a validation state.
  // (value should be observable or computed)
  def validatableProperty[T](value: T): PropertyValidationState[T] = js.native
  def validatableProperty[T](value: T, options: ValidationOptions): PropertyValidationState[T] = js.native
  
  var validationState: ValidationState = js.native
}
