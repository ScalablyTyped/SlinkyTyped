package typingsSlinky.serviceworkerWebpackPlugin

import org.scalajs.dom.experimental.serviceworkers.ServiceWorkerRegistration
import typingsSlinky.serviceworkerWebpackPlugin.serviceworkerWebpackPluginBooleans.`false`
import typingsSlinky.std.RegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serviceworker-webpack-plugin/lib/runtime", JSImport.Namespace)
@js.native
object runtimeMod extends js.Object {
  @js.native
  trait ServiceWorkerWebpackPluginRuntime extends js.Object {
    /**
      * Register the service worker registered using serviceworker-webpack-plugin.
      *
      * @param options Forwarded to `navigator.serviceWorker.register()`
      * @returns A promise if the runtime supports service workers, otherwise false.
      */
    def register(): `false` | js.Promise[ServiceWorkerRegistration] = js.native
    def register(options: RegistrationOptions): `false` | js.Promise[ServiceWorkerRegistration] = js.native
  }
  
  val default: ServiceWorkerWebpackPluginRuntime = js.native
}

