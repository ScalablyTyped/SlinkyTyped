package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Cert
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.Hello")
@js.native
class Hello protected ()
  extends typingsSlinky.stellarBase.mod.xdr.Hello {
  def this(attributes: Cert) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.Hello")
@js.native
object Hello extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Hello = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.Hello = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.Hello = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.Hello = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.Hello): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.Hello = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.Hello): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.Hello, io: Buffer): Unit = js.native
}

