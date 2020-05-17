package typingsSlinky.xummApi.anon

import typingsSlinky.xummApi.mod.XrplTransactionType
import typingsSlinky.xummApi.mod.XummJsonTransaction
import typingsSlinky.xummApi.mod.XummTransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Createdat extends js.Object {
  var created_at: String = js.native
  var expires_at: String = js.native
  var expires_in_seconds: Double = js.native
  var request_json: XummJsonTransaction = js.native
  var tx_destination: String = js.native
  var tx_destination_tag: Double | Null = js.native
  var tx_type: XummTransactionType | XrplTransactionType = js.native
}

object Createdat {
  @scala.inline
  def apply(
    created_at: String,
    expires_at: String,
    expires_in_seconds: Double,
    request_json: XummJsonTransaction,
    tx_destination: String,
    tx_type: XummTransactionType | XrplTransactionType
  ): Createdat = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in_seconds = expires_in_seconds.asInstanceOf[js.Any], request_json = request_json.asInstanceOf[js.Any], tx_destination = tx_destination.asInstanceOf[js.Any], tx_type = tx_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Createdat]
  }
  @scala.inline
  implicit class CreatedatOps[Self <: Createdat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires_in_seconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_in_seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest_json(value: XummJsonTransaction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTx_destination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tx_destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTx_type(value: XummTransactionType | XrplTransactionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tx_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTx_destination_tag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tx_destination_tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTx_destination_tagNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tx_destination_tag")(null)
        ret
    }
  }
  
}

