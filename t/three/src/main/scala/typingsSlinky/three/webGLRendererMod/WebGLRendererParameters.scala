package typingsSlinky.three.webGLRendererMod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.std.OffscreenCanvas
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLRendererParameters extends js.Object {
  /**
  	 * default is true.
  	 */
  var alpha: js.UndefOr[Boolean] = js.native
  /**
  	 * default is false.
  	 */
  var antialias: js.UndefOr[Boolean] = js.native
  /**
  	 * A Canvas where the renderer draws its output.
  	 */
  var canvas: js.UndefOr[HTMLCanvasElement | OffscreenCanvas] = js.native
  /**
  	 * A WebGL Rendering Context.
  	 * (https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext)
  	 *	Default is null
  	 */
  var context: js.UndefOr[WebGLRenderingContext] = js.native
  /**
  	 * default is true.
  	 */
  var depth: js.UndefOr[Boolean] = js.native
  /**
  	 * default is false.
  	 */
  var logarithmicDepthBuffer: js.UndefOr[Boolean] = js.native
  /**
  	 *	Can be "high-performance", "low-power" or "default"
  	 */
  var powerPreference: js.UndefOr[String] = js.native
  /**
  	 *	shader precision. Can be "highp", "mediump" or "lowp".
  	 */
  var precision: js.UndefOr[String] = js.native
  /**
  	 * default is true.
  	 */
  var premultipliedAlpha: js.UndefOr[Boolean] = js.native
  /**
  	 * default is false.
  	 */
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.native
  /**
  	 * default is true.
  	 */
  var stencil: js.UndefOr[Boolean] = js.native
}

object WebGLRendererParameters {
  @scala.inline
  def apply(): WebGLRendererParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLRendererParameters]
  }
  @scala.inline
  implicit class WebGLRendererParametersOps[Self <: WebGLRendererParameters] (val x: Self) extends AnyVal {
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
    def withCanvasHTMLCanvasElement(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanvas(value: HTMLCanvasElement | OffscreenCanvas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvas")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: WebGLRenderingContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
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
    def withLogarithmicDepthBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logarithmicDepthBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogarithmicDepthBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logarithmicDepthBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withPowerPreference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerPreference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPowerPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerPreference")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
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

