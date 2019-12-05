package typingsSlinky.web3DashCore.web3DashCoreMod

import typingsSlinky.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod.WebsocketProviderBase
import typingsSlinky.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod.WebsocketProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-core", "WebsocketProvider")
@js.native
class WebsocketProvider protected ()
  extends WebsocketProviderBase
     with _provider {
  def this(host: String) = this()
  def this(host: String, options: WebsocketProviderOptions) = this()
}

