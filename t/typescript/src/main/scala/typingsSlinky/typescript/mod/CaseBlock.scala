package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseBlock extends Node {
  
  var clauses: NodeArray[CaseOrDefaultClause] = js.native
  
  @JSName("kind")
  var kind_CaseBlock: typingsSlinky.typescript.mod.SyntaxKind.CaseBlock = js.native
  
  @JSName("parent")
  var parent_CaseBlock: SwitchStatement = js.native
}
