package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.abort
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.transactional
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.undo
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textOnlyTransactional
*/
trait FailureHandlingKind extends js.Object
@JSImport("vscode-languageserver-protocol/lib/protocol", "FailureHandlingKind")
@js.native
object FailureHandlingKind extends js.Object {
  
  /**
    * Applying the workspace change is simply aborted if one of the changes provided
    * fails. All operations executed before the failing operation stay executed.
    */
  val Abort: FailureHandlingKind = js.native
  
  /**
    * If the workspace edit contains only textual file changes they are executed transactional.
    * If resource changes (create, rename or delete file) are part of the change the failure
    * handling startegy is abort.
    */
  val TextOnlyTransactional: FailureHandlingKind = js.native
  
  /**
    * All operations are executed transactional. That means they either all
    * succeed or no changes at all are applied to the workspace.
    */
  val Transactional: FailureHandlingKind = js.native
  
  /**
    * The client tries to undo the operations already executed. But there is no
    * guarantee that this is succeeding.
    */
  val Undo: FailureHandlingKind = js.native
}
