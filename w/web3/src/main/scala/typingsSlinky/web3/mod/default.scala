package typingsSlinky.web3.mod

import typingsSlinky.node.netMod.Socket
import typingsSlinky.web3Core.mod.Providers
import typingsSlinky.web3Utils.mod.Utils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3", JSImport.Default)
@js.native
class default () extends Web3 {
  def this(provider: typingsSlinky.web3Core.mod.provider) = this()
  def this(provider: typingsSlinky.web3Core.mod.provider, net: Socket) = this()
}
/* static members */
@JSImport("web3", JSImport.Default)
@js.native
object default extends js.Object {
  
  val givenProvider: js.Any = js.native
  
  var modules: Modules = js.native
  
  val providers: Providers = js.native
  
  val utils: Utils = js.native
  
  val version: String = js.native
}
