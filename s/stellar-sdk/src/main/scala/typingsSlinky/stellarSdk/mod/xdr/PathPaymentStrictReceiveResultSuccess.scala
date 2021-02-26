package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Last
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResultSuccess")
@js.native
class PathPaymentStrictReceiveResultSuccess protected ()
  extends typingsSlinky.stellarBase.mod.xdr.PathPaymentStrictReceiveResultSuccess {
  def this(attributes: Last) = this()
}
object PathPaymentStrictReceiveResultSuccess {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResultSuccess.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess = js.native
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResultSuccess.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResultSuccess.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess = js.native
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResultSuccess.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResultSuccess.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResultSuccess.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResultSuccess.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResultSuccess.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResultSuccess.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResultSuccess.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResultSuccess.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.PathPaymentStrictReceiveResultSuccess.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResultSuccess, io: Buffer): Unit = js.native
}
