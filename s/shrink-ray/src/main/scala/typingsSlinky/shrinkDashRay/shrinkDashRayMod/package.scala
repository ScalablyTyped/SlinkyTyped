package typingsSlinky.shrinkDashRay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shrinkDashRayMod {
  import typingsSlinky.express.expressMod.Request
  import typingsSlinky.express.expressMod.Response
  import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
  import typingsSlinky.shrinkDashRay.Anon_Brotli
  import typingsSlinky.std.Partial

  type FilterFunction = js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, Boolean]
  type Options = Partial[Anon_Brotli]
}
