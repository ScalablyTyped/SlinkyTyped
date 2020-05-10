package typingsSlinky.wonderJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAlpha extends js.Object {
  var alpha: Boolean = js.native
  var antialias: Boolean = js.native
  var depth: Boolean = js.native
  var premultipliedAlpha: Boolean = js.native
  var preserveDrawingBuffer: Boolean = js.native
  var stencil: Boolean = js.native
}

object AnonAlpha {
  @scala.inline
  def apply(
    alpha: Boolean,
    antialias: Boolean,
    depth: Boolean,
    premultipliedAlpha: Boolean,
    preserveDrawingBuffer: Boolean,
    stencil: Boolean
  ): AnonAlpha = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], antialias = antialias.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], premultipliedAlpha = premultipliedAlpha.asInstanceOf[js.Any], preserveDrawingBuffer = preserveDrawingBuffer.asInstanceOf[js.Any], stencil = stencil.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlpha]
  }
  @scala.inline
  implicit class AnonAlphaOps[Self <: AnonAlpha] (val x: Self) extends AnyVal {
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
    def withAntialias(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antialias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPremultipliedAlpha(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("premultipliedAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreserveDrawingBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveDrawingBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStencil(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stencil")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

