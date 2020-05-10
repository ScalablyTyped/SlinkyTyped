package typingsSlinky.stellarBase.mod.OperationOptions

import typingsSlinky.stellarBase.mod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathPaymentStrictReceive extends BaseOptions {
  var destAmount: String = js.native
  var destAsset: Asset = js.native
  var destination: String = js.native
  var path: js.UndefOr[js.Array[Asset]] = js.native
  var sendAsset: Asset = js.native
  var sendMax: String = js.native
}

object PathPaymentStrictReceive {
  @scala.inline
  def apply(destAmount: String, destAsset: Asset, destination: String, sendAsset: Asset, sendMax: String): PathPaymentStrictReceive = {
    val __obj = js.Dynamic.literal(destAmount = destAmount.asInstanceOf[js.Any], destAsset = destAsset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any], sendMax = sendMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPaymentStrictReceive]
  }
  @scala.inline
  implicit class PathPaymentStrictReceiveOps[Self <: PathPaymentStrictReceive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestAsset(value: Asset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendAsset(value: Asset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendMax(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[Asset]): Self = {
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
  }
  
}

