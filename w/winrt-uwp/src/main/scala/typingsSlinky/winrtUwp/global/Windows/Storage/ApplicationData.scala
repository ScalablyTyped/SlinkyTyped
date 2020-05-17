package typingsSlinky.winrtUwp.global.Windows.Storage

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.System.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the application data store. Application data consists of files and settings that are either local, roaming, or temporary. */
@JSGlobal("Windows.Storage.ApplicationData")
@js.native
abstract class ApplicationData ()
  extends typingsSlinky.winrtUwp.Windows.Storage.ApplicationData

/* static members */
@JSGlobal("Windows.Storage.ApplicationData")
@js.native
object ApplicationData extends js.Object {
  /** Provides access to the app data store associated with the app's app package. */
  var current: typingsSlinky.winrtUwp.Windows.Storage.ApplicationData = js.native
  /**
    * Static method that returns the ApplicationData for a User .
    * @param user The User for which the ApplicationData is returned.
    * @return When this method completes, it returns the requested ApplicationData object.
    */
  def getForUserAsync(user: User): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Storage.ApplicationData] = js.native
}

