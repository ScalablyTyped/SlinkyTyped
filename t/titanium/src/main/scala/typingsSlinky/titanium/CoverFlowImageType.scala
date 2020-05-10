package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Blob
import typingsSlinky.titanium.Titanium.Filesystem.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for defining a single image in a cover flow view.
  */
@js.native
trait CoverFlowImageType extends js.Object {
  /**
  	 * Display height of the image, in Apple points.
  	 */
  var height: js.UndefOr[Double] = js.native
  /**
  	 * Image to use, as a local file URL, `Blob`, or `File`.
  	 */
  var image: js.UndefOr[java.lang.String | Blob | File] = js.native
  /**
  	 * Display width for the image, in Apple points.
  	 */
  var width: js.UndefOr[Double] = js.native
}

object CoverFlowImageType {
  @scala.inline
  def apply(): CoverFlowImageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverFlowImageType]
  }
  @scala.inline
  implicit class CoverFlowImageTypeOps[Self <: CoverFlowImageType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withImage(value: java.lang.String | Blob | File): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
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
  }
  
}

