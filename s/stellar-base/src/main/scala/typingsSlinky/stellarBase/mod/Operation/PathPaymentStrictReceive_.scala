package typingsSlinky.stellarBase.mod.Operation

import typingsSlinky.stellarBase.mod.Asset
import typingsSlinky.stellarBase.mod.OperationType.PathPaymentStrictReceive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathPaymentStrictReceive_ extends BaseOperation[PathPaymentStrictReceive] {
  var destAmount: String = js.native
  var destAsset: Asset = js.native
  var destination: String = js.native
  var path: js.Array[Asset] = js.native
  var sendAsset: Asset = js.native
  var sendMax: String = js.native
}

object PathPaymentStrictReceive_ {
  @scala.inline
  def apply(
    destAmount: String,
    destAsset: Asset,
    destination: String,
    path: js.Array[Asset],
    sendAsset: Asset,
    sendMax: String,
    `type`: PathPaymentStrictReceive
  ): PathPaymentStrictReceive_ = {
    val __obj = js.Dynamic.literal(destAmount = destAmount.asInstanceOf[js.Any], destAsset = destAsset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any], sendMax = sendMax.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPaymentStrictReceive_]
  }
  @scala.inline
  implicit class PathPaymentStrictReceive_Ops[Self <: PathPaymentStrictReceive_] (val x: Self) extends AnyVal {
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
    def withPath(value: js.Array[Asset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
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
  }
  
}

