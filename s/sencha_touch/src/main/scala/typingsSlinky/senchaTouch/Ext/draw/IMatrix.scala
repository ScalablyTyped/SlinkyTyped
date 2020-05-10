package typingsSlinky.senchaTouch.Ext.draw

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMatrix extends IBase {
  /** [Property] (Number) */
  var a: js.UndefOr[Double] = js.native
  /** [Method] Postpend a matrix onto the current
  		* @param xx Number Coefficient from x to x.
  		* @param xy Number Coefficient from x to y.
  		* @param yx Number Coefficient from y to x.
  		* @param yy Number Coefficient from y to y.
  		* @param dx Number Offset of x.
  		* @param dy Number Offset of y.
  		* @returns Ext.draw.Matrix this
  		*/
  var append: js.UndefOr[
    js.Function6[
      /* xx */ js.UndefOr[Double], 
      /* xy */ js.UndefOr[Double], 
      /* yx */ js.UndefOr[Double], 
      /* yy */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      this.type
    ]
  ] = js.native
  /** [Method] Postpend a matrix onto the current
  		* @param matrix Ext.draw.Matrix
  		* @returns Ext.draw.Matrix this
  		*/
  var appendMatrix: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[this.type], this.type]] = js.native
  /** [Method] Clone this matrix
  		* @returns Ext.draw.Matrix
  		*/
  @JSName("clone")
  var clone_FIMatrix: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Determines if this matrix has the same values as another matrix
  		* @param matrix Ext.draw.Matrix
  		* @returns Boolean
  		*/
  @JSName("equals")
  var equals_FIMatrix: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[this.type], Boolean]] = js.native
  /** [Method] Horizontally flip the matrix
  		* @returns Ext.draw.Matrix this
  		*/
  var flipX: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Vertically flip the matrix
  		* @returns Ext.draw.Matrix this
  		*/
  var flipY: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Get offset x component of the matrix
  		* @returns Number
  		*/
  var getDX: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get offset y component of the matrix
  		* @returns Number
  		*/
  var getDY: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get the x scale of the matrix
  		* @returns Number
  		*/
  var getScaleX: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get the y scale of the matrix
  		* @returns Number
  		*/
  var getScaleY: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get x to x component of the matrix
  		* @returns Number
  		*/
  var getXX: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get x to y component of the matrix
  		* @returns Number
  		*/
  var getXY: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get y to x component of the matrix
  		* @returns Number
  		*/
  var getYX: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Get y to y component of the matrix
  		* @returns Number
  		*/
  var getYY: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Return a new matrix represents the opposite transformation of the current one
  		* @param target Ext.draw.Matrix A target matrix. If present, it will receive the result of inversion to avoid creating a new object.
  		* @returns Ext.draw.Matrix
  		*/
  var inverse: js.UndefOr[js.Function1[/* target */ js.UndefOr[this.type], this.type]] = js.native
  /** [Method] Determines whether this matrix is an identity matrix no transform
  		* @returns Boolean
  		*/
  var isIdentity: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Postpend a matrix onto the current
  		* @param matrix Ext.draw.Matrix
  		* @returns Ext.draw.Matrix this
  		*/
  var multiply: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[this.type], this.type]] = js.native
  /** [Method] Prepend a matrix onto the current
  		* @param xx Number Coefficient from x to x.
  		* @param xy Number Coefficient from x to y.
  		* @param yx Number Coefficient from y to x.
  		* @param yy Number Coefficient from y to y.
  		* @param dx Number Offset of x.
  		* @param dy Number Offset of y.
  		* @returns Ext.draw.Matrix this
  		*/
  var prepend: js.UndefOr[
    js.Function6[
      /* xx */ js.UndefOr[Double], 
      /* xy */ js.UndefOr[Double], 
      /* yx */ js.UndefOr[Double], 
      /* yy */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      this.type
    ]
  ] = js.native
  /** [Method] Prepend a matrix onto the current
  		* @param matrix Ext.draw.Matrix
  		* @returns Ext.draw.Matrix this
  		*/
  var prependMatrix: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[this.type], this.type]] = js.native
  /** [Method] Reset the matrix to identical
  		* @returns Ext.draw.Matrix this
  		*/
  var reset: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Rotate the matrix
  		* @param angle Number Radians to rotate
  		* @param rcx Number|null Center of rotation.
  		* @param rcy Number|null Center of rotation.
  		* @param prepend Boolean If true, this will transformation be prepended to the matrix.
  		* @returns Ext.draw.Matrix this
  		*/
  var rotate: js.UndefOr[
    js.Function4[
      /* angle */ js.UndefOr[Double], 
      /* rcx */ js.UndefOr[js.Any], 
      /* rcy */ js.UndefOr[js.Any], 
      /* prepend */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Method] Rotate the matrix by the angle of a vector
  		* @param x Number
  		* @param y Number
  		* @param prepend Boolean If true, this will transformation be prepended to the matrix.
  		* @returns Ext.draw.Matrix this
  		*/
  var rotateFromVector: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* prepend */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Method] Scale the matrix
  		* @param sx Number
  		* @param sy Number
  		* @param scx Number
  		* @param scy Number
  		* @param prepend Boolean If true, this will transformation be prepended to the matrix.
  		* @returns Ext.draw.Matrix this
  		*/
  var scale: js.UndefOr[
    js.Function5[
      /* sx */ js.UndefOr[Double], 
      /* sy */ js.UndefOr[Double], 
      /* scx */ js.UndefOr[Double], 
      /* scy */ js.UndefOr[Double], 
      /* prepend */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Method] Set the elements of a Matrix
  		* @param xx Number
  		* @param xy Number
  		* @param yx Number
  		* @param yy Number
  		* @param dx Number
  		* @param dy Number
  		* @returns Ext.draw.Matrix this
  		*/
  var set: js.UndefOr[
    js.Function6[
      /* xx */ js.UndefOr[Double], 
      /* xy */ js.UndefOr[Double], 
      /* yx */ js.UndefOr[Double], 
      /* yy */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      this.type
    ]
  ] = js.native
  /** [Method] Skew the matrix
  		* @param angle Number
  		* @returns Ext.draw.Matrix this
  		*/
  var skewX: js.UndefOr[js.Function1[/* angle */ js.UndefOr[Double], this.type]] = js.native
  /** [Method] Skew the matrix
  		* @param angle Number
  		* @returns Ext.draw.Matrix this
  		*/
  var skewY: js.UndefOr[js.Function1[/* angle */ js.UndefOr[Double], this.type]] = js.native
  /** [Method] Split matrix into Translate Scale Shear and Rotate
  		* @returns Object
  		*/
  var split: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Create an array of elements by horizontal order xx yx dx yx yy dy
  		* @returns Array
  		*/
  var toArray: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Apply the matrix to a drawing context
  		* @param ctx Object
  		* @returns Ext.draw.Matrix this
  		*/
  var toContext: js.UndefOr[js.Function1[/* ctx */ js.UndefOr[js.Any], this.type]] = js.native
  /** [Method] Get an array of elements
  		* @returns Array
  		*/
  @JSName("toString")
  var toString_FIMatrix: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Return a string that can be used as transform attribute in SVG
  		* @returns String
  		*/
  var toSvg: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Create an array of elements by vertical order xx xy yx yy dx dy
  		* @returns Array|String
  		*/
  var toVerticalArray: js.UndefOr[js.Function0[_]] = js.native
  /** [Method]
  		* @param bbox Object Given as {x: Number, y: Number, width: Number, height: Number}.
  		* @param radius Number
  		* @param target Object Optional target object to recieve the result. Recommended to use it for better gc.
  		* @returns Object Object with x, y, width and height.
  		*/
  var transformBBox: js.UndefOr[
    js.Function3[
      /* bbox */ js.UndefOr[js.Any], 
      /* radius */ js.UndefOr[Double], 
      /* target */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Method] Transform a list for points
  		* @param list Array
  		* @returns Array list
  		*/
  var transformList: js.UndefOr[js.Function1[/* list */ js.UndefOr[Array], Array]] = js.native
  /** [Method] Transform a point to a new array
  		* @param point Array
  		* @returns Array
  		*/
  var transformPoint: js.UndefOr[js.Function1[/* point */ js.UndefOr[Array], Array]] = js.native
  /** [Method] Translate the matrix
  		* @param x Number
  		* @param y Number
  		* @param prepend Boolean If true, this will transformation be prepended to the matrix.
  		* @returns Ext.draw.Matrix this
  		*/
  var translate: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* prepend */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  /** [Method] Transform point returning the x component of the result
  		* @param x Number
  		* @param y Number
  		* @returns Number x component of the result.
  		*/
  var x: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Double]] = js.native
  /** [Method] Transform point returning the y component of the result
  		* @param x Number
  		* @param y Number
  		* @returns Number y component of the result.
  		*/
  var y: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Double]] = js.native
}

