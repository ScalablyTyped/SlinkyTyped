package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait col extends js.Object {
  var col: String = js.native
}

object col {
  @scala.inline
  def apply(col: String): col = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any])
    __obj.asInstanceOf[col]
  }
  @scala.inline
  implicit class colOps[Self <: col] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

