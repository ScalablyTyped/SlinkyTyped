package typingsSlinky.unimodulesReactNativeAdapter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.DeviceEventEmitterStatic
import typingsSlinky.unimodulesReactNativeAdapter.eventEmitterMod.NativeModule
import typingsSlinky.unimodulesReactNativeAdapter.nativeModulesProxyTypesMod.ProxyNativeModule
import typingsSlinky.unimodulesReactNativeAdapter.platformMod.PlatformSelect
import typingsSlinky.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.android
import typingsSlinky.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.ios
import typingsSlinky.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.macos
import typingsSlinky.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.web
import typingsSlinky.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.windows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@unimodules/react-native-adapter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val SyntheticPlatformEmitter: typingsSlinky.unimodulesReactNativeAdapter.syntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  
  def requireNativeViewManager[P](viewName: String): ReactComponentClass[P] = js.native
  
  @js.native
  class CodedError protected ()
    extends typingsSlinky.unimodulesReactNativeAdapter.codedErrorMod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  @js.native
  class DeviceEventEmitter ()
    extends typingsSlinky.reactNative.mod.DeviceEventEmitter
  @js.native
  object DeviceEventEmitter extends TopLevel[DeviceEventEmitterStatic]
  
  @js.native
  class EventEmitter protected ()
    extends typingsSlinky.unimodulesReactNativeAdapter.eventEmitterMod.EventEmitter {
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
  class RCTDeviceEventEmitter () extends DeviceEventEmitterStatic
  @js.native
  object RCTDeviceEventEmitter extends TopLevel[DeviceEventEmitterStatic]
  
  @js.native
  class UnavailabilityError protected ()
    extends typingsSlinky.unimodulesReactNativeAdapter.unavailabilityErrorMod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
}
