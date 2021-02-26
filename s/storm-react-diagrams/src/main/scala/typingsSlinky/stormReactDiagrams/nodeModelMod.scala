package typingsSlinky.stormReactDiagrams

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.stormReactDiagrams.anon.Width
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModel
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModelListener
import typingsSlinky.stormReactDiagrams.diagramModelMod.DiagramModel
import typingsSlinky.stormReactDiagrams.portModelMod.PortModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeModelMod {
  
  @JSImport("storm-react-diagrams/dist/src/models/NodeModel", "NodeModel")
  @js.native
  class NodeModel () extends BaseModel[DiagramModel, BaseModelListener] {
    def this(nodeType: String) = this()
    def this(nodeType: js.UndefOr[scala.Nothing], id: String) = this()
    def this(nodeType: String, id: String) = this()
    
    def addPort[T /* <: PortModel */](port: T): T = js.native
    
    def doClone(lookupTable: js.Object, clone: js.Any): Unit = js.native
    
    var extras: js.Any = js.native
    
    def getPort(name: String): PortModel | Null = js.native
    
    def getPortFromID(id: js.Any): PortModel | Null = js.native
    
    def getPorts(): StringDictionary[PortModel] = js.native
    
    var height: Double = js.native
    
    var ports: StringDictionary[PortModel] = js.native
    
    def removePort(port: PortModel): Unit = js.native
    
    def setPosition(x: js.Any, y: js.Any): Unit = js.native
    
    def updateDimensions(hasWidthHeight: Width): Unit = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
}
