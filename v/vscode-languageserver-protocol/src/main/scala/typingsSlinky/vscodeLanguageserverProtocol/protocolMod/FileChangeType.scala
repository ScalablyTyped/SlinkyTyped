package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  val Changed: /* 2 */ Double = js.native
  
  /**
    * The file got created.
    */
  val Created: /* 1 */ Double = js.native
  
  /**
    * The file got deleted.
    */
  val Deleted: /* 3 */ Double = js.native
}
