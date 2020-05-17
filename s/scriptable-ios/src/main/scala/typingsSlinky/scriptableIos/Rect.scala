package typingsSlinky.scriptableIos

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Structure representing a rectangle._
  *
  * Constructs a new rectangle placed in a two-dimensional coordinate system.
  * @see https://docs.scriptable.app/rect/#-new-rect
  */
@js.native
trait Rect extends js.Object {
  /**
    * _Height of rectangle._
    *
    * The height of the rectangle.
    * @see https://docs.scriptable.app/rect/#height
    */
  var height: Double = js.native
  /**
    * _Maximum X value._
    *
    * The greatest x-coordinate in the rectangle.
    * @see https://docs.scriptable.app/rect/#maxx
    */
  var maxX: Double = js.native
  /**
    * _Maximum Y value._
    *
    * The greatest y-coordinate in the rectangle.
    * @see https://docs.scriptable.app/rect/#maxy
    */
  var maxY: Double = js.native
  /**
    * _Minimum X value._
    *
    * The smallest x-coordinate in the rectangle.
    * @see https://docs.scriptable.app/rect/#minx
    */
  var minX: Double = js.native
  /**
    * _Minimum Y value._
    *
    * The smallest y-coordinate in the rectangle.
    * @see https://docs.scriptable.app/rect/#miny
    */
  var minY: Double = js.native
  /**
    * _Point that specifies the rectangles origin._
    *
    * The x- and y-coordinate that specifies the rectangles origin as a Point structure.
    * @see https://docs.scriptable.app/rect/#origin
    */
  var origin: Point = js.native
  /**
    * _Size of the rectangle._
    *
    * The width and height of the rectangle as a Size structure.
    * @see https://docs.scriptable.app/rect/#size
    */
  var size: Size = js.native
  /**
    * _Width of rectangle._
    *
    * The width of the rectangle.
    * @see https://docs.scriptable.app/rect/#width
    */
  var width: Double = js.native
  /**
    * _X value._
    *
    * The x-coordinate of the rectangle.
    * @see https://docs.scriptable.app/rect/#x
    */
  var x: Double = js.native
  /**
    * _Y value._
    *
    * The y-coordinate of the rectangle.
    * @see https://docs.scriptable.app/rect/#y
    */
  var y: Double = js.native
}

object Rect {
  @scala.inline
  def apply(
    height: Double,
    maxX: Double,
    maxY: Double,
    minX: Double,
    minY: Double,
    origin: Point,
    size: Size,
    width: Double,
    x: Double,
    y: Double
  ): Rect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
  @scala.inline
  implicit class RectOps[Self <: Rect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

