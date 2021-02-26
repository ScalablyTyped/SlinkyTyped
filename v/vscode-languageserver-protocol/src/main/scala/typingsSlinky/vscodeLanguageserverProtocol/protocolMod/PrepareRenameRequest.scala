package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import typingsSlinky.vscodeLanguageserverProtocol.anon.Placeholder
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashprepareRename
import typingsSlinky.vscodeLanguageserverTypes.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PrepareRenameRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "PrepareRenameRequest.method")
  @js.native
  val method: textDocumentSlashprepareRename = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "PrepareRenameRequest.type")
  @js.native
  val `type`: ProtocolRequestType[PrepareRenameParams, Range | Placeholder | Null, scala.Nothing, Unit, Unit] = js.native
}
