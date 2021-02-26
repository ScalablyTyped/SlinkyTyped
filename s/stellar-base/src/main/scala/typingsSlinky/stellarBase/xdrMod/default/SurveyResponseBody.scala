package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.SurveyResponseBody")
@js.native
class SurveyResponseBody ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody
object SurveyResponseBody {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SurveyResponseBody.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  @JSImport("stellar-base/types/xdr", "default.SurveyResponseBody.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SurveyResponseBody.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  @JSImport("stellar-base/types/xdr", "default.SurveyResponseBody.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SurveyResponseBody.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SurveyResponseBody.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SurveyResponseBody.surveyTopology")
  @js.native
  def surveyTopology(value: typingsSlinky.stellarBase.xdrMod.xdr.TopologyResponseBody): typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SurveyResponseBody.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SurveyResponseBody.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.SurveyResponseBody.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SurveyResponseBody.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.SurveyResponseBody.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.SurveyResponseBody.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.SurveyResponseBody, io: Buffer): Unit = js.native
}
