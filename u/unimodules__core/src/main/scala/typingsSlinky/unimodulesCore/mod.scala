package typingsSlinky.unimodulesCore

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.unimodulesCore.anon.CurrentVersion
import typingsSlinky.unimodulesCore.unimodulesCoreStrings.android
import typingsSlinky.unimodulesCore.unimodulesCoreStrings.ios
import typingsSlinky.unimodulesCore.unimodulesCoreStrings.macos
import typingsSlinky.unimodulesCore.unimodulesCoreStrings.web
import typingsSlinky.unimodulesCore.unimodulesCoreStrings.windows
import typingsSlinky.unimodulesReactNativeAdapter.eventEmitterMod.NativeModule
import typingsSlinky.unimodulesReactNativeAdapter.nativeModulesProxyTypesMod.ProxyNativeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@unimodules/core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val SyntheticPlatformEmitter: typingsSlinky.unimodulesReactNativeAdapter.syntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  
  def deprecate(library: String, deprecatedAPI: String): Unit = js.native
  def deprecate(library: String, deprecatedAPI: String, options: CurrentVersion): Unit = js.native
  
  def requireNativeViewManager[P](viewName: String): ReactComponentClass[P] = js.native
  
  @js.native
  class CodedError protected ()
    extends typingsSlinky.unimodulesCore.adapterProxyMod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  @js.native
  class EventEmitter protected ()
    extends typingsSlinky.unimodulesCore.adapterProxyMod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  @js.native
  object NativeModulesProxy extends /* moduleName */ StringDictionary[ProxyNativeModule]
  
  @js.native
  object Platform extends js.Object {
    
    var OS: ios | android | windows | macos | web = js.native
  }
  
  @js.native
  class UnavailabilityError protected ()
    extends typingsSlinky.unimodulesCore.adapterProxyMod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
}
