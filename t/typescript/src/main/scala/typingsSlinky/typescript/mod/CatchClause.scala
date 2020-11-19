package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatchClause extends Node {
  
  var block: Block = js.native
  
  @JSName("kind")
  var kind_CatchClause: typingsSlinky.typescript.mod.SyntaxKind.CatchClause = js.native
  
  @JSName("parent")
  var parent_CatchClause: TryStatement = js.native
  
  var variableDeclaration: js.UndefOr[VariableDeclaration] = js.native
}
