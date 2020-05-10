package typingsSlinky.tar

import typingsSlinky.node.Buffer
import typingsSlinky.node.zlibMod.ZlibOptions
import typingsSlinky.tar.mod.FileStat
import typingsSlinky.tar.tarBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tar.tar.CreateOptions & tar.tar.FileOptions & {  sync  :true} */
@js.native
trait CreateOptionsFileOptionss extends js.Object {
  /**
    * Alias for cwd.
    */
  var C: js.UndefOr[String] = js.native
  /**
    * Alias for follow.
    */
  var L: js.UndefOr[Boolean] = js.native
  /**
    * Alias for presevePaths.
    */
  var P: js.UndefOr[Boolean] = js.native
  /**
    * The current working directory for creating the archive. Defaults to process.cwd().
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * Alias for file.
    */
  var f: js.UndefOr[String] = js.native
  /**
    * Uses the given file as the input or output of this function.
    */
  var file: js.UndefOr[String] = js.native
  /**
    * A function that gets called with (path, stat) for each entry being
    * added. Return true to add the entry to the archive, or false to omit it.
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
    * The mode to set on the created file archive.
    */
  var mode: js.UndefOr[Double] = js.native
  /**
    * Do not recursively archive the contents of directories.
    */
  var noDirRecurse: js.UndefOr[Boolean] = js.native
  /**
    * Suppress pax extended headers. Note that this means that long paths and
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
    * Omit metadata that is system-specific: ctime, atime, uid, gid, uname,
    * gname, dev, ino, and nlink. Note that mtime is still included,
    * because this is necessary other time-based operations.
    */
  var portable: js.UndefOr[Boolean] = js.native
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
  var sync: `true` = js.native
  /**
    * Alias for gzip.
    */
  var z: js.UndefOr[Boolean | ZlibOptions] = js.native
}

object CreateOptionsFileOptionss {
  @scala.inline
  def apply(sync: `true`): CreateOptionsFileOptionss = {
    val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptionsFileOptionss]
  }
  @scala.inline
  implicit class CreateOptionsFileOptionssOps[Self <: CreateOptionsFileOptionss] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSync(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
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
    def withP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("P")(js.undefined)
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
    def withF(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(js.undefined)
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
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
    def withMode(value: Double): Self = {
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
    def withPortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portable")(js.undefined)
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
    def withZ(value: Boolean | ZlibOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(js.undefined)
        ret
    }
  }
  
}

