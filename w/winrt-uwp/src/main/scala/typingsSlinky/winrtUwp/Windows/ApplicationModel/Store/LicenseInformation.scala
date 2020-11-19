package typingsSlinky.winrtUwp.Windows.ApplicationModel.Store

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.WinRTEvent
import typingsSlinky.winrtUwp.winrtUwpStrings.licensechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the current app's license metadata. */
@js.native
trait LicenseInformation extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_licensechanged(`type`: licensechanged, listener: LicenseChangedEventHandler): Unit = js.native
  
  /** Gets the license expiration date and time relative to the system clock. */
  var expirationDate: js.Date = js.native
  
  /** Gets a value that indicates whether the license is active. */
  var isActive: Boolean = js.native
  
  /** Gets a value that indicates whether the license is a trial license. */
  var isTrial: Boolean = js.native
  
  /** Raises a notification event when the status of the app's license changes. */
  def onlicensechanged(ev: WinRTEvent[Unit]): Unit = js.native
  /** Raises a notification event when the status of the app's license changes. */
  @JSName("onlicensechanged")
  var onlicensechanged_Original: LicenseChangedEventHandler = js.native
  
  /** Gets the associative list of licenses for in-app products that a user is currently entitled to. */
  var productLicenses: IMapView[String, ProductLicense] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_licensechanged(`type`: licensechanged, listener: LicenseChangedEventHandler): Unit = js.native
}
