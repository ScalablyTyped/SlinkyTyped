package typingsSlinky.storybookAddonKnobs.arrayMod

import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.storybookAddonKnobs.anon.ReadonlyArrayTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayType
  extends Component[ArrayTypeProps, js.Object, js.Any] {
  
  def handleChange(e: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MArrayType(nextProps: ReadonlyArrayTypeProps): Boolean = js.native
}
