package typingsSlinky.stellarBase.xdrMod.default

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.OperationId")
@js.native
class OperationId ()
  extends typingsSlinky.stellarBase.xdrMod.xdr.OperationId
object OperationId {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationId.envelopeTypeOpId")
  @js.native
  def envelopeTypeOpId(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationIdId): typingsSlinky.stellarBase.xdrMod.xdr.OperationId = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationId.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OperationId = js.native
  @JSImport("stellar-base/types/xdr", "default.OperationId.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.OperationId = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationId.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.OperationId = js.native
  @JSImport("stellar-base/types/xdr", "default.OperationId.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.OperationId = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationId.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationId): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationId.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.OperationId = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationId.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationId): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationId.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.OperationId.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationId.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.OperationId.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.OperationId.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.OperationId, io: Buffer): Unit = js.native
}
