package typingsSlinky.swaggerExpressMw

import typingsSlinky.swaggerNodeRunner.mod.Config
import typingsSlinky.swaggerNodeRunner.mod.ConnectMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-express-mw", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def create(
    config: Config,
    cb: js.Function2[/* err */ js.UndefOr[js.Error], /* runner */ ConnectMiddleware, Unit]
  ): Unit = js.native
}

