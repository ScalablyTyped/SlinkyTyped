package typingsSlinky.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An input object that includes the input text. */
@js.native
trait MessageInput extends StObject {
  
  /** Entities to use when evaluating the message. Include entities from the previous response to continue using those entities rather than detecting entities in the new input. */
  var entities: js.UndefOr[js.Array[RuntimeEntity]] = js.native
  
  /** Intents to use when evaluating the user input. Include intents from the previous response to continue using those intents rather than trying to recognize intents in the new input. */
  var intents: js.UndefOr[js.Array[RuntimeIntent]] = js.native
  
  /** The type of user input. Currently, only text input is supported. */
  var message_type: js.UndefOr[String] = js.native
  
  /** Optional properties that control how the assistant responds. */
  var options: js.UndefOr[MessageInputOptions] = js.native
  
  /** For internal use only. */
  var suggestion_id: js.UndefOr[String] = js.native
  
  /** The text of the user input. This string cannot contain carriage return, newline, or tab characters, and it must be no longer than 2048 characters. */
  var text: js.UndefOr[String] = js.native
}
object MessageInput {
  
  @scala.inline
  def apply(): MessageInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageInput]
  }
  
  @scala.inline
  implicit class MessageInputMutableBuilder[Self <: MessageInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[RuntimeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: RuntimeEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setIntents(value: js.Array[RuntimeIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: RuntimeIntent*): Self = StObject.set(x, "intents", js.Array(value :_*))
    
    @scala.inline
    def setMessage_type(value: String): Self = StObject.set(x, "message_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage_typeUndefined: Self = StObject.set(x, "message_type", js.undefined)
    
    @scala.inline
    def setOptions(value: MessageInputOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setSuggestion_id(value: String): Self = StObject.set(x, "suggestion_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestion_idUndefined: Self = StObject.set(x, "suggestion_id", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
