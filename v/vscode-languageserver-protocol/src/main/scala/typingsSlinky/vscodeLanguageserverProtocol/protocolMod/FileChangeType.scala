package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`1`
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`2`
  - typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolNumbers.`3`
*/
trait FileChangeType extends StObject
object FileChangeType {
  
  /**
    * The file got changed.
    */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "FileChangeType.Changed")
  @js.native
  val Changed: /* 2 */ Double = js.native
  
  /**
    * The file got created.
    */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "FileChangeType.Created")
  @js.native
  val Created: /* 1 */ Double = js.native
  
  /**
    * The file got deleted.
    */
  @JSImport("vscode-languageserver-protocol/lib/protocol", "FileChangeType.Deleted")
  @js.native
  val Deleted: /* 3 */ Double = js.native
}
