package typingsSlinky.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeActionContext {
  
  /**
    * Creates a new CodeActionContext literal.
    */
  @JSImport("vscode-languageserver-protocol", "CodeActionContext.create")
  @js.native
  def create(diagnostics: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.Diagnostic]): typingsSlinky.vscodeLanguageserverTypes.mod.CodeActionContext = js.native
  @JSImport("vscode-languageserver-protocol", "CodeActionContext.create")
  @js.native
  def create(
    diagnostics: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.Diagnostic],
    only: js.Array[typingsSlinky.vscodeLanguageserverTypes.mod.CodeActionKind]
  ): typingsSlinky.vscodeLanguageserverTypes.mod.CodeActionContext = js.native
  
  /**
    * Checks whether the given literal conforms to the [CodeActionContext](#CodeActionContext) interface.
    */
  @JSImport("vscode-languageserver-protocol", "CodeActionContext.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeActionContext */ Boolean = js.native
}
