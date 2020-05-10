package typingsSlinky.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountInfoParams extends CommonParams {
      // if both these fields are missing, the user will select an account
  var coin: String = js.native
  var path: js.UndefOr[js.Array[Double]] = js.native
    // NOTE:
  var xpub: js.UndefOr[String] = js.native
}

object GetAccountInfoParams {
  @scala.inline
  def apply(coin: String): GetAccountInfoParams = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountInfoParams]
  }
  @scala.inline
  implicit class GetAccountInfoParamsOps[Self <: GetAccountInfoParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withXpub(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXpub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpub")(js.undefined)
        ret
    }
  }
  
}

