package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedImports
  extends Node
     with NamedImportBindings
     with NamedImportsOrExports {
  
  var elements: NodeArray[ImportSpecifier] = js.native
  
  @JSName("kind")
  var kind_NamedImports: typingsSlinky.typescript.mod.SyntaxKind.NamedImports = js.native
  
  @JSName("parent")
  var parent_NamedImports: ImportClause = js.native
}
