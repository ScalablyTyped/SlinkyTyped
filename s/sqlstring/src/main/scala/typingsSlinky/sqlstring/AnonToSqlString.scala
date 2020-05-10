package typingsSlinky.sqlstring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonToSqlString extends js.Object {
  def toSqlString(): String = js.native
}

object AnonToSqlString {
  @scala.inline
  def apply(toSqlString: () => String): AnonToSqlString = {
    val __obj = js.Dynamic.literal(toSqlString = js.Any.fromFunction0(toSqlString))
    __obj.asInstanceOf[AnonToSqlString]
  }
  @scala.inline
  implicit class AnonToSqlStringOps[Self <: AnonToSqlString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToSqlString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSqlString")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

