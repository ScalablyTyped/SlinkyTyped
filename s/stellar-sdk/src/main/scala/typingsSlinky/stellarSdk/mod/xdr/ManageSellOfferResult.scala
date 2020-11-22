package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.ManageSellOfferResult")
@js.native
class ManageSellOfferResult ()
  extends typingsSlinky.stellarBase.mod.xdr.ManageSellOfferResult
/* static members */
@JSImport("stellar-sdk", "xdr.ManageSellOfferResult")
@js.native
object ManageSellOfferResult extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageSellOfferResult): Boolean = js.native
  
  def manageSellOfferSuccess(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageOfferSuccessResult): typingsSlinky.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ManageSellOfferResult = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageSellOfferResult): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ManageSellOfferResult, io: Buffer): Unit = js.native
}
