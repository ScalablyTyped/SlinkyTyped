package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseClause
  extends Node
     with CaseOrDefaultClause {
  
  val expression: Expression = js.native
  
  @JSName("kind")
  val kind_CaseClause: typingsSlinky.typescript.mod.SyntaxKind.CaseClause = js.native
  
  @JSName("parent")
  val parent_CaseClause: CaseBlock = js.native
  
  val statements: NodeArray[Statement] = js.native
}
