package typingsSlinky.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSqlTokenType extends _SqlTokenType {
  var glue: SqlTokenType = js.native
  var members: js.Array[SqlTokenType] = js.native
  var `type`: js.Symbol = js.native
}

object ListSqlTokenType {
  @scala.inline
  def apply(glue: SqlTokenType, members: js.Array[SqlTokenType], `type`: js.Symbol): ListSqlTokenType = {
    val __obj = js.Dynamic.literal(glue = glue.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSqlTokenType]
  }
  @scala.inline
  implicit class ListSqlTokenTypeOps[Self <: ListSqlTokenType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlue(value: SqlTokenType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers(value: js.Array[SqlTokenType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

