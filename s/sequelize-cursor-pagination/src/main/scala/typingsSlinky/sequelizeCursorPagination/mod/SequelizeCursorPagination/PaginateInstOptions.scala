package typingsSlinky.sequelizeCursorPagination.mod.SequelizeCursorPagination

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginateInstOptions[T] extends BasicPaginateOptions[T] {
  var raw: js.UndefOr[Boolean] = js.native
}

object PaginateInstOptions {
  @scala.inline
  def apply[T](): PaginateInstOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginateInstOptions[T]]
  }
  @scala.inline
  implicit class PaginateInstOptionsOps[Self[t] <: PaginateInstOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withRaw(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
  }
  
}

