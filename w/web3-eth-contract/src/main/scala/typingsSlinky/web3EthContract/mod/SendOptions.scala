package typingsSlinky.web3EthContract.mod

import typingsSlinky.bnJs.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendOptions extends js.Object {
  var from: String = js.native
  var gas: js.UndefOr[Double] = js.native
  var gasPrice: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double | String | ^ ] = js.native
}

object SendOptions {
  @scala.inline
  def apply(from: String): SendOptions = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOptions]
  }
  @scala.inline
  implicit class SendOptionsOps[Self <: SendOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gas")(js.undefined)
        ret
    }
    @scala.inline
    def withGasPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGasPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasPrice")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double | String | ^ ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

