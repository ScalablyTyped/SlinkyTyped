package typingsSlinky.vscodeLanguageclient.mod

import typingsSlinky.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "DocumentSymbolRequest")
@js.native
object DocumentSymbolRequest extends js.Object {
  val `type`: typingsSlinky.vscodeJsonrpc.mod.RequestType[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentSymbolParams */ js.Any, 
    (js.Array[
      typingsSlinky.vscodeLanguageserverTypes.mod.DocumentSymbol | typingsSlinky.vscodeLanguageserverTypes.mod.SymbolInformation
    ]) | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

