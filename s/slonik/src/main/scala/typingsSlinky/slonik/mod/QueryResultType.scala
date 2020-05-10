package typingsSlinky.slonik.mod

import typingsSlinky.slonik.slonikStrings.DELETE
import typingsSlinky.slonik.slonikStrings.INSERT
import typingsSlinky.slonik.slonikStrings.SELECT
import typingsSlinky.slonik.slonikStrings.UPDATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResultType[T] extends js.Object {
  var command: DELETE | INSERT | SELECT | UPDATE = js.native
  var fields: js.Array[FieldType] = js.native
  var notices: js.Array[NoticeType] = js.native
  var oid: Double | Null = js.native
  var rowAsArray: Boolean = js.native
  var rowCount: Double = js.native
  var rows: js.Array[T] = js.native
}

object QueryResultType {
  @scala.inline
  def apply[T](
    command: DELETE | INSERT | SELECT | UPDATE,
    fields: js.Array[FieldType],
    notices: js.Array[NoticeType],
    rowAsArray: Boolean,
    rowCount: Double,
    rows: js.Array[T]
  ): QueryResultType[T] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], notices = notices.asInstanceOf[js.Any], rowAsArray = rowAsArray.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResultType[T]]
  }
  @scala.inline
  implicit class QueryResultTypeOps[Self[t] <: QueryResultType[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCommand(value: DELETE | INSERT | SELECT | UPDATE): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[FieldType]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotices(value: js.Array[NoticeType]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowAsArray(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowAsArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowCount(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOid(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOidNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oid")(null)
        ret
    }
  }
  
}

