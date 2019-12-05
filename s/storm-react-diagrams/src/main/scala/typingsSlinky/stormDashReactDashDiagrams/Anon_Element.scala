package typingsSlinky.stormDashReactDashDiagrams

import org.scalajs.dom.raw.Element
import typingsSlinky.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseEntity
import typingsSlinky.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseListener
import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModel
import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  var element: Element
  var model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]
}

object Anon_Element {
  @scala.inline
  def apply(element: Element, model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]): Anon_Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Element]
  }
}

