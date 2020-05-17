package typingsSlinky.stormReactDiagrams.pathFindingMod

import typingsSlinky.stormReactDiagrams.anon.End
import typingsSlinky.stormReactDiagrams.anon.X
import typingsSlinky.stormReactDiagrams.mod.DiagramEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathFinding extends js.Object {
  var diagramEngine: DiagramEngine = js.native
  var instance: js.Any = js.native
  /**
    * Taking as argument a fully unblocked walking matrix, this method
    * finds a direct path from point A to B.
    */
  def calculateDirectPath(from: X, to: X): js.Array[js.Array[Double]] = js.native
  /**
    * Puts everything together: merges the paths from/to the centre of the ports,
    * with the path calculated around other elements.
    */
  def calculateDynamicPath(
    routingMatrix: js.Array[js.Array[Double]],
    start: X,
    end: X,
    pathToStart: js.Array[js.Array[Double]],
    pathToEnd: js.Array[js.Array[Double]]
  ): js.Any = js.native
  /**
    * Using @link{#calculateDirectPath}'s result as input, we here
    * determine the first walkable point found in the matrix that includes
    * blocked paths.
    */
  def calculateLinkStartEndCoords(matrix: js.Array[js.Array[Double]], path: js.Array[js.Array[Double]]): End = js.native
}

object PathFinding {
  @scala.inline
  def apply(
    calculateDirectPath: (X, X) => js.Array[js.Array[Double]],
    calculateDynamicPath: (js.Array[js.Array[Double]], X, X, js.Array[js.Array[Double]], js.Array[js.Array[Double]]) => js.Any,
    calculateLinkStartEndCoords: (js.Array[js.Array[Double]], js.Array[js.Array[Double]]) => End,
    diagramEngine: DiagramEngine,
    instance: js.Any
  ): PathFinding = {
    val __obj = js.Dynamic.literal(calculateDirectPath = js.Any.fromFunction2(calculateDirectPath), calculateDynamicPath = js.Any.fromFunction5(calculateDynamicPath), calculateLinkStartEndCoords = js.Any.fromFunction2(calculateLinkStartEndCoords), diagramEngine = diagramEngine.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathFinding]
  }
  @scala.inline
  implicit class PathFindingOps[Self <: PathFinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculateDirectPath(value: (X, X) => js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateDirectPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCalculateDynamicPath(
      value: (js.Array[js.Array[Double]], X, X, js.Array[js.Array[Double]], js.Array[js.Array[Double]]) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateDynamicPath")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withCalculateLinkStartEndCoords(value: (js.Array[js.Array[Double]], js.Array[js.Array[Double]]) => End): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateLinkStartEndCoords")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDiagramEngine(value: DiagramEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagramEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

