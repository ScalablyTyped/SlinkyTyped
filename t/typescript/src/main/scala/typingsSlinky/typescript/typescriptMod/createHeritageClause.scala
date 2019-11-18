package typingsSlinky.typescript.typescriptMod

import typingsSlinky.typescript.typescriptMod.SyntaxKind.ExtendsKeyword
import typingsSlinky.typescript.typescriptMod.SyntaxKind.ImplementsKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createHeritageClause")
@js.native
object createHeritageClause extends js.Object {
  def apply(token: ExtendsKeyword, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
  def apply(token: ImplementsKeyword, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
}

