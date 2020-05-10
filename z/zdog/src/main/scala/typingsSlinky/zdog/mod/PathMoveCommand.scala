package typingsSlinky.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathMoveCommand extends PathCommand {
  /** @see {@link https://zzz.dog/shapes#shape-move Zdog Shape API} */
  var move: VectorOptions = js.native
}

object PathMoveCommand {
  @scala.inline
  def apply(move: VectorOptions): PathMoveCommand = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMoveCommand]
  }
  @scala.inline
  implicit class PathMoveCommandOps[Self <: PathMoveCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMove(value: VectorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

