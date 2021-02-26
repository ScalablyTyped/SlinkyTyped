package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionV0 extends StObject {
  
  def ext(): TransactionV0Ext = js.native
  def ext(value: TransactionV0Ext): TransactionV0Ext = js.native
  
  def fee(): Double = js.native
  def fee(value: Double): Double = js.native
  
  def memo(): Memo = js.native
  def memo(value: Memo): Memo = js.native
  
  def operations(): js.Array[Operation[typingsSlinky.stellarBase.mod.Operation]] = js.native
  def operations(value: js.Array[Operation[typingsSlinky.stellarBase.mod.Operation]]): js.Array[Operation[typingsSlinky.stellarBase.mod.Operation]] = js.native
  
  def seqNum(): SequenceNumber = js.native
  def seqNum(value: SequenceNumber): SequenceNumber = js.native
  
  def sourceAccountEd25519(): Buffer = js.native
  def sourceAccountEd25519(value: Buffer): Buffer = js.native
  
  def timeBounds(): Null | TimeBounds = js.native
  def timeBounds(value: TimeBounds): Null | TimeBounds = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
