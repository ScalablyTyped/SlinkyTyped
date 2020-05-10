package typingsSlinky.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withOndatarequested(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondatarequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOntargetapplicationchosen(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontargetapplicationchosen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

