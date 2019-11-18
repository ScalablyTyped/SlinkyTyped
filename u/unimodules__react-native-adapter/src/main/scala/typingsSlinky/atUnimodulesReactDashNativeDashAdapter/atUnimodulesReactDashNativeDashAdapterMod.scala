package typingsSlinky.atUnimodulesReactDashNativeDashAdapter

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterStrings.android
import typingsSlinky.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterStrings.ios
import typingsSlinky.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterStrings.macos
import typingsSlinky.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterStrings.web
import typingsSlinky.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterStrings.windows
import typingsSlinky.atUnimodulesReactDashNativeDashAdapter.buildEventEmitterMod.NativeModule
import typingsSlinky.atUnimodulesReactDashNativeDashAdapter.buildNativeModulesProxyMod.ProxyNativeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@unimodules/react-native-adapter", JSImport.Namespace)
@js.native
object atUnimodulesReactDashNativeDashAdapterMod extends js.Object {
  @js.native
  class CodedError protected ()
    extends typingsSlinky.atUnimodulesReactDashNativeDashAdapter.buildErrorsCodedErrorMod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  @js.native
  class EventEmitter protected ()
    extends typingsSlinky.atUnimodulesReactDashNativeDashAdapter.buildEventEmitterMod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  @js.native
  class UnavailabilityError protected ()
    extends typingsSlinky.atUnimodulesReactDashNativeDashAdapter.buildErrorsUnavailabilityErrorMod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
  
  val SyntheticPlatformEmitter: typingsSlinky.atUnimodulesReactDashNativeDashAdapter.buildSyntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  def requireNativeViewManager[P](viewName: String): ReactComponentClass[P] = js.native
  @js.native
  object NativeModulesProxy extends /* moduleName */ StringDictionary[ProxyNativeModule]
  
  @js.native
  object Platform extends js.Object {
    var OS: ios | android | windows | macos | web = js.native
  }
  
}

