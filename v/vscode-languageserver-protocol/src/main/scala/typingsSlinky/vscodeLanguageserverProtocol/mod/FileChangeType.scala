package typingsSlinky.vscodeLanguageserverProtocol.mod

import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "FileChangeType")
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

