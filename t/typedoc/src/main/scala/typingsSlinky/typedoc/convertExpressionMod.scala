package typingsSlinky.typedoc

import typingsSlinky.typescript.mod.EnumMember
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.ParameterDeclaration
import typingsSlinky.typescript.mod.VariableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertExpressionMod {
  
  @JSImport("typedoc/dist/lib/converter/convert-expression", "convertDefaultValue")
  @js.native
  def convertDefaultValue(node: EnumMember): js.UndefOr[String] = js.native
  @JSImport("typedoc/dist/lib/converter/convert-expression", "convertDefaultValue")
  @js.native
  def convertDefaultValue(node: ParameterDeclaration): js.UndefOr[String] = js.native
  @JSImport("typedoc/dist/lib/converter/convert-expression", "convertDefaultValue")
  @js.native
  def convertDefaultValue(node: VariableDeclaration): js.UndefOr[String] = js.native
  
  @JSImport("typedoc/dist/lib/converter/convert-expression", "convertExpression")
  @js.native
  def convertExpression(expression: Expression): String = js.native
}
