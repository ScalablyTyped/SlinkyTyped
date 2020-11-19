package typingsSlinky.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppInstallState extends js.Object
/** Defines the app install states that are returned by the InstallState property of the AppInstallStatus class. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState")
@js.native
object AppInstallState extends js.Object {
  
  /** The license is being acquired for the app. */
  @js.native
  sealed trait acquiringLicense extends AppInstallState
  
  /** The app install is canceled. */
  @js.native
  sealed trait canceled extends AppInstallState
  
  /** The app install is complete. */
  @js.native
  sealed trait completed extends AppInstallState
  
  /** The app is being downloaded. */
  @js.native
  sealed trait downloading extends AppInstallState
  
  /** The ap install encountered an error. */
  @js.native
  sealed trait error extends AppInstallState
  
  /** The app is in the process of being installed. */
  @js.native
  sealed trait installing extends AppInstallState
  
  /** The app install was paused. */
  @js.native
  sealed trait paused extends AppInstallState
  
  /** The app install was paused because the battery is low. */
  @js.native
  sealed trait pausedLowBattery extends AppInstallState
  
  /** The app install was paused because the app package was large enough to trigger a prompt for the user to download the app over Wi-Fi. */
  @js.native
  sealed trait pausedWiFiRecommended extends AppInstallState
  
  /** The app install was paused because the app package was large enough to require the user to download the app over Wi-Fi. */
  @js.native
  sealed trait pausedWiFiRequired extends AppInstallState
  
  /** The app install is pending. */
  @js.native
  sealed trait pending extends AppInstallState
  
  /** The app is ready to download. */
  @js.native
  sealed trait readyToDownload extends AppInstallState
  
  /** The app data is being restored. */
  @js.native
  sealed trait restoringData extends AppInstallState
  
  /** The app install is starting. */
  @js.native
  sealed trait starting extends AppInstallState
}
