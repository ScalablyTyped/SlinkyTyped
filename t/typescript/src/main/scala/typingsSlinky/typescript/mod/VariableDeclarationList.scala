package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableDeclarationList
  extends Node
     with ForInitializer {
  
  var declarations: NodeArray[VariableDeclaration] = js.native
  
  @JSName("kind")
  var kind_VariableDeclarationList: typingsSlinky.typescript.mod.SyntaxKind.VariableDeclarationList = js.native
  
  @JSName("parent")
  var parent_VariableDeclarationList: VariableStatement | ForStatement | ForOfStatement | ForInStatement = js.native
}
