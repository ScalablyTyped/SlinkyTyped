package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakStatement
  extends Statement
     with BreakOrContinueStatement {
  
  @JSName("kind")
  var kind_BreakStatement: typingsSlinky.typescript.mod.SyntaxKind.BreakStatement = js.native
  
  var label: js.UndefOr[Identifier] = js.native
}
