package typingsSlinky.webcola.anon

import typingsSlinky.webcola.geomMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrowStart extends js.Object {
  var arrowStart: Point = js.native
  var sourceIntersection: Point = js.native
  var targetIntersection: Point = js.native
}

object ArrowStart {
  @scala.inline
  def apply(arrowStart: Point, sourceIntersection: Point, targetIntersection: Point): ArrowStart = {
    val __obj = js.Dynamic.literal(arrowStart = arrowStart.asInstanceOf[js.Any], sourceIntersection = sourceIntersection.asInstanceOf[js.Any], targetIntersection = targetIntersection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowStart]
  }
  @scala.inline
  implicit class ArrowStartOps[Self <: ArrowStart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowStart(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceIntersection(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIntersection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetIntersection(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIntersection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

