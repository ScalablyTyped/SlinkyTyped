package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DialogSuggestion. */
@js.native
trait DialogSuggestion extends js.Object {
  
  /** The ID of the dialog node that the **label** property is taken from. The **label** property is populated using the value of the dialog node's **user_label** property. */
  var dialog_node: js.UndefOr[String] = js.native
  
  /** The user-facing label for the disambiguation option. This label is taken from the **user_label** property of the corresponding dialog node. */
  var label: String = js.native
  
  /** The dialog output that will be returned from the Watson Assistant service if the user selects the corresponding option. */
  var output: js.UndefOr[js.Object] = js.native
  
  /** An object defining the message input, intents, and entities to be sent to the Watson Assistant service if the user selects the corresponding disambiguation option. */
  var value: DialogSuggestionValue = js.native
}
object DialogSuggestion {
  
  @scala.inline
  def apply(label: String, value: DialogSuggestionValue): DialogSuggestion = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSuggestion]
  }
  
  @scala.inline
  implicit class DialogSuggestionOps[Self <: DialogSuggestion] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: DialogSuggestionValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog_node(value: String): Self = this.set("dialog_node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialog_node: Self = this.set("dialog_node", js.undefined)
    
    @scala.inline
    def setOutput(value: js.Object): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
  }
}
