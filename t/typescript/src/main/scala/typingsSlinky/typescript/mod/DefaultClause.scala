package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultClause
  extends Node
     with CaseOrDefaultClause {
  
  @JSName("kind")
  val kind_DefaultClause: typingsSlinky.typescript.mod.SyntaxKind.DefaultClause = js.native
  
  @JSName("parent")
  val parent_DefaultClause: CaseBlock = js.native
  
  val statements: NodeArray[Statement] = js.native
}
