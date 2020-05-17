package typingsSlinky.statsJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Stats ()
    extends typingsSlinky.statsJs.Stats
  
  @js.native
  object Stats extends js.Object {
    @js.native
    class Panel protected ()
      extends typingsSlinky.statsJs.Stats.Panel {
      def this(name: String, foregroundColor: String, backgroundColor: String) = this()
    }
    
  }
  
}

