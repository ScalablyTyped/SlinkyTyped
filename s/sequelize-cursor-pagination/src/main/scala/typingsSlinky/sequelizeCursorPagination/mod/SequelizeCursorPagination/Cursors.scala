package typingsSlinky.sequelizeCursorPagination.mod.SequelizeCursorPagination

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cursors extends js.Object {
  var after: String | Null = js.native
  var before: String | Null = js.native
  var hasNext: Boolean = js.native
  var hasPrevious: Boolean = js.native
}

object Cursors {
  @scala.inline
  def apply(hasNext: Boolean, hasPrevious: Boolean): Cursors = {
    val __obj = js.Dynamic.literal(hasNext = hasNext.asInstanceOf[js.Any], hasPrevious = hasPrevious.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursors]
  }
  @scala.inline
  implicit class CursorsOps[Self <: Cursors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasNext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasPrevious(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPrevious")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(null)
        ret
    }
    @scala.inline
    def withBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(null)
        ret
    }
  }
  
}

