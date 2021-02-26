package typingsSlinky.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeAction {
  
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param command The command to execute.
    * @param kind The kind of the code action.
    */
  @JSImport("vscode-languageserver-protocol", "CodeAction.create")
  @js.native
  def create(title: String, command: typingsSlinky.vscodeLanguageserverTypes.mod.Command): typingsSlinky.vscodeLanguageserverTypes.mod.CodeAction = js.native
  @JSImport("vscode-languageserver-protocol", "CodeAction.create")
  @js.native
  def create(
    title: String,
    command: typingsSlinky.vscodeLanguageserverTypes.mod.Command,
    kind: typingsSlinky.vscodeLanguageserverTypes.mod.CodeActionKind
  ): typingsSlinky.vscodeLanguageserverTypes.mod.CodeAction = js.native
  /**
    * Creates a new code action.
    *
    * @param title The title of the code action.
    * @param command The command to execute.
    * @param kind The kind of the code action.
    */
  @JSImport("vscode-languageserver-protocol", "CodeAction.create")
  @js.native
  def create(title: String, edit: typingsSlinky.vscodeLanguageserverTypes.mod.WorkspaceEdit): typingsSlinky.vscodeLanguageserverTypes.mod.CodeAction = js.native
  @JSImport("vscode-languageserver-protocol", "CodeAction.create")
  @js.native
  def create(
    title: String,
    edit: typingsSlinky.vscodeLanguageserverTypes.mod.WorkspaceEdit,
    kind: typingsSlinky.vscodeLanguageserverTypes.mod.CodeActionKind
  ): typingsSlinky.vscodeLanguageserverTypes.mod.CodeAction = js.native
  
  @JSImport("vscode-languageserver-protocol", "CodeAction.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CodeAction */ Boolean = js.native
}
