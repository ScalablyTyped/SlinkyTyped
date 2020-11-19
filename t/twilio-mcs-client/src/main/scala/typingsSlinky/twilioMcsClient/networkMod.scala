package typingsSlinky.twilioMcsClient

import org.scalajs.dom.raw.FormData
import typingsSlinky.node.Buffer
import typingsSlinky.twilioMcsClient.configurationMod.Configuration
import typingsSlinky.twilioMcsClient.transportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-mcs-client/lib/services/network", JSImport.Namespace)
@js.native
object networkMod extends js.Object {
  
  @js.native
  class Network protected () extends js.Object {
    def this(config: Configuration, transport: Transport) = this()
    
    var backoffConfig: js.Any = js.native
    
    val config: js.Any = js.native
    
    var executeWithRetry: js.Any = js.native
    
    def get(url: String): js.Promise[_] = js.native
    
    def post(url: String, media: String): js.Promise[_] = js.native
    def post(url: String, media: String, contentType: String): js.Promise[_] = js.native
    def post(url: String, media: Buffer): js.Promise[_] = js.native
    def post(url: String, media: Buffer, contentType: String): js.Promise[_] = js.native
    def post(url: String, media: FormData): js.Promise[_] = js.native
    def post(url: String, media: FormData, contentType: String): js.Promise[_] = js.native
    
    var retryWhenThrottled: js.Any = js.native
    
    val transport: js.Any = js.native
  }
}
