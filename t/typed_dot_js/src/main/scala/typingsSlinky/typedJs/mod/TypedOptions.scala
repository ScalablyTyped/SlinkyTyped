package typingsSlinky.typedJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedOptions extends js.Object {
  /**
    * attribute for typing Ex: input placeholder, value, or just HTML text
    */
  var attr: js.UndefOr[String] = js.native
  /**
    * insert CSS for cursor and fadeOut into HTML
    */
  var autoInsertCss: js.UndefOr[Boolean] = js.native
  /**
    * time before backspacing in milliseconds
    */
  var backDelay: js.UndefOr[Double] = js.native
  /**
    * backspacing speed in milliseconds
    */
  var backSpeed: js.UndefOr[Double] = js.native
  /**
    * bind to focus and blur if el is text input
    */
  var bindInputFocusEvents: js.UndefOr[Boolean] = js.native
  /**
    * 'html' or 'null' for plaintext
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * character for cursor
    */
  var cursorChar: js.UndefOr[String] = js.native
  /**
    * Fade out instead of backspace
    */
  var fadeOut: js.UndefOr[Boolean] = js.native
  /**
    * css class for fade animation
    */
  var fadeOutClass: js.UndefOr[String] = js.native
  /**
    * Fade out delay in milliseconds
    */
  var fadeOutDelay: js.UndefOr[Boolean] = js.native
  /**
    * loop strings
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * amount of loops
    */
  var loopCount: js.UndefOr[Double] = js.native
  /**
    * All typing is complete
    */
  var onComplete: js.UndefOr[js.Function1[/* self */ Typed, Unit]] = js.native
  /**
    * After destroy
    */
  var onDestroy: js.UndefOr[js.Function1[/* self */ Typed, Unit]] = js.native
  /**
    * During looping, after last string is typed
    */
  var onLastStringBackspaced: js.UndefOr[js.Function1[/* self */ Typed, Unit]] = js.native
  /**
    * After reset
    */
  var onReset: js.UndefOr[js.Function1[/* self */ Typed, Unit]] = js.native
  /**
    * After start
    */
  var onStart: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.native
  /**
    * After stop
    */
  var onStop: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.native
  /**
    * After each string is typed
    */
  var onStringTyped: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.native
  /**
    * Typing has been stopped
    */
  var onTypingPaused: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.native
  /**
    * Typing has been started after being stopped
    */
  var onTypingResumed: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.native
  /**
    * Before each string is typed
    */
  var preStringTyped: js.UndefOr[js.Function2[/* arrayPos */ Double, /* self */ Typed, Unit]] = js.native
  /**
    * show cursor
    */
  var showCursor: js.UndefOr[Boolean] = js.native
  /**
    * shuffle the strings
    */
  var shuffle: js.UndefOr[Boolean] = js.native
  /**
    * only backspace what doesn't match the previous string
    */
  var smartBackspace: js.UndefOr[Boolean] = js.native
  /**
    * time before typing starts in milliseconds
    */
  var startDelay: js.UndefOr[Double] = js.native
  /**
    * strings to be typed
    */
  var strings: js.UndefOr[js.Array[String]] = js.native
  /**
    * ID of element containing string children
    */
  var stringsElement: js.UndefOr[String] = js.native
  /**
    * type speed in milliseconds
    */
  var typeSpeed: js.UndefOr[Double] = js.native
}

object TypedOptions {
  @scala.inline
  def apply(): TypedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypedOptions]
  }
  @scala.inline
  implicit class TypedOptionsOps[Self <: TypedOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoInsertCss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoInsertCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoInsertCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoInsertCss")(js.undefined)
        ret
    }
    @scala.inline
    def withBackDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withBackSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withBindInputFocusEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindInputFocusEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindInputFocusEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindInputFocusEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorChar")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeOut")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeOutClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeOutClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeOutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeOutClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeOutDelay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeOutDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeOutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeOutDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withLoopCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoopCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopCount")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: /* self */ Typed => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDestroy(value: /* self */ Typed => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDestroy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLastStringBackspaced(value: /* self */ Typed => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLastStringBackspaced")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLastStringBackspaced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLastStringBackspaced")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReset(value: /* self */ Typed => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStart(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStop(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStringTyped(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStringTyped")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnStringTyped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStringTyped")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTypingPaused(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTypingPaused")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnTypingPaused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTypingPaused")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTypingResumed(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTypingResumed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnTypingResumed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTypingResumed")(js.undefined)
        ret
    }
    @scala.inline
    def withPreStringTyped(value: (/* arrayPos */ Double, /* self */ Typed) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preStringTyped")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPreStringTyped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preStringTyped")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCursor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withShuffle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShuffle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(js.undefined)
        ret
    }
    @scala.inline
    def withSmartBackspace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartBackspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmartBackspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smartBackspace")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withStrings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(js.undefined)
        ret
    }
    @scala.inline
    def withStringsElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringsElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringsElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringsElement")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeSpeed")(js.undefined)
        ret
    }
  }
  
}

