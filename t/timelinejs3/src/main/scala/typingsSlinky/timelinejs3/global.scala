package typingsSlinky.timelinejs3

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.timelinejs3.TL.ITimeline
import typingsSlinky.timelinejs3.TL.ITimelineConfig
import typingsSlinky.timelinejs3.TL.ITimelineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object TL extends js.Object {
    
    @js.native
    class Timeline protected () extends ITimeline {
      def this(containerId: String, data: String) = this()
      def this(containerId: String, data: ITimelineConfig) = this()
      def this(containerId: String, data: String, options: ITimelineOptions) = this()
      def this(containerId: String, data: ITimelineConfig, options: ITimelineOptions) = this()
    }
    @js.native
    object Timeline extends TopLevel[ITimeline]
  }
}
