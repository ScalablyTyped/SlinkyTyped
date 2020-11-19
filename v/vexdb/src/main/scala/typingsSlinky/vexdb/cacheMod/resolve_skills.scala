package typingsSlinky.vexdb.cacheMod

import typingsSlinky.vexdb.requestObjectsMod.SkillsRequestObject
import typingsSlinky.vexdb.vexdbStrings.skills
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexdb/out/methods/cache", "resolve")
@js.native
object resolve_skills extends js.Object {
  
  def apply(endpoint: skills, params: SkillsRequestObject): js.Promise[APIResponse[SkillsRequestObject]] = js.native
}
