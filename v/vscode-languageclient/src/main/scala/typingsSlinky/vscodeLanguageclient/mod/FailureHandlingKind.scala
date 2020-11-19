package typingsSlinky.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient", "FailureHandlingKind")
@js.native
object FailureHandlingKind extends js.Object {
  
  /**
    * Applying the workspace change is simply aborted if one of the changes provided
    * fails. All operations executed before the failing operation stay executed.
    */
  val Abort: typingsSlinky.vscodeLanguageserverProtocol.protocolMod.FailureHandlingKind = js.native
  
  /**
    * If the workspace edit contains only textual file changes they are executed transactional.
    * If resource changes (create, rename or delete file) are part of the change the failure
    * handling startegy is abort.
    */
  val TextOnlyTransactional: typingsSlinky.vscodeLanguageserverProtocol.protocolMod.FailureHandlingKind = js.native
  
  /**
    * All operations are executed transactional. That means they either all
    * succeed or no changes at all are applied to the workspace.
    */
  val Transactional: typingsSlinky.vscodeLanguageserverProtocol.protocolMod.FailureHandlingKind = js.native
  
  /**
    * The client tries to undo the operations already executed. But there is no
    * guarantee that this is succeeding.
    */
  val Undo: typingsSlinky.vscodeLanguageserverProtocol.protocolMod.FailureHandlingKind = js.native
}
