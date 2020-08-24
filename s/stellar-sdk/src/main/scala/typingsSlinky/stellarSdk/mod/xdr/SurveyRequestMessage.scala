package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.anon.CommandType
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.SurveyRequestMessage")
@js.native
class SurveyRequestMessage protected ()
  extends typingsSlinky.stellarBase.mod.xdr.SurveyRequestMessage {
  def this(attributes: CommandType) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.SurveyRequestMessage")
@js.native
object SurveyRequestMessage extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SurveyRequestMessage = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.SurveyRequestMessage = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.SurveyRequestMessage = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.SurveyRequestMessage = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.SurveyRequestMessage): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SurveyRequestMessage = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.SurveyRequestMessage): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.SurveyRequestMessage, io: Buffer): Unit = js.native
}

