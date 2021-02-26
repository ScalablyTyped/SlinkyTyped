package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.LedgerUpgrade")
@js.native
class LedgerUpgrade ()
  extends typingsSlinky.stellarBase.mod.xdr.LedgerUpgrade
object LedgerUpgrade {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerUpgrade.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  @JSImport("stellar-sdk", "xdr.LedgerUpgrade.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerUpgrade.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  @JSImport("stellar-sdk", "xdr.LedgerUpgrade.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerUpgrade.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerUpgrade.ledgerUpgradeBaseFee")
  @js.native
  def ledgerUpgradeBaseFee(value: Double): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerUpgrade.ledgerUpgradeBaseReserve")
  @js.native
  def ledgerUpgradeBaseReserve(value: Double): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerUpgrade.ledgerUpgradeMaxTxSetSize")
  @js.native
  def ledgerUpgradeMaxTxSetSize(value: Double): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerUpgrade.ledgerUpgradeVersion")
  @js.native
  def ledgerUpgradeVersion(value: Double): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerUpgrade.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerUpgrade.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerUpgrade.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerUpgrade.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerUpgrade.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerUpgrade.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerUpgrade.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerUpgrade, io: Buffer): Unit = js.native
}
