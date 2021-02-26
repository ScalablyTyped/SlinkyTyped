package typingsSlinky.stormReactDiagrams

import typingsSlinky.stormReactDiagrams.baseActionMod.BaseAction
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsSlinky.stormReactDiagrams.selectionModelMod.SelectionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveItemsActionMod {
  
  @JSImport("storm-react-diagrams/dist/src/actions/MoveItemsAction", "MoveItemsAction")
  @js.native
  class MoveItemsAction protected () extends BaseAction {
    def this(mouseX: Double, mouseY: Double, diagramEngine: DiagramEngine) = this()
    
    var moved: Boolean = js.native
    
    var selectionModels: js.Array[SelectionModel] = js.native
  }
}
