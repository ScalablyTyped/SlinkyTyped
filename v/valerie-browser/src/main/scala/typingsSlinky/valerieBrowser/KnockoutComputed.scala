package typingsSlinky.valerieBrowser

import typingsSlinky.valerieBrowser.Valerie.PropertyValidationState
import typingsSlinky.valerieBrowser.Valerie.ValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutComputed[T] extends js.Object {
  
  // starts validation for observable
  def validate(): PropertyValidationState[KnockoutComputed[T]] = js.native
  def validate(validationOptions: ValidationOptions): PropertyValidationState[KnockoutComputed[T]] = js.native
}
