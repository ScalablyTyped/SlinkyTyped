package typingsSlinky.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedTemplateLiteralInvocationType[Result] extends js.Object {
  var sql: String = js.native
  var `type`: js.Symbol = js.native
  var values: js.Array[ValueExpressionType] = js.native
}

object TaggedTemplateLiteralInvocationType {
  @scala.inline
  def apply[Result](sql: String, `type`: js.Symbol, values: js.Array[ValueExpressionType]): TaggedTemplateLiteralInvocationType[Result] = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaggedTemplateLiteralInvocationType[Result]]
  }
  @scala.inline
  implicit class TaggedTemplateLiteralInvocationTypeOps[Self[result] <: TaggedTemplateLiteralInvocationType[result], Result] (val x: Self[Result]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Result] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Result]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Result] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Result] with Other]
    @scala.inline
    def withSql(value: String): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: js.Symbol): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[ValueExpressionType]): Self[Result] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

