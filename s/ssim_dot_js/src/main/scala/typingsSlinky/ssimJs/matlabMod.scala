package typingsSlinky.ssimJs

import typingsSlinky.ssimJs.padarrayMod.PaddingDirection
import typingsSlinky.ssimJs.padarrayMod.PaddingValue
import typingsSlinky.ssimJs.ssimJsStrings.gaussian
import typingsSlinky.ssimJs.typesMod.ImageData
import typingsSlinky.ssimJs.typesMod.Matrix
import typingsSlinky.ssimJs.typesMod.Shape
import typingsSlinky.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssim.js/dist/matlab", JSImport.Namespace)
@js.native
object matlabMod extends js.Object {
  
  def conv2(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof boxConv | typeof convn | typeof mxConv2> is not an array type */ args: Parameters[
      (js.Function3[/* a */ Matrix, /* hasDataWidthHeight */ Matrix, js.UndefOr[Shape], Matrix]) | (js.Function4[/* a */ Matrix, /* b1 */ Matrix, /* b2 */ Matrix, /* shape */ js.UndefOr[Shape], Matrix])
    ]
  ): Matrix = js.native
  
  def filter2(h: Matrix, X: Matrix): Matrix = js.native
  def filter2(h: Matrix, X: Matrix, shape: Shape): Matrix = js.native
  
  def fspecial(): Matrix = js.native
  def fspecial(_type: js.UndefOr[scala.Nothing], hsize: js.UndefOr[scala.Nothing], σ: Double): Matrix = js.native
  def fspecial(_type: js.UndefOr[scala.Nothing], hsize: Double): Matrix = js.native
  def fspecial(_type: js.UndefOr[scala.Nothing], hsize: Double, σ: Double): Matrix = js.native
  @JSName("fspecial")
  def fspecial_gaussian(_type: gaussian): Matrix = js.native
  @JSName("fspecial")
  def fspecial_gaussian(_type: gaussian, hsize: js.UndefOr[scala.Nothing], σ: Double): Matrix = js.native
  @JSName("fspecial")
  def fspecial_gaussian(_type: gaussian, hsize: Double): Matrix = js.native
  @JSName("fspecial")
  def fspecial_gaussian(_type: gaussian, hsize: Double, σ: Double): Matrix = js.native
  
  def imfilter(A: Matrix, f: Matrix): Matrix = js.native
  def imfilter(A: Matrix, f: Matrix, pad: js.UndefOr[scala.Nothing], resSize: Shape): Matrix = js.native
  def imfilter(A: Matrix, f: Matrix, pad: PaddingValue): Matrix = js.native
  def imfilter(A: Matrix, f: Matrix, pad: PaddingValue, resSize: Shape): Matrix = js.native
  
  def normpdf(hasDataWidthHeight: Matrix): Matrix = js.native
  def normpdf(hasDataWidthHeight: Matrix, µ: js.UndefOr[scala.Nothing], σ: Double): Matrix = js.native
  def normpdf(hasDataWidthHeight: Matrix, µ: Double): Matrix = js.native
  def normpdf(hasDataWidthHeight: Matrix, µ: Double, σ: Double): Matrix = js.native
  
  def ones(height: Double): Matrix = js.native
  def ones(height: Double, width: Double): Matrix = js.native
  
  def padarray(A: Matrix, hasPadHeightPadWidth: js.Tuple2[Double, Double]): Matrix = js.native
  def padarray(
    A: Matrix,
    hasPadHeightPadWidth: js.Tuple2[Double, Double],
    _padval: js.UndefOr[scala.Nothing],
    _direction: PaddingDirection
  ): Matrix = js.native
  def padarray(A: Matrix, hasPadHeightPadWidth: js.Tuple2[Double, Double], _padval: PaddingValue): Matrix = js.native
  def padarray(
    A: Matrix,
    hasPadHeightPadWidth: js.Tuple2[Double, Double],
    _padval: PaddingValue,
    _direction: PaddingDirection
  ): Matrix = js.native
  
  def rgb2gray(hasDataWidthHeight: ImageData): Matrix = js.native
  def rgb2gray(hasDataWidthHeight: Matrix): Matrix = js.native
  
  def rgb2grayInteger(hasDataWidthHeight: ImageData): Matrix = js.native
  def rgb2grayInteger(hasDataWidthHeight: Matrix): Matrix = js.native
  
  def skip2d(
    A: Matrix,
    hasStartRowEveryRowEndRow: js.Tuple3[Double, Double, Double],
    hasStartColEveryColEndCol: js.Tuple3[Double, Double, Double]
  ): Matrix = js.native
  
  def sub(hasDataWidth: Matrix, x: Double, height: Double, y: Double, width: Double): Matrix = js.native
  
  def transpose(hasDataWidthHeight: Matrix): Matrix = js.native
  
  def zeros(height: Double): Matrix = js.native
  def zeros(height: Double, width: Double): Matrix = js.native
}
