package typingsSlinky.webgme.anon

import typingsSlinky.webgme.webgmeStrings.memory
import typingsSlinky.webgme.webgmeStrings.redis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Manager extends StObject {
  
  /**
    * If true will start a webhook-manager from the server.
    *  config.webhooks.enable = true;
    */
  var enable: Boolean = js.native
  
  /**
    * Type of webhook-manager for detecting events, can be 'memory', 'redis'. 
    * Memory runs in the server process, 
    * whereas redis is running in a sub-process. 
    * Redis requires the socket.io adapter to be of type redis. 
    * (It is also possible to run the redis manager separately from the webgme server.)
    *   config.webhooks.manager = 'memory';
    */
  var manager: memory | redis = js.native
}
object Manager {
  
  @scala.inline
  def apply(enable: Boolean, manager: memory | redis): Manager = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manager]
  }
  
  @scala.inline
  implicit class ManagerMutableBuilder[Self <: Manager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManager(value: memory | redis): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
  }
}
