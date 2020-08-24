package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.AllowTrustResult")
@js.native
class AllowTrustResult ()
  extends typingsSlinky.stellarBase.mod.xdr.AllowTrustResult

/* static members */
@JSImport("stellar-sdk", "xdr.AllowTrustResult")
@js.native
object AllowTrustResult extends js.Object {
  def allowTrustSuccess(): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.AllowTrustResult, io: Buffer): Unit = js.native
}

