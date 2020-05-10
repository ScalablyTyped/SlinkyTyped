package typingsSlinky.winrt.Windows.Storage.AccessCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IItemRemovedEventArgs extends js.Object {
  var removedEntry: AccessListEntry = js.native
}

object IItemRemovedEventArgs {
  @scala.inline
  def apply(removedEntry: AccessListEntry): IItemRemovedEventArgs = {
    val __obj = js.Dynamic.literal(removedEntry = removedEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemRemovedEventArgs]
  }
  @scala.inline
  implicit class IItemRemovedEventArgsOps[Self <: IItemRemovedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemovedEntry(value: AccessListEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedEntry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

