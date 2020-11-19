package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.ElementAccessExpression
import typingsSlinky.typescript.mod.PropertyAccessExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getConstantValue")
@js.native
object getConstantValue extends js.Object {
  
  def apply(node: ElementAccessExpression): js.UndefOr[String | Double] = js.native
  /**
    * Gets the constant value to emit for an expression.
    */
  def apply(node: PropertyAccessExpression): js.UndefOr[String | Double] = js.native
}
