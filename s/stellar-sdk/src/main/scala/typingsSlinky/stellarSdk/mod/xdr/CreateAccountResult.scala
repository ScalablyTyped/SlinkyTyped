package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.CreateAccountResult")
@js.native
class CreateAccountResult ()
  extends typingsSlinky.stellarBase.mod.xdr.CreateAccountResult

/* static members */
@JSImport("stellar-sdk", "xdr.CreateAccountResult")
@js.native
object CreateAccountResult extends js.Object {
  def createAccountSuccess(): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResult): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResult): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResult, io: Buffer): Unit = js.native
}

