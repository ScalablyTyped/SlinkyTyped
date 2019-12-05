package typingsSlinky.winrt.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PngFilterMode extends js.Object

@JSGlobal("Windows.Graphics.Imaging.PngFilterMode")
@js.native
object PngFilterMode extends js.Object {
  @js.native
  sealed trait adaptive extends PngFilterMode
  
  @js.native
  sealed trait automatic extends PngFilterMode
  
  @js.native
  sealed trait average extends PngFilterMode
  
  @js.native
  sealed trait none extends PngFilterMode
  
  @js.native
  sealed trait paeth extends PngFilterMode
  
  @js.native
  sealed trait sub extends PngFilterMode
  
  @js.native
  sealed trait up extends PngFilterMode
  
  /* 6 */ val adaptive: typingsSlinky.winrt.Windows.Graphics.Imaging.PngFilterMode.adaptive with Double = js.native
  /* 0 */ val automatic: typingsSlinky.winrt.Windows.Graphics.Imaging.PngFilterMode.automatic with Double = js.native
  /* 4 */ val average: typingsSlinky.winrt.Windows.Graphics.Imaging.PngFilterMode.average with Double = js.native
  /* 1 */ val none: typingsSlinky.winrt.Windows.Graphics.Imaging.PngFilterMode.none with Double = js.native
  /* 5 */ val paeth: typingsSlinky.winrt.Windows.Graphics.Imaging.PngFilterMode.paeth with Double = js.native
  /* 2 */ val sub: typingsSlinky.winrt.Windows.Graphics.Imaging.PngFilterMode.sub with Double = js.native
  /* 3 */ val up: typingsSlinky.winrt.Windows.Graphics.Imaging.PngFilterMode.up with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PngFilterMode with Double] = js.native
}

