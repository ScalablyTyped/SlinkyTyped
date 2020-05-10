package typingsSlinky.vinylFs.mod

import typingsSlinky.vinylFs.vinylFsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestOptions extends js.Object {
  /**
    * Specify the working directory the folder is relative to
    * Default is process.cwd()
    */
  var cwd: js.UndefOr[String] = js.native
  /** Specify the mode the directory should be created with. Default is the process mode */
  var dirMode: js.UndefOr[Double | String] = js.native
  /**
    * Specify the mode the files should be created with
    * Default is the mode of the input file (file.stat.mode)
    * or the process mode if the input file has no mode property
    */
  var mode: js.UndefOr[Double | String] = js.native
  /** Specify if existing files with the same path should be overwritten or not. Default is true, to always overwrite existing files */
  var overwrite: js.UndefOr[Boolean] = js.native
  /**
    * When creating a symlink, whether or not the created symlink should be relative. If false,
    * the symlink will be absolute. Note: This option will be ignored if a junction is being created.
    */
  var relativeSymlinks: js.UndefOr[Boolean] = js.native
  /**
    * Enables sourcemap support on files passed through the stream. Will write inline soucemaps if
    * specified as true. Specifying a string path will write external sourcemaps at the given path.
    */
  var sourcemaps: js.UndefOr[`true` | String] = js.native
  /* When creating a symlink, whether or not a directory symlink should be created as a junction. */
  var useJunctions: js.UndefOr[Boolean] = js.native
}

object DestOptions {
  @scala.inline
  def apply(): DestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestOptions]
  }
  @scala.inline
  implicit class DestOptionsOps[Self <: DestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withDirMode(value: Double | String): Self = {
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
    def withMode(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeSymlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeSymlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeSymlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeSymlinks")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcemaps(value: `true` | String): Self = {
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
    def withUseJunctions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useJunctions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseJunctions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useJunctions")(js.undefined)
        ret
    }
  }
  
}

