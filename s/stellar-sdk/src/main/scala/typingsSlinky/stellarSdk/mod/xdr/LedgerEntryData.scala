package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.LedgerEntryData")
@js.native
class LedgerEntryData ()
  extends typingsSlinky.stellarBase.mod.xdr.LedgerEntryData
object LedgerEntryData {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryData.account")
  @js.native
  def account(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountEntry): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryData.claimableBalance")
  @js.native
  def claimableBalance(value: typingsSlinky.stellarBase.xdrMod.xdr.ClaimableBalanceEntry): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryData.data")
  @js.native
  def data(value: typingsSlinky.stellarBase.xdrMod.xdr.DataEntry): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryData.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  @JSImport("stellar-sdk", "xdr.LedgerEntryData.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryData.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  @JSImport("stellar-sdk", "xdr.LedgerEntryData.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryData.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryData.offer")
  @js.native
  def offer(value: typingsSlinky.stellarBase.xdrMod.xdr.OfferEntry): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryData.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryData.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryData.trustline")
  @js.native
  def trustline(value: typingsSlinky.stellarBase.xdrMod.xdr.TrustLineEntry): typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryData.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerEntryData.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryData.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerEntryData.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryData.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerEntryData, io: Buffer): Unit = js.native
}
