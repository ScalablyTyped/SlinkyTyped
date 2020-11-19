package typingsSlinky.stormReactDiagrams

import typingsSlinky.stormReactDiagrams.baseActionMod.BaseAction
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsSlinky.stormReactDiagrams.selectionModelMod.SelectionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/actions/MoveItemsAction", JSImport.Namespace)
@js.native
object moveItemsActionMod extends js.Object {
  
  @js.native
  class MoveItemsAction protected () extends BaseAction {
    def this(mouseX: Double, mouseY: Double, diagramEngine: DiagramEngine) = this()
    
    var moved: Boolean = js.native
    
    var selectionModels: js.Array[SelectionModel] = js.native
  }
}
