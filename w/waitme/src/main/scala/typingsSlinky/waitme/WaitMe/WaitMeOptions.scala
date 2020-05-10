package typingsSlinky.waitme.WaitMe

import typingsSlinky.waitme.waitmeStrings.bounce
import typingsSlinky.waitme.waitmeStrings.bouncePulse
import typingsSlinky.waitme.waitmeStrings.facebook
import typingsSlinky.waitme.waitmeStrings.horizontal
import typingsSlinky.waitme.waitmeStrings.img
import typingsSlinky.waitme.waitmeStrings.ios
import typingsSlinky.waitme.waitmeStrings.none
import typingsSlinky.waitme.waitmeStrings.orbit
import typingsSlinky.waitme.waitmeStrings.progressBar
import typingsSlinky.waitme.waitmeStrings.pulse
import typingsSlinky.waitme.waitmeStrings.rotateplane
import typingsSlinky.waitme.waitmeStrings.rotation
import typingsSlinky.waitme.waitmeStrings.roundBounce
import typingsSlinky.waitme.waitmeStrings.stretch
import typingsSlinky.waitme.waitmeStrings.timer
import typingsSlinky.waitme.waitmeStrings.vertical
import typingsSlinky.waitme.waitmeStrings.win8
import typingsSlinky.waitme.waitmeStrings.win8_linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaitMeOptions extends js.Object {
  /**
    * background for container (string).
    * Use: 'rgba(255,255,255,0.7)'. You can use color and image.
    */
  var bg: js.UndefOr[String] = js.native
  /**
    * color for background animation and text (string, array).
    * Use: '#000', ['','',...] - you can use multicolor for effect
    */
  var color: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * animation effect (string).
    * Use: 'bounce' - default
    *      | none
    *      | rotateplane
    *      | stretch
    *      | orbit
    *      | roundBounce
    *      | win8
    *      | win8_linear
    *      | ios
    *      | facebook
    *      | rotation
    *      | timer
    *      | pulse
    *      | progressBar
    *      | bouncePulse
    *      | img
    */
  var effect: js.UndefOr[
    none | bounce | rotateplane | stretch | orbit | roundBounce | win8 | win8_linear | ios | facebook | rotation | timer | pulse | progressBar | bouncePulse | img
  ] = js.native
  /**
    * change font size (string).
    * Use: '18px'. By default, use empty string.
    */
  var fontSize: js.UndefOr[String] = js.native
  /**
    * set max size for elem animation (string).
    * Use: 40. By default, use empty string.
    */
  var maxSize: js.UndefOr[Double | String] = js.native
  /**
    * code execution after closed (function).
    * Use: function(){ //your code here... } or ()=>{ //your code here... }
    * @returns {void} 
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * url to image (string).
    * Use: 'url'. By default, use empty string. Use with effect: 'img'.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * place text under the effect (string).
    * Use: 'text'.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * change text position (string).
    * Use: 'vertical' - default, 'horizontal'.
    */
  var textPos: js.UndefOr[vertical | horizontal] = js.native
}

object WaitMeOptions {
  @scala.inline
  def apply(): WaitMeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitMeOptions]
  }
  @scala.inline
  implicit class WaitMeOptionsOps[Self <: WaitMeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withEffect(
      value: none | bounce | rotateplane | stretch | orbit | roundBounce | win8 | win8_linear | ios | facebook | rotation | timer | pulse | progressBar | bouncePulse | img
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effect")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextPos(value: vertical | horizontal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextPos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPos")(js.undefined)
        ret
    }
  }
  
}

