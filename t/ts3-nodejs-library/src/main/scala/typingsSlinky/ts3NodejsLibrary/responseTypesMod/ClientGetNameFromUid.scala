package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientGetNameFromUid extends ResponseEntry {
  
  var cldbid: String = js.native
  
  var cluid: String = js.native
  
  var name: String = js.native
}
object ClientGetNameFromUid {
  
  @scala.inline
  def apply(cldbid: String, cluid: String, name: String): ClientGetNameFromUid = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], cluid = cluid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientGetNameFromUid]
  }
  
  @scala.inline
  implicit class ClientGetNameFromUidMutableBuilder[Self <: ClientGetNameFromUid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCluid(value: String): Self = StObject.set(x, "cluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
