package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import typingsSlinky.stellarBase.mod.AssetType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfferAsset extends js.Object {
  var asset_code: js.UndefOr[String] = js.native
  var asset_issuer: js.UndefOr[String] = js.native
  var asset_type: AssetType = js.native
}

object OfferAsset {
  @scala.inline
  def apply(asset_type: AssetType): OfferAsset = {
    val __obj = js.Dynamic.literal(asset_type = asset_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfferAsset]
  }
  @scala.inline
  implicit class OfferAssetOps[Self <: OfferAsset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsset_type(value: AssetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsset_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsset_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_code")(js.undefined)
        ret
    }
    @scala.inline
    def withAsset_issuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsset_issuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset_issuer")(js.undefined)
        ret
    }
  }
  
}

