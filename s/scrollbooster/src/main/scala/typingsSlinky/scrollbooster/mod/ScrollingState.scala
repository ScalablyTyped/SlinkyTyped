package typingsSlinky.scrollbooster.mod

import typingsSlinky.scrollbooster.AnonBottom
import typingsSlinky.scrollbooster.RequiredPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollingState extends js.Object {
  var borderCollision: AnonBottom = js.native
  var dragOffset: Double = js.native
  var isDragging: Boolean = js.native
  var isMoving: Boolean = js.native
  var position: RequiredPosition = js.native
}

object ScrollingState {
  @scala.inline
  def apply(
    borderCollision: AnonBottom,
    dragOffset: Double,
    isDragging: Boolean,
    isMoving: Boolean,
    position: RequiredPosition
  ): ScrollingState = {
    val __obj = js.Dynamic.literal(borderCollision = borderCollision.asInstanceOf[js.Any], dragOffset = dragOffset.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isMoving = isMoving.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollingState]
  }
  @scala.inline
  implicit class ScrollingStateOps[Self <: ScrollingState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderCollision(value: AnonBottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderCollision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMoving(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMoving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: RequiredPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

