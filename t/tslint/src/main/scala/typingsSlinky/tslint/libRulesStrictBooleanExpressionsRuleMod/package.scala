package typingsSlinky.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRulesStrictBooleanExpressionsRuleMod {
  import typingsSlinky.typescript.typescriptMod.BinaryExpression
  import typingsSlinky.typescript.typescriptMod.ConditionalExpression
  import typingsSlinky.typescript.typescriptMod.DoStatement
  import typingsSlinky.typescript.typescriptMod.ForStatement
  import typingsSlinky.typescript.typescriptMod.IfStatement
  import typingsSlinky.typescript.typescriptMod.PrefixUnaryExpression
  import typingsSlinky.typescript.typescriptMod.WhileStatement

  type Location = PrefixUnaryExpression | IfStatement | WhileStatement | DoStatement | ForStatement | ConditionalExpression | BinaryExpression
}
