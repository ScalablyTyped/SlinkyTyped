package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createNew")
@js.native
object createNew extends js.Object {
  
  def apply(expression: Expression): NewExpression = js.native
  def apply(
    expression: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): NewExpression = js.native
  def apply(expression: Expression, typeArguments: js.Array[TypeNode]): NewExpression = js.native
  def apply(expression: Expression, typeArguments: js.Array[TypeNode], argumentsArray: js.Array[Expression]): NewExpression = js.native
}
