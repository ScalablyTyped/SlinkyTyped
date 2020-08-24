package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.Hyper")
@js.native
class Hyper protected ()
  extends typingsSlinky.stellarBase.mod.xdr.Hyper {
  def this(low: Double, high: Double) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.Hyper")
@js.native
object Hyper extends js.Object {
  val MAX_VALUE: typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  val MIN_VALUE: typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  def fromBytes(low: Double, high: Double): typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  def fromString(input: String): typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.Hyper): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Hyper = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.Hyper): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.Hyper, io: Buffer): Unit = js.native
}

