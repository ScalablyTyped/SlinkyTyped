package typingsSlinky.winrt.global.Windows

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Globalization.DayOfWeek
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import typingsSlinky.winrt.Windows.Storage.Streams.IRandomAccessStream
import typingsSlinky.winrt.Windows.System.Threading.Core.SignalHandler
import typingsSlinky.winrt.Windows.System.Threading.TimerDestroyedHandler
import typingsSlinky.winrt.Windows.System.Threading.TimerElapsedHandler
import typingsSlinky.winrt.Windows.System.Threading.WorkItemHandler
import typingsSlinky.winrt.Windows.System.Threading.WorkItemOptions
import typingsSlinky.winrt.Windows.System.Threading.WorkItemPriority
import typingsSlinky.winrt.Windows.System.UserProfile.AccountPictureKind
import typingsSlinky.winrt.Windows.System.UserProfile.SetAccountPictureResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object System {
  
  object Display {
    
    @JSGlobal("Windows.System.Display.DisplayRequest")
    @js.native
    class DisplayRequest ()
      extends typingsSlinky.winrt.Windows.System.Display.DisplayRequest
  }
  
  @JSGlobal("Windows.System.Launcher")
  @js.native
  class Launcher ()
    extends typingsSlinky.winrt.Windows.System.Launcher
  /* static members */
  object Launcher {
    
    @JSGlobal("Windows.System.Launcher.launchFileAsync")
    @js.native
    def launchFileAsync(file: IStorageFile): IAsyncOperation[Boolean] = js.native
    @JSGlobal("Windows.System.Launcher.launchFileAsync")
    @js.native
    def launchFileAsync(file: IStorageFile, options: typingsSlinky.winrt.Windows.System.LauncherOptions): IAsyncOperation[Boolean] = js.native
    
    @JSGlobal("Windows.System.Launcher.launchUriAsync")
    @js.native
    def launchUriAsync(uri: Uri): IAsyncOperation[Boolean] = js.native
    @JSGlobal("Windows.System.Launcher.launchUriAsync")
    @js.native
    def launchUriAsync(uri: Uri, options: typingsSlinky.winrt.Windows.System.LauncherOptions): IAsyncOperation[Boolean] = js.native
  }
  
  @JSGlobal("Windows.System.LauncherOptions")
  @js.native
  class LauncherOptions ()
    extends typingsSlinky.winrt.Windows.System.LauncherOptions
  
  @JSGlobal("Windows.System.LauncherUIOptions")
  @js.native
  class LauncherUIOptions ()
    extends typingsSlinky.winrt.Windows.System.LauncherUIOptions
  
  @JSGlobal("Windows.System.ProcessorArchitecture")
  @js.native
  object ProcessorArchitecture extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.System.ProcessorArchitecture with Double] = js.native
    
    /* 1 */ val arm: typingsSlinky.winrt.Windows.System.ProcessorArchitecture.arm with Double = js.native
    
    /* 3 */ val neutral: typingsSlinky.winrt.Windows.System.ProcessorArchitecture.neutral with Double = js.native
    
    /* 4 */ val unknown: typingsSlinky.winrt.Windows.System.ProcessorArchitecture.unknown with Double = js.native
    
    /* 2 */ val x64: typingsSlinky.winrt.Windows.System.ProcessorArchitecture.x64 with Double = js.native
    
    /* 0 */ val x86: typingsSlinky.winrt.Windows.System.ProcessorArchitecture.x86 with Double = js.native
  }
  
  object Profile {
    
    @JSGlobal("Windows.System.Profile.HardwareIdentification")
    @js.native
    class HardwareIdentification ()
      extends typingsSlinky.winrt.Windows.System.Profile.HardwareIdentification
    /* static members */
    object HardwareIdentification {
      
      @JSGlobal("Windows.System.Profile.HardwareIdentification.getPackageSpecificToken")
      @js.native
      def getPackageSpecificToken(nonce: IBuffer): typingsSlinky.winrt.Windows.System.Profile.HardwareToken = js.native
    }
    
    @JSGlobal("Windows.System.Profile.HardwareToken")
    @js.native
    class HardwareToken ()
      extends typingsSlinky.winrt.Windows.System.Profile.HardwareToken
  }
  
  object RemoteDesktop {
    
    @JSGlobal("Windows.System.RemoteDesktop.InteractiveSession")
    @js.native
    class InteractiveSession ()
      extends typingsSlinky.winrt.Windows.System.RemoteDesktop.InteractiveSession
    /* static members */
    object InteractiveSession {
      
      @JSGlobal("Windows.System.RemoteDesktop.InteractiveSession")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.System.RemoteDesktop.InteractiveSession.isRemote")
      @js.native
      def isRemote: Boolean = js.native
      @scala.inline
      def isRemote_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isRemote")(x.asInstanceOf[js.Any])
    }
  }
  
  object Threading {
    
    object Core {
      
      @JSGlobal("Windows.System.Threading.Core.PreallocatedWorkItem")
      @js.native
      class PreallocatedWorkItem protected ()
        extends typingsSlinky.winrt.Windows.System.Threading.Core.PreallocatedWorkItem {
        def this(handler: WorkItemHandler) = this()
        def this(handler: WorkItemHandler, priority: WorkItemPriority) = this()
        def this(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions) = this()
      }
      
      @JSGlobal("Windows.System.Threading.Core.SignalNotifier")
      @js.native
      class SignalNotifier ()
        extends typingsSlinky.winrt.Windows.System.Threading.Core.SignalNotifier
      /* static members */
      object SignalNotifier {
        
        @JSGlobal("Windows.System.Threading.Core.SignalNotifier.attachToEvent")
        @js.native
        def attachToEvent(name: String, handler: SignalHandler): typingsSlinky.winrt.Windows.System.Threading.Core.SignalNotifier = js.native
        @JSGlobal("Windows.System.Threading.Core.SignalNotifier.attachToEvent")
        @js.native
        def attachToEvent(name: String, handler: SignalHandler, timeout: Double): typingsSlinky.winrt.Windows.System.Threading.Core.SignalNotifier = js.native
        
        @JSGlobal("Windows.System.Threading.Core.SignalNotifier.attachToSemaphore")
        @js.native
        def attachToSemaphore(name: String, handler: SignalHandler): typingsSlinky.winrt.Windows.System.Threading.Core.SignalNotifier = js.native
        @JSGlobal("Windows.System.Threading.Core.SignalNotifier.attachToSemaphore")
        @js.native
        def attachToSemaphore(name: String, handler: SignalHandler, timeout: Double): typingsSlinky.winrt.Windows.System.Threading.Core.SignalNotifier = js.native
      }
    }
    
    @JSGlobal("Windows.System.Threading.ThreadPool")
    @js.native
    class ThreadPool ()
      extends typingsSlinky.winrt.Windows.System.Threading.ThreadPool
    /* static members */
    object ThreadPool {
      
      @JSGlobal("Windows.System.Threading.ThreadPool.runAsync")
      @js.native
      def runAsync(handler: WorkItemHandler): IAsyncAction = js.native
      @JSGlobal("Windows.System.Threading.ThreadPool.runAsync")
      @js.native
      def runAsync(handler: WorkItemHandler, priority: WorkItemPriority): IAsyncAction = js.native
      @JSGlobal("Windows.System.Threading.ThreadPool.runAsync")
      @js.native
      def runAsync(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions): IAsyncAction = js.native
    }
    
    @JSGlobal("Windows.System.Threading.ThreadPoolTimer")
    @js.native
    class ThreadPoolTimer ()
      extends typingsSlinky.winrt.Windows.System.Threading.ThreadPoolTimer
    /* static members */
    object ThreadPoolTimer {
      
      @JSGlobal("Windows.System.Threading.ThreadPoolTimer.createPeriodicTimer")
      @js.native
      def createPeriodicTimer(handler: TimerElapsedHandler, period: Double): typingsSlinky.winrt.Windows.System.Threading.ThreadPoolTimer = js.native
      @JSGlobal("Windows.System.Threading.ThreadPoolTimer.createPeriodicTimer")
      @js.native
      def createPeriodicTimer(handler: TimerElapsedHandler, period: Double, destroyed: TimerDestroyedHandler): typingsSlinky.winrt.Windows.System.Threading.ThreadPoolTimer = js.native
      
      @JSGlobal("Windows.System.Threading.ThreadPoolTimer.createTimer")
      @js.native
      def createTimer(handler: TimerElapsedHandler, delay: Double): typingsSlinky.winrt.Windows.System.Threading.ThreadPoolTimer = js.native
      @JSGlobal("Windows.System.Threading.ThreadPoolTimer.createTimer")
      @js.native
      def createTimer(handler: TimerElapsedHandler, delay: Double, destroyed: TimerDestroyedHandler): typingsSlinky.winrt.Windows.System.Threading.ThreadPoolTimer = js.native
    }
    
    @JSGlobal("Windows.System.Threading.WorkItemOptions")
    @js.native
    object WorkItemOptions extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.System.Threading.WorkItemOptions with Double] = js.native
      
      /* 0 */ val none: typingsSlinky.winrt.Windows.System.Threading.WorkItemOptions.none with Double = js.native
      
      /* 1 */ val timeSliced: typingsSlinky.winrt.Windows.System.Threading.WorkItemOptions.timeSliced with Double = js.native
    }
    
    @JSGlobal("Windows.System.Threading.WorkItemPriority")
    @js.native
    object WorkItemPriority extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.System.Threading.WorkItemPriority with Double] = js.native
      
      /* 2 */ val high: typingsSlinky.winrt.Windows.System.Threading.WorkItemPriority.high with Double = js.native
      
      /* 0 */ val low: typingsSlinky.winrt.Windows.System.Threading.WorkItemPriority.low with Double = js.native
      
      /* 1 */ val normal: typingsSlinky.winrt.Windows.System.Threading.WorkItemPriority.normal with Double = js.native
    }
  }
  
  object UserProfile {
    
    @JSGlobal("Windows.System.UserProfile.AccountPictureKind")
    @js.native
    object AccountPictureKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.System.UserProfile.AccountPictureKind with Double] = js.native
      
      /* 1 */ val largeImage: typingsSlinky.winrt.Windows.System.UserProfile.AccountPictureKind.largeImage with Double = js.native
      
      /* 0 */ val smallImage: typingsSlinky.winrt.Windows.System.UserProfile.AccountPictureKind.smallImage with Double = js.native
      
      /* 2 */ val video: typingsSlinky.winrt.Windows.System.UserProfile.AccountPictureKind.video with Double = js.native
    }
    
    @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences")
    @js.native
    class GlobalizationPreferences ()
      extends typingsSlinky.winrt.Windows.System.UserProfile.GlobalizationPreferences
    /* static members */
    object GlobalizationPreferences {
      
      @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.calendars")
      @js.native
      def calendars: IVectorView[String] = js.native
      @scala.inline
      def calendars_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calendars")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.clocks")
      @js.native
      def clocks: IVectorView[String] = js.native
      @scala.inline
      def clocks_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clocks")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.currencies")
      @js.native
      def currencies: IVectorView[String] = js.native
      @scala.inline
      def currencies_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currencies")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.homeGeographicRegion")
      @js.native
      def homeGeographicRegion: String = js.native
      @scala.inline
      def homeGeographicRegion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("homeGeographicRegion")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.languages")
      @js.native
      def languages: IVectorView[String] = js.native
      @scala.inline
      def languages_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languages")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.System.UserProfile.GlobalizationPreferences.weekStartsOn")
      @js.native
      def weekStartsOn: DayOfWeek = js.native
      @scala.inline
      def weekStartsOn_=(x: DayOfWeek): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weekStartsOn")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Windows.System.UserProfile.LockScreen")
    @js.native
    class LockScreen ()
      extends typingsSlinky.winrt.Windows.System.UserProfile.LockScreen
    /* static members */
    object LockScreen {
      
      @JSGlobal("Windows.System.UserProfile.LockScreen")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.System.UserProfile.LockScreen.getImageStream")
      @js.native
      def getImageStream(): IRandomAccessStream = js.native
      
      @JSGlobal("Windows.System.UserProfile.LockScreen.originalImageFile")
      @js.native
      def originalImageFile: Uri = js.native
      @scala.inline
      def originalImageFile_=(x: Uri): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("originalImageFile")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.System.UserProfile.LockScreen.setImageFileAsync")
      @js.native
      def setImageFileAsync(value: IStorageFile): IAsyncAction = js.native
      
      @JSGlobal("Windows.System.UserProfile.LockScreen.setImageStreamAsync")
      @js.native
      def setImageStreamAsync(value: IRandomAccessStream): IAsyncAction = js.native
    }
    
    @JSGlobal("Windows.System.UserProfile.SetAccountPictureResult")
    @js.native
    object SetAccountPictureResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrt.Windows.System.UserProfile.SetAccountPictureResult with Double
          ] = js.native
      
      /* 1 */ val changeDisabled: typingsSlinky.winrt.Windows.System.UserProfile.SetAccountPictureResult.changeDisabled with Double = js.native
      
      /* 5 */ val failure: typingsSlinky.winrt.Windows.System.UserProfile.SetAccountPictureResult.failure with Double = js.native
      
      /* 4 */ val fileSizeError: typingsSlinky.winrt.Windows.System.UserProfile.SetAccountPictureResult.fileSizeError with Double = js.native
      
      /* 2 */ val largeOrDynamicError: typingsSlinky.winrt.Windows.System.UserProfile.SetAccountPictureResult.largeOrDynamicError with Double = js.native
      
      /* 0 */ val success: typingsSlinky.winrt.Windows.System.UserProfile.SetAccountPictureResult.success with Double = js.native
      
      /* 3 */ val videoFrameSizeError: typingsSlinky.winrt.Windows.System.UserProfile.SetAccountPictureResult.videoFrameSizeError with Double = js.native
    }
    
    @JSGlobal("Windows.System.UserProfile.UserInformation")
    @js.native
    class UserInformation ()
      extends typingsSlinky.winrt.Windows.System.UserProfile.UserInformation
    /* static members */
    object UserInformation {
      
      @JSGlobal("Windows.System.UserProfile.UserInformation")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Windows.System.UserProfile.UserInformation.accountPictureChangeEnabled")
      @js.native
      def accountPictureChangeEnabled: Boolean = js.native
      @scala.inline
      def accountPictureChangeEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accountPictureChangeEnabled")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.System.UserProfile.UserInformation.getAccountPicture")
      @js.native
      def getAccountPicture(kind: AccountPictureKind): IStorageFile = js.native
      
      @JSGlobal("Windows.System.UserProfile.UserInformation.getDisplayNameAsync")
      @js.native
      def getDisplayNameAsync(): IAsyncOperation[String] = js.native
      
      @JSGlobal("Windows.System.UserProfile.UserInformation.getDomainNameAsync")
      @js.native
      def getDomainNameAsync(): IAsyncOperation[String] = js.native
      
      @JSGlobal("Windows.System.UserProfile.UserInformation.getFirstNameAsync")
      @js.native
      def getFirstNameAsync(): IAsyncOperation[String] = js.native
      
      @JSGlobal("Windows.System.UserProfile.UserInformation.getLastNameAsync")
      @js.native
      def getLastNameAsync(): IAsyncOperation[String] = js.native
      
      @JSGlobal("Windows.System.UserProfile.UserInformation.getPrincipalNameAsync")
      @js.native
      def getPrincipalNameAsync(): IAsyncOperation[String] = js.native
      
      @JSGlobal("Windows.System.UserProfile.UserInformation.getSessionInitiationProtocolUriAsync")
      @js.native
      def getSessionInitiationProtocolUriAsync(): IAsyncOperation[Uri] = js.native
      
      @JSGlobal("Windows.System.UserProfile.UserInformation.nameAccessAllowed")
      @js.native
      def nameAccessAllowed: Boolean = js.native
      @scala.inline
      def nameAccessAllowed_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nameAccessAllowed")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.System.UserProfile.UserInformation.onaccountpicturechanged")
      @js.native
      def onaccountpicturechanged: js.Any = js.native
      @scala.inline
      def onaccountpicturechanged_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onaccountpicturechanged")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Windows.System.UserProfile.UserInformation.setAccountPictureAsync")
      @js.native
      def setAccountPictureAsync(image: IStorageFile): IAsyncOperation[SetAccountPictureResult] = js.native
      
      @JSGlobal("Windows.System.UserProfile.UserInformation.setAccountPictureFromStreamAsync")
      @js.native
      def setAccountPictureFromStreamAsync(image: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult] = js.native
      
      @JSGlobal("Windows.System.UserProfile.UserInformation.setAccountPicturesAsync")
      @js.native
      def setAccountPicturesAsync(smallImage: IStorageFile, largeImage: IStorageFile, video: IStorageFile): IAsyncOperation[SetAccountPictureResult] = js.native
      
      @JSGlobal("Windows.System.UserProfile.UserInformation.setAccountPicturesFromStreamsAsync")
      @js.native
      def setAccountPicturesFromStreamsAsync(smallImage: IRandomAccessStream, largeImage: IRandomAccessStream, video: IRandomAccessStream): IAsyncOperation[SetAccountPictureResult] = js.native
    }
  }
  
  @JSGlobal("Windows.System.VirtualKey")
  @js.native
  object VirtualKey extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.System.VirtualKey with Double] = js.native
    
    /* 53 */ val a: typingsSlinky.winrt.Windows.System.VirtualKey.a with Double = js.native
    
    /* 25 */ val accept: typingsSlinky.winrt.Windows.System.VirtualKey.accept with Double = js.native
    
    /* 94 */ val add: typingsSlinky.winrt.Windows.System.VirtualKey.add with Double = js.native
    
    /* 81 */ val application: typingsSlinky.winrt.Windows.System.VirtualKey.application with Double = js.native
    
    /* 54 */ val b: typingsSlinky.winrt.Windows.System.VirtualKey.b with Double = js.native
    
    /* 7 */ val back: typingsSlinky.winrt.Windows.System.VirtualKey.back with Double = js.native
    
    /* 55 */ val c: typingsSlinky.winrt.Windows.System.VirtualKey.c with Double = js.native
    
    /* 3 */ val cancel: typingsSlinky.winrt.Windows.System.VirtualKey.cancel with Double = js.native
    
    /* 15 */ val capitalLock: typingsSlinky.winrt.Windows.System.VirtualKey.capitalLock with Double = js.native
    
    /* 9 */ val clear: typingsSlinky.winrt.Windows.System.VirtualKey.clear with Double = js.native
    
    /* 12 */ val control: typingsSlinky.winrt.Windows.System.VirtualKey.control with Double = js.native
    
    /* 23 */ val convert: typingsSlinky.winrt.Windows.System.VirtualKey.convert with Double = js.native
    
    /* 56 */ val d: typingsSlinky.winrt.Windows.System.VirtualKey.d with Double = js.native
    
    /* 97 */ val decimal: typingsSlinky.winrt.Windows.System.VirtualKey.decimal with Double = js.native
    
    /* 41 */ val delete_ : typingsSlinky.winrt.Windows.System.VirtualKey.delete_ with Double = js.native
    
    /* 98 */ val divide: typingsSlinky.winrt.Windows.System.VirtualKey.divide with Double = js.native
    
    /* 35 */ val down: typingsSlinky.winrt.Windows.System.VirtualKey.down with Double = js.native
    
    /* 57 */ val e: typingsSlinky.winrt.Windows.System.VirtualKey.e with Double = js.native
    
    /* 30 */ val end: typingsSlinky.winrt.Windows.System.VirtualKey.end with Double = js.native
    
    /* 10 */ val enter: typingsSlinky.winrt.Windows.System.VirtualKey.enter with Double = js.native
    
    /* 22 */ val escape: typingsSlinky.winrt.Windows.System.VirtualKey.escape with Double = js.native
    
    /* 38 */ val execute: typingsSlinky.winrt.Windows.System.VirtualKey.execute with Double = js.native
    
    /* 58 */ val f: typingsSlinky.winrt.Windows.System.VirtualKey.f with Double = js.native
    
    /* 99 */ val f1: typingsSlinky.winrt.Windows.System.VirtualKey.f1 with Double = js.native
    
    /* 108 */ val f10: typingsSlinky.winrt.Windows.System.VirtualKey.f10 with Double = js.native
    
    /* 109 */ val f11: typingsSlinky.winrt.Windows.System.VirtualKey.f11 with Double = js.native
    
    /* 110 */ val f12: typingsSlinky.winrt.Windows.System.VirtualKey.f12 with Double = js.native
    
    /* 111 */ val f13: typingsSlinky.winrt.Windows.System.VirtualKey.f13 with Double = js.native
    
    /* 112 */ val f14: typingsSlinky.winrt.Windows.System.VirtualKey.f14 with Double = js.native
    
    /* 113 */ val f15: typingsSlinky.winrt.Windows.System.VirtualKey.f15 with Double = js.native
    
    /* 114 */ val f16: typingsSlinky.winrt.Windows.System.VirtualKey.f16 with Double = js.native
    
    /* 115 */ val f17: typingsSlinky.winrt.Windows.System.VirtualKey.f17 with Double = js.native
    
    /* 116 */ val f18: typingsSlinky.winrt.Windows.System.VirtualKey.f18 with Double = js.native
    
    /* 117 */ val f19: typingsSlinky.winrt.Windows.System.VirtualKey.f19 with Double = js.native
    
    /* 100 */ val f2: typingsSlinky.winrt.Windows.System.VirtualKey.f2 with Double = js.native
    
    /* 118 */ val f20: typingsSlinky.winrt.Windows.System.VirtualKey.f20 with Double = js.native
    
    /* 119 */ val f21: typingsSlinky.winrt.Windows.System.VirtualKey.f21 with Double = js.native
    
    /* 120 */ val f22: typingsSlinky.winrt.Windows.System.VirtualKey.f22 with Double = js.native
    
    /* 121 */ val f23: typingsSlinky.winrt.Windows.System.VirtualKey.f23 with Double = js.native
    
    /* 122 */ val f24: typingsSlinky.winrt.Windows.System.VirtualKey.f24 with Double = js.native
    
    /* 101 */ val f3: typingsSlinky.winrt.Windows.System.VirtualKey.f3 with Double = js.native
    
    /* 102 */ val f4: typingsSlinky.winrt.Windows.System.VirtualKey.f4 with Double = js.native
    
    /* 103 */ val f5: typingsSlinky.winrt.Windows.System.VirtualKey.f5 with Double = js.native
    
    /* 104 */ val f6: typingsSlinky.winrt.Windows.System.VirtualKey.f6 with Double = js.native
    
    /* 105 */ val f7: typingsSlinky.winrt.Windows.System.VirtualKey.f7 with Double = js.native
    
    /* 106 */ val f8: typingsSlinky.winrt.Windows.System.VirtualKey.f8 with Double = js.native
    
    /* 107 */ val f9: typingsSlinky.winrt.Windows.System.VirtualKey.f9 with Double = js.native
    
    /* 19 */ val `final`: typingsSlinky.winrt.Windows.System.VirtualKey.`final` with Double = js.native
    
    /* 59 */ val g: typingsSlinky.winrt.Windows.System.VirtualKey.g with Double = js.native
    
    /* 60 */ val h: typingsSlinky.winrt.Windows.System.VirtualKey.h with Double = js.native
    
    /* 17 */ val hangul: typingsSlinky.winrt.Windows.System.VirtualKey.hangul with Double = js.native
    
    /* 20 */ val hanja: typingsSlinky.winrt.Windows.System.VirtualKey.hanja with Double = js.native
    
    /* 42 */ val help: typingsSlinky.winrt.Windows.System.VirtualKey.help with Double = js.native
    
    /* 31 */ val home: typingsSlinky.winrt.Windows.System.VirtualKey.home with Double = js.native
    
    /* 61 */ val i: typingsSlinky.winrt.Windows.System.VirtualKey.i with Double = js.native
    
    /* 40 */ val insert: typingsSlinky.winrt.Windows.System.VirtualKey.insert with Double = js.native
    
    /* 62 */ val j: typingsSlinky.winrt.Windows.System.VirtualKey.j with Double = js.native
    
    /* 18 */ val junja: typingsSlinky.winrt.Windows.System.VirtualKey.junja with Double = js.native
    
    /* 63 */ val k: typingsSlinky.winrt.Windows.System.VirtualKey.k with Double = js.native
    
    /* 16 */ val kana: typingsSlinky.winrt.Windows.System.VirtualKey.kana with Double = js.native
    
    /* 21 */ val kanji: typingsSlinky.winrt.Windows.System.VirtualKey.kanji with Double = js.native
    
    /* 64 */ val l: typingsSlinky.winrt.Windows.System.VirtualKey.l with Double = js.native
    
    /* 32 */ val left: typingsSlinky.winrt.Windows.System.VirtualKey.left with Double = js.native
    
    /* 1 */ val leftButton: typingsSlinky.winrt.Windows.System.VirtualKey.leftButton with Double = js.native
    
    /* 127 */ val leftControl: typingsSlinky.winrt.Windows.System.VirtualKey.leftControl with Double = js.native
    
    /* 129 */ val leftMenu: typingsSlinky.winrt.Windows.System.VirtualKey.leftMenu with Double = js.native
    
    /* 125 */ val leftShift: typingsSlinky.winrt.Windows.System.VirtualKey.leftShift with Double = js.native
    
    /* 79 */ val leftWindows: typingsSlinky.winrt.Windows.System.VirtualKey.leftWindows with Double = js.native
    
    /* 65 */ val m: typingsSlinky.winrt.Windows.System.VirtualKey.m with Double = js.native
    
    /* 13 */ val menu: typingsSlinky.winrt.Windows.System.VirtualKey.menu with Double = js.native
    
    /* 4 */ val middleButton: typingsSlinky.winrt.Windows.System.VirtualKey.middleButton with Double = js.native
    
    /* 26 */ val modeChange: typingsSlinky.winrt.Windows.System.VirtualKey.modeChange with Double = js.native
    
    /* 93 */ val multiply: typingsSlinky.winrt.Windows.System.VirtualKey.multiply with Double = js.native
    
    /* 66 */ val n: typingsSlinky.winrt.Windows.System.VirtualKey.n with Double = js.native
    
    /* 24 */ val nonConvert: typingsSlinky.winrt.Windows.System.VirtualKey.nonConvert with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.System.VirtualKey.none with Double = js.native
    
    /* 43 */ val number0: typingsSlinky.winrt.Windows.System.VirtualKey.number0 with Double = js.native
    
    /* 44 */ val number1: typingsSlinky.winrt.Windows.System.VirtualKey.number1 with Double = js.native
    
    /* 45 */ val number2: typingsSlinky.winrt.Windows.System.VirtualKey.number2 with Double = js.native
    
    /* 46 */ val number3: typingsSlinky.winrt.Windows.System.VirtualKey.number3 with Double = js.native
    
    /* 47 */ val number4: typingsSlinky.winrt.Windows.System.VirtualKey.number4 with Double = js.native
    
    /* 48 */ val number5: typingsSlinky.winrt.Windows.System.VirtualKey.number5 with Double = js.native
    
    /* 49 */ val number6: typingsSlinky.winrt.Windows.System.VirtualKey.number6 with Double = js.native
    
    /* 50 */ val number7: typingsSlinky.winrt.Windows.System.VirtualKey.number7 with Double = js.native
    
    /* 51 */ val number8: typingsSlinky.winrt.Windows.System.VirtualKey.number8 with Double = js.native
    
    /* 52 */ val number9: typingsSlinky.winrt.Windows.System.VirtualKey.number9 with Double = js.native
    
    /* 123 */ val numberKeyLock: typingsSlinky.winrt.Windows.System.VirtualKey.numberKeyLock with Double = js.native
    
    /* 83 */ val numberPad0: typingsSlinky.winrt.Windows.System.VirtualKey.numberPad0 with Double = js.native
    
    /* 84 */ val numberPad1: typingsSlinky.winrt.Windows.System.VirtualKey.numberPad1 with Double = js.native
    
    /* 85 */ val numberPad2: typingsSlinky.winrt.Windows.System.VirtualKey.numberPad2 with Double = js.native
    
    /* 86 */ val numberPad3: typingsSlinky.winrt.Windows.System.VirtualKey.numberPad3 with Double = js.native
    
    /* 87 */ val numberPad4: typingsSlinky.winrt.Windows.System.VirtualKey.numberPad4 with Double = js.native
    
    /* 88 */ val numberPad5: typingsSlinky.winrt.Windows.System.VirtualKey.numberPad5 with Double = js.native
    
    /* 89 */ val numberPad6: typingsSlinky.winrt.Windows.System.VirtualKey.numberPad6 with Double = js.native
    
    /* 90 */ val numberPad7: typingsSlinky.winrt.Windows.System.VirtualKey.numberPad7 with Double = js.native
    
    /* 91 */ val numberPad8: typingsSlinky.winrt.Windows.System.VirtualKey.numberPad8 with Double = js.native
    
    /* 92 */ val numberPad9: typingsSlinky.winrt.Windows.System.VirtualKey.numberPad9 with Double = js.native
    
    /* 67 */ val o: typingsSlinky.winrt.Windows.System.VirtualKey.o with Double = js.native
    
    /* 68 */ val p: typingsSlinky.winrt.Windows.System.VirtualKey.p with Double = js.native
    
    /* 29 */ val pageDown: typingsSlinky.winrt.Windows.System.VirtualKey.pageDown with Double = js.native
    
    /* 28 */ val pageUp: typingsSlinky.winrt.Windows.System.VirtualKey.pageUp with Double = js.native
    
    /* 14 */ val pause: typingsSlinky.winrt.Windows.System.VirtualKey.pause with Double = js.native
    
    /* 37 */ val print: typingsSlinky.winrt.Windows.System.VirtualKey.print with Double = js.native
    
    /* 69 */ val q: typingsSlinky.winrt.Windows.System.VirtualKey.q with Double = js.native
    
    /* 70 */ val r: typingsSlinky.winrt.Windows.System.VirtualKey.r with Double = js.native
    
    /* 34 */ val right: typingsSlinky.winrt.Windows.System.VirtualKey.right with Double = js.native
    
    /* 2 */ val rightButton: typingsSlinky.winrt.Windows.System.VirtualKey.rightButton with Double = js.native
    
    /* 128 */ val rightControl: typingsSlinky.winrt.Windows.System.VirtualKey.rightControl with Double = js.native
    
    /* 130 */ val rightMenu: typingsSlinky.winrt.Windows.System.VirtualKey.rightMenu with Double = js.native
    
    /* 126 */ val rightShift: typingsSlinky.winrt.Windows.System.VirtualKey.rightShift with Double = js.native
    
    /* 80 */ val rightWindows: typingsSlinky.winrt.Windows.System.VirtualKey.rightWindows with Double = js.native
    
    /* 71 */ val s: typingsSlinky.winrt.Windows.System.VirtualKey.s with Double = js.native
    
    /* 124 */ val scroll: typingsSlinky.winrt.Windows.System.VirtualKey.scroll with Double = js.native
    
    /* 36 */ val select: typingsSlinky.winrt.Windows.System.VirtualKey.select with Double = js.native
    
    /* 95 */ val separator: typingsSlinky.winrt.Windows.System.VirtualKey.separator with Double = js.native
    
    /* 11 */ val shift: typingsSlinky.winrt.Windows.System.VirtualKey.shift with Double = js.native
    
    /* 82 */ val sleep: typingsSlinky.winrt.Windows.System.VirtualKey.sleep with Double = js.native
    
    /* 39 */ val snapshot: typingsSlinky.winrt.Windows.System.VirtualKey.snapshot with Double = js.native
    
    /* 27 */ val space: typingsSlinky.winrt.Windows.System.VirtualKey.space with Double = js.native
    
    /* 96 */ val subtract: typingsSlinky.winrt.Windows.System.VirtualKey.subtract with Double = js.native
    
    /* 72 */ val t: typingsSlinky.winrt.Windows.System.VirtualKey.t with Double = js.native
    
    /* 8 */ val tab: typingsSlinky.winrt.Windows.System.VirtualKey.tab with Double = js.native
    
    /* 73 */ val u: typingsSlinky.winrt.Windows.System.VirtualKey.u with Double = js.native
    
    /* 33 */ val up: typingsSlinky.winrt.Windows.System.VirtualKey.up with Double = js.native
    
    /* 74 */ val v: typingsSlinky.winrt.Windows.System.VirtualKey.v with Double = js.native
    
    /* 75 */ val w: typingsSlinky.winrt.Windows.System.VirtualKey.w with Double = js.native
    
    /* 76 */ val x: typingsSlinky.winrt.Windows.System.VirtualKey.x with Double = js.native
    
    /* 5 */ val xButton1: typingsSlinky.winrt.Windows.System.VirtualKey.xButton1 with Double = js.native
    
    /* 6 */ val xButton2: typingsSlinky.winrt.Windows.System.VirtualKey.xButton2 with Double = js.native
    
    /* 77 */ val y: typingsSlinky.winrt.Windows.System.VirtualKey.y with Double = js.native
    
    /* 78 */ val z: typingsSlinky.winrt.Windows.System.VirtualKey.z with Double = js.native
  }
  
  @JSGlobal("Windows.System.VirtualKeyModifiers")
  @js.native
  object VirtualKeyModifiers extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.System.VirtualKeyModifiers with Double] = js.native
    
    /* 1 */ val control: typingsSlinky.winrt.Windows.System.VirtualKeyModifiers.control with Double = js.native
    
    /* 2 */ val menu: typingsSlinky.winrt.Windows.System.VirtualKeyModifiers.menu with Double = js.native
    
    /* 0 */ val none: typingsSlinky.winrt.Windows.System.VirtualKeyModifiers.none with Double = js.native
    
    /* 3 */ val shift: typingsSlinky.winrt.Windows.System.VirtualKeyModifiers.shift with Double = js.native
    
    /* 4 */ val windows: typingsSlinky.winrt.Windows.System.VirtualKeyModifiers.windows with Double = js.native
  }
}
