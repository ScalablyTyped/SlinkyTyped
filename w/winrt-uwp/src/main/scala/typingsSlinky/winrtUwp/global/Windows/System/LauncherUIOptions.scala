package typingsSlinky.winrtUwp.global.Windows.System

import typingsSlinky.winrtUwp.Windows.Foundation.Point
import typingsSlinky.winrtUwp.Windows.Foundation.Rect
import typingsSlinky.winrtUwp.Windows.UI.Popups.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies options for user interface elements such as the application picker that can be invoked by this API. */
@JSGlobal("Windows.System.LauncherUIOptions")
@js.native
abstract class LauncherUIOptions ()
  extends typingsSlinky.winrtUwp.Windows.System.LauncherUIOptions {
  /** Gets or sets the point on the screen where the user opened a file or URI. */
  /* CompleteClass */
  override var invocationPoint: Point = js.native
  /** Gets or sets the preferred placement of the Open With and Warning dialog boxes when starting a default app. */
  /* CompleteClass */
  override var preferredPlacement: Placement = js.native
  /** Gets or sets the selection rectangle on the screen where the user opened a file or URI. */
  /* CompleteClass */
  override var selectionRect: Rect = js.native
}

