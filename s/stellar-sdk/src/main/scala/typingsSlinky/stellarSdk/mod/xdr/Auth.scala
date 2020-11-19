package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Unused
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.Auth")
@js.native
class Auth protected ()
  extends typingsSlinky.stellarBase.mod.xdr.Auth {
  def this(attributes: Unused) = this()
}
/* static members */
@JSImport("stellar-sdk", "xdr.Auth")
@js.native
object Auth extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Auth = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.Auth = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.Auth = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.Auth = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.Auth): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Auth = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.Auth): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.Auth, io: Buffer): Unit = js.native
}
