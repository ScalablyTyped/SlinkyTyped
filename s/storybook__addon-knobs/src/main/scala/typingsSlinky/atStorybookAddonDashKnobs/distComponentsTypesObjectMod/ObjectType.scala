package typingsSlinky.atStorybookAddonDashKnobs.distComponentsTypesObjectMod

import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectType[T]
  extends Component[ObjectTypeProps[T], js.Object, js.Any] {
  @JSName("state")
  var state_ObjectType: ObjectTypeState[T] = js.native
  def handleChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
}

