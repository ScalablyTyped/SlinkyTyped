package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Ed25519
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.MuxedAccountMed25519")
@js.native
class MuxedAccountMed25519 protected ()
  extends typingsSlinky.stellarBase.mod.xdr.MuxedAccountMed25519 {
  def this(attributes: Ed25519) = this()
}
/* static members */
@JSImport("stellar-sdk", "xdr.MuxedAccountMed25519")
@js.native
object MuxedAccountMed25519 extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519 = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519 = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519 = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519 = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519 = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccountMed25519, io: Buffer): Unit = js.native
}
