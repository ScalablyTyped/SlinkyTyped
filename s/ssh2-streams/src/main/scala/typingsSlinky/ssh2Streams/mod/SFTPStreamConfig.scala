package typingsSlinky.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFTPStreamConfig extends StObject {
  
  /**
    * Set this to a function that receives a single string argument to get detailed (local) debug information.
    */
  var debug: js.UndefOr[js.Function1[/* information */ String, _]] = js.native
  
  /**
    * This is the highWaterMark to use for the stream.
    */
  var highWaterMark: js.UndefOr[Double] = js.native
  
  /**
    * Set to true to create an instance in server mode.
    */
  var server: js.UndefOr[Boolean] = js.native
}
object SFTPStreamConfig {
  
  @scala.inline
  def apply(): SFTPStreamConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SFTPStreamConfig]
  }
  
  @scala.inline
  implicit class SFTPStreamConfigMutableBuilder[Self <: SFTPStreamConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: /* information */ String => _): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    @scala.inline
    def setServer(value: Boolean): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
