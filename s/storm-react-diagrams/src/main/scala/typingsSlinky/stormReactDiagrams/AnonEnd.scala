package typingsSlinky.stormReactDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnd extends js.Object {
  var end: AnonX = js.native
  var pathToEnd: js.Array[js.Array[Double]] = js.native
  var pathToStart: js.Array[js.Array[Double]] = js.native
  var start: AnonX = js.native
}

object AnonEnd {
  @scala.inline
  def apply(
    end: AnonX,
    pathToEnd: js.Array[js.Array[Double]],
    pathToStart: js.Array[js.Array[Double]],
    start: AnonX
  ): AnonEnd = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], pathToEnd = pathToEnd.asInstanceOf[js.Any], pathToStart = pathToStart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnd]
  }
  @scala.inline
  implicit class AnonEndOps[Self <: AnonEnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: AnonX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathToEnd(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathToEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathToStart(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathToStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: AnonX): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

