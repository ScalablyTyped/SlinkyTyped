package typingsSlinky.termImg.mod

import typingsSlinky.ansiEscapes.mod.ImageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[FallbackType] extends ImageOptions {
  /**
  		Enables you to do something else when the terminal doesn't support images.
  		@default () => throw new UnsupportedTerminalError()
  		*/
  val fallback: js.UndefOr[js.Function0[FallbackType]] = js.native
}

object Options {
  @scala.inline
  def apply[FallbackType](): Options[FallbackType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[FallbackType]]
  }
  @scala.inline
  implicit class OptionsOps[Self[fallbacktype] <: Options[fallbacktype], FallbackType] (val x: Self[FallbackType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[FallbackType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[FallbackType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[FallbackType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[FallbackType] with Other]
    @scala.inline
    def withFallback(value: () => FallbackType): Self[FallbackType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFallback: Self[FallbackType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(js.undefined)
        ret
    }
  }
  
}

