package typingsSlinky.unimodulesCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.DeviceEventEmitterStatic
import typingsSlinky.unimodulesCore.unimodulesCoreStrings.android
import typingsSlinky.unimodulesCore.unimodulesCoreStrings.ios
import typingsSlinky.unimodulesCore.unimodulesCoreStrings.macos
import typingsSlinky.unimodulesCore.unimodulesCoreStrings.web
import typingsSlinky.unimodulesCore.unimodulesCoreStrings.windows
import typingsSlinky.unimodulesReactNativeAdapter.eventEmitterMod.NativeModule
import typingsSlinky.unimodulesReactNativeAdapter.nativeModulesProxyTypesMod.ProxyNativeModule
import typingsSlinky.unimodulesReactNativeAdapter.platformMod.PlatformSelect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@unimodules/core/build/AdapterProxy", JSImport.Namespace)
@js.native
object adapterProxyMod extends js.Object {
  
  val SyntheticPlatformEmitter: typingsSlinky.unimodulesReactNativeAdapter.syntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  
  def requireNativeViewManager[P](viewName: String): ReactComponentClass[P] = js.native
  
  @js.native
  class CodedError protected ()
    extends typingsSlinky.unimodulesReactNativeAdapter.mod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  @js.native
  class DeviceEventEmitter ()
    extends typingsSlinky.unimodulesReactNativeAdapter.mod.DeviceEventEmitter
  @js.native
  object DeviceEventEmitter extends TopLevel[DeviceEventEmitterStatic]
  
  @js.native
  class EventEmitter protected ()
    extends typingsSlinky.unimodulesReactNativeAdapter.mod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  @js.native
  object NativeModulesProxy extends /* moduleName */ StringDictionary[ProxyNativeModule]
  
  @js.native
  object Platform extends js.Object {
    
    /**
      * Denotes the currently running platform.
      * Can be one of ios, android, web.
      */
    var OS: ios | android | windows | macos | web = js.native
    
    /**
      * Denotes if the DOM API is available in the current environment.
      * The DOM is not available in native React runtimes and Node.js.
      */
    var isDOMAvailable: Boolean = js.native
    
    /**
      * Returns the value with the matching platform.
      * Object keys can be any of ios, android, native, web, default.
      *
      * @ios ios, native, default
      * @android android, native, default
      * @web web, default
      */
    var select: PlatformSelect = js.native
  }
  
  @js.native
  class RCTDeviceEventEmitter ()
    extends typingsSlinky.unimodulesReactNativeAdapter.mod.RCTDeviceEventEmitter
  @js.native
  object RCTDeviceEventEmitter extends TopLevel[DeviceEventEmitterStatic]
  
  @js.native
  class UnavailabilityError protected ()
    extends typingsSlinky.unimodulesReactNativeAdapter.mod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
}
