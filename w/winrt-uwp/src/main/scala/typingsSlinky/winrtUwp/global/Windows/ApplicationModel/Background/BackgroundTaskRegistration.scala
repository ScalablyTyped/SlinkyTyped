package typingsSlinky.winrtUwp.global.Windows.ApplicationModel.Background

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.IBackgroundTaskRegistration
import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a background task that has been registered with the system. */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration")
@js.native
abstract class BackgroundTaskRegistration ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Background.BackgroundTaskRegistration

/* static members */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration")
@js.native
object BackgroundTaskRegistration extends js.Object {
  /** Enumerates an application's registered background tasks. */
  var allTasks: IMapView[String, IBackgroundTaskRegistration] = js.native
}

