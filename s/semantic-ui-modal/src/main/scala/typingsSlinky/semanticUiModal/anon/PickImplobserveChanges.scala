package typingsSlinky.semanticUiModal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'observeChanges'> */
@js.native
trait PickImplobserveChanges extends StObject {
  
  var observeChanges: Boolean = js.native
}
object PickImplobserveChanges {
  
  @scala.inline
  def apply(observeChanges: Boolean): PickImplobserveChanges = {
    val __obj = js.Dynamic.literal(observeChanges = observeChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplobserveChanges]
  }
  
  @scala.inline
  implicit class PickImplobserveChangesMutableBuilder[Self <: PickImplobserveChanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
  }
}
