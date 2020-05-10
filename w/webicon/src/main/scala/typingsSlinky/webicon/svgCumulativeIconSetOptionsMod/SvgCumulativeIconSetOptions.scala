package typingsSlinky.webicon.svgCumulativeIconSetOptionsMod

import typingsSlinky.webicon.iconSetOptionsMod.IconSetOptions
import typingsSlinky.webicon.webiconBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SvgCumulativeIconSetOptions extends IconSetOptions {
  @JSName("cumulative")
  var cumulative_SvgCumulativeIconSetOptions: `true` = js.native
  /**
    * The amount of miliseconds to wait before downloading the icons.
    */
  var waitDuration: js.UndefOr[Double] = js.native
}

object SvgCumulativeIconSetOptions {
  @scala.inline
  def apply(cumulative: `true`): SvgCumulativeIconSetOptions = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgCumulativeIconSetOptions]
  }
  @scala.inline
  implicit class SvgCumulativeIconSetOptionsOps[Self <: SvgCumulativeIconSetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCumulative(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cumulative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaitDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitDuration")(js.undefined)
        ret
    }
  }
  
}

