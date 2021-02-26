package typingsSlinky.vscodeLanguageserver.mod

import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashprepareRename
import typingsSlinky.vscodeLanguageserverProtocol.anon.Placeholder
import typingsSlinky.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.PrepareRenameParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PrepareRenameRequest {
  
  @JSImport("vscode-languageserver", "PrepareRenameRequest.method")
  @js.native
  val method: textDocumentSlashprepareRename = js.native
  
  @JSImport("vscode-languageserver", "PrepareRenameRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    PrepareRenameParams, 
    typingsSlinky.vscodeLanguageserverTypes.mod.Range | Placeholder | Null, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
