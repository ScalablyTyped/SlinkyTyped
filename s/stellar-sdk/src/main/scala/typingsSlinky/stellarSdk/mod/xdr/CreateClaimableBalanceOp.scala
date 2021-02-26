package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Claimants
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.CreateClaimableBalanceOp")
@js.native
class CreateClaimableBalanceOp protected ()
  extends typingsSlinky.stellarBase.mod.xdr.CreateClaimableBalanceOp {
  def this(attributes: Claimants) = this()
}
object CreateClaimableBalanceOp {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.CreateClaimableBalanceOp.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.CreateClaimableBalanceOp = js.native
  @JSImport("stellar-sdk", "xdr.CreateClaimableBalanceOp.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.CreateClaimableBalanceOp = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.CreateClaimableBalanceOp.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.CreateClaimableBalanceOp = js.native
  @JSImport("stellar-sdk", "xdr.CreateClaimableBalanceOp.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.CreateClaimableBalanceOp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.CreateClaimableBalanceOp.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.CreateClaimableBalanceOp): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.CreateClaimableBalanceOp.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.CreateClaimableBalanceOp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.CreateClaimableBalanceOp.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.CreateClaimableBalanceOp): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.CreateClaimableBalanceOp.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.CreateClaimableBalanceOp.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.CreateClaimableBalanceOp.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.CreateClaimableBalanceOp.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.CreateClaimableBalanceOp.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.CreateClaimableBalanceOp, io: Buffer): Unit = js.native
}
