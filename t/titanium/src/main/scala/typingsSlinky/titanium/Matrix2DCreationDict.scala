package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object passed to <Titanium.UI.createMatrix2D> to initialize a matrix.
  */
@js.native
trait Matrix2DCreationDict extends js.Object {
  /**
  	 * Point to rotate around, specified as a dictionary object with `x` and `y`
  	 * properties, where { x: 0.5, y: 0.5 } represents the center of whatever is being
  	 * rotated.
  	 */
  var anchorPoint: js.UndefOr[Point] = js.native
  /**
  	 * Rotation angle, in degrees. See the [rotate](Titanium.UI.Matrix2D.rotate) method
  	 * for a discussion of rotation.
  	 */
  var rotate: js.UndefOr[Double] = js.native
  /**
  	 * Scale the matrix by the specified scaling factor. The same scaling factor is used
  	 * for both horizontal and vertical scaling.
  	 */
  var scale: js.UndefOr[Double] = js.native
}

object Matrix2DCreationDict {
  @scala.inline
  def apply(): Matrix2DCreationDict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Matrix2DCreationDict]
  }
  @scala.inline
  implicit class Matrix2DCreationDictOps[Self <: Matrix2DCreationDict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
  }
  
}

