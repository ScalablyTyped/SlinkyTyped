package typingsSlinky.winrtUwp.global.Windows

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.System.User
import typingsSlinky.winrtUwp.winrtUwpStrings.gamepadadded
import typingsSlinky.winrtUwp.winrtUwpStrings.gamepadremoved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Gaming {
  
  /** Provides access to game controller input. */
  object Input {
    
    /** Represents a game controller. */
    @JSGlobal("Windows.Gaming.Input.Gamepad")
    @js.native
    abstract class Gamepad ()
      extends typingsSlinky.winrtUwp.Windows.Gaming.Input.Gamepad
    object Gamepad {
      
      @JSGlobal("Windows.Gaming.Input.Gamepad")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Windows.Gaming.Input.Gamepad.addEventListener")
      @js.native
      def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
      /* static member */
      @JSGlobal("Windows.Gaming.Input.Gamepad.addEventListener")
      @js.native
      def addEventListener_gamepadadded(`type`: gamepadadded, listener: EventHandler[_]): Unit = js.native
      /* static member */
      @JSGlobal("Windows.Gaming.Input.Gamepad.addEventListener")
      @js.native
      def addEventListener_gamepadremoved(`type`: gamepadremoved, listener: EventHandler[_]): Unit = js.native
      
      /** The list of all connected gamepads. */
      /* static member */
      @JSGlobal("Windows.Gaming.Input.Gamepad.gamepads")
      @js.native
      def gamepads: IVectorView[typingsSlinky.winrtUwp.Windows.Gaming.Input.Gamepad] = js.native
      @scala.inline
      def gamepads_=(x: IVectorView[typingsSlinky.winrtUwp.Windows.Gaming.Input.Gamepad]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gamepads")(x.asInstanceOf[js.Any])
      
      /** Signals when a new gamepad is connected. */
      /* static member */
      @JSGlobal("Windows.Gaming.Input.Gamepad.ongamepadadded")
      @js.native
      def ongamepadadded: EventHandler[js.Any] = js.native
      @scala.inline
      def ongamepadadded_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ongamepadadded")(x.asInstanceOf[js.Any])
      
      /** Signals when a gamepad is disconnected. */
      /* static member */
      @JSGlobal("Windows.Gaming.Input.Gamepad.ongamepadremoved")
      @js.native
      def ongamepadremoved: EventHandler[js.Any] = js.native
      @scala.inline
      def ongamepadremoved_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ongamepadremoved")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("Windows.Gaming.Input.Gamepad.removeEventListener")
      @js.native
      def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
      /* static member */
      @JSGlobal("Windows.Gaming.Input.Gamepad.removeEventListener")
      @js.native
      def removeEventListener_gamepadadded(`type`: gamepadadded, listener: EventHandler[_]): Unit = js.native
      /* static member */
      @JSGlobal("Windows.Gaming.Input.Gamepad.removeEventListener")
      @js.native
      def removeEventListener_gamepadremoved(`type`: gamepadremoved, listener: EventHandler[_]): Unit = js.native
    }
    
    /** Specifies the button type. */
    @JSGlobal("Windows.Gaming.Input.GamepadButtons")
    @js.native
    object GamepadButtons extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons with Double] = js.native
      
      /* 3 */ val a: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.a with Double = js.native
      
      /* 4 */ val b: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.b with Double = js.native
      
      /* 8 */ val dpadDown: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadDown with Double = js.native
      
      /* 9 */ val dpadLeft: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadLeft with Double = js.native
      
      /* 10 */ val dpadRight: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadRight with Double = js.native
      
      /* 7 */ val dpadUp: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.dpadUp with Double = js.native
      
      /* 11 */ val leftShoulder: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.leftShoulder with Double = js.native
      
      /* 13 */ val leftThumbstick: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.leftThumbstick with Double = js.native
      
      /* 1 */ val menu: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.menu with Double = js.native
      
      /* 0 */ val none: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.none with Double = js.native
      
      /* 12 */ val rightShoulder: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.rightShoulder with Double = js.native
      
      /* 14 */ val rightThumbstick: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.rightThumbstick with Double = js.native
      
      /* 2 */ val view: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.view with Double = js.native
      
      /* 5 */ val x: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.x with Double = js.native
      
      /* 6 */ val y: typingsSlinky.winrtUwp.Windows.Gaming.Input.GamepadButtons.y with Double = js.native
    }
    
    /** Contains information about an audio headset attached to a gamepad. */
    @JSGlobal("Windows.Gaming.Input.Headset")
    @js.native
    abstract class Headset ()
      extends typingsSlinky.winrtUwp.Windows.Gaming.Input.Headset
  }
  
  object Preview {
    
    object GamesEnumeration {
      
      @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList")
      @js.native
      abstract class GameList ()
        extends typingsSlinky.winrtUwp.Windows.Gaming.Preview.GamesEnumeration.GameList
      object GameList {
        
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.addEventListener")
        @js.native
        def addEventListener: js.Any = js.native
        @scala.inline
        def addEventListener_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.findAllAsync")
        @js.native
        def findAllAsync: js.Any = js.native
        @scala.inline
        def findAllAsync_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAllAsync")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.ongameadded")
        @js.native
        def ongameadded: js.Any = js.native
        @scala.inline
        def ongameadded_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ongameadded")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.ongameremoved")
        @js.native
        def ongameremoved: js.Any = js.native
        @scala.inline
        def ongameremoved_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ongameremoved")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.ongameupdated")
        @js.native
        def ongameupdated: js.Any = js.native
        @scala.inline
        def ongameupdated_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ongameupdated")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        /* static member */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameList.removeEventListener")
        @js.native
        def removeEventListener: js.Any = js.native
        @scala.inline
        def removeEventListener_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(x.asInstanceOf[js.Any])
      }
      
      object GameListCategory {
        
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameListCategory")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameListCategory.candidate")
        @js.native
        def candidate: js.Any = js.native
        @scala.inline
        def candidate_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("candidate")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameListCategory.confirmedBySystem")
        @js.native
        def confirmedBySystem: js.Any = js.native
        @scala.inline
        def confirmedBySystem_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("confirmedBySystem")(x.asInstanceOf[js.Any])
        
        /* unmapped type */
        @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameListCategory.confirmedByUser")
        @js.native
        def confirmedByUser: js.Any = js.native
        @scala.inline
        def confirmedByUser_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("confirmedByUser")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("Windows.Gaming.Preview.GamesEnumeration.GameListEntry")
      @js.native
      abstract class GameListEntry ()
        extends typingsSlinky.winrtUwp.Windows.Gaming.Preview.GamesEnumeration.GameListEntry
    }
  }
  
  object UI {
    
    @JSGlobal("Windows.Gaming.UI.GameBar")
    @js.native
    abstract class GameBar ()
      extends typingsSlinky.winrtUwp.Windows.Gaming.UI.GameBar
    object GameBar {
      
      @JSGlobal("Windows.Gaming.UI.GameBar")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.addEventListener")
      @js.native
      def addEventListener: js.Any = js.native
      @scala.inline
      def addEventListener_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.isInputRedirected")
      @js.native
      def isInputRedirected: js.Any = js.native
      @scala.inline
      def isInputRedirected_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInputRedirected")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.onisinputredirectedchanged")
      @js.native
      def onisinputredirectedchanged: js.Any = js.native
      @scala.inline
      def onisinputredirectedchanged_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onisinputredirectedchanged")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.onvisibilitychanged")
      @js.native
      def onvisibilitychanged: js.Any = js.native
      @scala.inline
      def onvisibilitychanged_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onvisibilitychanged")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.removeEventListener")
      @js.native
      def removeEventListener: js.Any = js.native
      @scala.inline
      def removeEventListener_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(x.asInstanceOf[js.Any])
      
      /* unmapped type */
      /* static member */
      @JSGlobal("Windows.Gaming.UI.GameBar.visible")
      @js.native
      def visible: js.Any = js.native
      @scala.inline
      def visible_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visible")(x.asInstanceOf[js.Any])
    }
  }
  
  object XboxLive {
    
    /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
    object Storage {
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveBlobGetResult")
      @js.native
      abstract class GameSaveBlobGetResult ()
        extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobGetResult
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveBlobInfo")
      @js.native
      abstract class GameSaveBlobInfo ()
        extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfo
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoGetResult")
      @js.native
      abstract class GameSaveBlobInfoGetResult ()
        extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoGetResult
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoQuery")
      @js.native
      abstract class GameSaveBlobInfoQuery ()
        extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoQuery
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveContainer")
      @js.native
      abstract class GameSaveContainer ()
        extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainer
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveContainerInfo")
      @js.native
      abstract class GameSaveContainerInfo ()
        extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfo
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoGetResult")
      @js.native
      abstract class GameSaveContainerInfoGetResult ()
        extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoGetResult
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoQuery")
      @js.native
      abstract class GameSaveContainerInfoQuery ()
        extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoQuery
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus")
      @js.native
      object GameSaveErrorStatus extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus with Double
              ] = js.native
        
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
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveOperationResult")
      @js.native
      abstract class GameSaveOperationResult ()
        extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveOperationResult
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveProvider")
      @js.native
      abstract class GameSaveProvider ()
        extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProvider
      object GameSaveProvider {
        
        /**
          * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param user This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param serviceConfigId This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          */
        /* static member */
        @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveProvider.getForUserAsync")
        @js.native
        def getForUserAsync(user: User, serviceConfigId: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult] = js.native
        
        /**
          * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param user This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @param serviceConfigId This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
          */
        /* static member */
        @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveProvider.getSyncOnDemandForUserAsync")
        @js.native
        def getSyncOnDemandForUserAsync(user: User, serviceConfigId: String): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult] = js.native
      }
      
      /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
      @JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult")
      @js.native
      abstract class GameSaveProviderGetResult ()
        extends typingsSlinky.winrtUwp.Windows.Gaming.XboxLive.Storage.GameSaveProviderGetResult
    }
  }
}
