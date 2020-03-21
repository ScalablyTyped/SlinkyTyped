package typingsSlinky.tslint.exclusionsMod

import typingsSlinky.std.Map
import typingsSlinky.tslint.completedDocsRuleMod.DocType
import typingsSlinky.tslint.exclusionDescriptorsMod.IInputExclusionDescriptors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completed-docs/exclusions", "constructExclusionsMap")
@js.native
object constructExclusionsMap extends js.Object {
  def apply(ruleArguments: js.Array[IInputExclusionDescriptors]): Map[DocType, DocTypeExclusions] = js.native
}

