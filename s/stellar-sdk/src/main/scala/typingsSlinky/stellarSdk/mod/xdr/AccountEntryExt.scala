package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.AccountEntryExt")
@js.native
class AccountEntryExt ()
  extends typingsSlinky.stellarBase.mod.xdr.AccountEntryExt

/* static members */
@JSImport("stellar-sdk", "xdr.AccountEntryExt")
@js.native
object AccountEntryExt extends js.Object {
  def `0`(): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  def `1`(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryV1): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.AccountEntryExt, io: Buffer): Unit = js.native
}

