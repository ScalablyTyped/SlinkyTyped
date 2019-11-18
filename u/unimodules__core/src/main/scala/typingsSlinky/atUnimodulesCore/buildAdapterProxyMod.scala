package typingsSlinky.atUnimodulesCore

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.atUnimodulesCore.atUnimodulesCoreStrings.android
import typingsSlinky.atUnimodulesCore.atUnimodulesCoreStrings.ios
import typingsSlinky.atUnimodulesCore.atUnimodulesCoreStrings.macos
import typingsSlinky.atUnimodulesCore.atUnimodulesCoreStrings.web
import typingsSlinky.atUnimodulesCore.atUnimodulesCoreStrings.windows
import typingsSlinky.atUnimodulesReactDashNativeDashAdapter.buildEventEmitterMod.NativeModule
import typingsSlinky.atUnimodulesReactDashNativeDashAdapter.buildNativeModulesProxyMod.ProxyNativeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@unimodules/core/build/AdapterProxy", JSImport.Namespace)
@js.native
object buildAdapterProxyMod extends js.Object {
  @js.native
  class CodedError protected ()
    extends typingsSlinky.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterMod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  @js.native
  class EventEmitter protected ()
    extends typingsSlinky.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterMod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  @js.native
  class UnavailabilityError protected ()
    extends typingsSlinky.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterMod.UnavailabilityError {
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

