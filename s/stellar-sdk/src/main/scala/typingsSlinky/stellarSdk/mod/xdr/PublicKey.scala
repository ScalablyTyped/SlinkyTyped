package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.PublicKey")
@js.native
class PublicKey ()
  extends typingsSlinky.stellarBase.mod.xdr.PublicKey
object PublicKey {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PublicKey.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PublicKey = js.native
  @JSImport("stellar-sdk", "xdr.PublicKey.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.PublicKey = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.PublicKey.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.PublicKey = js.native
  @JSImport("stellar-sdk", "xdr.PublicKey.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.PublicKey = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PublicKey.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.PublicKey): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PublicKey.publicKeyTypeEd25519")
  @js.native
  def publicKeyTypeEd25519(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PublicKey = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PublicKey.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PublicKey = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PublicKey.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.PublicKey): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PublicKey.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.PublicKey.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.PublicKey.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.PublicKey.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PublicKey.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.PublicKey, io: Buffer): Unit = js.native
}
