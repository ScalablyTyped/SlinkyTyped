package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ModuleNameModuleReferenceSyntax")
@js.native
class ModuleNameModuleReferenceSyntax protected ()
  extends SyntaxNode
     with IModuleReferenceSyntax {
  def this(moduleName: INameSyntax, parsedInStrictMode: Boolean) = this()
  var moduleName: INameSyntax = js.native
  def update(moduleName: INameSyntax): ModuleNameModuleReferenceSyntax = js.native
  def withModuleName(moduleName: INameSyntax): ModuleNameModuleReferenceSyntax = js.native
}

