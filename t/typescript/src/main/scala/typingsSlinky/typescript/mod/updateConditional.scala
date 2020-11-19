package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "updateConditional")
@js.native
object updateConditional extends js.Object {
  
  def apply(
    node: ConditionalExpression,
    condition: Expression,
    questionToken: Token[typingsSlinky.typescript.mod.SyntaxKind.QuestionToken],
    whenTrue: Expression,
    colonToken: Token[typingsSlinky.typescript.mod.SyntaxKind.ColonToken],
    whenFalse: Expression
  ): ConditionalExpression = js.native
}
