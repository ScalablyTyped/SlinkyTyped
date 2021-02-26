package typingsSlinky.swaggerExpressMw

import typingsSlinky.swaggerNodeRunner.mod.Config
import typingsSlinky.swaggerNodeRunner.mod.ConnectMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swagger-express-mw", "create")
  @js.native
  def create(
    config: Config,
    cb: js.Function2[/* err */ js.UndefOr[js.Error], /* runner */ ConnectMiddleware, Unit]
  ): Unit = js.native
}
