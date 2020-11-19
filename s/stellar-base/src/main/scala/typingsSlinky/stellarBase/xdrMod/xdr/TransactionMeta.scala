package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionMeta extends js.Object {
  
  def operations(): js.Array[OperationMeta] = js.native
  def operations(value: js.Array[OperationMeta]): js.Array[OperationMeta] = js.native
  
  def switch(): Double = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def v1(): TransactionMetaV1 = js.native
  def v1(value: TransactionMetaV1): TransactionMetaV1 = js.native
  
  def v2(): TransactionMetaV2 = js.native
  def v2(value: TransactionMetaV2): TransactionMetaV2 = js.native
  
  def value(): js.Array[OperationMeta] | TransactionMetaV1 | TransactionMetaV2 = js.native
}
