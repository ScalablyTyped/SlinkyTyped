package typingsSlinky.scrollIntoViewIfNeeded.mod

import typingsSlinky.scrollIntoViewIfNeeded.typesMod.CustomScrollAction
import typingsSlinky.scrollIntoViewIfNeeded.typesMod.CustomScrollBehaviorCallback
import typingsSlinky.scrollIntoViewIfNeeded.typesMod.ScrollBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[T]
  extends typingsSlinky.scrollIntoViewIfNeeded.typesMod.Options {
  var behavior: js.UndefOr[ScrollBehavior | CustomScrollBehaviorCallback[T]] = js.native
}

object Options {
  @scala.inline
  def apply[T](): Options[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[T]]
  }
  @scala.inline
  implicit class OptionsOps[Self[t] <: Options[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBehaviorFunction1(value: /* actions */ js.Array[CustomScrollAction] => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBehavior(value: ScrollBehavior | CustomScrollBehaviorCallback[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehavior: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behavior")(js.undefined)
        ret
    }
  }
  
}

