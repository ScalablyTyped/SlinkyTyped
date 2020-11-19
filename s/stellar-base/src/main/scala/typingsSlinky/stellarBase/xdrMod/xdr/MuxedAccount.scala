package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MuxedAccount extends js.Object {
  
  def ed25519(): Buffer = js.native
  def ed25519(value: Buffer): Buffer = js.native
  
  def med25519(): MuxedAccountMed25519 = js.native
  def med25519(value: MuxedAccountMed25519): MuxedAccountMed25519 = js.native
  
  def switch(): CryptoKeyType = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def value(): Buffer | MuxedAccountMed25519 = js.native
}
