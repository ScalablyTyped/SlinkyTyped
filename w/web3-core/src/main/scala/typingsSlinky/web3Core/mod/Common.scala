package typingsSlinky.web3Core.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Common extends js.Object {
  var baseChain: js.UndefOr[chain] = js.native
  var customChain: CustomChainParams = js.native
  var hardfork: js.UndefOr[typingsSlinky.web3Core.mod.hardfork] = js.native
}

object Common {
  @scala.inline
  def apply(customChain: CustomChainParams): Common = {
    val __obj = js.Dynamic.literal(customChain = customChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Common]
  }
  @scala.inline
  implicit class CommonOps[Self <: Common] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomChain(value: CustomChainParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseChain(value: chain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseChain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseChain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseChain")(js.undefined)
        ret
    }
    @scala.inline
    def withHardfork(value: hardfork): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardfork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardfork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardfork")(js.undefined)
        ret
    }
  }
  
}

