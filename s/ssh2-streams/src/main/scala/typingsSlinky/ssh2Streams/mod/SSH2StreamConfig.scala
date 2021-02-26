package typingsSlinky.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSH2StreamConfig extends StObject {
  
  /**
    * This option allows you to explicitly override the default transport layer algorithms used for the connection. Each value must be an array of valid algorithms for that category. The order of the algorithms in the arrays are important, with the most favorable being first.
    */
  var algorithms: js.UndefOr[Algorithms] = js.native
  
  /**
    * A message that is sent to clients immediately upon connection, before handshaking begins.
    */
  var banner: js.UndefOr[String] = js.native
  
  /**
    * Set this to a function that receives a single string argument to get detailed (local) debug information.
    */
  var debug: js.UndefOr[js.Function1[/* information */ String, _]] = js.native
  
  /**
    * This is the highWaterMark to use for the parser stream.
    * @default 32 * 1024
    */
  var highWaterMark: js.UndefOr[Double] = js.native
  
  /**
    * If in server mode, an object keyed on host key format.
    */
  var hostKeys: js.UndefOr[HostKeys] = js.native
  
  /**
    * A custom server software name/version identifier.
    * @default 'ssh2js' + moduleVersion + 'srv'
    */
  var ident: js.UndefOr[String] = js.native
  
  /**
    * This is the maximum packet size that will be accepted. It should be 35000 bytes or larger to be compatible with other SSH2 implementations.
    * @default 35000
    */
  var maxPacketSize: js.UndefOr[Double] = js.native
  
  /**
    * Set to true to create an instance in server mode.
    */
  var server: js.UndefOr[Boolean] = js.native
}
object SSH2StreamConfig {
  
  @scala.inline
  def apply(): SSH2StreamConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSH2StreamConfig]
  }
  
  @scala.inline
  implicit class SSH2StreamConfigMutableBuilder[Self <: SSH2StreamConfig] (val x: Self) extends AnyVal {
    
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
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    @scala.inline
    def setHostKeys(value: HostKeys): Self = StObject.set(x, "hostKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostKeysUndefined: Self = StObject.set(x, "hostKeys", js.undefined)
    
    @scala.inline
    def setIdent(value: String): Self = StObject.set(x, "ident", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentUndefined: Self = StObject.set(x, "ident", js.undefined)
    
    @scala.inline
    def setMaxPacketSize(value: Double): Self = StObject.set(x, "maxPacketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPacketSizeUndefined: Self = StObject.set(x, "maxPacketSize", js.undefined)
    
    @scala.inline
    def setServer(value: Boolean): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
