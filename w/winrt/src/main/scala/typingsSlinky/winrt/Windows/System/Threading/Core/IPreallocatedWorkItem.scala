package typingsSlinky.winrt.Windows.System.Threading.Core

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPreallocatedWorkItem extends js.Object {
  def runAsync(): IAsyncAction = js.native
}

object IPreallocatedWorkItem {
  @scala.inline
  def apply(runAsync: () => IAsyncAction): IPreallocatedWorkItem = {
    val __obj = js.Dynamic.literal(runAsync = js.Any.fromFunction0(runAsync))
    __obj.asInstanceOf[IPreallocatedWorkItem]
  }
  @scala.inline
  implicit class IPreallocatedWorkItemOps[Self <: IPreallocatedWorkItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRunAsync(value: () => IAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAsync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

