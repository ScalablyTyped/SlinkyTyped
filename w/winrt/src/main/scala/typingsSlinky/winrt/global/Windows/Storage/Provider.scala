package typingsSlinky.winrt.global.Windows.Storage

import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Provider.CachedFileOptions
import typingsSlinky.winrt.Windows.Storage.Provider.ReadActivationMode
import typingsSlinky.winrt.Windows.Storage.Provider.WriteActivationMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Provider")
@js.native
object Provider extends js.Object {
  @js.native
  class CachedFileUpdater ()
    extends typingsSlinky.winrt.Windows.Storage.Provider.CachedFileUpdater
  
  @js.native
  class CachedFileUpdaterUI ()
    extends typingsSlinky.winrt.Windows.Storage.Provider.CachedFileUpdaterUI
  
  @js.native
  class FileUpdateRequest ()
    extends typingsSlinky.winrt.Windows.Storage.Provider.FileUpdateRequest
  
  @js.native
  class FileUpdateRequestDeferral ()
    extends typingsSlinky.winrt.Windows.Storage.Provider.FileUpdateRequestDeferral
  
  @js.native
  class FileUpdateRequestedEventArgs ()
    extends typingsSlinky.winrt.Windows.Storage.Provider.FileUpdateRequestedEventArgs
  
  @js.native
  object CachedFileOptions extends js.Object {
    /* 3 */ val denyAccessWhenOffline: typingsSlinky.winrt.Windows.Storage.Provider.CachedFileOptions.denyAccessWhenOffline with Double = js.native
    /* 0 */ val none: typingsSlinky.winrt.Windows.Storage.Provider.CachedFileOptions.none with Double = js.native
    /* 1 */ val requireUpdateOnAccess: typingsSlinky.winrt.Windows.Storage.Provider.CachedFileOptions.requireUpdateOnAccess with Double = js.native
    /* 2 */ val useCachedFileWhenOffline: typingsSlinky.winrt.Windows.Storage.Provider.CachedFileOptions.useCachedFileWhenOffline with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Provider.CachedFileOptions with Double] = js.native
  }
  
  @js.native
  object CachedFileTarget extends js.Object {
    /* 0 */ val local: typingsSlinky.winrt.Windows.Storage.Provider.CachedFileTarget.local with Double = js.native
    /* 1 */ val remote: typingsSlinky.winrt.Windows.Storage.Provider.CachedFileTarget.remote with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Provider.CachedFileTarget with Double] = js.native
  }
  
  /* static members */
  @js.native
  object CachedFileUpdater extends js.Object {
    def setUpdateInformation(
      file: IStorageFile,
      contentId: String,
      readMode: ReadActivationMode,
      writeMode: WriteActivationMode,
      options: CachedFileOptions
    ): Unit = js.native
  }
  
  @js.native
  object FileUpdateStatus extends js.Object {
    /* 1 */ val complete: typingsSlinky.winrt.Windows.Storage.Provider.FileUpdateStatus.complete with Double = js.native
    /* 5 */ val completeAndRenamed: typingsSlinky.winrt.Windows.Storage.Provider.FileUpdateStatus.completeAndRenamed with Double = js.native
    /* 3 */ val currentlyUnavailable: typingsSlinky.winrt.Windows.Storage.Provider.FileUpdateStatus.currentlyUnavailable with Double = js.native
    /* 4 */ val failed: typingsSlinky.winrt.Windows.Storage.Provider.FileUpdateStatus.failed with Double = js.native
    /* 0 */ val incomplete: typingsSlinky.winrt.Windows.Storage.Provider.FileUpdateStatus.incomplete with Double = js.native
    /* 2 */ val userInputNeeded: typingsSlinky.winrt.Windows.Storage.Provider.FileUpdateStatus.userInputNeeded with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Provider.FileUpdateStatus with Double] = js.native
  }
  
  @js.native
  object ReadActivationMode extends js.Object {
    /* 1 */ val beforeAccess: typingsSlinky.winrt.Windows.Storage.Provider.ReadActivationMode.beforeAccess with Double = js.native
    /* 0 */ val notNeeded: typingsSlinky.winrt.Windows.Storage.Provider.ReadActivationMode.notNeeded with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Provider.ReadActivationMode with Double] = js.native
  }
  
  @js.native
  object UIStatus extends js.Object {
    /* 3 */ val complete: typingsSlinky.winrt.Windows.Storage.Provider.UIStatus.complete with Double = js.native
    /* 1 */ val hidden: typingsSlinky.winrt.Windows.Storage.Provider.UIStatus.hidden with Double = js.native
    /* 0 */ val unavailable: typingsSlinky.winrt.Windows.Storage.Provider.UIStatus.unavailable with Double = js.native
    /* 2 */ val visible: typingsSlinky.winrt.Windows.Storage.Provider.UIStatus.visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Provider.UIStatus with Double] = js.native
  }
  
  @js.native
  object WriteActivationMode extends js.Object {
    /* 2 */ val afterWrite: typingsSlinky.winrt.Windows.Storage.Provider.WriteActivationMode.afterWrite with Double = js.native
    /* 1 */ val notNeeded: typingsSlinky.winrt.Windows.Storage.Provider.WriteActivationMode.notNeeded with Double = js.native
    /* 0 */ val readOnly: typingsSlinky.winrt.Windows.Storage.Provider.WriteActivationMode.readOnly with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Storage.Provider.WriteActivationMode with Double] = js.native
  }
  
}

