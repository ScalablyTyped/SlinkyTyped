package typingsSlinky.zdog.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IllustrationOptions
  extends AnchorOptions
     with DraggerOptions {
  /**
    * Centers the scene in the element.
    * @default true
    * @see {@link https://zzz.dog/api#illustration-centered Zdog API}
    */
  val centered: js.UndefOr[Boolean] = js.native
  /**
    * Enables dragging to rotate on an item.
    * @default false
    * @see {@link https://zzz.dog/api#illustration-dragrotate Zdog API}
    */
  val dragRotate: js.UndefOr[Boolean | Anchor] = js.native
  /**
    * The HTML element to render on, either a <canvas> or an  <svg>.
    * @see {@link https://zzz.dog/api#illustration-element Zdog API}
    */
  val element: String | HTMLCanvasElement | SVGSVGElement = js.native
  val onPrerender: js.UndefOr[PrerenderListener] = js.native
  val onResize: js.UndefOr[ResizeListener] = js.native
  /**
    * Enables fluid resizing of element.
    * @default false
    * @see {@link https://zzz.dog/api#illustration-resize Zdog API}
    */
  val resize: js.UndefOr[Boolean] = js.native
  /**
    * Enlarges or shrinks the displayed size of the rendering.
    * Whereas {@link Anchor#scale scale} will change the size of item geometry, `zoom` changes item geometry and {@link Shape#stroke stroke} size.
    * @default 1
    * @see {@link https://zzz.dog/api#illustration-zoom Zdog API}
    */
  val zoom: js.UndefOr[Double] = js.native
}

object IllustrationOptions {
  @scala.inline
  def apply(element: String | HTMLCanvasElement | SVGSVGElement): IllustrationOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[IllustrationOptions]
  }
  @scala.inline
  implicit class IllustrationOptionsOps[Self <: IllustrationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementSVGSVGElement(value: SVGSVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementHTMLCanvasElement(value: HTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: String | HTMLCanvasElement | SVGSVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCentered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCentered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centered")(js.undefined)
        ret
    }
    @scala.inline
    def withDragRotate(value: Boolean | Anchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragRotate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrerender(value: PrerenderListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrerender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPrerender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrerender")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(value: ResizeListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

