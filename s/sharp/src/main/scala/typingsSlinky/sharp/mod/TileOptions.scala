package typingsSlinky.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileOptions extends js.Object {
  /** Tile angle of rotation, must be a multiple of 90. (optional, default 0) */
  var angle: js.UndefOr[Double] = js.native
  /** background colour, parsed by the color module, defaults to white without transparency. (optional, default {r:255,g:255,b:255,alpha:1}) */
  var background: js.UndefOr[String | RGBA] = js.native
  /** Tile container, with value fs (filesystem) or zip (compressed file). (optional, default 'fs') */
  var container: js.UndefOr[String] = js.native
  /** How deep to make the pyramid, possible values are "onepixel", "onetile" or "one" (default based on layout) */
  var depth: js.UndefOr[String] = js.native
  /** Filesystem layout, possible values are dz, iiif, zoomify or google. (optional, default 'dz') */
  var layout: js.UndefOr[TileLayout] = js.native
  /** Tile overlap in pixels, a value between 0 and 8192. (optional, default 0) */
  var overlap: js.UndefOr[Double] = js.native
  /** Tile size in pixels, a value between 1 and 8192. (optional, default 256) */
  var size: js.UndefOr[Double] = js.native
  /** Threshold to skip tile generation, a value 0 - 255 for 8-bit images or 0 - 65535 for 16-bit images */
  var skipBlanks: js.UndefOr[Double] = js.native
}

object TileOptions {
  @scala.inline
  def apply(): TileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileOptions]
  }
  @scala.inline
  implicit class TileOptionsOps[Self <: TileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withBackground(value: String | RGBA): Self = {
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
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withDepth(value: String): Self = {
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
    def withLayout(value: TileLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlap")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipBlanks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipBlanks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipBlanks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipBlanks")(js.undefined)
        ret
    }
  }
  
}

