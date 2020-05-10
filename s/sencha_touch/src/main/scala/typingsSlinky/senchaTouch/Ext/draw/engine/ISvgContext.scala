package typingsSlinky.senchaTouch.Ext.draw.engine

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.senchaTouch.Ext.IBase
import typingsSlinky.senchaTouch.Ext.draw.engine.svgcontext.IGradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISvgContext extends IBase {
  /** [Method] Adds points to the subpath such that the arc described by the circumference of the circle described by the arguments
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
  /** [Method] Arc command using svg parameters
  		* @param r1 Number
  		* @param r2 Number
  		* @param rotation Number
  		* @param large Number
  		* @param swipe Number
  		* @param x2 Number
  		* @param y2 Number
  		*/
  var arcSvg: js.UndefOr[
    js.Function7[
      /* r1 */ js.UndefOr[Double], 
      /* r2 */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      /* large */ js.UndefOr[Double], 
      /* swipe */ js.UndefOr[Double], 
      /* x2 */ js.UndefOr[Double], 
      /* y2 */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Adds an arc with the given control points and radius to the current subpath connected to the previous point by a str
  		* @param x1 Number
  		* @param y1 Number
  		* @param x2 Number
  		* @param y2 Number
  		* @param radiusX Number
  		* @param radiusY Number
  		* @param rotation Number
  		*/
  var arcTo: js.UndefOr[
    js.Function7[
      /* x1 */ js.UndefOr[Double], 
      /* y1 */ js.UndefOr[Double], 
      /* x2 */ js.UndefOr[Double], 
      /* y2 */ js.UndefOr[Double], 
      /* radiusX */ js.UndefOr[Double], 
      /* radiusY */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Resets the current default path  */
  var beginPath: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Adds the given point to the current subpath connected to the previous one by a cubic B zier curve with the given con
  		* @param x1 Number
  		* @param y1 Number
  		* @param x2 Number
  		* @param y2 Number
  		* @param x3 Number
  		* @param y3 Number
  		*/
  var bezierCurveTo: js.UndefOr[
    js.Function6[
      /* x1 */ js.UndefOr[Double], 
      /* y1 */ js.UndefOr[Double], 
      /* x2 */ js.UndefOr[Double], 
      /* y2 */ js.UndefOr[Double], 
      /* x3 */ js.UndefOr[Double], 
      /* y3 */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Clears the context  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Marks the current subpath as closed and starts a new subpath with a point the same as the start and end of the newly  */
  var closePath: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns an object that represents a linear gradient that paints along the line given by the coordinates represented b
  		* @param x0 Number
  		* @param y0 Number
  		* @param x1 Number
  		* @param y1 Number
  		* @returns Ext.draw.engine.SvgContext.Gradient
  		*/
  var createLinearGradient: js.UndefOr[
    js.Function4[
      /* x0 */ js.UndefOr[Double], 
      /* y0 */ js.UndefOr[Double], 
      /* x1 */ js.UndefOr[Double], 
      /* y1 */ js.UndefOr[Double], 
      IGradient
    ]
  ] = js.native
  /** [Method] Returns a CanvasGradient object that represents a radial gradient that paints along the cone given by the circles rep
  		* @param x0 Number
  		* @param y0 Number
  		* @param r0 Number
  		* @param x1 Number
  		* @param y1 Number
  		* @param r1 Number
  		* @returns Ext.draw.engine.SvgContext.Gradient
  		*/
  var createRadialGradient: js.UndefOr[
    js.Function6[
      /* x0 */ js.UndefOr[Double], 
      /* y0 */ js.UndefOr[Double], 
      /* r0 */ js.UndefOr[Double], 
      /* x1 */ js.UndefOr[Double], 
      /* y1 */ js.UndefOr[Double], 
      /* r1 */ js.UndefOr[Double], 
      IGradient
    ]
  ] = js.native
  /** [Method] Draws the given image onto the canvas
  		* @param image HTMLElement
  		* @param sx Number
  		* @param sy Number
  		* @param sw Number
  		* @param sh Number
  		* @param dx Number
  		* @param dy Number
  		* @param dw Number
  		* @param dh Number
  		*/
  var drawImage: js.UndefOr[
    js.Function9[
      /* image */ js.UndefOr[HTMLElement], 
      /* sx */ js.UndefOr[Double], 
      /* sy */ js.UndefOr[Double], 
      /* sw */ js.UndefOr[Double], 
      /* sh */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      /* dw */ js.UndefOr[Double], 
      /* dh */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Adds points to the subpath such that the arc described by the circumference of the ellipse described by the arguments
  		* @param x Number
  		* @param y Number
  		* @param radiusX Number
  		* @param radiusY Number
  		* @param rotation Number
  		* @param startAngle Number
  		* @param endAngle Number
  		* @param anticlockwise Number
  		*/
  var ellipse: js.UndefOr[
    js.Function8[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* radiusX */ js.UndefOr[Double], 
      /* radiusY */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      /* startAngle */ js.UndefOr[Double], 
      /* endAngle */ js.UndefOr[Double], 
      /* anticlockwise */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Fills the subpaths of the current default path or the given path with the current fill style  */
  var fill: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Paints the given rectangle onto the canvas using the current fill style
  		* @param x Number
  		* @param y Number
  		* @param width Number
  		* @param height Number
  		*/
  var fillRect: js.UndefOr[
    js.Function4[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Note After the method guarantees the transform matrix will be inverted
  		* @param attr Object The attribute object
  		* @param transformFillStroke Boolean Indicate whether to transform fill and stroke. If this is not given, then uses attr.transformFillStroke instead.
  		*/
  var fillStroke: js.UndefOr[
    js.Function2[/* attr */ js.UndefOr[js.Any], /* transformFillStroke */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Fills the given text at the given position
  		* @param text String
  		* @param x Number
  		* @param y Number
  		*/
  var fillText: js.UndefOr[
    js.Function3[
      /* text */ js.UndefOr[String], 
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Adds the given point to the current subpath connected to the previous one by a straight line
  		* @param x Number
  		* @param y Number
  		*/
  var lineTo: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Creates a new subpath with the given point
  		* @param x Number
  		* @param y Number
  		*/
  var moveTo: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Adds a new closed subpath to the path representing the given rectangle
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
  /** [Method] Pops the state stack and restores the state  */
  var restore: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Pushes the context state to the state stack  */
  var save: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Changes the transformation matrix to the matrix given by the arguments as described below
  		* @param xx Number
  		* @param yx Number
  		* @param xy Number
  		* @param yy Number
  		* @param dx Number
  		* @param dy Number
  		*/
  var setTransform: js.UndefOr[
    js.Function6[
      /* xx */ js.UndefOr[Double], 
      /* yx */ js.UndefOr[Double], 
      /* xy */ js.UndefOr[Double], 
      /* yy */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Strokes the subpaths of the current default path or the given path with the current stroke style  */
  var stroke: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Paints the box that outlines the given rectangle onto the canvas using the current stroke style
  		* @param x Number
  		* @param y Number
  		* @param width Number
  		* @param height Number
  		*/
  var strokeRect: js.UndefOr[
    js.Function4[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Strokes the given text at the given position
  		* @param text String
  		* @param x Number
  		* @param y Number
  		*/
  var strokeText: js.UndefOr[
    js.Function3[
      /* text */ js.UndefOr[String], 
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Method] Changes the transformation matrix to apply the matrix given by the arguments as described below
  		* @param xx Number
  		* @param yx Number
  		* @param xy Number
  		* @param yy Number
  		* @param dx Number
  		* @param dy Number
  		*/
  var transform: js.UndefOr[
    js.Function6[
      /* xx */ js.UndefOr[Double], 
      /* yx */ js.UndefOr[Double], 
      /* xy */ js.UndefOr[Double], 
      /* yy */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
}

object ISvgContext {
  @scala.inline
  def apply(): ISvgContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISvgContext]
  }
  @scala.inline
  implicit class ISvgContextOps[Self <: ISvgContext] (val x: Self) extends AnyVal {
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
      value: (/* r1 */ js.UndefOr[Double], /* r2 */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* large */ js.UndefOr[Double], /* swipe */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double]) => Unit
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
      value: (/* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double], /* radiusX */ js.UndefOr[Double], /* radiusY */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double]) => Unit
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
    def withBeginPath(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeginPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginPath")(js.undefined)
        ret
    }
    @scala.inline
    def withBezierCurveTo(
      value: (/* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double], /* x3 */ js.UndefOr[Double], /* y3 */ js.UndefOr[Double]) => Unit
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
    def withCreateLinearGradient(
      value: (/* x0 */ js.UndefOr[Double], /* y0 */ js.UndefOr[Double], /* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double]) => IGradient
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLinearGradient")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutCreateLinearGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLinearGradient")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateRadialGradient(
      value: (/* x0 */ js.UndefOr[Double], /* y0 */ js.UndefOr[Double], /* r0 */ js.UndefOr[Double], /* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* r1 */ js.UndefOr[Double]) => IGradient
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRadialGradient")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutCreateRadialGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRadialGradient")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawImage(
      value: (/* image */ js.UndefOr[HTMLElement], /* sx */ js.UndefOr[Double], /* sy */ js.UndefOr[Double], /* sw */ js.UndefOr[Double], /* sh */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double], /* dw */ js.UndefOr[Double], /* dh */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawImage")(js.Any.fromFunction9(value))
        ret
    }
    @scala.inline
    def withoutDrawImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawImage")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipse(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* radiusX */ js.UndefOr[Double], /* radiusY */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* startAngle */ js.UndefOr[Double], /* endAngle */ js.UndefOr[Double], /* anticlockwise */ js.UndefOr[Double]) => Unit
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
    def withFill(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFillRect(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRect")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFillRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillRect")(js.undefined)
        ret
    }
    @scala.inline
    def withFillStroke(value: (/* attr */ js.UndefOr[js.Any], /* transformFillStroke */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStroke")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFillStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withFillText(
      value: (/* text */ js.UndefOr[String], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillText")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFillText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillText")(js.undefined)
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
    def withRestore(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRestore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restore")(js.undefined)
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTransform(
      value: (/* xx */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransform")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutSetTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeRect(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeRect")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutStrokeRect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeRect")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeText(
      value: (/* text */ js.UndefOr[String], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeText")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutStrokeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeText")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(
      value: (/* xx */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction6(value))
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

