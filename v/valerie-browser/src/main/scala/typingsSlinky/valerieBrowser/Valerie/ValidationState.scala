package typingsSlinky.valerieBrowser.Valerie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationState extends js.Object {
  
  // Finds and returns the validation states
  def findIn(model: js.Any): js.Array[IValidationState] = js.native
  def findIn(
    model: js.Any,
    includeSubModels: js.UndefOr[scala.Nothing],
    recurse: js.UndefOr[scala.Nothing],
    validationStates: js.Array[IValidationState]
  ): js.Array[IValidationState] = js.native
  def findIn(model: js.Any, includeSubModels: js.UndefOr[scala.Nothing], recurse: Boolean): js.Array[IValidationState] = js.native
  def findIn(
    model: js.Any,
    includeSubModels: js.UndefOr[scala.Nothing],
    recurse: Boolean,
    validationStates: js.Array[IValidationState]
  ): js.Array[IValidationState] = js.native
  def findIn(model: js.Any, includeSubModels: Boolean): js.Array[IValidationState] = js.native
  def findIn(
    model: js.Any,
    includeSubModels: Boolean,
    recurse: js.UndefOr[scala.Nothing],
    validationStates: js.Array[IValidationState]
  ): js.Array[IValidationState] = js.native
  def findIn(model: js.Any, includeSubModels: Boolean, recurse: Boolean): js.Array[IValidationState] = js.native
  def findIn(
    model: js.Any,
    includeSubModels: Boolean,
    recurse: Boolean,
    validationStates: js.Array[IValidationState]
  ): js.Array[IValidationState] = js.native
  
  // Gets the validation state for the given model, observable or computed.
  def getFor(modelOrObservableOrComputed: js.Any): IValidationState = js.native
  
  // nforms if the given model, observable or computed has a validation state.
  def has(modelOrObservableOrComputed: js.Any): Boolean = js.native
  
  // Sets the validation state for the given model, observable or computed.
  def setFor(modelOrObservableOrComputed: js.Any, state: IValidationState): Unit = js.native
}
