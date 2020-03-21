package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`3`
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`3`
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`4`
*/
trait MessageType extends js.Object

@JSImport("vscode-languageserver-protocol/lib/protocol", "MessageType")
@js.native
object MessageType extends js.Object {
  /**
    * An error message.
    */
  val Error: `1` = js.native
  /**
    * An information message.
    */
  val Info: `3` = js.native
  /**
    * A log message.
    */
  val Log: `4` = js.native
  /**
    * A warning message.
    */
  val Warning: `2` = js.native
}

