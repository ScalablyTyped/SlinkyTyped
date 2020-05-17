package typingsSlinky.selectorSet.anon

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Elements[T] extends js.Object {
  var data: T = js.native
  var elements: js.Array[Element] = js.native
  var selector: String = js.native
}

object Elements {
  @scala.inline
  def apply[T](data: T, elements: js.Array[Element], selector: String): Elements[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elements[T]]
  }
  @scala.inline
  implicit class ElementsOps[Self[t] <: Elements[t], T] (val x: Self[T]) extends AnyVal {
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
    def withElements(value: js.Array[Element]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

