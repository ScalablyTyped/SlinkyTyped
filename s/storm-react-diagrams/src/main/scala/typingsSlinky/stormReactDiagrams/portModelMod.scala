package typingsSlinky.stormReactDiagrams

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.stormReactDiagrams.anon.Height
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModel
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModelListener
import typingsSlinky.stormReactDiagrams.linkModelMod.LinkModel
import typingsSlinky.stormReactDiagrams.linkModelMod.LinkModelListener
import typingsSlinky.stormReactDiagrams.nodeModelMod.NodeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portModelMod {
  
  @JSImport("storm-react-diagrams/dist/src/models/PortModel", "PortModel")
  @js.native
  class PortModel protected () extends BaseModel[NodeModel, BaseModelListener] {
    def this(name: String) = this()
    def this(name: String, `type`: String) = this()
    def this(name: String, `type`: js.UndefOr[scala.Nothing], id: String) = this()
    def this(name: String, `type`: String, id: String) = this()
    def this(
      name: String,
      `type`: js.UndefOr[scala.Nothing],
      id: js.UndefOr[scala.Nothing],
      maximumLinks: Double
    ) = this()
    def this(name: String, `type`: js.UndefOr[scala.Nothing], id: String, maximumLinks: Double) = this()
    def this(name: String, `type`: String, id: js.UndefOr[scala.Nothing], maximumLinks: Double) = this()
    def this(name: String, `type`: String, id: String, maximumLinks: Double) = this()
    
    def addLink(link: LinkModel[LinkModelListener]): Unit = js.native
    
    def canLinkToPort(port: PortModel): Boolean = js.native
    
    def createLinkModel(): LinkModel[LinkModelListener] | Null = js.native
    
    def doClone(lookupTable: js.Object, clone: js.Any): Unit = js.native
    
    def getLinks(): StringDictionary[LinkModel[LinkModelListener]] = js.native
    
    def getMaximumLinks(): Double = js.native
    
    def getName(): String = js.native
    
    def getNode(): NodeModel = js.native
    
    var height: Double = js.native
    
    var links: StringDictionary[LinkModel[LinkModelListener]] = js.native
    
    var maximumLinks: Double = js.native
    
    var name: String = js.native
    
    def removeLink(link: LinkModel[LinkModelListener]): Unit = js.native
    
    def setMaximumLinks(maximumLinks: Double): Unit = js.native
    
    def updateCoords(hasXYWidthHeight: Height): Unit = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
}
