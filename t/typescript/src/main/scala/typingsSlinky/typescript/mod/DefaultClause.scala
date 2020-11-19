package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultClause
  extends Node
     with CaseOrDefaultClause {
  
  @JSName("kind")
  var kind_DefaultClause: typingsSlinky.typescript.mod.SyntaxKind.DefaultClause = js.native
  
  @JSName("parent")
  var parent_DefaultClause: CaseBlock = js.native
  
  var statements: NodeArray[Statement] = js.native
}
