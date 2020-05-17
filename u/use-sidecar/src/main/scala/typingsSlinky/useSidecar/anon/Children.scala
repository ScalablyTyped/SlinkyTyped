package typingsSlinky.useSidecar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children[T /* <: js.Array[_] */] extends js.Object {
  def children(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param prop because its type T is not an array type */ prop: T
  ): js.Any = js.native
}

object Children {
  @scala.inline
  def apply[T](children: T => js.Any): Children[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[Children[T]]
  }
  @scala.inline
  implicit class ChildrenOps[Self[t] <: Children[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChildren(value: T => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

