package typingsSlinky.stellarBase.mod.OperationOptions

import typingsSlinky.stellarBase.mod.Asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeTrust extends BaseOptions {
  var asset: Asset = js.native
  var limit: js.UndefOr[String] = js.native
}

object ChangeTrust {
  @scala.inline
  def apply(asset: Asset): ChangeTrust = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTrust]
  }
  @scala.inline
  implicit class ChangeTrustOps[Self <: ChangeTrust] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsset(value: Asset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
  }
  
}

