package typingsSlinky.winrt.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServiceRequestedEventArgs extends js.Object {
  var completion: MediaProtectionServiceCompletion = js.native
  var request: IMediaProtectionServiceRequest = js.native
}

object IServiceRequestedEventArgs {
  @scala.inline
  def apply(completion: MediaProtectionServiceCompletion, request: IMediaProtectionServiceRequest): IServiceRequestedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServiceRequestedEventArgs]
  }
  @scala.inline
  implicit class IServiceRequestedEventArgsOps[Self <: IServiceRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompletion(value: MediaProtectionServiceCompletion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequest(value: IMediaProtectionServiceRequest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

