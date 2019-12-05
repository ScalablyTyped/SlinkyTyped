package typingsSlinky.ssDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ss-utils", JSImport.Namespace)
@js.native
object ssDashUtilsMod extends js.Object {
  /**
    * EventSource
    */
  @js.native
  object ReadyState extends js.Object {
    /* 2 */ val CLOSED: typingsSlinky.ssDashUtils.ssutils.ReadyState.CLOSED with Double = js.native
    /* 0 */ val CONNECTING: typingsSlinky.ssDashUtils.ssutils.ReadyState.CONNECTING with Double = js.native
    /* 1 */ val OPEN: typingsSlinky.ssDashUtils.ssutils.ReadyState.OPEN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ssDashUtils.ssutils.ReadyState with Double] = js.native
  }
  
}

