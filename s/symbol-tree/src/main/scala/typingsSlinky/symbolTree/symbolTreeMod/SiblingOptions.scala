package typingsSlinky.symbolTree.symbolTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SiblingOptions[T /* <: js.Object */] extends js.Object {
  /**
  		 * Used to constrain the operation to a subtree.
  		 *
  		 * When `null`, the whole tree is walked to the real root.
  		 *
  		 * @default null
  		 */
  var root: js.UndefOr[T | Null] = js.native
  /**
  		 * If set, ignore the children of `object`
  		 *
  		 * @default false
  		 */
  var skipChildren: js.UndefOr[Boolean] = js.native
}

object SiblingOptions {
  @scala.inline
  def apply[T](): SiblingOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiblingOptions[T]]
  }
  @scala.inline
  implicit class SiblingOptionsOps[Self[t] <: SiblingOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withRoot(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withSkipChildren(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipChildren: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipChildren")(js.undefined)
        ret
    }
  }
  
}

