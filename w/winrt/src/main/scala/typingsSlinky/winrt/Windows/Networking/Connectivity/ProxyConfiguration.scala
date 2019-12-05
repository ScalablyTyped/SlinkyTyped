package typingsSlinky.winrt.Windows.Networking.Connectivity

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Connectivity.ProxyConfiguration")
@js.native
class ProxyConfiguration () extends IProxyConfiguration {
  /* CompleteClass */
  override var canConnectDirectly: Boolean = js.native
  /* CompleteClass */
  override var proxyUris: IVectorView[Uri] = js.native
}

