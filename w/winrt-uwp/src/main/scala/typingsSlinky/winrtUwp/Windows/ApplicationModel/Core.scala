package typingsSlinky.winrtUwp.Windows.ApplicationModel

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  /** Provides an app's display info such as its display name and description, and a method to launch the app. */
  @js.native
  trait AppListEntry extends StObject {
    
    /** Provides an app's display name, description, and logo. */
    var displayInfo: AppDisplayInfo = js.native
    
    /**
      * Launches the app associated with this AppListEntry
      * @return If the launch fails for any reason, the Boolean value is false
      */
    def launchAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  }
  object AppListEntry {
    
    @scala.inline
    def apply(displayInfo: AppDisplayInfo, launchAsync: () => IPromiseWithIAsyncOperation[Boolean]): AppListEntry = {
      val __obj = js.Dynamic.literal(displayInfo = displayInfo.asInstanceOf[js.Any], launchAsync = js.Any.fromFunction0(launchAsync))
      __obj.asInstanceOf[AppListEntry]
    }
    
    @scala.inline
    implicit class AppListEntryMutableBuilder[Self <: AppListEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayInfo(value: AppDisplayInfo): Self = StObject.set(x, "displayInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchAsync(value: () => IPromiseWithIAsyncOperation[Boolean]): Self = StObject.set(x, "launchAsync", js.Any.fromFunction0(value))
    }
  }
}
