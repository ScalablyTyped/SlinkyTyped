package typingsSlinky.winrt.Windows.Networking.Connectivity

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyConfiguration extends IProxyConfiguration

object ProxyConfiguration {
  @scala.inline
  def apply(canConnectDirectly: Boolean, proxyUris: IVectorView[Uri]): ProxyConfiguration = {
    val __obj = js.Dynamic.literal(canConnectDirectly = canConnectDirectly.asInstanceOf[js.Any], proxyUris = proxyUris.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfiguration]
  }
}

