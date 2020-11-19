package typingsSlinky.wechatMiniprogram.DB

import typingsSlinky.wechatMiniprogram.IAPISuccessParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQueryResult extends IAPISuccessParam {
  
  var data: js.Array[IDocumentData] = js.native
}
object IQueryResult {
  
  @scala.inline
  def apply(data: js.Array[IDocumentData], errMsg: String): IQueryResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryResult]
  }
  
  @scala.inline
  implicit class IQueryResultOps[Self <: IQueryResult] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: IDocumentData*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[IDocumentData]): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
