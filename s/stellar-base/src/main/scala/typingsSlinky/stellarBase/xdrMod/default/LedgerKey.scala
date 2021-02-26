package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.LedgerKey")
@js.native
class LedgerKey ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey
object LedgerKey {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.account")
  @js.native
  def account(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyAccount): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.claimableBalance")
  @js.native
  def claimableBalance(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyClaimableBalance): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.data")
  @js.native
  def data(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyData): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.offer")
  @js.native
  def offer(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyOffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.trustline")
  @js.native
  def trustline(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKey, io: Buffer): Unit = js.native
}
