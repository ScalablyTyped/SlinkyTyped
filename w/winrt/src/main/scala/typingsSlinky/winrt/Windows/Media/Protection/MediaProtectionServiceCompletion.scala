package typingsSlinky.winrt.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaProtectionServiceCompletion extends IMediaProtectionServiceCompletion
object MediaProtectionServiceCompletion {
  
  @scala.inline
  def apply(complete: Boolean => Unit): MediaProtectionServiceCompletion = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[MediaProtectionServiceCompletion]
  }
}
