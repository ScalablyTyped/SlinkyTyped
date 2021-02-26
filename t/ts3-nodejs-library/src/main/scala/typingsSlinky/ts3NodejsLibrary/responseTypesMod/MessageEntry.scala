package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageEntry extends ResponseEntry {
  
  var cluid: String = js.native
  
  var flagRead: Boolean = js.native
  
  var msgid: String = js.native
  
  var subject: String = js.native
  
  var timestamp: Double = js.native
}
object MessageEntry {
  
  @scala.inline
  def apply(cluid: String, flagRead: Boolean, msgid: String, subject: String, timestamp: Double): MessageEntry = {
    val __obj = js.Dynamic.literal(cluid = cluid.asInstanceOf[js.Any], flagRead = flagRead.asInstanceOf[js.Any], msgid = msgid.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEntry]
  }
  
  @scala.inline
  implicit class MessageEntryMutableBuilder[Self <: MessageEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluid(value: String): Self = StObject.set(x, "cluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagRead(value: Boolean): Self = StObject.set(x, "flagRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgid(value: String): Self = StObject.set(x, "msgid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
