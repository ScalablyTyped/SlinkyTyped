package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.PathPaymentStrictSendResult")
@js.native
class PathPaymentStrictSendResult ()
  extends typingsSlinky.stellarBase.mod.xdr.PathPaymentStrictSendResult
/* static members */
@JSImport("stellar-sdk", "xdr.PathPaymentStrictSendResult")
@js.native
object PathPaymentStrictSendResult extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult): Boolean = js.native
  
  def pathPaymentStrictSendNoIssuer(value: typingsSlinky.stellarBase.xdrMod.xdr.Asset): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  
  def pathPaymentStrictSendSuccess(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResultSuccess): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult, io: Buffer): Unit = js.native
}
