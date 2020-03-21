package typingsSlinky.stormReactDiagrams

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.stormReactDiagrams.defaultLinkModelMod.DefaultLinkModel
import typingsSlinky.stormReactDiagrams.linkModelMod.LinkModel
import typingsSlinky.stormReactDiagrams.linkModelMod.LinkModelListener
import typingsSlinky.stormReactDiagrams.portModelMod.PortModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/defaults/models/DefaultPortModel", JSImport.Namespace)
@js.native
object defaultPortModelMod extends js.Object {
  @js.native
  class DefaultPortModel protected () extends PortModel {
    def this(isInput: Boolean, name: String) = this()
    def this(isInput: Boolean, name: String, label: String) = this()
    def this(isInput: Boolean, name: String, label: String, id: String) = this()
    var in: Boolean = js.native
    var label: String = js.native
    @JSName("links")
    var links_DefaultPortModel: StringDictionary[DefaultLinkModel] = js.native
    def link(port: PortModel): LinkModel[LinkModelListener] = js.native
  }
  
}

