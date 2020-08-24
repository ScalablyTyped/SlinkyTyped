package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScpNomination extends js.Object {
  def accepted(): js.Array[Buffer] = js.native
  def accepted(value: js.Array[Buffer]): js.Array[Buffer] = js.native
  def quorumSetHash(): Buffer = js.native
  def quorumSetHash(value: Buffer): Buffer = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  def votes(): js.Array[Buffer] = js.native
  def votes(value: js.Array[Buffer]): js.Array[Buffer] = js.native
}

