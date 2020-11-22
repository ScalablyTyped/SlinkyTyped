package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportSpecifier
  extends NamedDeclaration
     with ImportOrExportSpecifier {
  
  @JSName("kind")
  val kind_ImportSpecifier: typingsSlinky.typescript.mod.SyntaxKind.ImportSpecifier = js.native
  
  @JSName("name")
  val name_ImportSpecifier: Identifier = js.native
  
  @JSName("parent")
  val parent_ImportSpecifier: NamedImports = js.native
  
  val propertyName: js.UndefOr[Identifier] = js.native
}
