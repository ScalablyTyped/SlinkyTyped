package typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive

import typingsSlinky.winrtUwp.Windows.Web.Http.HttpResponseMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of the creation of a AdaptiveMediaSource object. */
@js.native
trait AdaptiveMediaSourceCreationResult extends StObject {
  
  /** Gets the HTTP response message, if any, returned from an attempt to create a AdaptiveMediaSource object. */
  var httpResponseMessage: HttpResponseMessage = js.native
  
  /** Gets the AdaptiveMediaSource object that represents the source of adaptive streaming content. */
  var mediaSource: AdaptiveMediaSource = js.native
  
  /** Gets the status of an attempt to create a AdaptiveMediaSource object. */
  var status: AdaptiveMediaSourceCreationStatus = js.native
}
object AdaptiveMediaSourceCreationResult {
  
  @scala.inline
  def apply(
    httpResponseMessage: HttpResponseMessage,
    mediaSource: AdaptiveMediaSource,
    status: AdaptiveMediaSourceCreationStatus
  ): AdaptiveMediaSourceCreationResult = {
    val __obj = js.Dynamic.literal(httpResponseMessage = httpResponseMessage.asInstanceOf[js.Any], mediaSource = mediaSource.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourceCreationResult]
  }
  
  @scala.inline
  implicit class AdaptiveMediaSourceCreationResultMutableBuilder[Self <: AdaptiveMediaSourceCreationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpResponseMessage(value: HttpResponseMessage): Self = StObject.set(x, "httpResponseMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaSource(value: AdaptiveMediaSource): Self = StObject.set(x, "mediaSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AdaptiveMediaSourceCreationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
