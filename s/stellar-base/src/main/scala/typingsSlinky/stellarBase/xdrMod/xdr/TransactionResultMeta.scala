package typingsSlinky.stellarBase.xdrMod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionResultMeta extends js.Object {
  
  def feeProcessing(): js.Array[LedgerEntryChange] = js.native
  def feeProcessing(value: js.Array[LedgerEntryChange]): js.Array[LedgerEntryChange] = js.native
  
  def result(): TransactionResultPair = js.native
  def result(value: TransactionResultPair): TransactionResultPair = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def txApplyProcessing(): TransactionMeta = js.native
  def txApplyProcessing(value: TransactionMeta): TransactionMeta = js.native
}
