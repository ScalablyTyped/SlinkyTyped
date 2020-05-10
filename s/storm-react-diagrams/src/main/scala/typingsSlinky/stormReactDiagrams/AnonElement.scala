package typingsSlinky.stormReactDiagrams

import org.scalajs.dom.raw.Element
import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseListener
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModel
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonElement extends js.Object {
  var element: Element = js.native
  var model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener] = js.native
}

object AnonElement {
  @scala.inline
  def apply(element: Element, model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]): AnonElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElement]
  }
  @scala.inline
  implicit class AnonElementOps[Self <: AnonElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

