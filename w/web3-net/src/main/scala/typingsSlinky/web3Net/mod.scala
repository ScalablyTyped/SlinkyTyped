package typingsSlinky.web3Net

import typingsSlinky.node.netMod.Socket
import typingsSlinky.web3Core.mod.NetworkBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-net", "Network")
  @js.native
  class Network () extends NetworkBase {
    def this(provider: typingsSlinky.web3Core.mod.provider) = this()
    def this(provider: typingsSlinky.web3Core.mod.provider, net: Socket) = this()
  }
}
