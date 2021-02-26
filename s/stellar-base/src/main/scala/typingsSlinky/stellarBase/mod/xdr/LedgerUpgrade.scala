package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.LedgerUpgrade")
@js.native
class LedgerUpgrade ()
  extends typingsSlinky.stellarBase.xdrMod.default.LedgerUpgrade
object LedgerUpgrade {
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  @JSImport("stellar-base", "xdr.LedgerUpgrade.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  @JSImport("stellar-base", "xdr.LedgerUpgrade.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.ledgerUpgradeBaseFee")
  @js.native
  def ledgerUpgradeBaseFee(value: Double): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.ledgerUpgradeBaseReserve")
  @js.native
  def ledgerUpgradeBaseReserve(value: Double): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.ledgerUpgradeMaxTxSetSize")
  @js.native
  def ledgerUpgradeMaxTxSetSize(value: Double): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.ledgerUpgradeVersion")
  @js.native
  def ledgerUpgradeVersion(value: Double): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerUpgrade.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerUpgrade.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerUpgrade.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade, io: Buffer): Unit = js.native
}
