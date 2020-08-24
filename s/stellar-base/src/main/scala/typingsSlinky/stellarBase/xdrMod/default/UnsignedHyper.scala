package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "UnsignedHyper")
@js.native
class UnsignedHyper protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper {
  def this(low: Double, high: Double) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "UnsignedHyper")
@js.native
object UnsignedHyper extends js.Object {
  val MAX_VALUE: typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  val MIN_VALUE: typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  def fromBytes(low: Double, high: Double): typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  def fromString(input: String): typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.UnsignedHyper, io: Buffer): Unit = js.native
}

