package typingsSlinky.winrtUwp.global.Windows.Gaming

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.System.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Gaming.XboxLive")
@js.native
object XboxLive extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  object Storage extends js.Object {
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveBlobGetResult ()
      extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobGetResult
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveBlobInfo ()
      extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfo
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveBlobInfoGetResult ()
      extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoGetResult
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveBlobInfoQuery ()
      extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoQuery
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveContainer ()
      extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainer
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveContainerInfo ()
      extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfo
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveContainerInfoGetResult ()
      extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoGetResult
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveContainerInfoQuery ()
      extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoQuery
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveOperationResult ()
      extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveOperationResult
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveProvider ()
      extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProvider
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    abstract class GameSaveProviderGetResult ()
      extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    @js.native
    object GameSaveErrorStatus extends js.Object {
      /* 1 */ val abort: typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.abort with Double = js.native
      /* 9 */ val blobNotFound: typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.blobNotFound with Double = js.native
      /* 11 */ val containerNotInSync: typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.containerNotInSync with Double = js.native
      /* 12 */ val containerSyncFailed: typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.containerSyncFailed with Double = js.native
      /* 2 */ val invalidContainerName: typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.invalidContainerName with Double = js.native
      /* 3 */ val noAccess: typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.noAccess with Double = js.native
      /* 10 */ val noXboxLiveInfo: typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.noXboxLiveInfo with Double = js.native
      /* 14 */ val objectExpired: typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.objectExpired with Double = js.native
      /* 0 */ val ok: typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.ok with Double = js.native
      /* 4 */ val outOfLocalStorage: typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.outOfLocalStorage with Double = js.native
      /* 8 */ val providedBufferTooSmall: typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.providedBufferTooSmall with Double = js.native
      /* 7 */ val quotaExceeded: typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.quotaExceeded with Double = js.native
      /* 6 */ val updateTooBig: typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.updateTooBig with Double = js.native
      /* 5 */ val userCanceled: typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.userCanceled with Double = js.native
      /* 13 */ val userHasNoXboxLiveInfo: typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus.userHasNoXboxLiveInfo with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus with Double
          ] = js.native
    }
    
    /* static members */
    @js.native
    object GameSaveProvider extends js.Object {
      /**
        * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @param user This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @param serviceConfigId This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        */
      def getForUserAsync(user: User, serviceConfigId: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult] = js.native
      /**
        * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @param user This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @param serviceConfigId This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
        */
      def getSyncOnDemandForUserAsync(user: User, serviceConfigId: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult] = js.native
    }
    
  }
  
}

