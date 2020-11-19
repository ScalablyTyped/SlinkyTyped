package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult")
@js.native
class PathPaymentStrictReceiveResult ()
  extends typingsSlinky.stellarBase.mod.xdr.PathPaymentStrictReceiveResult
/* static members */
@JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResult")
@js.native
object PathPaymentStrictReceiveResult extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult): Boolean = js.native
  
  def pathPaymentStrictReceiveNoIssuer(value: typingsSlinky.stellarBase.xdrMod.xdr.Asset): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  
  def pathPaymentStrictReceiveSuccess(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult, io: Buffer): Unit = js.native
}
