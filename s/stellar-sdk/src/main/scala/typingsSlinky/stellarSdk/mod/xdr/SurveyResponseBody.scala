package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.SurveyResponseBody")
@js.native
class SurveyResponseBody ()
  extends typingsSlinky.stellarBase.mod.xdr.SurveyResponseBody

/* static members */
@JSImport("stellar-sdk", "xdr.SurveyResponseBody")
@js.native
object SurveyResponseBody extends js.Object {
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody): Boolean = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  def surveyTopology(value: typingsSlinky.stellarBase.xdrMod.xdr.TopologyResponseBody): typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody): Buffer = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody, io: Buffer): Unit = js.native
}

