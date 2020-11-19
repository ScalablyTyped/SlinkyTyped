package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashrename
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.RenameParams
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.RenameRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "RenameRequest")
@js.native
object RenameRequest extends js.Object {
  
  val method: textDocumentSlashrename = js.native
  
  val `type`: ProtocolRequestType[
    RenameParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.WorkspaceEdit | Null, 
    scala.Nothing, 
    Unit, 
    RenameRegistrationOptions
  ] = js.native
}
