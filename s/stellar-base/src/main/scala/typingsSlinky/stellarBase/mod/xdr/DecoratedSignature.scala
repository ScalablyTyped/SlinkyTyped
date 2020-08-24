package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Hint
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.DecoratedSignature")
@js.native
class DecoratedSignature protected ()
  extends typingsSlinky.stellarBase.xdrMod.default.DecoratedSignature {
  def this(attributes: Hint) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.DecoratedSignature")
@js.native
object DecoratedSignature extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.DecoratedSignature = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.DecoratedSignature = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.DecoratedSignature = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.DecoratedSignature = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.DecoratedSignature): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.DecoratedSignature = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.DecoratedSignature): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.DecoratedSignature, io: Buffer): Unit = js.native
}

