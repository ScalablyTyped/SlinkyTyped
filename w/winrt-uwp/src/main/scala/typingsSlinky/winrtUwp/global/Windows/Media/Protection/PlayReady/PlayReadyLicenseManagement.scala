package typingsSlinky.winrtUwp.global.Windows.Media.Protection.PlayReady

import typingsSlinky.winrtUwp.Windows.Foundation.IAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Performs license management operations. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyLicenseManagement")
@js.native
abstract class PlayReadyLicenseManagement ()
  extends typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyLicenseManagement
object PlayReadyLicenseManagement {
  
  /**
    * Deletes licenses that match the specified content header.
    * @param contentHeader Content header with a key identifier with which to match licenses.
    * @return The asynchronous operation performing the deletion.
    */
  /* static member */
  @JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyLicenseManagement.deleteLicenses")
  @js.native
  def deleteLicenses(contentHeader: typingsSlinky.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyContentHeader): IAsyncAction = js.native
}
