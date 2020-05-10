package typingsSlinky.typescriptServices.TypeScript.PullHelpers

import typingsSlinky.typescriptServices.TypeScript.PullSignatureSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureInfoForFuncDecl extends js.Object {
  var allSignatures: js.Array[PullSignatureSymbol] = js.native
  var signature: PullSignatureSymbol = js.native
}

object SignatureInfoForFuncDecl {
  @scala.inline
  def apply(allSignatures: js.Array[PullSignatureSymbol], signature: PullSignatureSymbol): SignatureInfoForFuncDecl = {
    val __obj = js.Dynamic.literal(allSignatures = allSignatures.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureInfoForFuncDecl]
  }
  @scala.inline
  implicit class SignatureInfoForFuncDeclOps[Self <: SignatureInfoForFuncDecl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllSignatures(value: js.Array[PullSignatureSymbol]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allSignatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature(value: PullSignatureSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

