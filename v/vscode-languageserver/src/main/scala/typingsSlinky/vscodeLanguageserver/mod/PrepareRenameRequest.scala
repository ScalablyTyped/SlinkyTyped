package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashprepareRename
import typingsSlinky.vscodeLanguageserverProtocol.anon.Placeholder
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.PrepareRenameParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "PrepareRenameRequest")
@js.native
object PrepareRenameRequest extends js.Object {
  
  val method: textDocumentSlashprepareRename = js.native
  
  val `type`: ProtocolRequestType[
    PrepareRenameParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.Range | Placeholder | Null, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
