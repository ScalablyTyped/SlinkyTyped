package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.BumpSequenceResult")
@js.native
class BumpSequenceResult ()
  extends typingsSlinky.stellarBase.mod.xdr.BumpSequenceResult

/* static members */
@JSImport("stellar-sdk", "xdr.BumpSequenceResult")
@js.native
object BumpSequenceResult extends js.Object {
  def bumpSequenceSuccess(): typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceResult): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceResult = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceResult): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.BumpSequenceResult, io: Buffer): Unit = js.native
}

