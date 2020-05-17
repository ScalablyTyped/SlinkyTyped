package typingsSlinky.uiBox.anon

import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.uiBox.boxTypesMod.Is
import typingsSlinky.uiBox.boxTypesMod.RefType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InnerRef[T /* <: Is[_] */] extends js.Object {
  /**
    * Callback that gets passed a ref to inner DOM node (or component if the
    * `is` prop is set to a React component type).
    */
  var innerRef: js.UndefOr[Ref[RefType[T]]] = js.native
  /**
    * Replaces the underlying element
    */
  var is: js.UndefOr[T] = js.native
}

object InnerRef {
  @scala.inline
  def apply[T](): InnerRef[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InnerRef[T]]
  }
  @scala.inline
  implicit class InnerRefOps[Self[t] <: InnerRef[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withInnerRefRefObject(value: ReactRef[RefType[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerRefFunction1(value: /* instance */ RefType[T] | Null => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInnerRef(value: Ref[RefType[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRef: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRefNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(null)
        ret
    }
    @scala.inline
    def withIs(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.undefined)
        ret
    }
  }
  
}

