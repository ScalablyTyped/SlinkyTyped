package typingsSlinky.storybookAddonKnobs.colorMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorType
  extends Component[ColorTypeProps, ColorTypeState, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MColorType(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MColorType(): Unit = js.native
  
  def handleChange(color: ColorResult): Unit = js.native
  
  def handleClick(): Unit = js.native
  
  def handleWindowMouseDown(e: MouseEvent): Unit = js.native
  
  var popover: HTMLDivElement = js.native
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MColorType(nextProps: ColorTypeProps, nextState: ColorTypeState): Boolean = js.native
}
