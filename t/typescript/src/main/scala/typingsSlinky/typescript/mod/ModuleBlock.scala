package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleBlock
  extends Statement
     with BlockLike
     with NamespaceBody {
  
  @JSName("kind")
  var kind_ModuleBlock: typingsSlinky.typescript.mod.SyntaxKind.ModuleBlock = js.native
  
  @JSName("parent")
  var parent_ModuleBlock: ModuleDeclaration = js.native
  
  var statements: NodeArray[Statement] = js.native
}
