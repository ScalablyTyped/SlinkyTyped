package typingsSlinky.swaggerNodeRunner.anon

import typingsSlinky.hapi.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  /**
    * Registers Plugin with `onRequest` and traces `request-error` callbacks
    *             *
    * @param  server - Hapi server
    * @param  options - options for plugin (not used in the moment)
    * @param  next - callback called when register is done
    */
  def apply(server: Server, options: js.Any, next: js.Function0[Unit]): Unit = js.native
  
  /** Object attached to `register` function to provide hapi with some additional information about the plugin */
  var attributes: Name = js.native
}
