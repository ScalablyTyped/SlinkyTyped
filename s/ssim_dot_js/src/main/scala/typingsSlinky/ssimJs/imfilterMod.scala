package typingsSlinky.ssimJs

import typingsSlinky.ssimJs.padarrayMod.PaddingValue
import typingsSlinky.ssimJs.typesMod.Matrix
import typingsSlinky.ssimJs.typesMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssim.js/dist/matlab/imfilter", JSImport.Namespace)
@js.native
object imfilterMod extends js.Object {
  
  def imfilter(A: Matrix, f: Matrix): Matrix = js.native
  def imfilter(A: Matrix, f: Matrix, pad: js.UndefOr[scala.Nothing], resSize: Shape): Matrix = js.native
  def imfilter(A: Matrix, f: Matrix, pad: PaddingValue): Matrix = js.native
  def imfilter(A: Matrix, f: Matrix, pad: PaddingValue, resSize: Shape): Matrix = js.native
}
