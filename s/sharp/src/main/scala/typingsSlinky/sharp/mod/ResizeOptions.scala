package typingsSlinky.sharp.mod

import typingsSlinky.sharp.sharpStrings.contain
import typingsSlinky.sharp.sharpStrings.cover
import typingsSlinky.sharp.sharpStrings.cubic
import typingsSlinky.sharp.sharpStrings.fill
import typingsSlinky.sharp.sharpStrings.inside
import typingsSlinky.sharp.sharpStrings.lanczos2
import typingsSlinky.sharp.sharpStrings.lanczos3
import typingsSlinky.sharp.sharpStrings.mitchell
import typingsSlinky.sharp.sharpStrings.nearest
import typingsSlinky.sharp.sharpStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeOptions extends js.Object {
  /** Background colour when using a fit of contain, parsed by the color module, defaults to black without transparency. (optional, default {r:0,g:0,b:0,alpha:1}) */
  var background: js.UndefOr[Color] = js.native
  /** Take greater advantage of the JPEG and WebP shrink-on-load feature, which can lead to a slight moiré pattern on some images. (optional, default true) */
  var fastShrinkOnLoad: js.UndefOr[Boolean] = js.native
  /** How the image should be resized to fit both provided dimensions, one of cover, contain, fill, inside or outside. (optional, default 'cover') */
  var fit: js.UndefOr[contain | cover | fill | inside | outside] = js.native
  /** Alternative means of specifying height. If both are present this take priority. */
  var height: js.UndefOr[Double] = js.native
  /** The kernel to use for image reduction. (optional, default 'lanczos3') */
  var kernel: js.UndefOr[nearest | cubic | mitchell | lanczos2 | lanczos3] = js.native
  /** Position, gravity or strategy to use when fit is cover or contain. (optional, default 'centre') */
  var position: js.UndefOr[Double | String] = js.native
  /** Alternative means of specifying width. If both are present this take priority. */
  var width: js.UndefOr[Double] = js.native
  /** Do not enlarge if the width or height are already less than the specified dimensions, equivalent to GraphicsMagick's > geometry option. (optional, default false) */
  var withoutEnlargement: js.UndefOr[Boolean] = js.native
}

object ResizeOptions {
  @scala.inline
  def apply(): ResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeOptions]
  }
  @scala.inline
  implicit class ResizeOptionsOps[Self <: ResizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withFastShrinkOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastShrinkOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFastShrinkOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastShrinkOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withFit(value: contain | cover | fill | inside | outside): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withKernel(value: nearest | cubic | mitchell | lanczos2 | lanczos3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWithoutEnlargement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutEnlargement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithoutEnlargement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutEnlargement")(js.undefined)
        ret
    }
  }
  
}

