package typingsSlinky.tslint.blockExclusionMod

import typingsSlinky.std.Set
import typingsSlinky.tslint.completedDocsRuleMod.Visibility
import typingsSlinky.tslint.exclusionMod.Exclusion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completed-docs/blockExclusion", "BlockExclusion")
@js.native
class BlockExclusion () extends Exclusion[IBlockExclusionDescriptor] {
  val visibilities: Set[Visibility] = js.native
}

