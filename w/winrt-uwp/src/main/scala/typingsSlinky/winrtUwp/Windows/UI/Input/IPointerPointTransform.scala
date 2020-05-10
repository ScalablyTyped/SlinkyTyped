package typingsSlinky.winrtUwp.Windows.UI.Input

import typingsSlinky.winrtUwp.AnonOutPoint
import typingsSlinky.winrtUwp.Windows.Foundation.Point
import typingsSlinky.winrtUwp.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides generalized transformation functions. */
@js.native
trait IPointerPointTransform extends js.Object {
  /** Gets the inverse of the specified transformation. */
  var inverse: IPointerPointTransform = js.native
  /**
    * Transforms the specified bounding rectangle.
    * @param rect The bounding rectangle to transform.
    * @return The smallest, axis-aligned bounding box that encloses rect after the transformation. (An axis-aligned bounding box is one which has all sides parallel to the coordinate axes.)
    */
  def transformBounds(rect: Rect): Rect = js.native
  /**
    * Attempts to perform the transformation on the specified input point.
    * @param inPoint The original input point.
    */
  def tryTransform(inPoint: Point): AnonOutPoint = js.native
}

object IPointerPointTransform {
  @scala.inline
  def apply(
    inverse: IPointerPointTransform,
    transformBounds: Rect => Rect,
    tryTransform: Point => AnonOutPoint
  ): IPointerPointTransform = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any], transformBounds = js.Any.fromFunction1(transformBounds), tryTransform = js.Any.fromFunction1(tryTransform))
    __obj.asInstanceOf[IPointerPointTransform]
  }
  @scala.inline
  implicit class IPointerPointTransformOps[Self <: IPointerPointTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInverse(value: IPointerPointTransform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformBounds(value: Rect => Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformBounds")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTryTransform(value: Point => AnonOutPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tryTransform")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

