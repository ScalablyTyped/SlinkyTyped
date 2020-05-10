package typingsSlinky.winrt.Windows.Networking.Connectivity

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProxyConfiguration extends js.Object {
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
  implicit class IProxyConfigurationOps[Self <: IProxyConfiguration] (val x: Self) extends AnyVal {
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

