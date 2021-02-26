package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.MuxedAccount")
@js.native
class MuxedAccount ()
  extends typingsSlinky.stellarBase.mod.xdr.MuxedAccount
object MuxedAccount {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccount.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  @JSImport("stellar-sdk", "xdr.MuxedAccount.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccount.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  @JSImport("stellar-sdk", "xdr.MuxedAccount.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccount.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccount.keyTypeEd25519")
  @js.native
  def keyTypeEd25519(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccount.keyTypeMuxedEd25519")
  @js.native
  def keyTypeMuxedEd25519(value: typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccount.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccount.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccount.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.MuxedAccount.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccount.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.MuxedAccount.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.MuxedAccount.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount, io: Buffer): Unit = js.native
}
