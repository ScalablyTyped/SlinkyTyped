package typingsSlinky.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitSvgOptions extends js.Object {
  var src: js.UndefOr[String] = js.native
  var `stroke-animation`: js.UndefOr[Boolean] = js.native
}

object UIkitSvgOptions {
  @scala.inline
  def apply(): UIkitSvgOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitSvgOptions]
  }
  @scala.inline
  implicit class UIkitSvgOptionsOps[Self <: UIkitSvgOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def `withStroke-animation`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStroke-animation`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke-animation")(js.undefined)
        ret
    }
  }
  
}

