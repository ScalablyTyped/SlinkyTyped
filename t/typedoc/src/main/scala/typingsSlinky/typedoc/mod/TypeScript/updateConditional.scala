package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.ConditionalExpression
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.SyntaxKind.ColonToken
import typingsSlinky.typescript.mod.SyntaxKind.QuestionToken
import typingsSlinky.typescript.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.updateConditional")
@js.native
object updateConditional extends js.Object {
  
  def apply(
    node: ConditionalExpression,
    condition: Expression,
    questionToken: Token[QuestionToken],
    whenTrue: Expression,
    colonToken: Token[ColonToken],
    whenFalse: Expression
  ): ConditionalExpression = js.native
}
