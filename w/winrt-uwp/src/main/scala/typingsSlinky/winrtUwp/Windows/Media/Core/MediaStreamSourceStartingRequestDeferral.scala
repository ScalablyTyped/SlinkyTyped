package typingsSlinky.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a way for the application to asynchronously report that it has completed processing the MediaStreamSource.Starting event. */
@js.native
trait MediaStreamSourceStartingRequestDeferral extends StObject {
  
  /** Reports that the application has completed processing the Starting event. */
  def complete(): Unit = js.native
}
object MediaStreamSourceStartingRequestDeferral {
  
  @scala.inline
  def apply(complete: () => Unit): MediaStreamSourceStartingRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[MediaStreamSourceStartingRequestDeferral]
  }
  
  @scala.inline
  implicit class MediaStreamSourceStartingRequestDeferralMutableBuilder[Self <: MediaStreamSourceStartingRequestDeferral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
