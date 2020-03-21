package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`3`
*/
trait FileChangeType extends js.Object

@JSImport("vscode-languageserver-protocol/lib/protocol", "FileChangeType")
@js.native
object FileChangeType extends js.Object {
  /**
    * The file got changed.
    */
  val Changed: `2` = js.native
  /**
    * The file got created.
    */
  val Created: `1` = js.native
  /**
    * The file got deleted.
    */
  val Deleted: `3` = js.native
}

