package typingsSlinky.stormReactDiagrams

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import slinky.core.facade.ReactElement
import typingsSlinky.stormReactDiagrams.abstractLabelFactoryMod.AbstractLabelFactory
import typingsSlinky.stormReactDiagrams.abstractLinkFactoryMod.AbstractLinkFactory
import typingsSlinky.stormReactDiagrams.abstractNodeFactoryMod.AbstractNodeFactory
import typingsSlinky.stormReactDiagrams.abstractPortFactoryMod.AbstractPortFactory
import typingsSlinky.stormReactDiagrams.anon.HAdjustmentFactor
import typingsSlinky.stormReactDiagrams.anon.Height
import typingsSlinky.stormReactDiagrams.anon.Width
import typingsSlinky.stormReactDiagrams.anon.X
import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsSlinky.stormReactDiagrams.baseEntityMod.BaseListener
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModel
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModelListener
import typingsSlinky.stormReactDiagrams.diagramModelMod.DiagramModel
import typingsSlinky.stormReactDiagrams.labelModelMod.LabelModel
import typingsSlinky.stormReactDiagrams.linkModelMod.LinkModel
import typingsSlinky.stormReactDiagrams.linkModelMod.LinkModelListener
import typingsSlinky.stormReactDiagrams.nodeModelMod.NodeModel
import typingsSlinky.stormReactDiagrams.portModelMod.PortModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagramEngineMod {
  
  @JSImport("storm-react-diagrams/dist/src/DiagramEngine", "DiagramEngine")
  @js.native
  class DiagramEngine () extends BaseEntity[DiagramEngineListener] {
    
    def calculateCanvasMatrix(): Unit = js.native
    
    /**
      * Despite being a long method, we simply iterate over all three collections (nodes, ports and points)
      * to find the highest X and Y dimensions, so we can build the matrix large enough to contain all elements.
      */
    def calculateMatrixDimensions(): HAdjustmentFactor = js.native
    
    def calculateRoutingMatrix(): Unit = js.native
    
    def canEntityRepaint(baseModel: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]): Boolean = js.native
    
    var canvas: Element = js.native
    
    var canvasMatrix: js.Array[js.Array[Double]] = js.native
    
    def clearRepaintEntities(): Unit = js.native
    
    var diagramModel: DiagramModel = js.native
    
    def enableRepaintEntities(entities: js.Array[BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]]): Unit = js.native
    
    def generateWidgetForLink(link: LinkModel[LinkModelListener]): ReactElement | Null = js.native
    
    def generateWidgetForNode(node: NodeModel): ReactElement | Null = js.native
    
    /**
      * A representation of the canvas in the following format:
      *
      * +-----------------+
      * | 0 0 0 0 0 0 0 0 |
      * | 0 0 0 0 0 0 0 0 |
      * | 0 0 0 0 0 0 0 0 |
      * | 0 0 0 0 0 0 0 0 |
      * | 0 0 0 0 0 0 0 0 |
      * +-----------------+
      *
      * In which all walkable points are marked by zeros.
      * It uses @link{#ROUTING_SCALING_FACTOR} to reduce the matrix dimensions and improve performance.
      */
    def getCanvasMatrix(): js.Array[js.Array[Double]] = js.native
    
    def getDiagramModel(): DiagramModel = js.native
    
    def getFactoryForLabel(label: LabelModel): AbstractLabelFactory[LabelModel] | Null = js.native
    
    def getFactoryForLink(link: LinkModel[LinkModelListener]): AbstractLinkFactory[LinkModel[LinkModelListener]] | Null = js.native
    
    def getFactoryForNode(node: NodeModel): AbstractNodeFactory[NodeModel] | Null = js.native
    
    def getLabelFactories(): StringDictionary[AbstractLabelFactory[LabelModel]] = js.native
    
    def getLabelFactory(`type`: String): AbstractLabelFactory[LabelModel] = js.native
    
    def getLinkFactories(): StringDictionary[AbstractLinkFactory[LinkModel[LinkModelListener]]] = js.native
    
    def getLinkFactory(`type`: String): AbstractLinkFactory[LinkModel[LinkModelListener]] = js.native
    
    def getMaxNumberPointsPerLink(): Double = js.native
    
    /**
      * Determine the width and height of the node passed in.
      * It currently assumes nodes have a rectangular shape, can be overriden for customised shapes.
      */
    def getNodeDimensions(node: NodeModel): Width = js.native
    
    def getNodeElement(node: NodeModel): Element = js.native
    
    def getNodeFactories(): StringDictionary[AbstractNodeFactory[NodeModel]] = js.native
    
    def getNodeFactory(`type`: String): AbstractNodeFactory[NodeModel] = js.native
    
    def getNodePortElement(port: PortModel): js.Any = js.native
    
    def getPortCenter(port: PortModel): X = js.native
    
    /**
      * Calculate rectangular coordinates of the port passed in.
      */
    def getPortCoords(port: PortModel): Height = js.native
    
    def getPortFactory(`type`: String): AbstractPortFactory[PortModel] = js.native
    
    def getRelativeMousePoint(event: js.Any): X = js.native
    
    def getRelativePoint(x: js.Any, y: js.Any): X = js.native
    
    /**
      * A representation of the canvas in the following format:
      *
      * +-----------------+
      * | 0 0 1 1 0 0 0 0 |
      * | 0 0 1 1 0 0 1 1 |
      * | 0 0 0 0 0 0 1 1 |
      * | 1 1 0 0 0 0 0 0 |
      * | 1 1 0 0 0 0 0 0 |
      * +-----------------+
      *
      * In which all points blocked by a node (and its ports) are
      * marked as 1; points were there is nothing (ie, free) receive 0.
      */
    def getRoutingMatrix(): js.Array[js.Array[Double]] = js.native
    
    var hAdjustmentFactor: Double = js.native
    
    def installDefaultFactories(): Unit = js.native
    
    /**
      * Checks to see if a model is locked by running through
      * its parents to see if they are locked first
      */
    def isModelLocked(model: BaseEntity[BaseListener[_]]): Boolean = js.native
    
    def isSmartRoutingEnabled(): Boolean = js.native
    
    var labelFactories: StringDictionary[AbstractLabelFactory[LabelModel]] = js.native
    
    var linkFactories: StringDictionary[AbstractLinkFactory[LinkModel[LinkModelListener]]] = js.native
    
    def markMatrixPoint(matrix: js.Array[js.Array[Double]], x: Double, y: Double): Unit = js.native
    
    /**
      * Updates (by reference) where nodes will be drawn on the matrix passed in.
      */
    def markNodes(matrix: js.Array[js.Array[Double]]): Unit = js.native
    
    /**
      * Updates (by reference) where ports will be drawn on the matrix passed in.
      */
    def markPorts(matrix: js.Array[js.Array[Double]]): Unit = js.native
    
    var maxNumberPointsPerLink: Double = js.native
    
    var nodeFactories: StringDictionary[AbstractNodeFactory[NodeModel]] = js.native
    
    var nodesRendered: Boolean = js.native
    
    var portFactories: StringDictionary[AbstractPortFactory[PortModel]] = js.native
    
    def recalculatePortsVisually(): Unit = js.native
    
    def registerLabelFactory(factory: AbstractLabelFactory[LabelModel]): Unit = js.native
    
    def registerLinkFactory(factory: AbstractLinkFactory[LinkModel[LinkModelListener]]): Unit = js.native
    
    def registerNodeFactory(factory: AbstractNodeFactory[NodeModel]): Unit = js.native
    
    def registerPortFactory(factory: AbstractPortFactory[PortModel]): Unit = js.native
    
    def repaintCanvas(): Unit = js.native
    
    var routingMatrix: js.Array[js.Array[Double]] = js.native
    
    def setCanvas(): Unit = js.native
    def setCanvas(canvas: Element): Unit = js.native
    
    def setDiagramModel(model: DiagramModel): Unit = js.native
    
    def setMaxNumberPointsPerLink(max: Double): Unit = js.native
    
    def setSmartRoutingStatus(status: Boolean): Unit = js.native
    
    var smartRouting: Boolean = js.native
    
    /**
      * The routing matrix does not have negative indexes, but elements could be negatively positioned.
      * We use the functions below to translate back and forth between these coordinates, relying on the
      * calculated values of hAdjustmentFactor and vAdjustmentFactor.
      */
    def translateRoutingX(x: Double): Double = js.native
    def translateRoutingX(x: Double, reverse: Boolean): Double = js.native
    
    def translateRoutingY(y: Double): Double = js.native
    def translateRoutingY(y: Double, reverse: Boolean): Double = js.native
    
    var vAdjustmentFactor: Double = js.native
    
    def zoomToFit(): Unit = js.native
  }
  
  @js.native
  trait DiagramEngineListener
    extends BaseListener[js.Any] {
    
    var labelFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.native
    
    var linkFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.native
    
    var nodeFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.native
    
    var portFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.native
    
    var repaintCanvas: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object DiagramEngineListener {
    
    @scala.inline
    def apply(): DiagramEngineListener = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiagramEngineListener]
    }
    
    @scala.inline
    implicit class DiagramEngineListenerMutableBuilder[Self <: DiagramEngineListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabelFactoriesUpdated(value: () => Unit): Self = StObject.set(x, "labelFactoriesUpdated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLabelFactoriesUpdatedUndefined: Self = StObject.set(x, "labelFactoriesUpdated", js.undefined)
      
      @scala.inline
      def setLinkFactoriesUpdated(value: () => Unit): Self = StObject.set(x, "linkFactoriesUpdated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLinkFactoriesUpdatedUndefined: Self = StObject.set(x, "linkFactoriesUpdated", js.undefined)
      
      @scala.inline
      def setNodeFactoriesUpdated(value: () => Unit): Self = StObject.set(x, "nodeFactoriesUpdated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNodeFactoriesUpdatedUndefined: Self = StObject.set(x, "nodeFactoriesUpdated", js.undefined)
      
      @scala.inline
      def setPortFactoriesUpdated(value: () => Unit): Self = StObject.set(x, "portFactoriesUpdated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPortFactoriesUpdatedUndefined: Self = StObject.set(x, "portFactoriesUpdated", js.undefined)
      
      @scala.inline
      def setRepaintCanvas(value: () => Unit): Self = StObject.set(x, "repaintCanvas", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRepaintCanvasUndefined: Self = StObject.set(x, "repaintCanvas", js.undefined)
    }
  }
}
