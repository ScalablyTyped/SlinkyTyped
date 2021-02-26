package typingsSlinky.winrt.Windows.Networking.Connectivity

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProxyConfiguration extends StObject {
  
  var canConnectDirectly: Boolean = js.native
  
  var proxyUris: IVectorView[Uri] = js.native
}
object IProxyConfiguration {
  
  @scala.inline
  def apply(canConnectDirectly: Boolean, proxyUris: IVectorView[Uri]): IProxyConfiguration = {
    val __obj = js.Dynamic.literal(canConnectDirectly = canConnectDirectly.asInstanceOf[js.Any], proxyUris = proxyUris.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProxyConfiguration]
  }
  
  @scala.inline
  implicit class IProxyConfigurationMutableBuilder[Self <: IProxyConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanConnectDirectly(value: Boolean): Self = StObject.set(x, "canConnectDirectly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUris(value: IVectorView[Uri]): Self = StObject.set(x, "proxyUris", value.asInstanceOf[js.Any])
  }
}
