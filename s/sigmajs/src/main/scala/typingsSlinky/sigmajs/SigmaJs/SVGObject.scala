package typingsSlinky.sigmajs.SigmaJs

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGObject[T] extends js.Object {
  def create(`object`: T, a: js.Any*): Element = js.native
  def update(`object`: T, a: js.Any*): Unit = js.native
}

object SVGObject {
  @scala.inline
  def apply[T](create: (T, /* repeated */ js.Any) => Element, update: (T, /* repeated */ js.Any) => Unit): SVGObject[T] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[SVGObject[T]]
  }
  @scala.inline
  implicit class SVGObjectOps[Self[t] <: SVGObject[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCreate(value: (T, /* repeated */ js.Any) => Element): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpdate(value: (T, /* repeated */ js.Any) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

