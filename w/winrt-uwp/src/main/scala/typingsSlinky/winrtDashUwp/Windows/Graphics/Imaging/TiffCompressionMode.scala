package typingsSlinky.winrtDashUwp.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TiffCompressionMode extends js.Object

/** Specifies the compression mode used for TIFF images. */
@JSGlobal("Windows.Graphics.Imaging.TiffCompressionMode")
@js.native
object TiffCompressionMode extends js.Object {
  /** The compression will be automatically selected. */
  @js.native
  sealed trait automatic extends TiffCompressionMode
  
  /** CCITT3 compression will be applied. */
  @js.native
  sealed trait ccitt3 extends TiffCompressionMode
  
  /** CCITT4compression will be applied. */
  @js.native
  sealed trait ccitt4 extends TiffCompressionMode
  
  /** LZW compression will be applied. */
  @js.native
  sealed trait lzw extends TiffCompressionMode
  
  /** LZWH Differencing compression will be applied. */
  @js.native
  sealed trait lzwhDifferencing extends TiffCompressionMode
  
  /** No compression will be applied. */
  @js.native
  sealed trait none extends TiffCompressionMode
  
  /** RLE compression will be applied. */
  @js.native
  sealed trait rle extends TiffCompressionMode
  
  /** ZIP compression will be applied. */
  @js.native
  sealed trait zip extends TiffCompressionMode
  
  /* 0 */ val automatic: typingsSlinky.winrtDashUwp.Windows.Graphics.Imaging.TiffCompressionMode.automatic with Double = js.native
  /* 2 */ val ccitt3: typingsSlinky.winrtDashUwp.Windows.Graphics.Imaging.TiffCompressionMode.ccitt3 with Double = js.native
  /* 3 */ val ccitt4: typingsSlinky.winrtDashUwp.Windows.Graphics.Imaging.TiffCompressionMode.ccitt4 with Double = js.native
  /* 4 */ val lzw: typingsSlinky.winrtDashUwp.Windows.Graphics.Imaging.TiffCompressionMode.lzw with Double = js.native
  /* 7 */ val lzwhDifferencing: typingsSlinky.winrtDashUwp.Windows.Graphics.Imaging.TiffCompressionMode.lzwhDifferencing with Double = js.native
  /* 1 */ val none: typingsSlinky.winrtDashUwp.Windows.Graphics.Imaging.TiffCompressionMode.none with Double = js.native
  /* 5 */ val rle: typingsSlinky.winrtDashUwp.Windows.Graphics.Imaging.TiffCompressionMode.rle with Double = js.native
  /* 6 */ val zip: typingsSlinky.winrtDashUwp.Windows.Graphics.Imaging.TiffCompressionMode.zip with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TiffCompressionMode with Double] = js.native
}

