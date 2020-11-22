package typingsSlinky.tsNkeys.codecMod

import typingsSlinky.node.Buffer
import typingsSlinky.tsNkeys.mod.Prefix
import typingsSlinky.tsNkeys.utilMod.ToArrayBuffer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-nkeys/lib/codec", "Codec")
@js.native
class Codec () extends js.Object
/* static members */
@JSImport("ts-nkeys/lib/codec", "Codec")
@js.native
object Codec extends js.Object {
  
  def _decode(src: Buffer): Buffer = js.native
  
  def _decodePrefix(raw: Buffer): js.typedarray.Uint8Array = js.native
  
  def _encode(seed: Boolean, role: Prefix, payload: Buffer): Buffer = js.native
  
  def _encodePrefix(kind: Prefix, role: Prefix): Buffer = js.native
  
  def decode(expected: Prefix, src: Buffer): Buffer = js.native
  
  def decodeSeed(src: Buffer): SeedDecode = js.native
  
  def encode(prefix: Prefix, src: Buffer): Buffer = js.native
  
  def encodeSeed(role: Prefix, src: Buffer): Buffer = js.native
  
  def toArrayBuffer(buf: Buffer): js.typedarray.ArrayBuffer = js.native
  @JSName("toArrayBuffer")
  var toArrayBuffer_Original: ToArrayBuffer_ = js.native
}
