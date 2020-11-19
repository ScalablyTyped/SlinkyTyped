package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.ColonToken
import typingsSlinky.typescript.mod.ConditionalExpression
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createConditional")
@js.native
object createConditional extends js.Object {
  
  def apply(
    condition: Expression,
    questionToken: QuestionToken,
    whenTrue: Expression,
    colonToken: ColonToken,
    whenFalse: Expression
  ): ConditionalExpression = js.native
  /** @deprecated */ def apply(condition: Expression, whenTrue: Expression, whenFalse: Expression): ConditionalExpression = js.native
}
