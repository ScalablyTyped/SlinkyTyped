package typingsSlinky.winrtDashUwp.Windows.Services.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StorePackageUpdateState extends js.Object

/** Defines values that represent the state of a package download or installation request. */
@JSGlobal("Windows.Services.Store.StorePackageUpdateState")
@js.native
object StorePackageUpdateState extends js.Object {
  /** The download or installation of the package updates was canceled. */
  @js.native
  sealed trait canceled extends StorePackageUpdateState
  
  /** The package updates have finished downloading or installing. */
  @js.native
  sealed trait completed extends StorePackageUpdateState
  
  /** The package updates are being deployed to the device. */
  @js.native
  sealed trait deploying extends StorePackageUpdateState
  
  /** The package updates are being downloaded. */
  @js.native
  sealed trait downloading extends StorePackageUpdateState
  
  /** The download or installation of the package updates did not succeed because the device does not have enough battery power. */
  @js.native
  sealed trait errorLowBattery extends StorePackageUpdateState
  
  /** The download did not succeed because a Wi-Fi connection is recommended to download the package updates. */
  @js.native
  sealed trait errorWiFiRecommended extends StorePackageUpdateState
  
  /** The download did not succeed because a Wi-Fi connection is required to download the package updates. */
  @js.native
  sealed trait errorWiFiRequired extends StorePackageUpdateState
  
  /** An unknown error occurred. */
  @js.native
  sealed trait otherError extends StorePackageUpdateState
  
  /** The download of the package updates has not started. */
  @js.native
  sealed trait pending extends StorePackageUpdateState
  
  /* 4 */ val canceled: typingsSlinky.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.canceled with Double = js.native
  /* 3 */ val completed: typingsSlinky.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.completed with Double = js.native
  /* 2 */ val deploying: typingsSlinky.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.deploying with Double = js.native
  /* 1 */ val downloading: typingsSlinky.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.downloading with Double = js.native
  /* 6 */ val errorLowBattery: typingsSlinky.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.errorLowBattery with Double = js.native
  /* 7 */ val errorWiFiRecommended: typingsSlinky.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.errorWiFiRecommended with Double = js.native
  /* 8 */ val errorWiFiRequired: typingsSlinky.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.errorWiFiRequired with Double = js.native
  /* 5 */ val otherError: typingsSlinky.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.otherError with Double = js.native
  /* 0 */ val pending: typingsSlinky.winrtDashUwp.Windows.Services.Store.StorePackageUpdateState.pending with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StorePackageUpdateState with Double] = js.native
}

