package typingsSlinky.useSidecar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChildren[T /* <: js.Array[_] */] extends js.Object {
  def children(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param prop because its type T is not an array type */ prop: T
  ): js.Any = js.native
}

object AnonChildren {
  @scala.inline
  def apply[T](children: T => js.Any): AnonChildren[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[AnonChildren[T]]
  }
  @scala.inline
  implicit class AnonChildrenOps[Self[t] <: AnonChildren[t], T] (val x: Self[T]) extends AnyVal {
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

