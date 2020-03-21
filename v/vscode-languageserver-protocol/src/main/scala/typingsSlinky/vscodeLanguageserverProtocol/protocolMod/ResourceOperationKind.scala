package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.create
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.rename
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.delete
*/
trait ResourceOperationKind extends js.Object

@JSImport("vscode-languageserver-protocol/lib/protocol", "ResourceOperationKind")
@js.native
object ResourceOperationKind extends js.Object {
  /**
    * Supports creating new files and folders.
    */
  val Create: ResourceOperationKind = js.native
  /**
    * Supports deleting existing files and folders.
    */
  val Delete: ResourceOperationKind = js.native
  /**
    * Supports renaming existing files and folders.
    */
  val Rename: ResourceOperationKind = js.native
}

