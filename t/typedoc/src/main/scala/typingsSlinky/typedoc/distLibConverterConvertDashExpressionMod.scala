package typingsSlinky.typedoc

import typingsSlinky.typescript.typescriptMod.EnumMember
import typingsSlinky.typescript.typescriptMod.Expression
import typingsSlinky.typescript.typescriptMod.ParameterDeclaration
import typingsSlinky.typescript.typescriptMod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/convert-expression", JSImport.Namespace)
@js.native
object distLibConverterConvertDashExpressionMod extends js.Object {
  def convertDefaultValue(node: EnumMember): js.UndefOr[String] = js.native
  def convertDefaultValue(node: ParameterDeclaration): js.UndefOr[String] = js.native
  def convertDefaultValue(node: VariableDeclaration): js.UndefOr[String] = js.native
  def convertExpression(expression: Expression): String = js.native
}

