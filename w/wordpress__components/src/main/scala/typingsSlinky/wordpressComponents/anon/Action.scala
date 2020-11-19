package typingsSlinky.wordpressComponents.anon

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressComponents.autocompleteMod.Autocomplete._OptionCompletion
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`insert-at-caret`
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
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: `insert-at-caret`): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ReactElement): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
