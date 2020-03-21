package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinueStatement
  extends Statement
     with BreakOrContinueStatement {
  @JSName("kind")
  var kind_ContinueStatement: typingsSlinky.typescript.mod.SyntaxKind.ContinueStatement = js.native
  var label: js.UndefOr[Identifier] = js.native
}

