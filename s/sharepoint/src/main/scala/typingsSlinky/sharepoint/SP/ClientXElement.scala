package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientXElement extends js.Object {
  def get_element(): XElement = js.native
  def set_element(value: XElement): Unit = js.native
}

object ClientXElement {
  @scala.inline
  def apply(get_element: () => XElement, set_element: XElement => Unit): ClientXElement = {
    val __obj = js.Dynamic.literal(get_element = js.Any.fromFunction0(get_element), set_element = js.Any.fromFunction1(set_element))
    __obj.asInstanceOf[ClientXElement]
  }
  @scala.inline
  implicit class ClientXElementOps[Self <: ClientXElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_element(value: () => XElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_element")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_element(value: XElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_element")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

