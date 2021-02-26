package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Limit
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.ChangeTrustOp")
@js.native
class ChangeTrustOp protected ()
  extends typingsSlinky.stellarBase.mod.xdr.ChangeTrustOp {
  def this(attributes: Limit) = this()
}
object ChangeTrustOp {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ChangeTrustOp.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustOp = js.native
  @JSImport("stellar-sdk", "xdr.ChangeTrustOp.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustOp = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.ChangeTrustOp.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustOp = js.native
  @JSImport("stellar-sdk", "xdr.ChangeTrustOp.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustOp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ChangeTrustOp.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustOp): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ChangeTrustOp.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustOp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ChangeTrustOp.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustOp): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ChangeTrustOp.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.ChangeTrustOp.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.ChangeTrustOp.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.ChangeTrustOp.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ChangeTrustOp.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ChangeTrustOp, io: Buffer): Unit = js.native
}
