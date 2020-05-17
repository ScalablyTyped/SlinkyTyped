package typingsSlinky.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Maxheight extends js.Object {
  /**
    * Sets the maximum chart height in pixels. 600 | 400 | 300
    */
  var `max-height`: js.UndefOr[Double] = js.native
  /**
    * Sets the maximum chart width in pixels. 1000 | 800 | 600
    */
  var `max-width`: js.UndefOr[Double] = js.native
  /**
    * Sets the minimum chart height in pixels. 600 | 400 | 300
    */
  var `min-height`: js.UndefOr[Double] = js.native
  /**
    * Sets the minimum chart width in pixels. 1000 | 800 | 600
    */
  var `min-width`: js.UndefOr[Double] = js.native
  /**
    * Removes the object (legend, title) from the chart at that specified breakpoint. Use the attribute to save screen space at smaller
    * breakpoints. true | false
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object Maxheight {
  @scala.inline
  def apply(): Maxheight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Maxheight]
  }
  @scala.inline
  implicit class MaxheightOps[Self <: Maxheight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withMax-height`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-height`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-height")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-width`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withMin-height`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMin-height`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-height")(js.undefined)
        ret
    }
    @scala.inline
    def `withMin-width`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMin-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min-width")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

