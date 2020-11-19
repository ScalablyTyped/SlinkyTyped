package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.AmountDestination
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "InflationPayout")
@js.native
class InflationPayout protected ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.InflationPayout {
  def this(attributes: AmountDestination) = this()
}
/* static members */
@JSImport("stellar-base/types/xdr", "InflationPayout")
@js.native
object InflationPayout extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.InflationPayout = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.InflationPayout = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.InflationPayout = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.InflationPayout = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.InflationPayout): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.InflationPayout = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.InflationPayout): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.InflationPayout, io: Buffer): Unit = js.native
}
