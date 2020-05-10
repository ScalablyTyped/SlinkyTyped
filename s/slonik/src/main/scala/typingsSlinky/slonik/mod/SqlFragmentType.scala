package typingsSlinky.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlFragmentType extends js.Object {
  var parameters: js.Array[PrimitiveValueExpressionType] = js.native
  var sql: String = js.native
}

object SqlFragmentType {
  @scala.inline
  def apply(parameters: js.Array[PrimitiveValueExpressionType], sql: String): SqlFragmentType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlFragmentType]
  }
  @scala.inline
  implicit class SqlFragmentTypeOps[Self <: SqlFragmentType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameters(value: js.Array[PrimitiveValueExpressionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSql(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

