package typingsSlinky.tryghostContentApi

import typingsSlinky.tryghostContentApi.mod.Pagination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPagination extends js.Object {
  var pagination: Pagination
}

object AnonPagination {
  @scala.inline
  def apply(pagination: Pagination): AnonPagination = {
    val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPagination]
  }
}

