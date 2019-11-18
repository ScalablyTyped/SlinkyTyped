package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "updateConditional")
@js.native
object updateConditional extends js.Object {
  def apply(
    node: ConditionalExpression,
    condition: Expression,
    questionToken: Token[typingsSlinky.typescript.typescriptMod.SyntaxKind.QuestionToken],
    whenTrue: Expression,
    colonToken: Token[typingsSlinky.typescript.typescriptMod.SyntaxKind.ColonToken],
    whenFalse: Expression
  ): ConditionalExpression = js.native
}

