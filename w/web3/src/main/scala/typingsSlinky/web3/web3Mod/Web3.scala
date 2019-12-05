package typingsSlinky.web3.web3Mod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.web3DashBzz.web3DashBzzMod.Bzz
import typingsSlinky.web3DashCore.web3DashCoreMod.BatchRequest
import typingsSlinky.web3DashCore.web3DashCoreMod.Extension
import typingsSlinky.web3DashCore.web3DashCoreMod.provider
import typingsSlinky.web3DashEth.web3DashEthMod.Eth
import typingsSlinky.web3DashShh.web3DashShhMod.Shh
import typingsSlinky.web3DashUtils.web3DashUtilsMod.Utils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Web3 extends js.Object {
  var BatchRequest: Instantiable0[typingsSlinky.web3DashCore.web3DashCoreMod.BatchRequest]
  var bzz: Bzz
  val currentProvider: provider
  var defaultAccount: String | Null
  var defaultBlock: String | Double
  var eth: Eth
  val givenProvider: js.Any
  var shh: Shh
  var utils: Utils
  var version: String
  def extend(extension: Extension): js.Any
  def setProvider(provider: provider): Boolean
}

object Web3 {
  @scala.inline
  def apply(
    BatchRequest: Instantiable0[BatchRequest],
    bzz: Bzz,
    defaultBlock: String | Double,
    eth: Eth,
    extend: Extension => js.Any,
    givenProvider: js.Any,
    setProvider: provider => Boolean,
    shh: Shh,
    utils: Utils,
    version: String,
    currentProvider: provider = null,
    defaultAccount: String = null
  ): Web3 = {
    val __obj = js.Dynamic.literal(BatchRequest = BatchRequest.asInstanceOf[js.Any], bzz = bzz.asInstanceOf[js.Any], defaultBlock = defaultBlock.asInstanceOf[js.Any], eth = eth.asInstanceOf[js.Any], extend = js.Any.fromFunction1(extend), givenProvider = givenProvider.asInstanceOf[js.Any], setProvider = js.Any.fromFunction1(setProvider), shh = shh.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (currentProvider != null) __obj.updateDynamic("currentProvider")(currentProvider.asInstanceOf[js.Any])
    if (defaultAccount != null) __obj.updateDynamic("defaultAccount")(defaultAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Web3]
  }
}

