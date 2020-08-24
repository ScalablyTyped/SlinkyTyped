package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.InflationResult")
@js.native
class InflationResult ()
  extends typingsSlinky.stellarBase.xdrMod.default.InflationResult

/* static members */
@JSImport("stellar-base", "xdr.InflationResult")
@js.native
object InflationResult extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.InflationResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.InflationResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.InflationResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.InflationResult = js.native
  def inflationSuccess(value: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.InflationPayout]): typingsSlinky.stellarBase.xdrMod.xdr.InflationResult = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.InflationResult): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.InflationResult = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.InflationResult): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.InflationResult, io: Buffer): Unit = js.native
}

