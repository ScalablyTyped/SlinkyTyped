package typingsSlinky.titanium.Titanium.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event for class Titanium.Media.VideoPlayer
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ @js.native
trait VideoPlayerBaseEvent extends StObject {
  
  /**
    * Source object that fired the event.
    */
  var source: VideoPlayer = js.native
}
object VideoPlayerBaseEvent {
  
  @scala.inline
  def apply(source: VideoPlayer): VideoPlayerBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerBaseEvent]
  }
  
  @scala.inline
  implicit class VideoPlayerBaseEventMutableBuilder[Self <: VideoPlayerBaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: VideoPlayer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
