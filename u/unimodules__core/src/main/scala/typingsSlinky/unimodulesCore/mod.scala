package typingsSlinky.unimodulesCore

import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.DeviceEventEmitterStatic
import typingsSlinky.unimodulesCore.anon.CurrentVersion
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

object mod {
  
  @JSImport("@unimodules/core", "CodedError")
  @js.native
  class CodedError protected ()
    extends typingsSlinky.unimodulesCore.adapterProxyMod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@unimodules/core", "DeviceEventEmitter")
  @js.native
  class DeviceEventEmitter ()
    extends typingsSlinky.unimodulesCore.adapterProxyMod.DeviceEventEmitter
  @JSImport("@unimodules/core", "DeviceEventEmitter")
  @js.native
  val DeviceEventEmitter: DeviceEventEmitterStatic = js.native
  
  @JSImport("@unimodules/core", "EventEmitter")
  @js.native
  class EventEmitter protected ()
    extends typingsSlinky.unimodulesCore.adapterProxyMod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  object Platform {
    
    @JSImport("@unimodules/core", "Platform")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Denotes the currently running platform.
      * Can be one of ios, android, web.
      */
    @JSImport("@unimodules/core", "Platform.OS")
    @js.native
    def OS: ios | android | windows | macos | web = js.native
    @scala.inline
    def OS_=(x: ios | android | windows | macos | web): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OS")(x.asInstanceOf[js.Any])
    
    /**
      * Denotes if the DOM API is available in the current environment.
      * The DOM is not available in native React runtimes and Node.js.
      */
    @JSImport("@unimodules/core", "Platform.isDOMAvailable")
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
    @JSImport("@unimodules/core", "Platform.select")
    @js.native
    def select: PlatformSelect = js.native
    @scala.inline
    def select_=(x: PlatformSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@unimodules/core", "RCTDeviceEventEmitter")
  @js.native
  class RCTDeviceEventEmitter ()
    extends typingsSlinky.unimodulesCore.adapterProxyMod.RCTDeviceEventEmitter
  @JSImport("@unimodules/core", "RCTDeviceEventEmitter")
  @js.native
  val RCTDeviceEventEmitter: DeviceEventEmitterStatic = js.native
  
  @JSImport("@unimodules/core", "SyntheticPlatformEmitter")
  @js.native
  val SyntheticPlatformEmitter: typingsSlinky.unimodulesReactNativeAdapter.syntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  
  @JSImport("@unimodules/core", "UnavailabilityError")
  @js.native
  class UnavailabilityError protected ()
    extends typingsSlinky.unimodulesCore.adapterProxyMod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
  
  @JSImport("@unimodules/core", "deprecate")
  @js.native
  def deprecate(library: String, deprecatedAPI: String): Unit = js.native
  @JSImport("@unimodules/core", "deprecate")
  @js.native
  def deprecate(library: String, deprecatedAPI: String, options: CurrentVersion): Unit = js.native
  
  @JSImport("@unimodules/core", "requireNativeViewManager")
  @js.native
  def requireNativeViewManager[P](viewName: String): ReactComponentClass[P] = js.native
}
