package typingsSlinky.vscodeLanguageclient.anon

import typingsSlinky.vscode.mod.Uri
import typingsSlinky.vscodeLanguageclient.codeConverterMod.URIConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Code2Protocol extends js.Object {
  
  def code2Protocol(value: Uri): String = js.native
  @JSName("code2Protocol")
  var code2Protocol_Original: URIConverter = js.native
  
  def protocol2Code(value: String): Uri = js.native
  @JSName("protocol2Code")
  var protocol2Code_Original: typingsSlinky.vscodeLanguageclient.protocolConverterMod.URIConverter = js.native
}
