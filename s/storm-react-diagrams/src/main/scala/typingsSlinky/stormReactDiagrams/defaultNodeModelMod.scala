package typingsSlinky.stormReactDiagrams

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.stormReactDiagrams.defaultPortModelMod.DefaultPortModel
import typingsSlinky.stormReactDiagrams.nodeModelMod.NodeModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/defaults/models/DefaultNodeModel", JSImport.Namespace)
@js.native
object defaultNodeModelMod extends js.Object {
  
  @js.native
  class DefaultNodeModel () extends NodeModel {
    def this(name: String) = this()
    def this(name: js.UndefOr[scala.Nothing], color: String) = this()
    def this(name: String, color: String) = this()
    
    def addInPort(label: String): DefaultPortModel = js.native
    
    def addOutPort(label: String): DefaultPortModel = js.native
    
    var color: String = js.native
    
    def getInPorts(): js.Array[DefaultPortModel] = js.native
    
    def getOutPorts(): js.Array[DefaultPortModel] = js.native
    
    var name: String = js.native
    
    @JSName("ports")
    var ports_DefaultNodeModel: StringDictionary[DefaultPortModel] = js.native
  }
}
