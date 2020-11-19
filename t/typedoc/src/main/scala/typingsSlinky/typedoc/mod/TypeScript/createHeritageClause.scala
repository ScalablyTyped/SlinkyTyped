package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.ExpressionWithTypeArguments
import typingsSlinky.typescript.mod.HeritageClause
import typingsSlinky.typescript.mod.SyntaxKind.ExtendsKeyword
import typingsSlinky.typescript.mod.SyntaxKind.ImplementsKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createHeritageClause")
@js.native
object createHeritageClause extends js.Object {
  
  def apply(token: ExtendsKeyword, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
  def apply(token: ImplementsKeyword, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
}
