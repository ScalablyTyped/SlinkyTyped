package typingsSlinky.stormReactDiagrams

import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModel
import typingsSlinky.stormReactDiagrams.baseModelMod.BaseModelListener
import typingsSlinky.stormReactDiagrams.linkModelMod.LinkModel
import typingsSlinky.stormReactDiagrams.linkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/models/LabelModel", JSImport.Namespace)
@js.native
object labelModelMod extends js.Object {
  
  @js.native
  class LabelModel () extends BaseModel[LinkModel[LinkModelListener], BaseModelListener] {
    def this(`type`: String) = this()
    def this(`type`: js.UndefOr[scala.Nothing], id: String) = this()
    def this(`type`: String, id: String) = this()
    
    var offsetX: Double = js.native
    
    var offsetY: Double = js.native
  }
}
