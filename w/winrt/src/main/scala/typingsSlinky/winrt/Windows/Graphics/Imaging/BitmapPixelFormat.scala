package typingsSlinky.winrt.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapPixelFormat extends js.Object

@JSGlobal("Windows.Graphics.Imaging.BitmapPixelFormat")
@js.native
object BitmapPixelFormat extends js.Object {
  @js.native
  sealed trait bgra8 extends BitmapPixelFormat
  
  @js.native
  sealed trait rgba16 extends BitmapPixelFormat
  
  @js.native
  sealed trait rgba8 extends BitmapPixelFormat
  
  @js.native
  sealed trait unknown extends BitmapPixelFormat
  
  /* 3 */ val bgra8: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapPixelFormat.bgra8 with Double = js.native
  /* 1 */ val rgba16: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapPixelFormat.rgba16 with Double = js.native
  /* 2 */ val rgba8: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapPixelFormat.rgba8 with Double = js.native
  /* 0 */ val unknown: typingsSlinky.winrt.Windows.Graphics.Imaging.BitmapPixelFormat.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BitmapPixelFormat with Double] = js.native
}

