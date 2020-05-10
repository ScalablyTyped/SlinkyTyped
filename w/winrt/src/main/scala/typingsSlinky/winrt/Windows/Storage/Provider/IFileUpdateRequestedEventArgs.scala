package typingsSlinky.winrt.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileUpdateRequestedEventArgs extends js.Object {
  var request: FileUpdateRequest = js.native
}

object IFileUpdateRequestedEventArgs {
  @scala.inline
  def apply(request: FileUpdateRequest): IFileUpdateRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileUpdateRequestedEventArgs]
  }
  @scala.inline
  implicit class IFileUpdateRequestedEventArgsOps[Self <: IFileUpdateRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: FileUpdateRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

