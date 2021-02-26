package typingsSlinky.winrt.Windows.Media.Capture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaCaptureFailedEventArgs extends IMediaCaptureFailedEventArgs
object MediaCaptureFailedEventArgs {
  
  @scala.inline
  def apply(code: Double, message: String): MediaCaptureFailedEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureFailedEventArgs]
  }
}
