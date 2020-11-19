package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportSpecifier
  extends NamedDeclaration
     with ImportOrExportSpecifier {
  
  @JSName("kind")
  var kind_ImportSpecifier: typingsSlinky.typescript.mod.SyntaxKind.ImportSpecifier = js.native
  
  @JSName("name")
  var name_ImportSpecifier: Identifier = js.native
  
  @JSName("parent")
  var parent_ImportSpecifier: NamedImports = js.native
  
  var propertyName: js.UndefOr[Identifier] = js.native
}
