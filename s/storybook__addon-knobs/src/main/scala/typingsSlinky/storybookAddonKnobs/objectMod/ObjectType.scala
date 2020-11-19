package typingsSlinky.storybookAddonKnobs.objectMod

import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectType[T]
  extends Component[ObjectTypeProps[T], js.Object, js.Any] {
  
  def handleChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
  
  @JSName("state")
  var state_ObjectType: ObjectTypeState[T] = js.native
}
