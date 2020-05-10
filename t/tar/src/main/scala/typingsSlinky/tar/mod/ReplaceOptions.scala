package typingsSlinky.tar.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.zlibMod.ZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceOptions extends js.Object {
  /**
    * Alias for cwd.
    */
  var C: js.UndefOr[String] = js.native
  /**
    * Alias for follow.
    */
  var L: js.UndefOr[Boolean] = js.native
  /**
    * Extract files relative to the specified directory. Defaults to
    * process.cwd(). If provided, this must exist and must be a directory.
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * Required. Write the tarball archive to the specified filename.
    */
  var file: String = js.native
  /**
    * A function that gets called with (path, stat) for each entry being
    * added. Return true to emit the entry from the archive, or false to skip it.
    */
  var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ FileStat, Boolean]] = js.native
  /**
    * Set to true to pack the targets of symbolic links. Without this
    * option, symbolic links are archived as such.
    */
  var follow: js.UndefOr[Boolean] = js.native
  /**
    * Set to any truthy value to create a gzipped archive,
    * or an object with settings for zlib.Gzip()
    */
  var gzip: js.UndefOr[Boolean | ZlibOptions] = js.native
  /**
    * Alias for follow.
    */
  var h: js.UndefOr[Boolean] = js.native
  /**
    * The maximum buffer size for fs.read() operations. Defaults to 16 MB.
    */
  var maxReadSize: js.UndefOr[Double] = js.native
  /**
    * Do not recursively archive the contents of directories.
    */
  var noDirRecurse: js.UndefOr[Boolean] = js.native
  /**
    * uppress pax extended headers. Note that this means that long paths and
    * linkpaths will be truncated, and large or negative numeric values
    * may be interpreted incorrectly.
    */
  var noPax: js.UndefOr[Boolean] = js.native
  /**
    * A function that will get called with (message, data)
    * for any warnings encountered.
    */
  var onwarn: js.UndefOr[js.Function2[/* message */ String, /* data */ Buffer, Unit]] = js.native
  /**
    * A path portion to prefix onto the entries in the archive.
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Allow absolute paths. By default, / is stripped from absolute paths.
    */
  var preservePaths: js.UndefOr[Boolean] = js.native
  /**
    * Treat warnings as crash-worthy errors. Default false.
    */
  var strict: js.UndefOr[Boolean] = js.native
  /**
    * Act synchronously. If this is set, then any provided file will be
    * fully written after the call to tar.c.
    */
  var sync: js.UndefOr[Boolean] = js.native
}

object ReplaceOptions {
  @scala.inline
  def apply(file: String): ReplaceOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceOptions]
  }
  @scala.inline
  implicit class ReplaceOptionsOps[Self <: ReplaceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("C")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("C")(js.undefined)
        ret
    }
    @scala.inline
    def withL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("L")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("L")(js.undefined)
        ret
    }
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
    def withFilter(value: (/* path */ String, /* stat */ FileStat) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFollow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(js.undefined)
        ret
    }
    @scala.inline
    def withGzip(value: Boolean | ZlibOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGzip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzip")(js.undefined)
        ret
    }
    @scala.inline
    def withH(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxReadSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReadSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxReadSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReadSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDirRecurse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDirRecurse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDirRecurse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDirRecurse")(js.undefined)
        ret
    }
    @scala.inline
    def withNoPax(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoPax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPax")(js.undefined)
        ret
    }
    @scala.inline
    def withOnwarn(value: (/* message */ String, /* data */ Buffer) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwarn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnwarn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onwarn")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPreservePaths(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preservePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreservePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preservePaths")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
  }
  
}

