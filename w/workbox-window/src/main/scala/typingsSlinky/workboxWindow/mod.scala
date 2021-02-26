package typingsSlinky.workboxWindow

import org.scalajs.dom.experimental.serviceworkers.ServiceWorker
import typingsSlinky.std.RegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-window", "Workbox")
  @js.native
  class Workbox protected ()
    extends typingsSlinky.workboxWindow.workboxMod.Workbox {
    def this(scriptURL: String) = this()
    def this(scriptURL: String, registerOptions: RegistrationOptions) = this()
  }
  
  @JSImport("workbox-window", "messageSW")
  @js.native
  def messageSW(sw: ServiceWorker, data: js.Any): js.Promise[_] = js.native
}
