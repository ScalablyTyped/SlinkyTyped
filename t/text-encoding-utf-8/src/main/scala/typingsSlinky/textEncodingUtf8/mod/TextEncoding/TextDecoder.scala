package typingsSlinky.textEncodingUtf8.mod.TextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDecoder extends js.Object {
  
  def decode(): String = js.native
  def decode(input: js.UndefOr[scala.Nothing], options: TextDecodeOptions): String = js.native
  def decode(input: js.typedarray.ArrayBuffer): String = js.native
  def decode(input: js.typedarray.ArrayBufferView): String = js.native
  def decode(input: js.typedarray.ArrayBufferView, options: TextDecodeOptions): String = js.native
  def decode(input: js.typedarray.ArrayBuffer, options: TextDecodeOptions): String = js.native
  
  var encoding: String = js.native
  
  var fatal: Boolean = js.native
  
  var ignoreBOM: Boolean = js.native
}
