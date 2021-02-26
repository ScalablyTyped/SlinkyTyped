package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.StellarMessage")
@js.native
class StellarMessage ()
  extends typingsSlinky.stellarBase.mod.xdr.StellarMessage
object StellarMessage {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.auth")
  @js.native
  def auth(value: typingsSlinky.stellarBase.xdrMod.xdr.Auth): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.dontHave")
  @js.native
  def dontHave(value: typingsSlinky.stellarBase.xdrMod.xdr.DontHave): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.errorMsg")
  @js.native
  def errorMsg(value: typingsSlinky.stellarBase.xdrMod.xdr.Error): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  @JSImport("stellar-sdk", "xdr.StellarMessage.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  @JSImport("stellar-sdk", "xdr.StellarMessage.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.getPeers")
  @js.native
  def getPeers(): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.getScpQuorumset")
  @js.native
  def getScpQuorumset(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.getScpState")
  @js.native
  def getScpState(value: Double): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.getTxSet")
  @js.native
  def getTxSet(value: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.hello")
  @js.native
  def hello(value: typingsSlinky.stellarBase.xdrMod.xdr.Hello): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.peers")
  @js.native
  def peers(value: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.PeerAddress]): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.scpMessage")
  @js.native
  def scpMessage(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpEnvelope): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.scpQuorumset")
  @js.native
  def scpQuorumset(value: typingsSlinky.stellarBase.xdrMod.xdr.ScpQuorumSet): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.surveyRequest")
  @js.native
  def surveyRequest(value: typingsSlinky.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.surveyResponse")
  @js.native
  def surveyResponse(value: typingsSlinky.stellarBase.xdrMod.xdr.SignedSurveyResponseMessage): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.transaction")
  @js.native
  def transaction(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionEnvelope): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.txSet")
  @js.native
  def txSet(value: typingsSlinky.stellarBase.xdrMod.xdr.TransactionSet): typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.StellarMessage.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.StellarMessage.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarMessage.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.StellarMessage, io: Buffer): Unit = js.native
}
