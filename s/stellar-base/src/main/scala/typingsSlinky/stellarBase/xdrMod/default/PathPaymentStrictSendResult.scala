package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.PathPaymentStrictSendResult")
@js.native
class PathPaymentStrictSendResult ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult
object PathPaymentStrictSendResult {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictSendResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictSendResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictSendResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictSendResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictSendResult.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictSendResult.pathPaymentStrictSendNoIssuer")
  @js.native
  def pathPaymentStrictSendNoIssuer(value: typingsSlinky.stellarBase.xdrMod.xdr.Asset): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictSendResult.pathPaymentStrictSendSuccess")
  @js.native
  def pathPaymentStrictSendSuccess(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResultSuccess): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictSendResult.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictSendResult.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictSendResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictSendResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictSendResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictSendResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.PathPaymentStrictSendResult.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult, io: Buffer): Unit = js.native
}
