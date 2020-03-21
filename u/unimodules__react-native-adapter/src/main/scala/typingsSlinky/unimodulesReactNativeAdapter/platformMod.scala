package typingsSlinky.unimodulesReactNativeAdapter

import typingsSlinky.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.android
import typingsSlinky.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.ios
import typingsSlinky.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.macos
import typingsSlinky.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.web
import typingsSlinky.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.windows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@unimodules/react-native-adapter/build/Platform", JSImport.Namespace)
@js.native
object platformMod extends js.Object {
  @js.native
  object default extends js.Object {
    var OS: ios | android | windows | macos | web = js.native
  }
  
}

