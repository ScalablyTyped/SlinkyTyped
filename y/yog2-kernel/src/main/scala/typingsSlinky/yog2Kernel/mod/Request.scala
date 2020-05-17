package typingsSlinky.yog2Kernel.mod

import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.yog2Kernel.anon.TypeofRAL
import typingsSlinky.yog2Kernel.anon.TypeofRALPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends typingsSlinky.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any, Query] {
  var CURRENT_APP: String = js.native
  var ral: TypeofRAL = js.native
  var ralP: TypeofRALPromise = js.native
}

