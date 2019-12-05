package typingsSlinky.swaggerDashHapi

import typingsSlinky.swaggerDashNodeDashRunner.swaggerDashNodeDashRunnerMod.Config
import typingsSlinky.swaggerDashNodeDashRunner.swaggerDashNodeDashRunnerMod.HapiMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-hapi", JSImport.Namespace)
@js.native
object swaggerDashHapiMod extends js.Object {
  def create(
    config: Config,
    cb: js.Function2[/* err */ js.UndefOr[js.Error], /* middleware */ HapiMiddleware, Unit]
  ): Unit = js.native
}

