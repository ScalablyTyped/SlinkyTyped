package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.LedgerUpgrade")
@js.native
class LedgerUpgrade ()
  extends typingsSlinky.stellarBase.xdrMod.default.LedgerUpgrade
/* static members */
@JSImport("stellar-base", "xdr.LedgerUpgrade")
@js.native
object LedgerUpgrade extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade): Boolean = js.native
  
  def ledgerUpgradeBaseFee(value: Double): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  def ledgerUpgradeBaseReserve(value: Double): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  def ledgerUpgradeMaxTxSetSize(value: Double): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  def ledgerUpgradeVersion(value: Double): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade, io: Buffer): Unit = js.native
}
