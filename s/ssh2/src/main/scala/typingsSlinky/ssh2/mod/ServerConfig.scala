package typingsSlinky.ssh2.mod

import typingsSlinky.node.Buffer
import typingsSlinky.ssh2Streams.mod.Algorithms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerConfig extends StObject {
  
  /** Explicit overrides for the default transport layer algorithms used for the connection. */
  var algorithms: js.UndefOr[Algorithms] = js.native
  
  /** A message that is sent to clients once, right before authentication begins. */
  var banner: js.UndefOr[String] = js.native
  
  /** A function that receives a single string argument to get detailed (local) debug information. */
  var debug: js.UndefOr[js.Function1[/* information */ String, _]] = js.native
  
  /** A message that is sent to clients immediately upon connection, before handshaking begins. */
  var greeting: js.UndefOr[String] = js.native
  
  /** This is the highWaterMark to use for the parser stream (default: `32 * 1024`). */
  var highWaterMark: js.UndefOr[Double] = js.native
  
  /** An array of host private keys. */
  var hostKeys: js.Array[Buffer | String | EncryptedPrivateKey] = js.native
  
  /** A custom server software name/version identifier. */
  var ident: js.UndefOr[String] = js.native
  
  /** This is the maximum packet size that will be accepted. It should be 35000 bytes or larger to be compatible with other SSH2 implementations. */
  var maxPacketSize: js.UndefOr[Double] = js.native
}
object ServerConfig {
  
  @scala.inline
  def apply(hostKeys: js.Array[Buffer | String | EncryptedPrivateKey]): ServerConfig = {
    val __obj = js.Dynamic.literal(hostKeys = hostKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig]
  }
  
  @scala.inline
  implicit class ServerConfigMutableBuilder[Self <: ServerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithms(value: Algorithms): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
    
    @scala.inline
    def setBanner(value: String): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
    
    @scala.inline
    def setDebug(value: /* information */ String => _): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setGreeting(value: String): Self = StObject.set(x, "greeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreetingUndefined: Self = StObject.set(x, "greeting", js.undefined)
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    @scala.inline
    def setHostKeys(value: js.Array[Buffer | String | EncryptedPrivateKey]): Self = StObject.set(x, "hostKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostKeysVarargs(value: (Buffer | String | EncryptedPrivateKey)*): Self = StObject.set(x, "hostKeys", js.Array(value :_*))
    
    @scala.inline
    def setIdent(value: String): Self = StObject.set(x, "ident", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentUndefined: Self = StObject.set(x, "ident", js.undefined)
    
    @scala.inline
    def setMaxPacketSize(value: Double): Self = StObject.set(x, "maxPacketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPacketSizeUndefined: Self = StObject.set(x, "maxPacketSize", js.undefined)
  }
}
