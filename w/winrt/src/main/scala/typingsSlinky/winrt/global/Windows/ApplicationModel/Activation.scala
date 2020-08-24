package typingsSlinky.winrt.global.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation")
@js.native
object Activation extends js.Object {
  @js.native
  class CachedFileUpdaterActivatedEventArgs ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Activation.CachedFileUpdaterActivatedEventArgs
  
  @js.native
  class CameraSettingsActivatedEventArgs ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Activation.CameraSettingsActivatedEventArgs
  
  @js.native
  class ContactPickerActivatedEventArgs ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Activation.ContactPickerActivatedEventArgs
  
  @js.native
  class DeviceActivatedEventArgs ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Activation.DeviceActivatedEventArgs
  
  @js.native
  class FileActivatedEventArgs ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Activation.FileActivatedEventArgs
  
  @js.native
  class FileOpenPickerActivatedEventArgs ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Activation.FileOpenPickerActivatedEventArgs
  
  @js.native
  class FileSavePickerActivatedEventArgs ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Activation.FileSavePickerActivatedEventArgs
  
  @js.native
  class LaunchActivatedEventArgs ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Activation.LaunchActivatedEventArgs
  
  @js.native
  class PrintTaskSettingsActivatedEventArgs ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Activation.PrintTaskSettingsActivatedEventArgs
  
  @js.native
  class ProtocolActivatedEventArgs ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Activation.ProtocolActivatedEventArgs
  
  @js.native
  class SearchActivatedEventArgs ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Activation.SearchActivatedEventArgs
  
  @js.native
  class ShareTargetActivatedEventArgs ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Activation.ShareTargetActivatedEventArgs
  
  @js.native
  class SplashScreen ()
    extends typingsSlinky.winrt.Windows.ApplicationModel.Activation.SplashScreen
  
  @js.native
  object ActivationKind extends js.Object {
    /* 13 */ val appointmentsProvider: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.appointmentsProvider with Double = js.native
    /* 7 */ val cachedFileUpdater: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.cachedFileUpdater with Double = js.native
    /* 11 */ val cameraSettings: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.cameraSettings with Double = js.native
    /* 25 */ val componentUI: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.componentUI with Double = js.native
    /* 14 */ val contact: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.contact with Double = js.native
    /* 8 */ val contactPicker: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.contactPicker with Double = js.native
    /* 9 */ val device: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.device with Double = js.native
    /* 29 */ val dialReceiver: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.dialReceiver with Double = js.native
    /* 3 */ val file: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.file with Double = js.native
    /* 5 */ val fileOpenPicker: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.fileOpenPicker with Double = js.native
    /* 6 */ val fileSavePicker: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.fileSavePicker with Double = js.native
    /* 0 */ val launch: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.launch with Double = js.native
    /* 17 */ val lockScreen: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.lockScreen with Double = js.native
    /* 15 */ val lockScreenCall: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.lockScreenCall with Double = js.native
    /* 20 */ val pickFileContinuation: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickFileContinuation with Double = js.native
    /* 22 */ val pickFolderContinuation: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickFolderContinuation with Double = js.native
    /* 21 */ val pickSaveFileContinuation: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickSaveFileContinuation with Double = js.native
    /* 18 */ val pickerReturned: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.pickerReturned with Double = js.native
    /* 28 */ val print3DWorkflow: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.print3DWorkflow with Double = js.native
    /* 10 */ val printTaskSettings: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.printTaskSettings with Double = js.native
    /* 4 */ val protocol: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.protocol with Double = js.native
    /* 26 */ val protocolForResults: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.protocolForResults with Double = js.native
    /* 12 */ val restrictedLaunch: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.restrictedLaunch with Double = js.native
    /* 1 */ val search: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.search with Double = js.native
    /* 2 */ val shareTarget: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.shareTarget with Double = js.native
    /* 27 */ val toastNotification: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.toastNotification with Double = js.native
    /* 16 */ val voiceCommand: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.voiceCommand with Double = js.native
    /* 19 */ val walletAction: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.walletAction with Double = js.native
    /* 24 */ val webAccountProvider: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.webAccountProvider with Double = js.native
    /* 23 */ val webAuthenticationBrokerContinuation: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind.webAuthenticationBrokerContinuation with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.ApplicationModel.Activation.ActivationKind with Double
      ] = js.native
  }
  
  @js.native
  object ApplicationExecutionState extends js.Object {
    /* 4 */ val closedByUser: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.closedByUser with Double = js.native
    /* 0 */ val notRunning: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.notRunning with Double = js.native
    /* 1 */ val running: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.running with Double = js.native
    /* 2 */ val suspended: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.suspended with Double = js.native
    /* 3 */ val terminated: typingsSlinky.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.terminated with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState with Double
      ] = js.native
  }
  
}

