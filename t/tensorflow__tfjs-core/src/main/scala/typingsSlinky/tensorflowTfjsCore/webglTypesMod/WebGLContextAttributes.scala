package typingsSlinky.tensorflowTfjsCore.webglTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLContextAttributes extends js.Object {
  var alpha: js.UndefOr[Boolean] = js.native
  var antialias: js.UndefOr[Boolean] = js.native
  var depth: js.UndefOr[Boolean] = js.native
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.native
  var premultipliedAlpha: js.UndefOr[Boolean] = js.native
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.native
  var stencil: js.UndefOr[Boolean] = js.native
}

object WebGLContextAttributes {
  @scala.inline
  def apply(): WebGLContextAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLContextAttributes]
  }
  @scala.inline
  implicit class WebGLContextAttributesOps[Self <: WebGLContextAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Boolean): Self = {
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
    def withAntialias(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntialias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialias")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(js.undefined)
        ret
    }
    @scala.inline
    def withFailIfMajorPerformanceCaveat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failIfMajorPerformanceCaveat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailIfMajorPerformanceCaveat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failIfMajorPerformanceCaveat")(js.undefined)
        ret
    }
    @scala.inline
    def withPremultipliedAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premultipliedAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPremultipliedAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premultipliedAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveDrawingBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveDrawingBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveDrawingBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveDrawingBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withStencil(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStencil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencil")(js.undefined)
        ret
    }
  }
  
}

