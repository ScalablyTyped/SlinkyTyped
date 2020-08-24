package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.PublicKey")
@js.native
class PublicKey ()
  extends typingsSlinky.stellarBase.mod.xdr.PublicKey

/* static members */
@JSImport("stellar-sdk", "xdr.PublicKey")
@js.native
object PublicKey extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PublicKey = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.PublicKey = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.PublicKey = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.PublicKey = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.PublicKey): Boolean = js.native
  def publicKeyTypeEd25519(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PublicKey = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PublicKey = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.PublicKey): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.PublicKey, io: Buffer): Unit = js.native
}

