package typingsSlinky.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppInstallType extends js.Object
/** Defines the different app install types that are returned by the InstallType property of the AppInstallItem class. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallType")
@js.native
object AppInstallType extends js.Object {
  
  /** The app is being installed. */
  @js.native
  sealed trait install extends AppInstallType
  
  /** The app installation is being repaired. */
  @js.native
  sealed trait repair extends AppInstallType
  
  /** The app is being updated. */
  @js.native
  sealed trait update extends AppInstallType
}
