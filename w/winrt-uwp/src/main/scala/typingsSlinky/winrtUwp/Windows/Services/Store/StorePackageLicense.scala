package typingsSlinky.winrtUwp.Windows.Services.Store

import typingsSlinky.winrtUwp.Windows.ApplicationModel.Package
import typingsSlinky.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides license info for a downloadable content (DLC) package for the current app. */
@js.native
trait StorePackageLicense extends StObject {
  
  /** Gets the downloadable content (DLC) package that is associated with the license. */
  @JSName("package")
  var _package: Package = js.native
  
  /** Closes and releases any resources used by this StorePackageLicense. */
  def close(): Unit = js.native
  
  /** Gets a value that indicates whether the license is valid. */
  var isValid: Boolean = js.native
  
  /** Raised when user no longer has rights to the license on the current device (for example, the user has acquired the license on a different device). */
  def onlicenselost(ev: js.Object with WinRTEvent[StorePackageLicense]): Unit = js.native
  /** Raised when user no longer has rights to the license on the current device (for example, the user has acquired the license on a different device). */
  @JSName("onlicenselost")
  var onlicenselost_Original: TypedEventHandler[StorePackageLicense, js.Object] = js.native
  
  /** Releases the license for the downloadable content (DLC) package. */
  def releaseLicense(): Unit = js.native
}
