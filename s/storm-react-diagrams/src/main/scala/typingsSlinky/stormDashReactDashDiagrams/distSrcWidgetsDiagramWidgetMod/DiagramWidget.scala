package typingsSlinky.stormDashReactDashDiagrams.distSrcWidgetsDiagramWidgetMod

import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.Window
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.stormDashReactDashDiagrams.Anon_Element
import typingsSlinky.stormDashReactDashDiagrams.distSrcActionsBaseActionMod.BaseAction
import typingsSlinky.stormDashReactDashDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def drawSelectionBox(): Element = js.native
  def fireAction(): Unit = js.native
  /**
    * Gets a model and element under the mouse cursor
    */
  def getMouseElement(event: js.Any): Anon_Element = js.native
  def onKeyUp(event: js.Any): Unit = js.native
  def onKeyUpPointer(`this`: Window, ev: KeyboardEvent): Unit = js.native
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

