package typingsSlinky.vexdb.cacheMod

import typingsSlinky.vexdb.requestObjectsMod.AwardsRequestObject
import typingsSlinky.vexdb.vexdbStrings.awards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexdb/out/methods/cache", "resolve")
@js.native
object resolve_awards extends js.Object {
  
  def apply(endpoint: awards, params: AwardsRequestObject): js.Promise[APIResponse[AwardsRequestObject]] = js.native
}
