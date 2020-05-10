package typingsSlinky.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharpOptions extends js.Object {
  /** Describes a new image to be created. */
  var create: js.UndefOr[Create] = js.native
  /** Number representing the DPI for vector images. (optional, default 72) */
  var density: js.UndefOr[Double] = js.native
  /**
    * By default halt processing and raise an error when loading invalid images.
    * Set this flag to false if you'd rather apply a "best effort" to decode images,
    * even if the data is corrupt or invalid. (optional, default true)
    * (optional, default true)
    */
  var failOnError: js.UndefOr[Boolean] = js.native
  /**
    * Do not process input images where the number of pixels (width x height) exceeds this limit.
    * Assumes image dimensions contained in the input metadata can be trusted.
    * An integral Number of pixels, zero or false to remove limit, true to use default limit of 268402689 (0x3FFF x 0x3FFF). (optional, default 268402689)
    */
  var limitInputPixels: js.UndefOr[Double | Boolean] = js.native
  /** Page number to start extracting from for multi-page input (GIF, TIFF, PDF), zero based. (optional, default 0) */
  var page: js.UndefOr[Double] = js.native
  /** Number of pages to extract for multi-page input (GIF, TIFF, PDF), use -1 for all pages */
  var pages: js.UndefOr[Double] = js.native
  /** Describes raw pixel input image data. See raw() for pixel ordering. */
  var raw: js.UndefOr[Raw] = js.native
  /** Set this to true to use sequential rather than random access where possible. This can reduce memory usage and might improve performance on some systems. (optional, default false) */
  var sequentialRead: js.UndefOr[Boolean] = js.native
}

object SharpOptions {
  @scala.inline
  def apply(): SharpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharpOptions]
  }
  @scala.inline
  implicit class SharpOptionsOps[Self <: SharpOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: Create): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDensity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(js.undefined)
        ret
    }
    @scala.inline
    def withFailOnError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failOnError")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitInputPixels(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitInputPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitInputPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitInputPixels")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(js.undefined)
        ret
    }
    @scala.inline
    def withRaw(value: Raw): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaw: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("raw")(js.undefined)
        ret
    }
    @scala.inline
    def withSequentialRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequentialRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequentialRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequentialRead")(js.undefined)
        ret
    }
  }
  
}

