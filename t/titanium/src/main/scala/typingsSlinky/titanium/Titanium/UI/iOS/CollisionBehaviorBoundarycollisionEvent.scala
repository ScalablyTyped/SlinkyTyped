package typingsSlinky.titanium.Titanium.UI.iOS

import typingsSlinky.titanium.Point
import typingsSlinky.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired when an item collides with a boundary.
			 */
@js.native
trait CollisionBehaviorBoundarycollisionEvent extends CollisionBehaviorBaseEvent {
  /**
  				 * Identifier of the boundary the item collided with.
  				 */
  var identifier: String = js.native
  /**
  				 * Item that collided with the boundary.
  				 */
  var item: View = js.native
  /**
  				 * Point of the collision when it started. Only returned when `start` is `true`.
  				 */
  var point: Point = js.native
  /**
  				 * Returns `true` if the collision started else `false`.
  				 */
  var start: Boolean = js.native
}

object CollisionBehaviorBoundarycollisionEvent {
  @scala.inline
  def apply(identifier: String, item: View, point: Point, source: CollisionBehavior, start: Boolean): CollisionBehaviorBoundarycollisionEvent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollisionBehaviorBoundarycollisionEvent]
  }
  @scala.inline
  implicit class CollisionBehaviorBoundarycollisionEventOps[Self <: CollisionBehaviorBoundarycollisionEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: View): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

