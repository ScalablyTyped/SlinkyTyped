package typingsSlinky.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormalSignatureItemInfo extends js.Object {
  var docComment: String = js.native
  var parameters: js.Array[FormalParameterInfo] = js.native
  var signatureInfo: String = js.native
  var typeParameters: js.Array[FormalTypeParameterInfo] = js.native
}

object FormalSignatureItemInfo {
  @scala.inline
  def apply(
    docComment: String,
    parameters: js.Array[FormalParameterInfo],
    signatureInfo: String,
    typeParameters: js.Array[FormalTypeParameterInfo]
  ): FormalSignatureItemInfo = {
    val __obj = js.Dynamic.literal(docComment = docComment.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], signatureInfo = signatureInfo.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormalSignatureItemInfo]
  }
  @scala.inline
  implicit class FormalSignatureItemInfoOps[Self <: FormalSignatureItemInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: js.Array[FormalParameterInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignatureInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeParameters(value: js.Array[FormalTypeParameterInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameters")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

