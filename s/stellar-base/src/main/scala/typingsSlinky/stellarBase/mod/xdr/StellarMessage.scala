package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.StellarMessage")
@js.native
class StellarMessage ()
  extends typingsSlinky.stellarBase.xdrMod.default.StellarMessage

/* static members */
@JSImport("stellar-base", "xdr.StellarMessage")
@js.native
object StellarMessage extends js.Object {
  def auth(value: typingsSlinky.stellarBase.xdrMod.xdr.Auth): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def dontHave(value: typingsSlinky.stellarBase.xdrMod.xdr.DontHave): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def errorMsg(value: typingsSlinky.stellarBase.xdrMod.xdr.Error): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def getPeer(): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def getScpQuorumset(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def getScpState(value: Double): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def getTxSet(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def hello(value: typingsSlinky.stellarBase.xdrMod.xdr.Hello): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage): Boolean = js.native
  def peer(value: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.PeerAddress]): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def scpMessage(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpEnvelope): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def scpQuorumset(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpQuorumSet): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def surveyRequest(value: typingsSlinky.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def surveyResponse(value: typingsSlinky.stellarBase.xdrMod.xdr.SignedSurveyResponseMessage): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage): Buffer = js.native
  def transaction(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def txSet(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionSet): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage, io: Buffer): Unit = js.native
}

