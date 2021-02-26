package typingsSlinky.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketOptions extends StObject {
  
  /**
    * Reconnect on error.
    */
  var autoReconnect: js.UndefOr[Boolean] = js.native
  
  /**
    * TCP Connection timeout setting.
    */
  var connectTimeoutMS: js.UndefOr[scala.Double] = js.native
  
  /**
    * TCP KeepAlive on the socket with a X ms delay before start.
    */
  var keepAlive: js.UndefOr[scala.Double] = js.native
  
  /**
    * TCP Socket NoDelay option.
    */
  var noDelay: js.UndefOr[Boolean] = js.native
  
  /**
    * TCP Socket timeout setting.
    */
  var socketTimeoutMS: js.UndefOr[scala.Double] = js.native
}
object SocketOptions {
  
  @scala.inline
  def apply(): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketOptions]
  }
  
  @scala.inline
  implicit class SocketOptionsMutableBuilder[Self <: SocketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoReconnect(value: Boolean): Self = StObject.set(x, "autoReconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoReconnectUndefined: Self = StObject.set(x, "autoReconnect", js.undefined)
    
    @scala.inline
    def setConnectTimeoutMS(value: scala.Double): Self = StObject.set(x, "connectTimeoutMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectTimeoutMSUndefined: Self = StObject.set(x, "connectTimeoutMS", js.undefined)
    
    @scala.inline
    def setKeepAlive(value: scala.Double): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    @scala.inline
    def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
    
    @scala.inline
    def setSocketTimeoutMS(value: scala.Double): Self = StObject.set(x, "socketTimeoutMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketTimeoutMSUndefined: Self = StObject.set(x, "socketTimeoutMS", js.undefined)
  }
}
