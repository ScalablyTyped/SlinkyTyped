package typingsSlinky.winrtDashUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserWatcherStatus extends js.Object

/** Represents the status of a user watcher. */
@JSGlobal("Windows.System.UserWatcherStatus")
@js.native
object UserWatcherStatus extends js.Object {
  /** The watcher was aborted. */
  @js.native
  sealed trait aborted extends UserWatcherStatus
  
  /** The watcher has been created. */
  @js.native
  sealed trait created extends UserWatcherStatus
  
  /** The watcher's enumeration has completed. */
  @js.native
  sealed trait enumerationCompleted extends UserWatcherStatus
  
  /** The watcher has started. */
  @js.native
  sealed trait started extends UserWatcherStatus
  
  /** The watcher has stopped. */
  @js.native
  sealed trait stopped extends UserWatcherStatus
  
  /** The watcher is stopping. */
  @js.native
  sealed trait stopping extends UserWatcherStatus
  
  /* 5 */ val aborted: typingsSlinky.winrtDashUwp.Windows.System.UserWatcherStatus.aborted with Double = js.native
  /* 0 */ val created: typingsSlinky.winrtDashUwp.Windows.System.UserWatcherStatus.created with Double = js.native
  /* 2 */ val enumerationCompleted: typingsSlinky.winrtDashUwp.Windows.System.UserWatcherStatus.enumerationCompleted with Double = js.native
  /* 1 */ val started: typingsSlinky.winrtDashUwp.Windows.System.UserWatcherStatus.started with Double = js.native
  /* 4 */ val stopped: typingsSlinky.winrtDashUwp.Windows.System.UserWatcherStatus.stopped with Double = js.native
  /* 3 */ val stopping: typingsSlinky.winrtDashUwp.Windows.System.UserWatcherStatus.stopping with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserWatcherStatus with Double] = js.native
}

