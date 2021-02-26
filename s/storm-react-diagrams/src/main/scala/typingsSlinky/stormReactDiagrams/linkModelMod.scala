package typingsSlinky.stormReactDiagrams

import typingsSlinky.stormReactDiagrams.anon.BaseEventLinkModelLinkMod
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModel
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModelListener
import typingsSlinky.stormReactDiagrams.diagramModelMod.DiagramModel
import typingsSlinky.stormReactDiagrams.labelModelMod.LabelModel
import typingsSlinky.stormReactDiagrams.pointModelMod.PointModel
import typingsSlinky.stormReactDiagrams.portModelMod.PortModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkModelMod {
  
  @JSImport("storm-react-diagrams/dist/src/models/LinkModel", "LinkModel")
  @js.native
  class LinkModel[T /* <: LinkModelListener */] () extends BaseModel[DiagramModel, T] {
    def this(linkType: String) = this()
    def this(linkType: js.UndefOr[scala.Nothing], id: String) = this()
    def this(linkType: String, id: String) = this()
    
    def addLabel(label: LabelModel): Unit = js.native
    
    def addPoint[P /* <: PointModel */](pointModel: P): P = js.native
    def addPoint[P /* <: PointModel */](pointModel: P, index: Double): P = js.native
    
    def doClone(lookupTable: js.Object, clone: js.Any): Unit = js.native
    
    def generatePoint(): PointModel = js.native
    def generatePoint(x: js.UndefOr[scala.Nothing], y: Double): PointModel = js.native
    def generatePoint(x: Double): PointModel = js.native
    def generatePoint(x: Double, y: Double): PointModel = js.native
    
    def getFirstPoint(): PointModel = js.native
    
    def getLastPoint(): PointModel = js.native
    
    def getPointForPort(port: PortModel): PointModel = js.native
    
    def getPointIndex(point: PointModel): Double = js.native
    
    def getPointModel(id: String): PointModel | Null = js.native
    
    def getPoints(): js.Array[PointModel] = js.native
    
    def getPortForPoint(point: PointModel): PortModel = js.native
    
    def getSourcePort(): PortModel = js.native
    
    def getTargetPort(): PortModel = js.native
    
    def isLastPoint(point: PointModel): Boolean = js.native
    
    var labels: js.Array[LabelModel] = js.native
    
    def point(x: Double, y: Double): PointModel = js.native
    
    var points: js.Array[PointModel] = js.native
    
    def removeMiddlePoints(): Unit = js.native
    
    def removePoint(pointModel: PointModel): Unit = js.native
    
    def removePointsAfter(pointModel: PointModel): Unit = js.native
    
    def removePointsBefore(pointModel: PointModel): Unit = js.native
    
    def setPoints(points: js.Array[PointModel]): Unit = js.native
    
    def setSourcePort(port: PortModel): Unit = js.native
    
    def setTargetPort(port: PortModel): Unit = js.native
    
    var sourcePort: PortModel | Null = js.native
    
    var targetPort: PortModel | Null = js.native
  }
  
  @js.native
  trait LinkModelListener extends BaseModelListener {
    
    var sourcePortChanged: js.UndefOr[js.Function1[/* event */ BaseEventLinkModelLinkMod, Unit]] = js.native
    
    var targetPortChanged: js.UndefOr[js.Function1[/* event */ BaseEventLinkModelLinkMod, Unit]] = js.native
  }
  object LinkModelListener {
    
    @scala.inline
    def apply(): LinkModelListener = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkModelListener]
    }
    
    @scala.inline
    implicit class LinkModelListenerMutableBuilder[Self <: LinkModelListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourcePortChanged(value: /* event */ BaseEventLinkModelLinkMod => Unit): Self = StObject.set(x, "sourcePortChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSourcePortChangedUndefined: Self = StObject.set(x, "sourcePortChanged", js.undefined)
      
      @scala.inline
      def setTargetPortChanged(value: /* event */ BaseEventLinkModelLinkMod => Unit): Self = StObject.set(x, "targetPortChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTargetPortChangedUndefined: Self = StObject.set(x, "targetPortChanged", js.undefined)
    }
  }
}
