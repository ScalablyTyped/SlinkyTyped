package typingsSlinky.stellarBase.mod.Operation

import typingsSlinky.stellarBase.mod.Asset
import typingsSlinky.stellarBase.mod.OperationType.PathPaymentStrictSend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathPaymentStrictSend_ extends BaseOperation[PathPaymentStrictSend] {
  var destAsset: Asset = js.native
  var destMin: String = js.native
  var destination: String = js.native
  var path: js.Array[Asset] = js.native
  var sendAmount: String = js.native
  var sendAsset: Asset = js.native
}

object PathPaymentStrictSend_ {
  @scala.inline
  def apply(
    destAsset: Asset,
    destMin: String,
    destination: String,
    path: js.Array[Asset],
    sendAmount: String,
    sendAsset: Asset,
    `type`: PathPaymentStrictSend
  ): PathPaymentStrictSend_ = {
    val __obj = js.Dynamic.literal(destAsset = destAsset.asInstanceOf[js.Any], destMin = destMin.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sendAmount = sendAmount.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPaymentStrictSend_]
  }
  @scala.inline
  implicit class PathPaymentStrictSend_Ops[Self <: PathPaymentStrictSend_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestAsset(value: Asset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestMin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[Asset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSendAsset(value: Asset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendAsset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

