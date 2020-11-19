package typingsSlinky.twilioChat.networkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-chat/lib/services/network", "Network")
@js.native
class Network protected () extends js.Object {
  def this(config: js.Any, services: js.Any) = this()
  
  var backoffConfig: js.Any = js.native
  
  val cache: js.Any = js.native
  
  var cacheLifetime: js.Any = js.native
  
  var cleanupCache: js.Any = js.native
  
  val config: js.Any = js.native
  
  var executeWithRetry: js.Any = js.native
  
  def get(url: String): js.Promise[_] = js.native
  
  var isExpired: js.Any = js.native
  
  def pokeTimer(): Unit = js.native
  
  var retryWhenThrottled: js.Any = js.native
  
  val services: js.Any = js.native
  
  var timer: js.Any = js.native
}
