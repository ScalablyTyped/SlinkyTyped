package typingsSlinky.typedoc.mod.TypeScript

import typingsSlinky.typescript.mod.ElementAccessChain
import typingsSlinky.typescript.mod.Expression
import typingsSlinky.typescript.mod.QuestionDotToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createElementAccessChain")
@js.native
object createElementAccessChain extends js.Object {
  
  def apply(expression: Expression, questionDotToken: js.UndefOr[scala.Nothing], index: Double): ElementAccessChain = js.native
  def apply(expression: Expression, questionDotToken: js.UndefOr[scala.Nothing], index: Expression): ElementAccessChain = js.native
  /** @deprecated Use `factory.createElementAccessChain` or the factory supplied by your transformation context instead. */
  def apply(expression: Expression, questionDotToken: QuestionDotToken, index: Double): ElementAccessChain = js.native
  def apply(expression: Expression, questionDotToken: QuestionDotToken, index: Expression): ElementAccessChain = js.native
}
