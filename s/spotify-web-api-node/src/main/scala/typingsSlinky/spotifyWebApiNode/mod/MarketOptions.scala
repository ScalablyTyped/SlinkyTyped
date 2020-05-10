package typingsSlinky.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketOptions extends js.Object {
  var market: js.UndefOr[String] = js.native
}

object MarketOptions {
  @scala.inline
  def apply(): MarketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarketOptions]
  }
  @scala.inline
  implicit class MarketOptionsOps[Self <: MarketOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("market")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("market")(js.undefined)
        ret
    }
  }
  
}

