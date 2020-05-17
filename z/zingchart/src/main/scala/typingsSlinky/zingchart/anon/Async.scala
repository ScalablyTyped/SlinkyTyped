package typingsSlinky.zingchart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Async extends js.Object {
  /**
    * Sets the transparency of the object. Values must range between 0.0 and 1.0, with 0.0 being completely invisible and 1.0 being comp
    * letely opaque. Please note that values also require the leading 0 before the decimal. 0.3 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * TODO: description of async attribute true | false | 1 | 0
    */
  var async: js.UndefOr[Boolean] = js.native
  /**
    * Sets the blur radius of the heatmap regions. 10 | 20 | ...
    */
  var blur: js.UndefOr[Double] = js.native
  /**
    * Sets the type of blur shape. "circle" | "square" | ...
    */
  var `brush-typebrushType`: js.UndefOr[String] = js.native
  /**
    * Sets the blur shapes to composite or not. true | false | 1 | 0
    */
  var composite: js.UndefOr[Boolean] = js.native
  var graph: js.UndefOr[KeyscalekeyScale] = js.native
  /**
    * Sets the size of the object/shape. 4 | "6px" | ...
    */
  var size: js.UndefOr[js.Any] = js.native
  /**
    * Sets whether or not the data is sorted. true | false | 1 | 0
    */
  var `sort-datasortData`: js.UndefOr[Boolean] = js.native
  var tooltip: js.UndefOr[Backgroundfit] = js.native
}

object Async {
  @scala.inline
  def apply(): Async = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Async]
  }
  @scala.inline
  implicit class AsyncOps[Self <: Async] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.undefined)
        ret
    }
    @scala.inline
    def `withBrush-typebrushType`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brush-typebrushType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutBrush-typebrushType`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brush-typebrushType")(js.undefined)
        ret
    }
    @scala.inline
    def withComposite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComposite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composite")(js.undefined)
        ret
    }
    @scala.inline
    def withGraph(value: KeyscalekeyScale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def `withSort-datasortData`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort-datasortData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutSort-datasortData`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort-datasortData")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: Backgroundfit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
  }
  
}

