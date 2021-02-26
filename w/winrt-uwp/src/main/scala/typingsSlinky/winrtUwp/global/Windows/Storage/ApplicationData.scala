package typingsSlinky.winrtUwp.global.Windows.Storage

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.System.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the application data store. Application data consists of files and settings that are either local, roaming, or temporary. */
@JSGlobal("Windows.Storage.ApplicationData")
@js.native
abstract class ApplicationData ()
  extends typingsSlinky.winrtUwp.Windows.Storage.ApplicationData
object ApplicationData {
  
  @JSGlobal("Windows.Storage.ApplicationData")
  @js.native
  val ^ : js.Any = js.native
  
  /** Provides access to the app data store associated with the app's app package. */
  /* static member */
  @JSGlobal("Windows.Storage.ApplicationData.current")
  @js.native
  def current: typingsSlinky.winrtUwp.Windows.Storage.ApplicationData = js.native
  @scala.inline
  def current_=(x: typingsSlinky.winrtUwp.Windows.Storage.ApplicationData): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
  
  /**
    * Static method that returns the ApplicationData for a User .
    * @param user The User for which the ApplicationData is returned.
    * @return When this method completes, it returns the requested ApplicationData object.
    */
  /* static member */
  @JSGlobal("Windows.Storage.ApplicationData.getForUserAsync")
  @js.native
  def getForUserAsync(user: User): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Storage.ApplicationData] = js.native
}
