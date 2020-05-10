package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubmitTransactionResponse extends js.Object {
  var envelope_xdr: String = js.native
  var hash: String = js.native
  var ledger: Double = js.native
  var result_meta_xdr: String = js.native
  var result_xdr: String = js.native
}

object SubmitTransactionResponse {
  @scala.inline
  def apply(envelope_xdr: String, hash: String, ledger: Double, result_meta_xdr: String, result_xdr: String): SubmitTransactionResponse = {
    val __obj = js.Dynamic.literal(envelope_xdr = envelope_xdr.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], ledger = ledger.asInstanceOf[js.Any], result_meta_xdr = result_meta_xdr.asInstanceOf[js.Any], result_xdr = result_xdr.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitTransactionResponse]
  }
  @scala.inline
  implicit class SubmitTransactionResponseOps[Self <: SubmitTransactionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvelope_xdr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envelope_xdr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLedger(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ledger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult_meta_xdr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_meta_xdr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult_xdr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_xdr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

