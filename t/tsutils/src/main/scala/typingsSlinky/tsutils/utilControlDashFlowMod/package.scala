package typingsSlinky.tsutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilControlDashFlowMod {
  import typingsSlinky.typescript.typescriptMod.BreakStatement
  import typingsSlinky.typescript.typescriptMod.ContinueStatement
  import typingsSlinky.typescript.typescriptMod.ReturnStatement
  import typingsSlinky.typescript.typescriptMod.ThrowStatement

  type ControlFlowStatement = BreakStatement | ContinueStatement | ReturnStatement | ThrowStatement
}
