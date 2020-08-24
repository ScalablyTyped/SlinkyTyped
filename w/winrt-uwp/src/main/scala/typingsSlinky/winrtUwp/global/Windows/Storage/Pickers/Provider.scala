package typingsSlinky.winrtUwp.global.Windows.Storage.Pickers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides support for apps that offer files through the file picker by participating in the File Open Picker contract, and for apps that act as a save location for files through file picker by participating in the File Save Picker contract or the Cached File Updater contract. */
@JSGlobal("Windows.Storage.Pickers.Provider")
@js.native
object Provider extends js.Object {
  /** Used to interact with the file picker if your app provides files with the File Open Picker contract. */
  @js.native
  abstract class FileOpenPickerUI ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.FileOpenPickerUI
  
  /** Provides information about a fileremoved event. */
  @js.native
  abstract class FileRemovedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.FileRemovedEventArgs
  
  /** Used to interact with the file picker when your app provides a save location with the File Save Picker contract. */
  @js.native
  abstract class FileSavePickerUI ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.FileSavePickerUI
  
  /** Use by an app that provides files to indicate asynchronously that the app is finished responding to a closing event. */
  @js.native
  abstract class PickerClosingDeferral ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.PickerClosingDeferral
  
  /** Provides information about a closing event. */
  @js.native
  abstract class PickerClosingEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.PickerClosingEventArgs
  
  /** Lets an app that provides files get the deadline for responding to a closing event and get a deferral so the app can respond to the event asynchronously. */
  @js.native
  abstract class PickerClosingOperation ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.PickerClosingOperation
  
  /** Lets an app that provides a save location specify the storageFile that represents the file to save and get a deferral so the app can respond asynchronously to a targetFileRequested event. */
  @js.native
  abstract class TargetFileRequest ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.TargetFileRequest
  
  /** Used by an app that provides a save location to indicate asynchronously that the app is finished responding to a targetfilerequested event. */
  @js.native
  abstract class TargetFileRequestDeferral ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.TargetFileRequestDeferral
  
  /** Provides information about a targetfilerequested event. */
  @js.native
  abstract class TargetFileRequestedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.TargetFileRequestedEventArgs
  
  /** Indicates the result of a call to the fileOpenPickerUI.addFile method. */
  @js.native
  object AddFileResult extends js.Object {
    /* 0 */ val added: typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult.added with Double = js.native
    /* 1 */ val alreadyAdded: typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult.alreadyAdded with Double = js.native
    /* 2 */ val notAllowed: typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult.notAllowed with Double = js.native
    /* 3 */ val unavailable: typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult.unavailable with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.AddFileResult with Double
      ] = js.native
  }
  
  /** Indicates whether the file picker currently limits selection to single files, or if multiple files can be selected. */
  @js.native
  object FileSelectionMode extends js.Object {
    /* 1 */ val multiple: typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.FileSelectionMode.multiple with Double = js.native
    /* 0 */ val single: typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.FileSelectionMode.single with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.FileSelectionMode with Double
      ] = js.native
  }
  
  /** Indicates the result of a call to the fileSavePickerUI.trySetFileName method. */
  @js.native
  object SetFileNameResult extends js.Object {
    /* 1 */ val notAllowed: typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.SetFileNameResult.notAllowed with Double = js.native
    /* 0 */ val succeeded: typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.SetFileNameResult.succeeded with Double = js.native
    /* 2 */ val unavailable: typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.SetFileNameResult.unavailable with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Storage.Pickers.Provider.SetFileNameResult with Double
      ] = js.native
  }
  
}

