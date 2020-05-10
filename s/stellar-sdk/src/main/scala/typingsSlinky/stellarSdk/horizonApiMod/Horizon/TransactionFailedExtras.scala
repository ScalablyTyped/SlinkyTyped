package typingsSlinky.stellarSdk.horizonApiMod.Horizon

import typingsSlinky.stellarSdk.AnonOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionFailedExtras extends js.Object {
  var envelope_xdr: String = js.native
  var result_codes: AnonOperations = js.native
  var result_xdr: String = js.native
}

object TransactionFailedExtras {
  @scala.inline
  def apply(envelope_xdr: String, result_codes: AnonOperations, result_xdr: String): TransactionFailedExtras = {
    val __obj = js.Dynamic.literal(envelope_xdr = envelope_xdr.asInstanceOf[js.Any], result_codes = result_codes.asInstanceOf[js.Any], result_xdr = result_xdr.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionFailedExtras]
  }
  @scala.inline
  implicit class TransactionFailedExtrasOps[Self <: TransactionFailedExtras] (val x: Self) extends AnyVal {
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
    def withResult_codes(value: AnonOperations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_codes")(value.asInstanceOf[js.Any])
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

