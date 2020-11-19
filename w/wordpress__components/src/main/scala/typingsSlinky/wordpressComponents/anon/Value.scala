package typingsSlinky.wordpressComponents.anon

import typingsSlinky.wordpressComponents.autocompleteMod.Autocomplete._OptionCompletion
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends _OptionCompletion {
  
  var action: replace = js.native
  
  var value: typingsSlinky.wordpressRichText.mod.Value = js.native
}
object Value {
  
  @scala.inline
  def apply(action: replace, value: typingsSlinky.wordpressRichText.mod.Value): Value = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
    
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
    def setAction(value: replace): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: typingsSlinky.wordpressRichText.mod.Value): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
