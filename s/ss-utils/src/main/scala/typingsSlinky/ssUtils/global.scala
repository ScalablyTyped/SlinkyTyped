package typingsSlinky.ssUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object ssutils extends js.Object {
    
    /**
      * EventSource
      */
    @js.native
    object ReadyState extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.ssUtils.ssutils.ReadyState with Double] = js.native
      
      /* 2 */ val CLOSED: typingsSlinky.ssUtils.ssutils.ReadyState.CLOSED with Double = js.native
      
      /* 0 */ val CONNECTING: typingsSlinky.ssUtils.ssutils.ReadyState.CONNECTING with Double = js.native
      
      /* 1 */ val OPEN: typingsSlinky.ssUtils.ssutils.ReadyState.OPEN with Double = js.native
    }
  }
}
