package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`3`
*/
trait SignatureHelpTriggerKind extends StObject
object SignatureHelpTriggerKind {
  
  /**
    * Signature help was triggered by the cursor moving or by the document content changing.
    */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "SignatureHelpTriggerKind.ContentChange")
  @js.native
  val ContentChange: `3` = js.native
  
  /**
    * Signature help was invoked manually by the user or by a command.
    */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "SignatureHelpTriggerKind.Invoked")
  @js.native
  val Invoked: `1` = js.native
  
  /**
    * Signature help was triggered by a trigger character.
    */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "SignatureHelpTriggerKind.TriggerCharacter")
  @js.native
  val TriggerCharacter: `2` = js.native
}
