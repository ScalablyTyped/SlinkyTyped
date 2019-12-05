package typingsSlinky.swaggerDashRestifyDashMw

import typingsSlinky.swaggerDashNodeDashRunner.swaggerDashNodeDashRunnerMod.Config
import typingsSlinky.swaggerDashNodeDashRunner.swaggerDashNodeDashRunnerMod.RestifyMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-restify-mw", JSImport.Namespace)
@js.native
object swaggerDashRestifyDashMwMod extends js.Object {
  def create(
    config: Config,
    cb: js.Function2[/* err */ js.UndefOr[js.Error], /* middleware */ RestifyMiddleware, Unit]
  ): Unit = js.native
}

