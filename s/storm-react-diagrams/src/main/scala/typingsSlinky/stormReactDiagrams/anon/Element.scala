package typingsSlinky.stormReactDiagrams.anon

import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseListener
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModel
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var element: org.scalajs.dom.raw.Element
  var model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]
}

object Element {
  @scala.inline
  def apply(
    element: org.scalajs.dom.raw.Element,
    model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]
  ): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

