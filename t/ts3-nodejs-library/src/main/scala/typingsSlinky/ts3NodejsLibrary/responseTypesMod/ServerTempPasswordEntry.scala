package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerTempPasswordEntry extends ResponseEntry {
  
  var desc: String = js.native
  
  var end: Double = js.native
  
  var nickname: String = js.native
  
  var pwClear: String = js.native
  
  var start: Double = js.native
  
  var tcid: String = js.native
  
  var uid: String = js.native
}
object ServerTempPasswordEntry {
  
  @scala.inline
  def apply(
    desc: String,
    end: Double,
    nickname: String,
    pwClear: String,
    start: Double,
    tcid: String,
    uid: String
  ): ServerTempPasswordEntry = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], pwClear = pwClear.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tcid = tcid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerTempPasswordEntry]
  }
  
  @scala.inline
  implicit class ServerTempPasswordEntryMutableBuilder[Self <: ServerTempPasswordEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPwClear(value: String): Self = StObject.set(x, "pwClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcid(value: String): Self = StObject.set(x, "tcid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
