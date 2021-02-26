package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.LedgerKey")
@js.native
class LedgerKey ()
  extends typingsSlinky.stellarBase.mod.xdr.LedgerKey
object LedgerKey {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.account")
  @js.native
  def account(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyAccount): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.claimableBalance")
  @js.native
  def claimableBalance(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyClaimableBalance): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.data")
  @js.native
  def data(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyData): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKey.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKey.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.offer")
  @js.native
  def offer(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyOffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.trustline")
  @js.native
  def trustline(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKey.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKey.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey, io: Buffer): Unit = js.native
}
