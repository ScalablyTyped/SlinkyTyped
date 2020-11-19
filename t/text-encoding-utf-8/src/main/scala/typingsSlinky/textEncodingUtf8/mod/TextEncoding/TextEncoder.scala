package typingsSlinky.textEncodingUtf8.mod.TextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEncoder extends js.Object {
  
  def encode(): js.typedarray.Uint8Array = js.native
  def encode(input: js.UndefOr[scala.Nothing], options: TextEncodeOptions): js.typedarray.Uint8Array = js.native
  def encode(input: String): js.typedarray.Uint8Array = js.native
  def encode(input: String, options: TextEncodeOptions): js.typedarray.Uint8Array = js.native
  
  var encoding: String = js.native
}
