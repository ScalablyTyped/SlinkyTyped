package typingsSlinky.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitGridOptions extends js.Object {
  var `first-column`: js.UndefOr[String] = js.native
  var margin: js.UndefOr[String] = js.native
  var masonry: js.UndefOr[Boolean] = js.native
  var parallax: js.UndefOr[Double] = js.native
}

object UIkitGridOptions {
  @scala.inline
  def apply(): UIkitGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitGridOptions]
  }
  @scala.inline
  implicit class UIkitGridOptionsOps[Self <: UIkitGridOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withFirst-column`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first-column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutFirst-column`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first-column")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withMasonry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masonry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasonry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masonry")(js.undefined)
        ret
    }
    @scala.inline
    def withParallax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParallax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallax")(js.undefined)
        ret
    }
  }
  
}

