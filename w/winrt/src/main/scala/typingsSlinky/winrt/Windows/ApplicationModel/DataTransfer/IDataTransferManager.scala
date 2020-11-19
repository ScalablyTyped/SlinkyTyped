package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataTransferManager extends js.Object {
  
  var ondatarequested: js.Any = js.native
  
  var ontargetapplicationchosen: js.Any = js.native
}
object IDataTransferManager {
  
  @scala.inline
  def apply(ondatarequested: js.Any, ontargetapplicationchosen: js.Any): IDataTransferManager = {
    val __obj = js.Dynamic.literal(ondatarequested = ondatarequested.asInstanceOf[js.Any], ontargetapplicationchosen = ontargetapplicationchosen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataTransferManager]
  }
  
  @scala.inline
  implicit class IDataTransferManagerOps[Self <: IDataTransferManager] (val x: Self) extends AnyVal {
    
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
    def setOndatarequested(value: js.Any): Self = this.set("ondatarequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntargetapplicationchosen(value: js.Any): Self = this.set("ontargetapplicationchosen", value.asInstanceOf[js.Any])
  }
}
