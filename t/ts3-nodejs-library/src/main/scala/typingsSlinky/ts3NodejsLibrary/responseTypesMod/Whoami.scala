package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Whoami extends ResponseEntry {
  
  var clientChannelId: String = js.native
  
  var clientDatabaseId: String = js.native
  
  var clientId: String = js.native
  
  var clientLoginName: String = js.native
  
  var clientNickname: String = js.native
  
  var clientOriginServerId: String = js.native
  
  var clientUniqueIdentifier: String = js.native
  
  var virtualserverId: String = js.native
  
  var virtualserverPort: Double = js.native
  
  var virtualserverStatus: String = js.native
  
  var virtualserverUniqueIdentifier: String = js.native
}
object Whoami {
  
  @scala.inline
  def apply(
    clientChannelId: String,
    clientDatabaseId: String,
    clientId: String,
    clientLoginName: String,
    clientNickname: String,
    clientOriginServerId: String,
    clientUniqueIdentifier: String,
    virtualserverId: String,
    virtualserverPort: Double,
    virtualserverStatus: String,
    virtualserverUniqueIdentifier: String
  ): Whoami = {
    val __obj = js.Dynamic.literal(clientChannelId = clientChannelId.asInstanceOf[js.Any], clientDatabaseId = clientDatabaseId.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], clientLoginName = clientLoginName.asInstanceOf[js.Any], clientNickname = clientNickname.asInstanceOf[js.Any], clientOriginServerId = clientOriginServerId.asInstanceOf[js.Any], clientUniqueIdentifier = clientUniqueIdentifier.asInstanceOf[js.Any], virtualserverId = virtualserverId.asInstanceOf[js.Any], virtualserverPort = virtualserverPort.asInstanceOf[js.Any], virtualserverStatus = virtualserverStatus.asInstanceOf[js.Any], virtualserverUniqueIdentifier = virtualserverUniqueIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Whoami]
  }
  
  @scala.inline
  implicit class WhoamiMutableBuilder[Self <: Whoami] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientChannelId(value: String): Self = StObject.set(x, "clientChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientDatabaseId(value: String): Self = StObject.set(x, "clientDatabaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLoginName(value: String): Self = StObject.set(x, "clientLoginName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNickname(value: String): Self = StObject.set(x, "clientNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOriginServerId(value: String): Self = StObject.set(x, "clientOriginServerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUniqueIdentifier(value: String): Self = StObject.set(x, "clientUniqueIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverId(value: String): Self = StObject.set(x, "virtualserverId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverPort(value: Double): Self = StObject.set(x, "virtualserverPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverStatus(value: String): Self = StObject.set(x, "virtualserverStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverUniqueIdentifier(value: String): Self = StObject.set(x, "virtualserverUniqueIdentifier", value.asInstanceOf[js.Any])
  }
}
