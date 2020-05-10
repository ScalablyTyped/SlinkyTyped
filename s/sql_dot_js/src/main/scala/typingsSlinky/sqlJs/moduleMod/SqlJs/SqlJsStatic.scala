package typingsSlinky.sqlJs.moduleMod.SqlJs

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SqlJsStatic extends js.Object {
  var Database: Instantiable0[typingsSlinky.sqlJs.moduleMod.SqlJs.Database] = js.native
  var Statement: Instantiable0[typingsSlinky.sqlJs.moduleMod.SqlJs.Statement] = js.native
}

object SqlJsStatic {
  @scala.inline
  def apply(Database: Instantiable0[Database], Statement: Instantiable0[Statement]): SqlJsStatic = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlJsStatic]
  }
  @scala.inline
  implicit class SqlJsStaticOps[Self <: SqlJsStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabase(value: Instantiable0[Database]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatement(value: Instantiable0[Statement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

