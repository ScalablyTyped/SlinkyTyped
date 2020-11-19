package typingsSlinky.stellarBase.anon

import typingsSlinky.stellarBase.mod.Operation
import typingsSlinky.stellarBase.xdrMod.xdr.Memo
import typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount
import typingsSlinky.stellarBase.xdrMod.xdr.SequenceNumber
import typingsSlinky.stellarBase.xdrMod.xdr.TimeBounds
import typingsSlinky.stellarBase.xdrMod.xdr.TransactionExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fee extends js.Object {
  
  var ext: TransactionExt = js.native
  
  var fee: Double = js.native
  
  var memo: Memo = js.native
  
  var operations: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.Operation[Operation]] = js.native
  
  var seqNum: SequenceNumber = js.native
  
  var sourceAccount: MuxedAccount = js.native
  
  var timeBounds: Null | TimeBounds = js.native
}
object Fee {
  
  @scala.inline
  def apply(
    ext: TransactionExt,
    fee: Double,
    memo: Memo,
    operations: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.Operation[Operation]],
    seqNum: SequenceNumber,
    sourceAccount: MuxedAccount
  ): Fee = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], memo = memo.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], seqNum = seqNum.asInstanceOf[js.Any], sourceAccount = sourceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fee]
  }
  
  @scala.inline
  implicit class FeeOps[Self <: Fee] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExt(value: TransactionExt): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFee(value: Double): Self = this.set("fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemo(value: Memo): Self = this.set("memo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsVarargs(value: typingsSlinky.stellarBase.xdrMod.xdr.Operation[Operation]*): Self = this.set("operations", js.Array(value :_*))
    
    @scala.inline
    def setOperations(value: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.Operation[Operation]]): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeqNum(value: SequenceNumber): Self = this.set("seqNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAccount(value: MuxedAccount): Self = this.set("sourceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeBounds(value: TimeBounds): Self = this.set("timeBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeBoundsNull: Self = this.set("timeBounds", null)
  }
}
