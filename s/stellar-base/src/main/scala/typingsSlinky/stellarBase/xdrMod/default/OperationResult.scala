package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.OperationResult")
@js.native
class OperationResult ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.OperationResult
object OperationResult {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OperationResult = js.native
  @JSImport("stellar-base/types/xdr", "default.OperationResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.OperationResult = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.OperationResult = js.native
  @JSImport("stellar-base/types/xdr", "default.OperationResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.OperationResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationResult.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationResult.opInner")
  @js.native
  def opInner(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationResultTr): typingsSlinky.stellarBase.xdrMod.xdr.OperationResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationResult.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OperationResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationResult.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.OperationResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.OperationResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationResult.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationResult, io: Buffer): Unit = js.native
}
