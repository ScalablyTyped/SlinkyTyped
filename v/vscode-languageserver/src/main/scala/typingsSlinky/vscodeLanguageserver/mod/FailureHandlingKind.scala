package typingsSlinky.vscodeLanguageserver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FailureHandlingKind {
  
  /**
    * Applying the workspace change is simply aborted if one of the changes provided
    * fails. All operations executed before the failing operation stay executed.
    */
  @JSImport("vscode-languageserver", "FailureHandlingKind.Abort")
  @js.native
  val Abort: typingsSlinky.vscodeLanguageserverProtocol.protocolMod.FailureHandlingKind = js.native
  
  /**
    * If the workspace edit contains only textual file changes they are executed transactional.
    * If resource changes (create, rename or delete file) are part of the change the failure
    * handling startegy is abort.
    */
  @JSImport("vscode-languageserver", "FailureHandlingKind.TextOnlyTransactional")
  @js.native
  val TextOnlyTransactional: typingsSlinky.vscodeLanguageserverProtocol.protocolMod.FailureHandlingKind = js.native
  
  /**
    * All operations are executed transactional. That means they either all
    * succeed or no changes at all are applied to the workspace.
    */
  @JSImport("vscode-languageserver", "FailureHandlingKind.Transactional")
  @js.native
  val Transactional: typingsSlinky.vscodeLanguageserverProtocol.protocolMod.FailureHandlingKind = js.native
  
  /**
    * The client tries to undo the operations already executed. But there is no
    * guarantee that this is succeeding.
    */
  @JSImport("vscode-languageserver", "FailureHandlingKind.Undo")
  @js.native
  val Undo: typingsSlinky.vscodeLanguageserverProtocol.protocolMod.FailureHandlingKind = js.native
}
