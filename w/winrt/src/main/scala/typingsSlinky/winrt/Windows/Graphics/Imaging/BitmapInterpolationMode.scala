package typingsSlinky.winrt.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapInterpolationMode extends js.Object

@JSGlobal("Windows.Graphics.Imaging.BitmapInterpolationMode")
@js.native
object BitmapInterpolationMode extends js.Object {
  @js.native
  sealed trait cubic extends BitmapInterpolationMode
  
  @js.native
  sealed trait fant extends BitmapInterpolationMode
  
  @js.native
  sealed trait linear extends BitmapInterpolationMode
  
  @js.native
  sealed trait nearestNeighbor extends BitmapInterpolationMode
  
  /* 2 */ val cubic: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.cubic with Double = js.native
  /* 3 */ val fant: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.fant with Double = js.native
  /* 1 */ val linear: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.linear with Double = js.native
  /* 0 */ val nearestNeighbor: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.nearestNeighbor with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BitmapInterpolationMode with Double] = js.native
}

