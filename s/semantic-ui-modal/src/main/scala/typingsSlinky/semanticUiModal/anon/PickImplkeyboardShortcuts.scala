package typingsSlinky.semanticUiModal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'keyboardShortcuts'> */
@js.native
trait PickImplkeyboardShortcuts extends StObject {
  
  var keyboardShortcuts: Boolean = js.native
}
object PickImplkeyboardShortcuts {
  
  @scala.inline
  def apply(keyboardShortcuts: Boolean): PickImplkeyboardShortcuts = {
    val __obj = js.Dynamic.literal(keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplkeyboardShortcuts]
  }
  
  @scala.inline
  implicit class PickImplkeyboardShortcutsMutableBuilder[Self <: PickImplkeyboardShortcuts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyboardShortcuts(value: Boolean): Self = StObject.set(x, "keyboardShortcuts", value.asInstanceOf[js.Any])
  }
}
