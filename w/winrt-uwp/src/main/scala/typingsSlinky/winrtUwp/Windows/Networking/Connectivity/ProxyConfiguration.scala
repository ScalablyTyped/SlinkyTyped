package typingsSlinky.winrtUwp.Windows.Networking.Connectivity

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the proxy configuration for the current user. */
@js.native
trait ProxyConfiguration extends js.Object {
  /** Gets a value that indicates if this configuration can connect directly. */
  var canConnectDirectly: Boolean = js.native
  /** Gets a list of URIs for the proxies from the proxy configuration. */
  var proxyUris: IVectorView[Uri] = js.native
}

object ProxyConfiguration {
  @scala.inline
  def apply(canConnectDirectly: Boolean, proxyUris: IVectorView[Uri]): ProxyConfiguration = {
    val __obj = js.Dynamic.literal(canConnectDirectly = canConnectDirectly.asInstanceOf[js.Any], proxyUris = proxyUris.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfiguration]
  }
  @scala.inline
  implicit class ProxyConfigurationOps[Self <: ProxyConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanConnectDirectly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canConnectDirectly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxyUris(value: IVectorView[Uri]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyUris")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

