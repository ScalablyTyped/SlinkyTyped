package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary to specify a boundary identifier for <Titanium.UI.iOS.CollisionBehavior.addBoundary>.
  */
@js.native
trait BoundaryIdentifier extends js.Object {
  /**
  	 * Arbitrary identifier for the boundary
  	 */
  var identifier: js.UndefOr[java.lang.String] = js.native
  /**
  	 * Start point for the boundary
  	 */
  var point1: js.UndefOr[Point] = js.native
  /**
  	 * End point for the boundary
  	 */
  var point2: js.UndefOr[Point] = js.native
}

object BoundaryIdentifier {
  @scala.inline
  def apply(): BoundaryIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundaryIdentifier]
  }
  @scala.inline
  implicit class BoundaryIdentifierOps[Self <: BoundaryIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withPoint1(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoint1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point1")(js.undefined)
        ret
    }
    @scala.inline
    def withPoint2(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoint2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point2")(js.undefined)
        ret
    }
  }
  
}

