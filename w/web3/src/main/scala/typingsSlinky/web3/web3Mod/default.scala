package typingsSlinky.web3.web3Mod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.node.netMod.Socket
import typingsSlinky.web3DashBzz.web3DashBzzMod.Bzz
import typingsSlinky.web3DashCore.web3DashCoreMod.Extension
import typingsSlinky.web3DashCore.web3DashCoreMod.Providers
import typingsSlinky.web3DashCore.web3DashCoreMod.provider
import typingsSlinky.web3DashEth.web3DashEthMod.Eth
import typingsSlinky.web3DashShh.web3DashShhMod.Shh
import typingsSlinky.web3DashUtils.web3DashUtilsMod.Utils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3", JSImport.Default)
@js.native
class default () extends Web3 {
  def this(provider: provider) = this()
  def this(provider: provider, net: Socket) = this()
  /* CompleteClass */
  override var BatchRequest: Instantiable0[typingsSlinky.web3DashCore.web3DashCoreMod.BatchRequest] = js.native
  /* CompleteClass */
  override var bzz: Bzz = js.native
  /* CompleteClass */
  override val currentProvider: provider = js.native
  /* CompleteClass */
  override var defaultAccount: String | Null = js.native
  /* CompleteClass */
  override var defaultBlock: String | Double = js.native
  /* CompleteClass */
  override var eth: Eth = js.native
  /* CompleteClass */
  override val givenProvider: js.Any = js.native
  /* CompleteClass */
  override var shh: Shh = js.native
  /* CompleteClass */
  override var utils: Utils = js.native
  /* CompleteClass */
  override var version: String = js.native
  /* CompleteClass */
  override def extend(extension: Extension): js.Any = js.native
  /* CompleteClass */
  override def setProvider(provider: provider): Boolean = js.native
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

