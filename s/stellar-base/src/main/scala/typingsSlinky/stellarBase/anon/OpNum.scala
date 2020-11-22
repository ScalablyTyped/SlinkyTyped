package typingsSlinky.stellarBase.anon

import typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount
import typingsSlinky.stellarBase.xdrMod.xdr.SequenceNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpNum extends js.Object {
  
  var opNum: Double = js.native
  
  var seqNum: SequenceNumber = js.native
  
  var sourceAccount: MuxedAccount = js.native
}
object OpNum {
  
  @scala.inline
  def apply(opNum: Double, seqNum: SequenceNumber, sourceAccount: MuxedAccount): OpNum = {
    val __obj = js.Dynamic.literal(opNum = opNum.asInstanceOf[js.Any], seqNum = seqNum.asInstanceOf[js.Any], sourceAccount = sourceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpNum]
  }
  
  @scala.inline
  implicit class OpNumOps[Self <: OpNum] (val x: Self) extends AnyVal {
    
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
    def setOpNum(value: Double): Self = this.set("opNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeqNum(value: SequenceNumber): Self = this.set("seqNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAccount(value: MuxedAccount): Self = this.set("sourceAccount", value.asInstanceOf[js.Any])
  }
}
