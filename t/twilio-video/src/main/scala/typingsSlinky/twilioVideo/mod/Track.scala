package typingsSlinky.twilioVideo.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.eventsMod.EventEmitterOptions
import typingsSlinky.twilioVideo.mod.Track.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-video", "Track")
@js.native
class Track () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  var kind: Kind = js.native
  
  var name: String = js.native
}
object Track {
  
  type ID = String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.twilioVideo.twilioVideoStrings.audio
    - typingsSlinky.twilioVideo.twilioVideoStrings.video
    - typingsSlinky.twilioVideo.twilioVideoStrings.data
  */
  trait Kind extends StObject
  object Kind {
    
    @scala.inline
    def audio: typingsSlinky.twilioVideo.twilioVideoStrings.audio = "audio".asInstanceOf[typingsSlinky.twilioVideo.twilioVideoStrings.audio]
    
    @scala.inline
    def data: typingsSlinky.twilioVideo.twilioVideoStrings.data = "data".asInstanceOf[typingsSlinky.twilioVideo.twilioVideoStrings.data]
    
    @scala.inline
    def video: typingsSlinky.twilioVideo.twilioVideoStrings.video = "video".asInstanceOf[typingsSlinky.twilioVideo.twilioVideoStrings.video]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.twilioVideo.twilioVideoStrings.low
    - typingsSlinky.twilioVideo.twilioVideoStrings.standard
    - typingsSlinky.twilioVideo.twilioVideoStrings.high
  */
  trait Priority extends StObject
  object Priority {
    
    @scala.inline
    def high: typingsSlinky.twilioVideo.twilioVideoStrings.high = "high".asInstanceOf[typingsSlinky.twilioVideo.twilioVideoStrings.high]
    
    @scala.inline
    def low: typingsSlinky.twilioVideo.twilioVideoStrings.low = "low".asInstanceOf[typingsSlinky.twilioVideo.twilioVideoStrings.low]
    
    @scala.inline
    def standard: typingsSlinky.twilioVideo.twilioVideoStrings.standard = "standard".asInstanceOf[typingsSlinky.twilioVideo.twilioVideoStrings.standard]
  }
  
  type SID = String
}
