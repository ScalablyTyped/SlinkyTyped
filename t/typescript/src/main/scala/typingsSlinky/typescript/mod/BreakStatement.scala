package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakStatement
  extends Statement
     with BreakOrContinueStatement {
  
  @JSName("kind")
  val kind_BreakStatement: typingsSlinky.typescript.mod.SyntaxKind.BreakStatement = js.native
  
  val label: js.UndefOr[Identifier] = js.native
}
