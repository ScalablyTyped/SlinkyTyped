package typingsSlinky.styletronReact.mod

import typingsSlinky.styletronReact.styletronReactBooleans.`false`
import typingsSlinky.styletronReact.styletronReactBooleans.`true`
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.styletronReact.mod.AssignmentCommutativeReducerContainer
  - typingsSlinky.styletronReact.mod.NonAssignmentCommutativeReducerContainer
*/
trait ReducerContainer extends js.Object
object ReducerContainer {
  
  @scala.inline
  def AssignmentCommutativeReducerContainer(
    assignmentCommutative: `true`,
    factory: StyleObject => typingsSlinky.styletronReact.mod.AssignmentCommutativeReducerContainer,
    reducer: (/* style */ StyleObject, /* props */ js.UndefOr[js.Object]) => StyleObject,
    style: StyleObject
  ): ReducerContainer = {
    val __obj = js.Dynamic.literal(assignmentCommutative = assignmentCommutative.asInstanceOf[js.Any], factory = js.Any.fromFunction1(factory), reducer = js.Any.fromFunction2(reducer), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReducerContainer]
  }
  
  @scala.inline
  def NonAssignmentCommutativeReducerContainer(
    assignmentCommutative: `false`,
    reducer: (/* style */ StyleObject, /* props */ js.UndefOr[js.Object]) => StyleObject
  ): ReducerContainer = {
    val __obj = js.Dynamic.literal(assignmentCommutative = assignmentCommutative.asInstanceOf[js.Any], reducer = js.Any.fromFunction2(reducer))
    __obj.asInstanceOf[ReducerContainer]
  }
}
