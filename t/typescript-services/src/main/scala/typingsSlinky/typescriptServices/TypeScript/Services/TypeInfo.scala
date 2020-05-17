package typingsSlinky.typescriptServices.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.MemberName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeInfo extends js.Object {
  var docComment: String = js.native
  var fullSymbolName: String = js.native
  var kind: String = js.native
  var limChar: Double = js.native
  var memberName: MemberName = js.native
  var minChar: Double = js.native
}

object TypeInfo {
  @scala.inline
  def apply(
    docComment: String,
    fullSymbolName: String,
    kind: String,
    limChar: Double,
    memberName: MemberName,
    minChar: Double
  ): TypeInfo = {
    val __obj = js.Dynamic.literal(docComment = docComment.asInstanceOf[js.Any], fullSymbolName = fullSymbolName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeInfo]
  }
  @scala.inline
  implicit class TypeInfoOps[Self <: TypeInfo] (val x: Self) extends AnyVal {
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
    def withFullSymbolName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullSymbolName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimChar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberName(value: MemberName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinChar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minChar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

