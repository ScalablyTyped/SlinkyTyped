package typingsSlinky.slickgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumnId extends js.Object {
  var columnId: String = js.native
  var sortAsc: Boolean = js.native
}

object AnonColumnId {
  @scala.inline
  def apply(columnId: String, sortAsc: Boolean): AnonColumnId = {
    val __obj = js.Dynamic.literal(columnId = columnId.asInstanceOf[js.Any], sortAsc = sortAsc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnId]
  }
  @scala.inline
  implicit class AnonColumnIdOps[Self <: AnonColumnId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortAsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAsc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

