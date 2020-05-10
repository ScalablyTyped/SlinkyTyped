package typingsSlinky.twilioChat.paginatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paginator[T] extends js.Object {
  var hasNextPage: Boolean = js.native
  var hasPrevPage: Boolean = js.native
  var items: js.Array[T] = js.native
  /**
    * Request next page.
    * Does not modify existing object.
    * @return {Promise<Paginator<T>>}
    */
  def nextPage(): js.Promise[Paginator[T]] = js.native
  /**
    * Request previous page.
    * Does not modify existing object.
    * @return {Promise<Paginator<T>>}
    */
  def prevPage(): js.Promise[Paginator[T]] = js.native
}

object Paginator {
  @scala.inline
  def apply[T](
    hasNextPage: Boolean,
    hasPrevPage: Boolean,
    items: js.Array[T],
    nextPage: () => js.Promise[Paginator[T]],
    prevPage: () => js.Promise[Paginator[T]]
  ): Paginator[T] = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPrevPage = hasPrevPage.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], nextPage = js.Any.fromFunction0(nextPage), prevPage = js.Any.fromFunction0(prevPage))
    __obj.asInstanceOf[Paginator[T]]
  }
  @scala.inline
  implicit class PaginatorOps[Self[t] <: Paginator[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withHasNextPage(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasNextPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasPrevPage(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasPrevPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextPage(value: () => js.Promise[Paginator[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrevPage(value: () => js.Promise[Paginator[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevPage")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

