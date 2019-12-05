package typingsSlinky.vscodeDashLanguageclient

import typingsSlinky.vscode.vscodeMod.Uri
import typingsSlinky.vscodeDashLanguageclient.libCodeConverterMod.URIConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Code2Protocol extends js.Object {
  @JSName("code2Protocol")
  var code2Protocol_Original: URIConverter = js.native
  @JSName("protocol2Code")
  var protocol2Code_Original: typingsSlinky.vscodeDashLanguageclient.libProtocolConverterMod.URIConverter = js.native
  def code2Protocol(value: Uri): String = js.native
  def protocol2Code(value: String): Uri = js.native
}

