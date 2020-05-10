package typingsSlinky.tooltipster.JQueryTooltipster

import typingsSlinky.tooltipster.AnonHeight
import typingsSlinky.tooltipster.AnonLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** see http://iamceege.github.io/tooltipster/#positioning */
@js.native
trait ITooltipPosition extends js.Object {
  /** determines the position of the tooltip and are relative to the viewport */
  var coord: AnonLeft = js.native
  /** the offset that will be applied between the origin and the tooltip */
  var distance: Double = js.native
  /** is the side Tooltipster has judged best for your tooltip, according to your requirements */
  var side: TooltipPositioningSide = js.native
  /**
  		 * the size that your tooltip will have. It is either the natural size of the tooltip, or a size that has been 
  		 * set by Tooltipster to fit best on screen according to your requirements
  		 */
  var size: AnonHeight = js.native
  /**
  		 * the location Tooltipster thinks the tooltip should ideally be centered on, and the arrow aiming at. It is 
  		 * given as the distance from the relevant edge of the viewport (left edge if the side is "top" or "bottom", 
  		 * top edge if the side is "left" or "right"). The target is usually the middle of the origin, but can be 
  		 * somewhere else when the origin is actually a portion of text split in several lines. Editing this value 
  		 * will change the location the arrow is aiming at but will not change the position of the tooltip itself 
  		 * (use coord for that).
  		 */
  var target: Double = js.native
}

object ITooltipPosition {
  @scala.inline
  def apply(coord: AnonLeft, distance: Double, side: TooltipPositioningSide, size: AnonHeight, target: Double): ITooltipPosition = {
    val __obj = js.Dynamic.literal(coord = coord.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipPosition]
  }
  @scala.inline
  implicit class ITooltipPositionOps[Self <: ITooltipPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoord(value: AnonLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSide(value: TooltipPositioningSide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: AnonHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

