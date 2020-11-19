package typingsSlinky.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "NetworkQualityMediaStats")
@js.native
class NetworkQualityMediaStats () extends js.Object {
  
  var recv: NetworkQualityLevel = js.native
  
  var recvStats: NetworkQualitySendOrRecvStats | Null = js.native
  
  var send: NetworkQualityLevel = js.native
  
  var sendStats: NetworkQualitySendOrRecvStats | Null = js.native
}
