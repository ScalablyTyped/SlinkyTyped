package typingsSlinky.stripe.mod.bitcoinReceivers

import typingsSlinky.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBitcoinReceiverListOptions extends IListOptions {
  /**
    * Filter for active receivers.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Filter for filled receivers.
    */
  var filled: js.UndefOr[Boolean] = js.native
  /**
    * Filter for receivers with uncaptured funds.
    */
  var uncaptured_funds: js.UndefOr[Boolean] = js.native
}

object IBitcoinReceiverListOptions {
  @scala.inline
  def apply(): IBitcoinReceiverListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBitcoinReceiverListOptions]
  }
  @scala.inline
  implicit class IBitcoinReceiverListOptionsOps[Self <: IBitcoinReceiverListOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withFilled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filled")(js.undefined)
        ret
    }
    @scala.inline
    def withUncaptured_funds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncaptured_funds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncaptured_funds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncaptured_funds")(js.undefined)
        ret
    }
  }
  
}

