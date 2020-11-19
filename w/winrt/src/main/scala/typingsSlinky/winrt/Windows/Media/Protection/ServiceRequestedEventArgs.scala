package typingsSlinky.winrt.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceRequestedEventArgs extends IServiceRequestedEventArgs
object ServiceRequestedEventArgs {
  
  @scala.inline
  def apply(completion: MediaProtectionServiceCompletion, request: IMediaProtectionServiceRequest): ServiceRequestedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceRequestedEventArgs]
  }
}
