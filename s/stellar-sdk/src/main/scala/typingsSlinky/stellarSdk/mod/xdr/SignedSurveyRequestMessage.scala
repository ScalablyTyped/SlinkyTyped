package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.Request
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.SignedSurveyRequestMessage")
@js.native
class SignedSurveyRequestMessage protected ()
  extends typingsSlinky.stellarBase.mod.xdr.SignedSurveyRequestMessage {
  def this(attributes: Request) = this()
}
/* static members */
@JSImport("stellar-sdk", "xdr.SignedSurveyRequestMessage")
@js.native
object SignedSurveyRequestMessage extends js.Object {
  
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage = js.native
  
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage): Boolean = js.native
  
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage = js.native
  
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage): Buffer = js.native
  
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage, io: Buffer): Unit = js.native
}
