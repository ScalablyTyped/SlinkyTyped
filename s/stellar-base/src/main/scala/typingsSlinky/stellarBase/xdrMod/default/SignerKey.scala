package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "SignerKey")
@js.native
class SignerKey ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.SignerKey
/* static members */
@JSImport("stellar-base/types/xdr", "SignerKey")
@js.native
object SignerKey extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SignerKey = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.SignerKey = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.SignerKey = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.SignerKey = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.SignerKey): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SignerKey = js.native
  
  def signerKeyTypeEd25519(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SignerKey = js.native
  
  def signerKeyTypeHashX(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SignerKey = js.native
  
  def signerKeyTypePreAuthTx(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SignerKey = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.SignerKey): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.SignerKey, io: Buffer): Unit = js.native
}
