package typingsSlinky.voronoiDiagram.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoronoiDiagram extends js.Object {
  var cells: js.Array[Cell] = js.native
  var positions: js.Array[Point] = js.native
}

object VoronoiDiagram {
  @scala.inline
  def apply(cells: js.Array[Cell], positions: js.Array[Point]): VoronoiDiagram = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoronoiDiagram]
  }
  @scala.inline
  implicit class VoronoiDiagramOps[Self <: VoronoiDiagram] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCells(value: js.Array[Cell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositions(value: js.Array[Point]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

