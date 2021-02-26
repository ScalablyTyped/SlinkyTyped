package typingsSlinky.unimodulesCore

import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.DeviceEventEmitterStatic
import typingsSlinky.unimodulesCore.unimodulesCoreStrings.android
import typingsSlinky.unimodulesCore.unimodulesCoreStrings.ios
import typingsSlinky.unimodulesCore.unimodulesCoreStrings.macos
import typingsSlinky.unimodulesCore.unimodulesCoreStrings.web
import typingsSlinky.unimodulesCore.unimodulesCoreStrings.windows
import typingsSlinky.unimodulesReactNativeAdapter.eventEmitterMod.NativeModule
import typingsSlinky.unimodulesReactNativeAdapter.platformMod.PlatformSelect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterProxyMod {
  
  @JSImport("@unimodules/core/build/AdapterProxy", "CodedError")
  @js.native
  class CodedError protected ()
    extends typingsSlinky.unimodulesReactNativeAdapter.mod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@unimodules/core/build/AdapterProxy", "DeviceEventEmitter")
  @js.native
  class DeviceEventEmitter ()
    extends typingsSlinky.unimodulesReactNativeAdapter.mod.DeviceEventEmitter
  @JSImport("@unimodules/core/build/AdapterProxy", "DeviceEventEmitter")
  @js.native
  val DeviceEventEmitter: DeviceEventEmitterStatic = js.native
  
  @JSImport("@unimodules/core/build/AdapterProxy", "EventEmitter")
  @js.native
  class EventEmitter protected ()
    extends typingsSlinky.unimodulesReactNativeAdapter.mod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  object Platform {
    
    @JSImport("@unimodules/core/build/AdapterProxy", "Platform")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Denotes the currently running platform.
      * Can be one of ios, android, web.
      */
    @JSImport("@unimodules/core/build/AdapterProxy", "Platform.OS")
    @js.native
    def OS: ios | android | windows | macos | web = js.native
    @scala.inline
    def OS_=(x: ios | android | windows | macos | web): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OS")(x.asInstanceOf[js.Any])
    
    /**
      * Denotes if the DOM API is available in the current environment.
      * The DOM is not available in native React runtimes and Node.js.
      */
    @JSImport("@unimodules/core/build/AdapterProxy", "Platform.isDOMAvailable")
    @js.native
    def isDOMAvailable: Boolean = js.native
    @scala.inline
    def isDOMAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDOMAvailable")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the value with the matching platform.
      * Object keys can be any of ios, android, native, web, default.
      *
      * @ios ios, native, default
      * @android android, native, default
      * @web web, default
      */
    @JSImport("@unimodules/core/build/AdapterProxy", "Platform.select")
    @js.native
    def select: PlatformSelect = js.native
    @scala.inline
    def select_=(x: PlatformSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@unimodules/core/build/AdapterProxy", "RCTDeviceEventEmitter")
  @js.native
  class RCTDeviceEventEmitter ()
    extends typingsSlinky.unimodulesReactNativeAdapter.mod.RCTDeviceEventEmitter
  @JSImport("@unimodules/core/build/AdapterProxy", "RCTDeviceEventEmitter")
  @js.native
  val RCTDeviceEventEmitter: DeviceEventEmitterStatic = js.native
  
  @JSImport("@unimodules/core/build/AdapterProxy", "SyntheticPlatformEmitter")
  @js.native
  val SyntheticPlatformEmitter: typingsSlinky.unimodulesReactNativeAdapter.syntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  
  @JSImport("@unimodules/core/build/AdapterProxy", "UnavailabilityError")
  @js.native
  class UnavailabilityError protected ()
    extends typingsSlinky.unimodulesReactNativeAdapter.mod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
  
  @JSImport("@unimodules/core/build/AdapterProxy", "requireNativeViewManager")
  @js.native
  def requireNativeViewManager[P](viewName: String): ReactComponentClass[P] = js.native
}
