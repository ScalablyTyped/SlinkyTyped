package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SurveyRequestMessage extends js.Object {
  
  def commandType(): SurveyMessageCommandType = js.native
  def commandType(value: SurveyMessageCommandType): SurveyMessageCommandType = js.native
  
  def encryptionKey(): Curve25519Public = js.native
  def encryptionKey(value: Curve25519Public): Curve25519Public = js.native
  
  def ledgerNum(): Double = js.native
  def ledgerNum(value: Double): Double = js.native
  
  def surveyedPeerId(): NodeId = js.native
  def surveyedPeerId(value: NodeId): NodeId = js.native
  
  def surveyorPeerId(): NodeId = js.native
  def surveyorPeerId(value: NodeId): NodeId = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
