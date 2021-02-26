package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientDBInfo extends ResponseEntry {
  
  var clientBase64HashClientUID: String = js.native
  
  var clientCreated: Double = js.native
  
  var clientDatabaseId: String = js.native
  
  var clientDescription: String = js.native
  
  var clientFlagAvatar: String = js.native
  
  var clientLastconnected: Double = js.native
  
  var clientLastip: String = js.native
  
  var clientMonthBytesDownloaded: Double = js.native
  
  var clientMonthBytesUploaded: Double = js.native
  
  var clientNickname: String = js.native
  
  var clientTotalBytesDownloaded: Double = js.native
  
  var clientTotalBytesUploaded: Double = js.native
  
  var clientTotalconnections: Double = js.native
  
  var clientUniqueIdentifier: String = js.native
}
object ClientDBInfo {
  
  @scala.inline
  def apply(
    clientBase64HashClientUID: String,
    clientCreated: Double,
    clientDatabaseId: String,
    clientDescription: String,
    clientFlagAvatar: String,
    clientLastconnected: Double,
    clientLastip: String,
    clientMonthBytesDownloaded: Double,
    clientMonthBytesUploaded: Double,
    clientNickname: String,
    clientTotalBytesDownloaded: Double,
    clientTotalBytesUploaded: Double,
    clientTotalconnections: Double,
    clientUniqueIdentifier: String
  ): ClientDBInfo = {
    val __obj = js.Dynamic.literal(clientBase64HashClientUID = clientBase64HashClientUID.asInstanceOf[js.Any], clientCreated = clientCreated.asInstanceOf[js.Any], clientDatabaseId = clientDatabaseId.asInstanceOf[js.Any], clientDescription = clientDescription.asInstanceOf[js.Any], clientFlagAvatar = clientFlagAvatar.asInstanceOf[js.Any], clientLastconnected = clientLastconnected.asInstanceOf[js.Any], clientLastip = clientLastip.asInstanceOf[js.Any], clientMonthBytesDownloaded = clientMonthBytesDownloaded.asInstanceOf[js.Any], clientMonthBytesUploaded = clientMonthBytesUploaded.asInstanceOf[js.Any], clientNickname = clientNickname.asInstanceOf[js.Any], clientTotalBytesDownloaded = clientTotalBytesDownloaded.asInstanceOf[js.Any], clientTotalBytesUploaded = clientTotalBytesUploaded.asInstanceOf[js.Any], clientTotalconnections = clientTotalconnections.asInstanceOf[js.Any], clientUniqueIdentifier = clientUniqueIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDBInfo]
  }
  
  @scala.inline
  implicit class ClientDBInfoMutableBuilder[Self <: ClientDBInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientBase64HashClientUID(value: String): Self = StObject.set(x, "clientBase64HashClientUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCreated(value: Double): Self = StObject.set(x, "clientCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientDatabaseId(value: String): Self = StObject.set(x, "clientDatabaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientDescription(value: String): Self = StObject.set(x, "clientDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientFlagAvatar(value: String): Self = StObject.set(x, "clientFlagAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLastconnected(value: Double): Self = StObject.set(x, "clientLastconnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLastip(value: String): Self = StObject.set(x, "clientLastip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMonthBytesDownloaded(value: Double): Self = StObject.set(x, "clientMonthBytesDownloaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMonthBytesUploaded(value: Double): Self = StObject.set(x, "clientMonthBytesUploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNickname(value: String): Self = StObject.set(x, "clientNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTotalBytesDownloaded(value: Double): Self = StObject.set(x, "clientTotalBytesDownloaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTotalBytesUploaded(value: Double): Self = StObject.set(x, "clientTotalBytesUploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTotalconnections(value: Double): Self = StObject.set(x, "clientTotalconnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUniqueIdentifier(value: String): Self = StObject.set(x, "clientUniqueIdentifier", value.asInstanceOf[js.Any])
  }
}
