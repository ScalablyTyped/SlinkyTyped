package typingsSlinky.swaggerStats.mod

import typingsSlinky.fastify.instanceMod.FastifyInstance
import typingsSlinky.fastify.loggerMod.FastifyLoggerInstance
import typingsSlinky.fastify.utilsMod.RawReplyDefaultExpression
import typingsSlinky.fastify.utilsMod.RawRequestDefaultExpression
import typingsSlinky.fastify.utilsMod.RawServerDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("swagger-stats", "getFastifyPlugin")
@js.native
object getFastifyPlugin extends js.Object {
  
  def apply(
    fastify: FastifyInstance[
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      RawReplyDefaultExpression[RawServerDefault], 
      FastifyLoggerInstance
    ],
    opts: SWStats,
    done: js.Function0[Unit]
  ): Unit = js.native
}
