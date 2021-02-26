package typingsSlinky.wordpressComponents.anon

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressComponents.autocompleteMod.Autocomplete._OptionCompletion
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`insert-at-caret`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends _OptionCompletion {
  
  var action: `insert-at-caret` = js.native
  
  var value: ReactElement = js.native
}
object Action {
  
  @scala.inline
  def apply(action: `insert-at-caret`): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: `insert-at-caret`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ReactElement): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
