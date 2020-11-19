package typingsSlinky.server

import typingsSlinky.server.commonMod.Context
import typingsSlinky.server.commonMod.Middlewares
import typingsSlinky.server.optionsMod.Options
import typingsSlinky.server.replyMod.Reply
import typingsSlinky.server.routerMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("server", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param middlewares because its type Middlewares is not an array type */ middlewares: Middlewares
  ): js.Promise[Context] = js.native
  def apply(
    options: Options,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param middlewares because its type Middlewares is not an array type */ middlewares: Middlewares
  ): js.Promise[Context] = js.native
  
  val reply: Reply = js.native
  
  val router: Router = js.native
}
