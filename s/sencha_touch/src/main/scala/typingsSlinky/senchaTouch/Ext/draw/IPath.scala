package typingsSlinky.senchaTouch.Ext.draw

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPath extends IBase {
  /** [Method] Create an circular arc
  		* @param x Number
  		* @param y Number
  		* @param radius Number
  		* @param startAngle Number
  		* @param endAngle Number
  		* @param anticlockwise Number
  		*/
  var arc: js.UndefOr[
    js.Function6[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* radius */ js.UndefOr[Double], 
      /* startAngle */ js.UndefOr[Double], 
      /* endAngle */ js.UndefOr[Double], 
      /* anticlockwise */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] http  www w3 org TR SVG implnote html ArcImplementationNotes
  		* @param rx Number
  		* @param ry Number
  		* @param rotation Number Differ from svg spec, this is radian.
  		* @param fA Number
  		* @param fS Number
  		* @param x2 Number
  		* @param y2 Number
  		*/
  var arcSvg: js.UndefOr[
    js.Function7[
      /* rx */ js.UndefOr[Double], 
      /* ry */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      /* fA */ js.UndefOr[Double], 
      /* fS */ js.UndefOr[Double], 
      /* x2 */ js.UndefOr[Double], 
      /* y2 */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Create a elliptic arc curve compatible with SVG s arc to instruction
  		* @param x1 Number
  		* @param y1 Number
  		* @param x2 Number
  		* @param y2 Number
  		* @param rx Number
  		* @param ry Number
  		* @param rotation Number
  		*/
  var arcTo: js.UndefOr[
    js.Function7[
      /* x1 */ js.UndefOr[Double], 
      /* y1 */ js.UndefOr[Double], 
      /* x2 */ js.UndefOr[Double], 
      /* y2 */ js.UndefOr[Double], 
      /* rx */ js.UndefOr[Double], 
      /* ry */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] A cubic bezier curve to a position
  		* @param cx1 Number
  		* @param cy1 Number
  		* @param cx2 Number
  		* @param cy2 Number
  		* @param x Number
  		* @param y Number
  		*/
  var bezierCurveTo: js.UndefOr[
    js.Function6[
      /* cx1 */ js.UndefOr[Double], 
      /* cy1 */ js.UndefOr[Double], 
      /* cx2 */ js.UndefOr[Double], 
      /* cy2 */ js.UndefOr[Double], 
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Clear the path  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Clone this path
  		* @returns Ext.draw.Path
  		*/
  @JSName("clone")
  var clone_FIPath: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Close this path with a straight line  */
  var closePath: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Create an elliptic arc
  		* @param cx Number
  		* @param cy Number
  		* @param radiusX Number
  		* @param radiusY Number
  		* @param rotation Number
  		* @param startAngle Number
  		* @param endAngle Number
  		* @param anticlockwise Number
  		*/
  var ellipse: js.UndefOr[
    js.Function8[
      /* cx */ js.UndefOr[Double], 
      /* cy */ js.UndefOr[Double], 
      /* radiusX */ js.UndefOr[Double], 
      /* radiusY */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      /* startAngle */ js.UndefOr[Double], 
      /* endAngle */ js.UndefOr[Double], 
      /* anticlockwise */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Reconstruct path from cubic bezier curve stripes
  		* @param stripes Array
  		*/
  var fromStripes: js.UndefOr[js.Function1[/* stripes */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Feed the path from svg path string
  		* @param pathString String
  		*/
  var fromSvgString: js.UndefOr[js.Function1[/* pathString */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Get the bounding box of this matrix
  		* @param target Object Optional object to receive the result.
  		* @returns Object Object with x, y, width and height
  		*/
  var getDimension: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Get the bounding box as if the path is transformed by a matrix
  		* @param matrix Ext.draw.Matrix
  		* @param target Object Optional object to receive the result.
  		* @returns Object An object with x, y, width and height.
  		*/
  var getDimensionWithTransform: js.UndefOr[
    js.Function2[/* matrix */ js.UndefOr[IMatrix], /* target */ js.UndefOr[js.Any], _]
  ] = js.native
  /** [Method] Test whether the given point is on or inside the path
  		* @param x Number
  		* @param y Number
  		* @returns Boolean
  		*/
  var isPointInPath: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Boolean]] = js.native
  /** [Method] A straight line to a position
  		* @param x Number
  		* @param y Number
  		*/
  var lineTo: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Move to a position
  		* @param x Number
  		* @param y Number
  		*/
  var moveTo: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] A quadratic bezier curve to a position
  		* @param cx Number
  		* @param cy Number
  		* @param x Number
  		* @param y Number
  		*/
  var quadraticCurveTo: js.UndefOr[
    js.Function4[
      /* cx */ js.UndefOr[Double], 
      /* cy */ js.UndefOr[Double], 
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Draw a rectangle and close it
  		* @param x Number
  		* @param y Number
  		* @param width Number
  		* @param height Number
  		*/
  var rect: js.UndefOr[
    js.Function4[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Return an svg path string for this path
  		* @returns String
  		*/
  @JSName("toString")
  var toString_FIPath: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Convert path to bezier curve stripes
  		* @param target Array The optional array to receive the result.
  		* @returns Array
  		*/
  var toStripes: js.UndefOr[js.Function1[/* target */ js.UndefOr[Array], Array]] = js.native
  /** [Method] Transform the current path by a matrix
  		* @param matrix Ext.draw.Matrix
  		*/
  var transform: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[IMatrix], Unit]] = js.native
}

object IPath {
  @scala.inline
  def apply(): IPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPath]
  }
  @scala.inline
  implicit class IPathOps[Self <: IPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArc(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* radius */ js.UndefOr[Double], /* startAngle */ js.UndefOr[Double], /* endAngle */ js.UndefOr[Double], /* anticlockwise */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arc")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutArc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arc")(js.undefined)
        ret
    }
    @scala.inline
    def withArcSvg(
      value: (/* rx */ js.UndefOr[Double], /* ry */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* fA */ js.UndefOr[Double], /* fS */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcSvg")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withoutArcSvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcSvg")(js.undefined)
        ret
    }
    @scala.inline
    def withArcTo(
      value: (/* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double], /* rx */ js.UndefOr[Double], /* ry */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcTo")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withoutArcTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arcTo")(js.undefined)
        ret
    }
    @scala.inline
    def withBezierCurveTo(
      value: (/* cx1 */ js.UndefOr[Double], /* cy1 */ js.UndefOr[Double], /* cx2 */ js.UndefOr[Double], /* cy2 */ js.UndefOr[Double], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bezierCurveTo")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutBezierCurveTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bezierCurveTo")(js.undefined)
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withClone(value: () => IPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.undefined)
        ret
    }
    @scala.inline
    def withClosePath(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closePath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClosePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closePath")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipse(
      value: (/* cx */ js.UndefOr[Double], /* cy */ js.UndefOr[Double], /* radiusX */ js.UndefOr[Double], /* radiusY */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* startAngle */ js.UndefOr[Double], /* endAngle */ js.UndefOr[Double], /* anticlockwise */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipse")(js.Any.fromFunction8(value))
        ret
    }
    @scala.inline
    def withoutEllipse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipse")(js.undefined)
        ret
    }
    @scala.inline
    def withFromStripes(value: /* stripes */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromStripes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFromStripes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromStripes")(js.undefined)
        ret
    }
    @scala.inline
    def withFromSvgString(value: /* pathString */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSvgString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFromSvgString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSvgString")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDimension(value: /* target */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDimension")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDimensionWithTransform(value: (/* matrix */ js.UndefOr[IMatrix], /* target */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDimensionWithTransform")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetDimensionWithTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDimensionWithTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPointInPath(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPointInPath")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutIsPointInPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPointInPath")(js.undefined)
        ret
    }
    @scala.inline
    def withLineTo(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLineTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineTo")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveTo(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMoveTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveTo")(js.undefined)
        ret
    }
    @scala.inline
    def withQuadraticCurveTo(
      value: (/* cx */ js.UndefOr[Double], /* cy */ js.UndefOr[Double], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quadraticCurveTo")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutQuadraticCurveTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quadraticCurveTo")(js.undefined)
        ret
    }
    @scala.inline
    def withRect(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rect")(js.undefined)
        ret
    }
    @scala.inline
    def withToString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.undefined)
        ret
    }
    @scala.inline
    def withToStripes(value: /* target */ js.UndefOr[Array] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toStripes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToStripes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toStripes")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: /* matrix */ js.UndefOr[IMatrix] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

