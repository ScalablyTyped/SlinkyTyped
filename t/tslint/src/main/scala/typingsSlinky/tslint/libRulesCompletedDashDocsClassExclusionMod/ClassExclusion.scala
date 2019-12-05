package typingsSlinky.tslint.libRulesCompletedDashDocsClassExclusionMod

import typingsSlinky.std.Set
import typingsSlinky.tslint.libRulesCompletedDashDocsExclusionMod.Exclusion
import typingsSlinky.tslint.libRulesCompletedDocsRuleMod.Location
import typingsSlinky.tslint.libRulesCompletedDocsRuleMod.Privacy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completed-docs/classExclusion", "ClassExclusion")
@js.native
class ClassExclusion () extends Exclusion[IClassExclusionDescriptor] {
  val locations: Set[Location] = js.native
  val privacies: Set[Privacy] = js.native
  var shouldLocationBeDocumented: js.Any = js.native
  var shouldPrivacyBeDocumented: js.Any = js.native
}

