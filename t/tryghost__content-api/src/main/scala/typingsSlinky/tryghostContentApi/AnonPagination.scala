package typingsSlinky.tryghostContentApi

import typingsSlinky.tryghostContentApi.mod.Pagination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPagination extends js.Object {
  var pagination: Pagination = js.native
}

object AnonPagination {
  @scala.inline
  def apply(pagination: Pagination): AnonPagination = {
    val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPagination]
  }
  @scala.inline
  implicit class AnonPaginationOps[Self <: AnonPagination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPagination(value: Pagination): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

