package typingsSlinky.server

import typingsSlinky.server.replyMod.Reply
import typingsSlinky.server.routerMod.Router
import typingsSlinky.server.typingsCommonMod.Context
import typingsSlinky.server.typingsCommonMod.Middlewares
import typingsSlinky.server.typingsOptionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("server", JSImport.Namespace)
@js.native
object serverMod extends js.Object {
  val reply: Reply = js.native
  val router: Router = js.native
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param middlewares because its type Middlewares is not an array type */ middlewares: Middlewares
  ): js.Promise[Context] = js.native
  def apply(
    options: Options,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param middlewares because its type Middlewares is not an array type */ middlewares: Middlewares
  ): js.Promise[Context] = js.native
}

