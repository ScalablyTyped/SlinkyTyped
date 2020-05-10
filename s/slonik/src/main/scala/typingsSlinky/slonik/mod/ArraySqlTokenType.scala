package typingsSlinky.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArraySqlTokenType extends _SqlTokenType {
  var memberType: TypeNameIdentifierType | SqlTokenType = js.native
  var `type`: js.Symbol = js.native
  var values: js.Array[ValueExpressionType] = js.native
}

object ArraySqlTokenType {
  @scala.inline
  def apply(
    memberType: TypeNameIdentifierType | SqlTokenType,
    `type`: js.Symbol,
    values: js.Array[ValueExpressionType]
  ): ArraySqlTokenType = {
    val __obj = js.Dynamic.literal(memberType = memberType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArraySqlTokenType]
  }
  @scala.inline
  implicit class ArraySqlTokenTypeOps[Self <: ArraySqlTokenType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMemberType(value: TypeNameIdentifierType | SqlTokenType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memberType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[ValueExpressionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

