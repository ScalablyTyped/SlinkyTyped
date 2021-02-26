package typingsSlinky.smpteTimecode

import typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`23.976`
import typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`29.97`
import typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`59.94`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("smpte-timecode", JSImport.Namespace)
  @js.native
  def apply(): TimecodeInstance = js.native
  @JSImport("smpte-timecode", JSImport.Namespace)
  @js.native
  def apply(timecode: js.UndefOr[TIMECODE], frameRate: js.UndefOr[scala.Nothing], dropFrame: Boolean): TimecodeInstance = js.native
  @JSImport("smpte-timecode", JSImport.Namespace)
  @js.native
  def apply(timecode: js.UndefOr[TIMECODE], frameRate: FRAMERATE): TimecodeInstance = js.native
  @JSImport("smpte-timecode", JSImport.Namespace)
  @js.native
  def apply(timecode: js.UndefOr[TIMECODE], frameRate: FRAMERATE, dropFrame: Boolean): TimecodeInstance = js.native
  @JSImport("smpte-timecode", JSImport.Namespace)
  @js.native
  def apply(timecode: TIMECODE): TimecodeInstance = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("smpte-timecode", JSImport.Namespace)
  @js.native
  class ^ () extends TimecodeInstance {
    def this(timecode: TIMECODE) = this()
    def this(timecode: js.UndefOr[TIMECODE], frameRate: FRAMERATE) = this()
    def this(timecode: js.UndefOr[TIMECODE], frameRate: js.UndefOr[scala.Nothing], dropFrame: Boolean) = this()
    def this(timecode: js.UndefOr[TIMECODE], frameRate: FRAMERATE, dropFrame: Boolean) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`23.976`
    - typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`24`
    - typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`25`
    - typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`29.97`
    - typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`30`
    - typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`50`
    - typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`59.94`
    - typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`60`
  */
  trait FRAMERATE extends StObject
  object FRAMERATE {
    
    @scala.inline
    def `23Dot976`: `23.976` = 23.976.asInstanceOf[`23.976`]
    
    @scala.inline
    def `24`: typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`24` = 24.asInstanceOf[typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`24`]
    
    @scala.inline
    def `25`: typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`25` = 25.asInstanceOf[typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`25`]
    
    @scala.inline
    def `29Dot97`: `29.97` = 29.97.asInstanceOf[`29.97`]
    
    @scala.inline
    def `30`: typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`30` = 30.asInstanceOf[typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`30`]
    
    @scala.inline
    def `50`: typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`50` = 50.asInstanceOf[typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`50`]
    
    @scala.inline
    def `59Dot94`: `59.94` = 59.94.asInstanceOf[`59.94`]
    
    @scala.inline
    def `60`: typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`60` = 60.asInstanceOf[typingsSlinky.smpteTimecode.smpteTimecodeNumbers.`60`]
  }
  
  type TIMECODE = Double | String | js.Date | TimecodeObject
  
  @js.native
  trait TimecodeInstance extends StObject {
    
    def add(timecode: TIMECODE): TimecodeInstance = js.native
    def add(timecode: TIMECODE, negative: js.UndefOr[scala.Nothing], rollOverMaxHours: Double): TimecodeInstance = js.native
    def add(timecode: TIMECODE, negative: Boolean): TimecodeInstance = js.native
    def add(timecode: TIMECODE, negative: Boolean, rollOverMaxHours: Double): TimecodeInstance = js.native
    
    var dropFrame: Boolean = js.native
    
    var frameCount: Double = js.native
    
    var frameRate: Double = js.native
    
    var frames: Double = js.native
    
    var hours: Double = js.native
    
    var minutes: Double = js.native
    
    var seconds: Double = js.native
    
    def subtract(timecode: TIMECODE): TimecodeInstance = js.native
    def subtract(timecode: TIMECODE, rollOverMaxHours: Double): TimecodeInstance = js.native
    
    def toDate(): js.Date = js.native
    
    def toString(options: String): String = js.native
  }
  
  @js.native
  trait TimecodeObject extends StObject {
    
    var frames: Double = js.native
    
    var hours: Double = js.native
    
    var minutes: Double = js.native
    
    var seconds: Double = js.native
  }
  object TimecodeObject {
    
    @scala.inline
    def apply(frames: Double, hours: Double, minutes: Double, seconds: Double): TimecodeObject = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimecodeObject]
    }
    
    @scala.inline
    implicit class TimecodeObjectMutableBuilder[Self <: TimecodeObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrames(value: Double): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
