package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverNumbers.`1`
import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverNumbers.`2`
import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "SignatureHelpTriggerKind")
@js.native
object SignatureHelpTriggerKind extends js.Object {
  
  /**
    * Signature help was triggered by the cursor moving or by the document content changing.
    */
  val ContentChange: `3` = js.native
  
  /**
    * Signature help was invoked manually by the user or by a command.
    */
  val Invoked: `1` = js.native
  
  /**
    * Signature help was triggered by a trigger character.
    */
  val TriggerCharacter: `2` = js.native
}
