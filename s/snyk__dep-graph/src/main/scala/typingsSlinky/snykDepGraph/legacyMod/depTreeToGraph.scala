package typingsSlinky.snykDepGraph.legacyMod

import typingsSlinky.snykDepGraph.typesMod.DepGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/dep-graph/dist/legacy", "depTreeToGraph")
@js.native
object depTreeToGraph extends js.Object {
  def apply(depTree: DepTree, pkgManagerName: String): js.Promise[DepGraph] = js.native
}

