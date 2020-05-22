package typingsSlinky.typescriptServices.TypeScript.Services

import typingsSlinky.typescriptServices.TypeScript.MemberName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeInfo extends js.Object {
  var docComment: String
  var fullSymbolName: String
  var kind: String
  var limChar: Double
  var memberName: MemberName
  var minChar: Double
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
}

