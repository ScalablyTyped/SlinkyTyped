package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.ManageDataResult")
@js.native
class ManageDataResult ()
  extends typingsSlinky.stellarBase.mod.xdr.ManageDataResult

/* static members */
@JSImport("stellar-sdk", "xdr.ManageDataResult")
@js.native
object ManageDataResult extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ManageDataResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ManageDataResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ManageDataResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ManageDataResult = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageDataResult): Boolean = js.native
  def manageDataSuccess(): typingsSlinky.stellarBase.xdrMod.xdr.ManageDataResult = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ManageDataResult = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageDataResult): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageDataResult, io: Buffer): Unit = js.native
}

