package typingsSlinky.sequelizeCursorPagination.mod.SequelizeCursorPagination

import typingsSlinky.sequelizeCursorPagination.sequelizeCursorPaginationBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginateRawOptions[T] extends BasicPaginateOptions[T] {
  var raw: `true` = js.native
}

object PaginateRawOptions {
  @scala.inline
  def apply[T](raw: `true`): PaginateRawOptions[T] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginateRawOptions[T]]
  }
  @scala.inline
  implicit class PaginateRawOptionsOps[Self[t] <: PaginateRawOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withRaw(value: `true`): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