object IMatrix {
  @scala.inline
  def apply(): IMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMatrix]
  }
  @scala.inline
  implicit class IMatrixOps[Self <: IMatrix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(js.undefined)
        ret
    }
    @scala.inline
    def withAppend(
      value: (/* xx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => IMatrix
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutAppend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendMatrix(value: /* matrix */ js.UndefOr[IMatrix] => IMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendMatrix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAppendMatrix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendMatrix")(js.undefined)
        ret
    }
    @scala.inline
    def withClone(value: () => IMatrix): Self = {
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
    def withEquals(value: /* matrix */ js.UndefOr[IMatrix] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipX(value: () => IMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFlipX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipX")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipY(value: () => IMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFlipY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDX")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScaleX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaleX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScaleX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaleX")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScaleY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaleY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScaleY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaleY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetXX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetXX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXX")(js.undefined)
        ret
    }
    @scala.inline
    def withGetXY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetXY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getXY")(js.undefined)
        ret
    }
    @scala.inline
    def withGetYX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetYX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYX")(js.undefined)
        ret
    }
    @scala.inline
    def withGetYY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetYY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getYY")(js.undefined)
        ret
    }
    @scala.inline
    def withInverse(value: /* target */ js.UndefOr[IMatrix] => IMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverse")(js.undefined)
        ret
    }
    @scala.inline
    def withIsIdentity(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdentity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsIdentity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdentity")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiply(value: /* matrix */ js.UndefOr[IMatrix] => IMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMultiply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiply")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepend(
      value: (/* xx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => IMatrix
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutPrepend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(js.undefined)
        ret
    }
    @scala.inline
    def withPrependMatrix(value: /* matrix */ js.UndefOr[IMatrix] => IMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependMatrix")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrependMatrix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prependMatrix")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: () => IMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(
      value: (/* angle */ js.UndefOr[Double], /* rcx */ js.UndefOr[js.Any], /* rcy */ js.UndefOr[js.Any], /* prepend */ js.UndefOr[Boolean]) => IMatrix
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateFromVector(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* prepend */ js.UndefOr[Boolean]) => IMatrix
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateFromVector")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRotateFromVector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateFromVector")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(
      value: (/* sx */ js.UndefOr[Double], /* sy */ js.UndefOr[Double], /* scx */ js.UndefOr[Double], /* scy */ js.UndefOr[Double], /* prepend */ js.UndefOr[Boolean]) => IMatrix
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(
      value: (/* xx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => IMatrix
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
    @scala.inline
    def withSkewX(value: /* angle */ js.UndefOr[Double] => IMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSkewX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewX")(js.undefined)
        ret
    }
    @scala.inline
    def withSkewY(value: /* angle */ js.UndefOr[Double] => IMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSkewY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skewY")(js.undefined)
        ret
    }
    @scala.inline
    def withSplit(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(js.undefined)
        ret
    }
    @scala.inline
    def withToArray(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.undefined)
        ret
    }
    @scala.inline
    def withToContext(value: /* ctx */ js.UndefOr[js.Any] => IMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutToContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toContext")(js.undefined)
        ret
    }
    @scala.inline
    def withToString(value: () => Array): Self = {
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
    def withToSvg(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSvg")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToSvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSvg")(js.undefined)
        ret
    }
    @scala.inline
    def withToVerticalArray(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toVerticalArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToVerticalArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toVerticalArray")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformBBox(
      value: (/* bbox */ js.UndefOr[js.Any], /* radius */ js.UndefOr[Double], /* target */ js.UndefOr[js.Any]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformBBox")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTransformBBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformBBox")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformList(value: /* list */ js.UndefOr[Array] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformList")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformPoint(value: /* point */ js.UndefOr[Array] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPoint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslate(
      value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* prepend */ js.UndefOr[Boolean]) => IMatrix
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

