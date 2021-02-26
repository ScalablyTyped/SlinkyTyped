package typingsSlinky.timelinejs3

import typingsSlinky.timelinejs3.TL.ITimeline
import typingsSlinky.timelinejs3.TL.ITimelineConfig
import typingsSlinky.timelinejs3.TL.ITimelineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object TL {
    
    @JSGlobal("TL")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("TL.Timeline")
    @js.native
    class Timeline protected () extends ITimeline {
      def this(containerId: String, data: String) = this()
      def this(containerId: String, data: ITimelineConfig) = this()
      def this(containerId: String, data: String, options: ITimelineOptions) = this()
      def this(containerId: String, data: ITimelineConfig, options: ITimelineOptions) = this()
    }
    @JSGlobal("TL.Timeline")
    @js.native
    def Timeline: ITimeline = js.native
    @scala.inline
    def Timeline_=(x: ITimeline): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Timeline")(x.asInstanceOf[js.Any])
  }
}
