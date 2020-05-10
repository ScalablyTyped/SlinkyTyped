package typingsSlinky.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureHelp extends js.Object {
  /**
    * The active parameter of the active signature. Set to `null`
    * if the active signature has no parameters.
    */
  var activeParameter: Double | Null = js.native
  /**
    * The active signature. Set to `null` if no
    * signatures exist.
    */
  var activeSignature: Double | Null = js.native
  /**
    * One or more signatures.
    */
  var signatures: js.Array[SignatureInformation] = js.native
}

object SignatureHelp {
  @scala.inline
  def apply(signatures: js.Array[SignatureInformation]): SignatureHelp = {
    val __obj = js.Dynamic.literal(signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelp]
  }
  @scala.inline
  implicit class SignatureHelpOps[Self <: SignatureHelp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignatures(value: js.Array[SignatureInformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveParameter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveParameterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeParameter")(null)
        ret
    }
    @scala.inline
    def withActiveSignature(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveSignatureNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSignature")(null)
        ret
    }
  }
  
}

