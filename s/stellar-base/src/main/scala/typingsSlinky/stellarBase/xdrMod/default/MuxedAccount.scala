package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "MuxedAccount")
@js.native
class MuxedAccount ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount
/* static members */
@JSImport("stellar-base/types/xdr", "MuxedAccount")
@js.native
object MuxedAccount extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount): Boolean = js.native
  
  def keyTypeEd25519(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  
  def keyTypeMuxedEd25519(value: typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount, io: Buffer): Unit = js.native
}
