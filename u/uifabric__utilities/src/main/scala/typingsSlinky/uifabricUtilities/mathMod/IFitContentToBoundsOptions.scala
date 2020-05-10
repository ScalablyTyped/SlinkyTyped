package typingsSlinky.uifabricUtilities.mathMod

import typingsSlinky.uifabricUtilities.isizeMod.ISize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFitContentToBoundsOptions extends js.Object {
  /**
    * The size of the bounds.
    */
  var boundsSize: ISize = js.native
  /**
    * The size of the content to fit to the bounds.
    * The output will be proportional to this value.
    */
  var contentSize: ISize = js.native
  /**
    * An optional maximum scale factor to apply. The default is 1.
    * Use Infinity for an unbounded resize.
    */
  var maxScale: js.UndefOr[Double] = js.native
  /**
    * The fit mode to apply, either 'contain' or 'cover'.
    */
  var mode: FitMode = js.native
}

object IFitContentToBoundsOptions {
  @scala.inline
  def apply(boundsSize: ISize, contentSize: ISize, mode: FitMode): IFitContentToBoundsOptions = {
    val __obj = js.Dynamic.literal(boundsSize = boundsSize.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFitContentToBoundsOptions]
  }
  @scala.inline
  implicit class IFitContentToBoundsOptionsOps[Self <: IFitContentToBoundsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundsSize(value: ISize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundsSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentSize(value: ISize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: FitMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxScale")(js.undefined)
        ret
    }
  }
  
}

