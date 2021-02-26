package typingsSlinky.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DialogSuggestion. */
@js.native
trait DialogSuggestion extends StObject {
  
  /** The user-facing label for the disambiguation option. This label is taken from the **user_label** property of the corresponding dialog node. */
  var label: String = js.native
  
  /** The dialog output that will be returned from the Watson Assistant service if the user selects the corresponding option. */
  var output: js.UndefOr[js.Object] = js.native
  
  /** An object defining the message input to be sent to the assistant if the user selects the corresponding disambiguation option. */
  var value: DialogSuggestionValue = js.native
}
object DialogSuggestion {
  
  @scala.inline
  def apply(label: String, value: DialogSuggestionValue): DialogSuggestion = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSuggestion]
  }
  
  @scala.inline
  implicit class DialogSuggestionMutableBuilder[Self <: DialogSuggestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: js.Object): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setValue(value: DialogSuggestionValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
