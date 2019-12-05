package typingsSlinky.stormDashReactDashDiagrams

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.stormDashReactDashDiagrams.distSrcDefaultsModelsDefaultPortModelMod.DefaultPortModel
import typingsSlinky.stormDashReactDashDiagrams.distSrcModelsNodeModelMod.NodeModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/defaults/models/DefaultNodeModel", JSImport.Namespace)
@js.native
object distSrcDefaultsModelsDefaultNodeModelMod extends js.Object {
  @js.native
  class DefaultNodeModel () extends NodeModel {
    def this(name: String) = this()
    def this(name: String, color: String) = this()
    var color: String = js.native
    var name: String = js.native
    @JSName("ports")
    var ports_DefaultNodeModel: StringDictionary[DefaultPortModel] = js.native
    def addInPort(label: String): DefaultPortModel = js.native
    def addOutPort(label: String): DefaultPortModel = js.native
    def getInPorts(): js.Array[DefaultPortModel] = js.native
    def getOutPorts(): js.Array[DefaultPortModel] = js.native
  }
  
}

