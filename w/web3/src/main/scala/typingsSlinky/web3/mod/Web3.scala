package typingsSlinky.web3.mod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.web3Bzz.mod.Bzz
import typingsSlinky.web3Core.mod.BatchRequest
import typingsSlinky.web3Core.mod.Extension
import typingsSlinky.web3Core.mod.provider
import typingsSlinky.web3Eth.mod.Eth
import typingsSlinky.web3Shh.mod.Shh
import typingsSlinky.web3Utils.mod.Utils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Web3 extends js.Object {
  var BatchRequest: Instantiable0[typingsSlinky.web3Core.mod.BatchRequest] = js.native
  var bzz: Bzz = js.native
  val currentProvider: provider = js.native
  var defaultAccount: String | Null = js.native
  var defaultBlock: String | Double = js.native
  var eth: Eth = js.native
  val givenProvider: js.Any = js.native
  var shh: Shh = js.native
  var utils: Utils = js.native
  var version: String = js.native
  def extend(extension: Extension): js.Any = js.native
  def setProvider(provider: provider): Boolean = js.native
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
    version: String
  ): Web3 = {
    val __obj = js.Dynamic.literal(BatchRequest = BatchRequest.asInstanceOf[js.Any], bzz = bzz.asInstanceOf[js.Any], defaultBlock = defaultBlock.asInstanceOf[js.Any], eth = eth.asInstanceOf[js.Any], extend = js.Any.fromFunction1(extend), givenProvider = givenProvider.asInstanceOf[js.Any], setProvider = js.Any.fromFunction1(setProvider), shh = shh.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Web3]
  }
  @scala.inline
  implicit class Web3Ops[Self <: Web3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchRequest(value: Instantiable0[BatchRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBzz(value: Bzz): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bzz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultBlock(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEth(value: Eth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtend(value: Extension => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGivenProvider(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetProvider(value: provider => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProvider")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShh(value: Shh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtils(value: Utils): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentProvider(value: provider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentProviderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentProvider")(null)
        ret
    }
    @scala.inline
    def withDefaultAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultAccountNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAccount")(null)
        ret
    }
  }
  
}

