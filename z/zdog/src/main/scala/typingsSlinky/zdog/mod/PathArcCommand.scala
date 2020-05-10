package typingsSlinky.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathArcCommand extends PathCommand {
  /** @see {@link https://zzz.dog/shapes#shape-arc Zdog Shape API} */
  var arc: js.Tuple2[VectorOptions, VectorOptions] = js.native
}

object PathArcCommand {
  @scala.inline
  def apply(arc: js.Tuple2[VectorOptions, VectorOptions]): PathArcCommand = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathArcCommand]
  }
  @scala.inline
  implicit class PathArcCommandOps[Self <: PathArcCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArc(value: js.Tuple2[VectorOptions, VectorOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

