package typingsSlinky.shrinkRay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FilterFunction = js.Function2[
    /* req */ typingsSlinky.express.mod.Request_[typingsSlinky.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typingsSlinky.express.mod.Response_, 
    scala.Boolean
  ]
}
