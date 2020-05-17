package typingsSlinky.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNode[T] extends js.Object {
  var data: T = js.native
  var next: ListNode[T] = js.native
  var previous: ListNode[T] = js.native
}

object ListNode {
  @scala.inline
  def apply[T](data: T, next: ListNode[T], previous: ListNode[T]): ListNode[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNode[T]]
  }
  @scala.inline
  implicit class ListNodeOps[Self[t] <: ListNode[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: ListNode[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevious(value: ListNode[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

