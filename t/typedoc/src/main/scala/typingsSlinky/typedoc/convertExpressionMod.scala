package typingsSlinky.typedoc

import typingsSlinky.typescript.mod.EnumMember
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/convert-expression", JSImport.Namespace)
@js.native
object convertExpressionMod extends js.Object {
  
  def convertDefaultValue(node: EnumMember): js.UndefOr[String] = js.native
  def convertDefaultValue(node: ParameterDeclaration): js.UndefOr[String] = js.native
  def convertDefaultValue(node: VariableDeclaration): js.UndefOr[String] = js.native
  
  def convertExpression(expression: Expression): String = js.native
}
