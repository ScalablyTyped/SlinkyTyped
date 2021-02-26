package typingsSlinky.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Built-in system properties that apply to all skills used by the assistant. */
@js.native
trait MessageContextGlobalSystem extends StObject {
  
  /** The user time zone. The assistant uses the time zone to correctly resolve relative time references. */
  var timezone: js.UndefOr[String] = js.native
  
  /** A counter that is automatically incremented with each turn of the conversation. A value of 1 indicates that this is the the first turn of a new conversation, which can affect the behavior of some skills (for example, triggering the start node of a dialog). */
  var turn_count: js.UndefOr[Double] = js.native
  
  /** A string value that identifies the user who is interacting with the assistant. The client must provide a unique identifier for each individual end user who accesses the application. For Plus and Premium plans, this user ID is used to identify unique users for billing purposes. This string cannot contain carriage return, newline, or tab characters. */
  var user_id: js.UndefOr[String] = js.native
}
object MessageContextGlobalSystem {
  
  @scala.inline
  def apply(): MessageContextGlobalSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageContextGlobalSystem]
  }
  
  @scala.inline
  implicit class MessageContextGlobalSystemMutableBuilder[Self <: MessageContextGlobalSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    @scala.inline
    def setTurn_count(value: Double): Self = StObject.set(x, "turn_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTurn_countUndefined: Self = StObject.set(x, "turn_count", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
