package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IParentElement extends js.Object {
  var isReadOnly: Boolean = js.native
  def addElement(element: IElement, index: Double): js.Any = js.native
  def removeElement(element: IElement): Boolean = js.native
}

object IParentElement {
  @scala.inline
  def apply(addElement: (IElement, Double) => js.Any, isReadOnly: Boolean, removeElement: IElement => Boolean): IParentElement = {
    val __obj = js.Dynamic.literal(addElement = js.Any.fromFunction2(addElement), isReadOnly = isReadOnly.asInstanceOf[js.Any], removeElement = js.Any.fromFunction1(removeElement))
    __obj.asInstanceOf[IParentElement]
  }
  @scala.inline
  implicit class IParentElementOps[Self <: IParentElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddElement(value: (IElement, Double) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveElement(value: IElement => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeElement")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

