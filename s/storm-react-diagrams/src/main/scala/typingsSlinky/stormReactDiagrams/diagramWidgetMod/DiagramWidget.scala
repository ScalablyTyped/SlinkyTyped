package typingsSlinky.stormReactDiagrams.diagramWidgetMod

import org.scalajs.dom.raw.KeyboardEvent
import slinky.core.facade.ReactElement
import typingsSlinky.stormReactDiagrams.anon.Element
import typingsSlinky.stormReactDiagrams.baseActionMod.BaseAction
import typingsSlinky.stormReactDiagrams.baseWidgetMod.BaseWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/widgets/DiagramWidget", "DiagramWidget")
@js.native
class DiagramWidget protected () extends BaseWidget[DiagramProps, DiagramState] {
  def this(props: DiagramProps) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MDiagramWidget(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDiagramWidget(): Unit = js.native
  
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDiagramWidget(nextProps: DiagramProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDiagramWidget(): Unit = js.native
  
  @JSName("componentWillUpdate")
  def componentWillUpdate_MDiagramWidget(nextProps: DiagramProps): Unit = js.native
  
  def drawSelectionBox(): ReactElement = js.native
  
  def fireAction(): Unit = js.native
  
  /**
    * Gets a model and element under the mouse cursor
    */
  def getMouseElement(event: js.Any): Element = js.native
  
  def onKeyUp(event: js.Any): Unit = js.native
  
  def onKeyUpPointer(ev: KeyboardEvent): Unit = js.native
  
  def onMouseMove(event: js.Any): Unit = js.native
  
  def onMouseUp(event: js.Any): Unit = js.native
  
  def startFiringAction(action: BaseAction): Unit = js.native
  
  def stopFiringAction(): Unit = js.native
  def stopFiringAction(shouldSkipEvent: Boolean): Unit = js.native
}
/* static members */
@JSImport("storm-react-diagrams/dist/src/widgets/DiagramWidget", "DiagramWidget")
@js.native
object DiagramWidget extends js.Object {
  
  var defaultProps: DiagramProps = js.native
}
