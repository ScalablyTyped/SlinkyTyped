package typingsSlinky.winrtUwp.Windows.Networking.Connectivity

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the proxy configuration for the current user. */
@JSGlobal("Windows.Networking.Connectivity.ProxyConfiguration")
@js.native
abstract class ProxyConfiguration () extends js.Object {
  /** Gets a value that indicates if this configuration can connect directly. */
  var canConnectDirectly: Boolean = js.native
  /** Gets a list of URIs for the proxies from the proxy configuration. */
  var proxyUris: IVectorView[Uri] = js.native
}

