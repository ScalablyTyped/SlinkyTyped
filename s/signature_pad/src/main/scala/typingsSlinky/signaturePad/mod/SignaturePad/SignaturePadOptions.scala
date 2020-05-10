package typingsSlinky.signaturePad.mod.SignaturePad

import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignaturePadOptions extends js.Object {
  /*
    * (string) Color used to clear the background. Can be any color format accepted by context.fillStyle. Defaults to "rgba(0,0,0,0)" (transparent black). Use a non-transparent color e.g. "rgb(255,255,255)" (opaque white) if you'd like to save signatures as JPEG images.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /*
    * (float or function) Radius of a single dot.
    */
  var dotSize: js.UndefOr[Double | js.Function0[Double]] = js.native
  /*
    * (float) Maximum width of a line. Defaults to 2.5.
    */
  var maxWidth: js.UndefOr[Double] = js.native
  /*
    * (integer) Add the next point only if the previous one is farther than x pixels. Defaults to 5.
    */
  var minDistance: js.UndefOr[Double] = js.native
  /*
    * (float) Minimum width of a line. Defaults to 0.5.
    */
  var minWidth: js.UndefOr[Double] = js.native
  /*
    * (function) Callback when stroke begin.
    */
  var onBegin: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  /*
    * (function) Callback when stroke end.
    */
  var onEnd: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  /*
    * (string) Color used to draw the lines. Can be any color format accepted by context.fillStyle. Defaults to "black".
    */
  var penColor: js.UndefOr[String] = js.native
  /*
    * (integer) Draw the next point at most once per every x milliseconds. Set it to 0 to turn off throttling. Defaults to 16.
    */
  var throttle: js.UndefOr[Double] = js.native
  /*
    * (float) Weight used to modify new velocity based on the previous velocity. Defaults to 0.7.
    */
  var velocityFilterWeight: js.UndefOr[Double] = js.native
}

object SignaturePadOptions {
  @scala.inline
  def apply(): SignaturePadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignaturePadOptions]
  }
  @scala.inline
  implicit class SignaturePadOptionsOps[Self <: SignaturePadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDotSizeFunction0(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDotSize(value: Double | js.Function0[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBegin(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBegin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnd(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withPenColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("penColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPenColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("penColor")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(js.undefined)
        ret
    }
    @scala.inline
    def withVelocityFilterWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityFilterWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVelocityFilterWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityFilterWeight")(js.undefined)
        ret
    }
  }
  
}

