package typingsSlinky.zfont.mod.zdogAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Vertical text alignment, equivalent to the HTML5 canvas' {@link CanvasRenderingContext2D.textBaseline textBaseline} property.
  * @see {@link https://github.com/jaames/zfont#textbaseline Zfont API} (Text)
  * @see {@link https://github.com/jaames/zfont#textbaseline-1 Zfont API} (TextGroup)
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.zfont.zfontStrings.top
  - typingsSlinky.zfont.zfontStrings.middle
  - typingsSlinky.zfont.zfontStrings.bottom
*/
trait TextBaseline extends js.Object

object TextBaseline {
  @scala.inline
  def bottom: typingsSlinky.zfont.zfontStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def middle: typingsSlinky.zfont.zfontStrings.middle = this.cast("middle")
  @scala.inline
  def top: typingsSlinky.zfont.zfontStrings.top = this.cast("top")
}

