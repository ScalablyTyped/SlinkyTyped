package typingsSlinky.stormReactDiagrams.defaultLinkWidgetMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.SVGPathElement
import slinky.core.facade.ReactElement
import typingsSlinky.stormReactDiagrams.anon.Path
import typingsSlinky.stormReactDiagrams.baseWidgetMod.BaseWidget
import typingsSlinky.stormReactDiagrams.labelModelMod.LabelModel
import typingsSlinky.stormReactDiagrams.pathFindingMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultLinkWidget", "DefaultLinkWidget")
@js.native
class DefaultLinkWidget protected () extends BaseWidget[DefaultLinkProps, DefaultLinkState] {
  def this(props: DefaultLinkProps) = this()
  
  def addPointToLink(event: MouseEvent, index: Double): Unit = js.native
  
  def calculateAllLabelPosition(): Unit = js.native
  
  def calculateLabelPosition(label: js.Any, index: Double): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MDefaultLinkWidget(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDefaultLinkWidget(): Unit = js.native
  
  def findPathAndRelativePositionToRenderLabel(index: Double): Path = js.native
  
  def generateLabel(label: LabelModel): ReactElement = js.native
  
  def generateLink(path: String, extraProps: js.Any, id: String): ReactElement = js.native
  def generateLink(path: String, extraProps: js.Any, id: Double): ReactElement = js.native
  
  def generatePoint(pointIndex: Double): ReactElement = js.native
  
  /**
    * Smart routing is only applicable when all conditions below are true:
    * - smart routing is set to true on the engine
    * - current link is between two nodes (not between a node and an empty point)
    * - no custom points exist along the line
    */
  def isSmartRoutingApplicable(): Boolean = js.native
  
  var pathFinding: default = js.native
  
  var refLabels: StringDictionary[HTMLElement] = js.native
  
  var refPaths: js.Array[SVGPathElement] = js.native
}
/* static members */
@JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultLinkWidget", "DefaultLinkWidget")
@js.native
object DefaultLinkWidget extends js.Object {
  
  var defaultProps: DefaultLinkProps = js.native
}
