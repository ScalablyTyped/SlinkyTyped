package typingsSlinky.web3Core.mod

import typingsSlinky.node.netMod.Server
import typingsSlinky.web3CoreHelpers.mod.IpcProviderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3-core", "IpcProvider")
@js.native
class IpcProvider protected ()
  extends IpcProviderBase
     with _provider {
  def this(path: String, net: Server) = this()
}
