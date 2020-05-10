package typingsSlinky.stellarSdk.serverApiMod.ServerApi

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.stellarSdk.AnonAssetcode
import typingsSlinky.stellarSdk.horizonApiMod.Horizon.BaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentPathRecord
  extends BaseResponse[scala.Nothing] {
  var destination_amount: String = js.native
  var destination_asset_code: String = js.native
  var destination_asset_issuer: String = js.native
  var destination_asset_type: String = js.native
  var path: js.Array[AnonAssetcode] = js.native
  var source_amount: String = js.native
  var source_asset_code: String = js.native
  var source_asset_issuer: String = js.native
  var source_asset_type: String = js.native
}

object PaymentPathRecord {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsSlinky.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    destination_amount: String,
    destination_asset_code: String,
    destination_asset_issuer: String,
    destination_asset_type: String,
    path: js.Array[AnonAssetcode],
    source_amount: String,
    source_asset_code: String,
    source_asset_issuer: String,
    source_asset_type: String
  ): PaymentPathRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], destination_amount = destination_amount.asInstanceOf[js.Any], destination_asset_code = destination_asset_code.asInstanceOf[js.Any], destination_asset_issuer = destination_asset_issuer.asInstanceOf[js.Any], destination_asset_type = destination_asset_type.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], source_amount = source_amount.asInstanceOf[js.Any], source_asset_code = source_asset_code.asInstanceOf[js.Any], source_asset_issuer = source_asset_issuer.asInstanceOf[js.Any], source_asset_type = source_asset_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentPathRecord]
  }
  @scala.inline
  implicit class PaymentPathRecordOps[Self <: PaymentPathRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination_amount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination_asset_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination_asset_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination_asset_issuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination_asset_issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination_asset_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination_asset_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[AnonAssetcode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_amount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_asset_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_asset_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_asset_issuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_asset_issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_asset_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_asset_type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

