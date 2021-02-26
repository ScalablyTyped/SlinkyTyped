package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.AccountIdAsset
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.LedgerKeyTrustLine")
@js.native
class LedgerKeyTrustLine protected ()
  extends typingsSlinky.stellarBase.mod.xdr.LedgerKeyTrustLine {
  def this(attributes: AccountIdAsset) = this()
}
object LedgerKeyTrustLine {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyTrustLine.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKeyTrustLine.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyTrustLine.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKeyTrustLine.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyTrustLine.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyTrustLine.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyTrustLine.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyTrustLine.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKeyTrustLine.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyTrustLine.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKeyTrustLine.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyTrustLine.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.LedgerKeyTrustLine, io: Buffer): Unit = js.native
}
