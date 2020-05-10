package typingsSlinky.vinylFs.mod

import typingsSlinky.globStream.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SrcOptions extends Options {
  /**
    * Setting this to false will make file.contents a paused stream
    * If true it will buffer the file contents
    * Default: true
    */
  var buffer: js.UndefOr[Boolean] = js.native
  /**
    * The mode the directory should be created with.
    * Default: the process mode
    */
  var dirMode: js.UndefOr[Double] = js.native
  /**
    * Whether or not to recursively resolve symlinks to their targets.
    * Setting to `false` to preserve them as symlinks and make `file.symlink`
    * equal the original symlink's target path.
    * Default: true
    */
  var followSymlinks: js.UndefOr[Boolean] = js.native
  /**
    * Setting this to true will create a duplex stream, one that passes
    * through items and emits globbed files.
    * Default: false
    */
  var passthrough: js.UndefOr[Boolean] = js.native
  /**
    * Setting this to false will ignore the contents of the file and disable
    * writing to disk to speed up operations
    * Default: true
    */
  var read: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the symlink should be relative or absolute.
    * Default: false
    */
  var relative: js.UndefOr[Boolean] = js.native
  /**
    * Causes the BOM to be removed on UTF-8 encoded files. Set to false if you need the BOM for some reason.
    * Default: true
    */
  var removeBOM: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not to recursively resolve symlinks to their targets. Setting to false to
    * preserve them as symlinks and make file.symlink equal the original symlink's target path.
    * Default: false
    */
  var resolveSymlinks: js.UndefOr[Boolean] = js.native
  /** Only find files that have been modified since the time specified */
  var since: js.UndefOr[js.Date | Double] = js.native
  /**
    * Setting this to true will enable sourcemaps.
    * Default: false
    */
  var sourcemaps: js.UndefOr[Boolean] = js.native
  /**
    * Causes the BOM to be stripped on UTF-8 encoded files. Set to `false`
    * if you need the BOM for some reason.
    */
  var stripBOM: js.UndefOr[Boolean] = js.native
}

object SrcOptions {
  @scala.inline
  def apply(): SrcOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SrcOptions]
  }
  @scala.inline
  implicit class SrcOptionsOps[Self <: SrcOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
    @scala.inline
    def withDirMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowSymlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followSymlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowSymlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followSymlinks")(js.undefined)
        ret
    }
    @scala.inline
    def withPassthrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passthrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassthrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passthrough")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withRelative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveBOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveBOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBOM")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveSymlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveSymlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolveSymlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveSymlinks")(js.undefined)
        ret
    }
    @scala.inline
    def withSinceDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSince(value: js.Date | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSince: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("since")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcemaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcemaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourcemaps")(js.undefined)
        ret
    }
    @scala.inline
    def withStripBOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripBOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripBOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripBOM")(js.undefined)
        ret
    }
  }
  
}

