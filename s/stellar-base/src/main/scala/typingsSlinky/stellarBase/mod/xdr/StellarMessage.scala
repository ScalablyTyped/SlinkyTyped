package typingsSlinky.stellarBase.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.StellarMessage")
@js.native
class StellarMessage ()
  extends typingsSlinky.stellarBase.xdrMod.default.StellarMessage
object StellarMessage {
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.auth")
  @js.native
  def auth(value: typingsSlinky.stellarBase.xdrMod.xdr.Auth): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.dontHave")
  @js.native
  def dontHave(value: typingsSlinky.stellarBase.xdrMod.xdr.DontHave): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.errorMsg")
  @js.native
  def errorMsg(value: typingsSlinky.stellarBase.xdrMod.xdr.Error): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  @JSImport("stellar-base", "xdr.StellarMessage.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  @JSImport("stellar-base", "xdr.StellarMessage.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.getPeers")
  @js.native
  def getPeers(): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.getScpQuorumset")
  @js.native
  def getScpQuorumset(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.getScpState")
  @js.native
  def getScpState(value: Double): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.getTxSet")
  @js.native
  def getTxSet(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.hello")
  @js.native
  def hello(value: typingsSlinky.stellarBase.xdrMod.xdr.Hello): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.peers")
  @js.native
  def peers(value: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.PeerAddress]): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.scpMessage")
  @js.native
  def scpMessage(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpEnvelope): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.scpQuorumset")
  @js.native
  def scpQuorumset(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpQuorumSet): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.surveyRequest")
  @js.native
  def surveyRequest(value: typingsSlinky.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.surveyResponse")
  @js.native
  def surveyResponse(value: typingsSlinky.stellarBase.xdrMod.xdr.SignedSurveyResponseMessage): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.transaction")
  @js.native
  def transaction(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.txSet")
  @js.native
  def txSet(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionSet): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.StellarMessage.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.StellarMessage.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarMessage.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage, io: Buffer): Unit = js.native
}
