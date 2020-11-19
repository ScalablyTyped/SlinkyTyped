package typingsSlinky.web3Core.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogsOptions extends js.Object {
  
  var address: js.UndefOr[String | js.Array[String]] = js.native
  
  var fromBlock: js.UndefOr[BlockNumber] = js.native
  
  var topics: js.UndefOr[js.Array[String | js.Array[String] | Null]] = js.native
}
object LogsOptions {
  
  @scala.inline
  def apply(): LogsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogsOptions]
  }
  
  @scala.inline
  implicit class LogsOptionsOps[Self <: LogsOptions] (val x: Self) extends AnyVal {
    
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
    def setAddressVarargs(value: String*): Self = this.set("address", js.Array(value :_*))
    
    @scala.inline
    def setAddress(value: String | js.Array[String]): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setFromBlock(value: BlockNumber): Self = this.set("fromBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromBlock: Self = this.set("fromBlock", js.undefined)
    
    @scala.inline
    def setTopicsVarargs(value: (String | js.Array[String] | Null)*): Self = this.set("topics", js.Array(value :_*))
    
    @scala.inline
    def setTopics(value: js.Array[String | js.Array[String] | Null]): Self = this.set("topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopics: Self = this.set("topics", js.undefined)
  }
}
