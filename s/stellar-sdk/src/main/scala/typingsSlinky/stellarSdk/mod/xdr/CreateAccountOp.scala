package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Destination
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.CreateAccountOp")
@js.native
class CreateAccountOp protected ()
  extends typingsSlinky.stellarBase.mod.xdr.CreateAccountOp {
  def this(attributes: Destination) = this()
}
object CreateAccountOp {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.CreateAccountOp.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountOp = js.native
  @JSImport("stellar-sdk", "xdr.CreateAccountOp.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountOp = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.CreateAccountOp.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountOp = js.native
  @JSImport("stellar-sdk", "xdr.CreateAccountOp.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountOp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.CreateAccountOp.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountOp): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.CreateAccountOp.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountOp = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.CreateAccountOp.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountOp): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.CreateAccountOp.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.CreateAccountOp.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.CreateAccountOp.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.CreateAccountOp.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.CreateAccountOp.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountOp, io: Buffer): Unit = js.native
}
