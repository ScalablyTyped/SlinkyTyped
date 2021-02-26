package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchFileKind extends StObject
@JSImport("typescript", "WatchFileKind")
@js.native
object WatchFileKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchFileKind with Double] = js.native
  
  @js.native
  sealed trait DynamicPriorityPolling extends WatchFileKind
  /* 2 */ val DynamicPriorityPolling: typingsSlinky.typescript.mod.WatchFileKind.DynamicPriorityPolling with Double = js.native
  
  @js.native
  sealed trait FixedPollingInterval extends WatchFileKind
  /* 0 */ val FixedPollingInterval: typingsSlinky.typescript.mod.WatchFileKind.FixedPollingInterval with Double = js.native
  
  @js.native
  sealed trait PriorityPollingInterval extends WatchFileKind
  /* 1 */ val PriorityPollingInterval: typingsSlinky.typescript.mod.WatchFileKind.PriorityPollingInterval with Double = js.native
  
  @js.native
  sealed trait UseFsEvents extends WatchFileKind
  /* 3 */ val UseFsEvents: typingsSlinky.typescript.mod.WatchFileKind.UseFsEvents with Double = js.native
  
  @js.native
  sealed trait UseFsEventsOnParentDirectory extends WatchFileKind
  /* 4 */ val UseFsEventsOnParentDirectory: typingsSlinky.typescript.mod.WatchFileKind.UseFsEventsOnParentDirectory with Double = js.native
}
