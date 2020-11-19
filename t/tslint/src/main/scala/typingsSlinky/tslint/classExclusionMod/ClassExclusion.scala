package typingsSlinky.tslint.classExclusionMod

import typingsSlinky.std.Set
import typingsSlinky.tslint.completedDocsRuleMod.Location
import typingsSlinky.tslint.completedDocsRuleMod.Privacy
import typingsSlinky.tslint.exclusionMod.Exclusion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/completed-docs/classExclusion", "ClassExclusion")
@js.native
class ClassExclusion () extends Exclusion[IClassExclusionDescriptor] {
  
  val locations: Set[Location] = js.native
  
  val privacies: Set[Privacy] = js.native
  
  var shouldLocationBeDocumented: js.Any = js.native
  
  var shouldPrivacyBeDocumented: js.Any = js.native
}
