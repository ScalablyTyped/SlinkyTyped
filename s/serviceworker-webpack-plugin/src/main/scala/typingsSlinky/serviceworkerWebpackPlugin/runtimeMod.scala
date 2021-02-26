package typingsSlinky.serviceworkerWebpackPlugin

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.experimental.serviceworkers.ServiceWorkerRegistration
import typingsSlinky.serviceworkerWebpackPlugin.serviceworkerWebpackPluginBooleans.`false`
import typingsSlinky.std.RegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeMod extends Shortcut {
  
  @JSImport("serviceworker-webpack-plugin/lib/runtime", JSImport.Default)
  @js.native
  val default: ServiceWorkerWebpackPluginRuntime = js.native
  
  @js.native
  trait ServiceWorkerWebpackPluginRuntime extends StObject {
    
    /**
      * Register the service worker registered using serviceworker-webpack-plugin.
      *
      * @param options Forwarded to `navigator.serviceWorker.register()`
      * @returns A promise if the runtime supports service workers, otherwise false.
      */
    def register(): `false` | js.Promise[ServiceWorkerRegistration] = js.native
    def register(options: RegistrationOptions): `false` | js.Promise[ServiceWorkerRegistration] = js.native
  }
  
  type _To = ServiceWorkerWebpackPluginRuntime
  
  /* This means you don't have to write `default`, but can instead just say `runtimeMod.foo` */
  override def _to: ServiceWorkerWebpackPluginRuntime = default
}
