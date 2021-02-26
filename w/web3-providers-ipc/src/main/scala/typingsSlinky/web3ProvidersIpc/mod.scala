package typingsSlinky.web3ProvidersIpc

import typingsSlinky.node.netMod.Server
import typingsSlinky.web3CoreHelpers.mod.IpcProviderBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-providers-ipc", "IpcProvider")
  @js.native
  class IpcProvider protected () extends IpcProviderBase {
    def this(path: String, net: Server) = this()
  }
}
