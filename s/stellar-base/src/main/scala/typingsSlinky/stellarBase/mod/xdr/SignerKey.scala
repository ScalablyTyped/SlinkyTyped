package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.SignerKey")
@js.native
class SignerKey ()
  extends typingsSlinky.stellarBase.xdrMod.default.SignerKey
object SignerKey {
  
  /* static member */
  @JSImport("stellar-base", "xdr.SignerKey.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SignerKey = js.native
  @JSImport("stellar-base", "xdr.SignerKey.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.SignerKey = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.SignerKey.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.SignerKey = js.native
  @JSImport("stellar-base", "xdr.SignerKey.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.SignerKey = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.SignerKey.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.SignerKey): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.SignerKey.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SignerKey = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.SignerKey.signerKeyTypeEd25519")
  @js.native
  def signerKeyTypeEd25519(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SignerKey = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.SignerKey.signerKeyTypeHashX")
  @js.native
  def signerKeyTypeHashX(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SignerKey = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.SignerKey.signerKeyTypePreAuthTx")
  @js.native
  def signerKeyTypePreAuthTx(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SignerKey = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.SignerKey.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.SignerKey): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.SignerKey.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.SignerKey.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.SignerKey.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.SignerKey.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.SignerKey.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.SignerKey, io: Buffer): Unit = js.native
}
