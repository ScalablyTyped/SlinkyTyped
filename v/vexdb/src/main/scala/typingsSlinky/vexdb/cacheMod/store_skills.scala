package typingsSlinky.vexdb.cacheMod

import typingsSlinky.vexdb.requestObjectsMod.SkillsRequestObject
import typingsSlinky.vexdb.responseObjectsMod.SkillsResponseObject
import typingsSlinky.vexdb.vexdbStrings.skills
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexdb/out/methods/cache", "store")
@js.native
object store_skills extends js.Object {
  
  def apply(endpoint: skills, params: SkillsRequestObject, data: APIResponse[SkillsResponseObject]): js.Promise[Boolean] = js.native
}
