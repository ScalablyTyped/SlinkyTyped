package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleDeclaration
  extends DeclarationStatement
     with JSDocContainer
     with _HasJSDoc {
  
  var body: js.UndefOr[ModuleBody | JSDocNamespaceDeclaration] = js.native
  
  @JSName("kind")
  var kind_ModuleDeclaration: typingsSlinky.typescript.mod.SyntaxKind.ModuleDeclaration = js.native
  
  @JSName("name")
  var name_ModuleDeclaration: ModuleName = js.native
  
  @JSName("parent")
  var parent_ModuleDeclaration: ModuleBody | SourceFile = js.native
}
