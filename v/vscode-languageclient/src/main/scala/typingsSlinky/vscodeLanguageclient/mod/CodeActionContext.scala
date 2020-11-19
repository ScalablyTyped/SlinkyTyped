package typingsSlinky.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "CodeActionContext")
@js.native
object CodeActionContext extends js.Object {
  
  /**
    * Creates a new CodeActionContext literal.
    */
  def create(diagnostics: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.Diagnostic]): typingsSlinky.vscodeLanguageserverTypes.mod.CodeActionContext = js.native
  def create(
    diagnostics: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.Diagnostic],
    only: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CodeActionKind]
  ): typingsSlinky.vscodeLanguageserverTypes.mod.CodeActionContext = js.native
  
  /**
    * Checks whether the given literal conforms to the [CodeActionContext](#CodeActionContext) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeActionContext */ Boolean = js.native
}
