package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportEqualsDeclaration
  extends DeclarationStatement
     with JSDocContainer
     with _HasJSDoc {
  
  @JSName("kind")
  val kind_ImportEqualsDeclaration: typingsSlinky.typescript.mod.SyntaxKind.ImportEqualsDeclaration = js.native
  
  val moduleReference: ModuleReference = js.native
  
  @JSName("name")
  val name_ImportEqualsDeclaration: Identifier = js.native
  
  @JSName("parent")
  val parent_ImportEqualsDeclaration: SourceFile | ModuleBlock = js.native
}
