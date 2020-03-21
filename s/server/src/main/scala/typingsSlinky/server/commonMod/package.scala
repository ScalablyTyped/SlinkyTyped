package typingsSlinky.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonMod {
  type BasicType = java.lang.String | js.Array[js.Any] | js.Object | scala.Double
  type LogFn = js.Function2[/* template */ java.lang.String, /* repeated */ java.lang.String, scala.Unit]
  type Middleware = js.Function1[
    /* ctx */ typingsSlinky.server.commonMod.Context, 
    typingsSlinky.server.replyMod.Reply | typingsSlinky.server.commonMod.BasicType | scala.Unit
  ]
  type Middlewares = js.Array[
    typingsSlinky.server.commonMod.Middleware | js.Array[typingsSlinky.server.commonMod.Middleware]
  ]
}
