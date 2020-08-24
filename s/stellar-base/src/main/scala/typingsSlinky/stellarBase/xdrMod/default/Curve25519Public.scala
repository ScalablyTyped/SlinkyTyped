package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Key
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "Curve25519Public")
@js.native
class Curve25519Public protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public {
  def this(attributes: Key) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "Curve25519Public")
@js.native
object Curve25519Public extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.Curve25519Public, io: Buffer): Unit = js.native
}

