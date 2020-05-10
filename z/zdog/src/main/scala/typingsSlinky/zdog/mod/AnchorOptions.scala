package typingsSlinky.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorOptions extends js.Object {
  /**
    * Adds item to parent item.
    * Shapes can be added as children to other shapes.
    * A child shape is positioned relative to its parent.
    * @see {@link https://zzz.dog/api#anchor-addto Zdog API}
    */
  val addTo: js.UndefOr[Anchor] = js.native
  /**
    * Rotates the item.
    * Set to rotate the item around the corresponding axis.
    * @see {@link https://zzz.dog/api#anchor-rotate Zdog API}
    */
  val rotate: js.UndefOr[VectorOptions] = js.native
  /**
    * Enlarges or shrinks item geometry. `scale` does not scale `stroke`.
    * @see {@link https://zzz.dog/api#anchor-scale Zdog API}
    */
  val scale: js.UndefOr[VectorOptions | Double] = js.native
  /**
    * Positions the item.
    * @see {@link https://zzz.dog/api#anchor-translate Zdog API}
    */
  val translate: js.UndefOr[VectorOptions] = js.native
}

object AnchorOptions {
  @scala.inline
  def apply(): AnchorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorOptions]
  }
  @scala.inline
  implicit class AnchorOptionsOps[Self <: AnchorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTo(value: Anchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTo")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: VectorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: VectorOptions | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslate(value: VectorOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate")(js.undefined)
        ret
    }
  }
  
}

