package typingsSlinky.winrt.Windows.ApplicationModel.Background

import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration")
@js.native
class BackgroundTaskRegistration () extends IBackgroundTaskRegistration

/* static members */
@JSGlobal("Windows.ApplicationModel.Background.BackgroundTaskRegistration")
@js.native
object BackgroundTaskRegistration extends js.Object {
  var allTasks: IMapView[String, IBackgroundTaskRegistration] = js.native
}

