package typingsSlinky.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jitter extends js.Object {
  /**
    * To set the jitter width. 0 | .5 | 1 | 2 | ...
    */
  var jitter: js.UndefOr[js.Any] = js.native
  /**
    * To set the `mean-factor` width. 0 | .5 | 1 | 2 | ...
    */
  var meanFactor: js.UndefOr[js.Any] = js.native
  /**
    * To set the `rounding-factor` on median edges. 0 | .5 | 1 | 2 | ...
    */
  var roundingFactor: js.UndefOr[js.Any] = js.native
  /**
    * To set the styling of the violin object. {}
    */
  var style: js.UndefOr[js.Any] = js.native
  /**
    * To set the trim. true | false | 0 | 1
    */
  var trim: js.UndefOr[Boolean] = js.native
}

object Jitter {
  @scala.inline
  def apply(): Jitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jitter]
  }
  @scala.inline
  implicit class JitterOps[Self <: Jitter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJitter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jitter")(js.undefined)
        ret
    }
    @scala.inline
    def withMeanFactor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meanFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeanFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meanFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundingFactor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundingFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundingFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundingFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
  }
  
}

