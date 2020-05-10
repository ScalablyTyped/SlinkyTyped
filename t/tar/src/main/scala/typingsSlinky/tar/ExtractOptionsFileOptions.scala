package typingsSlinky.tar

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.tar.mod.FileStat
import typingsSlinky.tar.mod.ReadEntry
import typingsSlinky.tar.tarBooleans.`false`
import typingsSlinky.tar.tarBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tar.tar.ExtractOptions & tar.tar.FileOptions & {  sync  :true} */
@js.native
trait ExtractOptionsFileOptions extends js.Object {
  /**
    * Alias for cwd.
    */
  var C: js.UndefOr[String] = js.native
  var Directory: js.UndefOr[Boolean] = js.native
  /**
    * Extract files relative to the specified directory. Defaults to
    * process.cwd(). If provided, this must exist and must be a directory.
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
    * added. Return true to emit the entry from the archive, or false to skip it.
    */
  var filter: js.UndefOr[js.Function2[/* path */ String, /* stat */ FileStat, Boolean]] = js.native
  /**
    * Set to a number to force ownership of all extracted files and folders,
    * and all implicitly created directories, to be owned by the specified
    * group id, regardless of the gid field in the archive. Cannot be used
    * along with preserveOwner. Requires also setting a uid option
    */
  var gid: js.UndefOr[Double] = js.native
  /**
    * Alias for keep.
    */
  var k: js.UndefOr[Boolean] = js.native
  /**
    * Do not overwrite existing files. In particular, if a file appears more
    * than once in an archive, later copies will not overwrite earlier copies
    */
  var keep: js.UndefOr[Boolean] = js.native
  /**
    * Alias for keep.
    */
  var `keep-existing`: js.UndefOr[Boolean] = js.native
  /**
    * Alias for newer.
    */
  var `keep-newer`: js.UndefOr[Boolean] = js.native
  /**
    * Alias for newer.
    */
  var `keep-newer-files`: js.UndefOr[Boolean] = js.native
  var m: js.UndefOr[Boolean] = js.native
  /**
    * The maximum size of meta entries that is supported. Defaults to 1 MB.
    */
  var maxMetaEntrySize: js.UndefOr[Double] = js.native
  // The following options are mostly internal, but can be modified in some
  // advanced use cases, such as re-using caches between runs.
  /**
    * The maximum buffer size for fs.read() operations (in bytes). Defaults to 16 MB.
    */
  var maxReadSize: js.UndefOr[Double] = js.native
  /**
    * Set to true to keep the existing file on disk if it's newer than
    * the file in the archive.
    */
  var newer: js.UndefOr[Boolean] = js.native
  var `no-mtime`: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to omit writing mtime value for extracted entries.
    * [Alias: m, no-mtime]
    */
  var noMtime: js.UndefOr[Boolean] = js.native
  /**
    * A function that gets called with (entry) for each entry that passes the
    * filter.
    */
  var onentry: js.UndefOr[js.Function1[/* entry */ ReadEntry, Unit]] = js.native
  /**
    * A function that will get called with (message, data)
    * for any warnings encountered.
    */
  var onwarn: js.UndefOr[js.Function2[/* message */ String, /* data */ Buffer, Unit]] = js.native
  /**
    * Alias for preserveOwner.
    */
  var p: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
  /**
    * If true, tar will set the uid and gid of extracted entries to the uid
    * and gid fields in the archive. This defaults to true when run as root,
    * and false otherwise. If false, then files and directories will be set
    * with the owner and group of the user running the process. This is
    * similar to -p in tar(1), but ACLs and other system-specific data is
    * never unpacked in this implementation, and modes
    * are set by default already.
    */
  var preserveOwner: js.UndefOr[Boolean] = js.native
  /**
    * Treat warnings as crash-worthy errors. Default false.
    */
  var strict: js.UndefOr[Boolean] = js.native
  /**
    * Remove the specified number of leading path elements. Pathnames with
    * fewer elements will be silently skipped. Note that the pathname
    * is edited after applying the filter, but before security checks.
    */
  var strip: js.UndefOr[Double] = js.native
  /**
    * Alias for strip.
    */
  var `strip-components`: js.UndefOr[Double] = js.native
  /**
    * Alias for strip.
    */
  var stripComponents: js.UndefOr[Double] = js.native
  var sync: `true` = js.native
  /**
    * Provide a function that takes an entry object, and returns a stream,
    * or any falsey value. If a stream is provided, then that stream's data
    * will be written instead of the contents of the archive entry. If a
    * falsey value is provided, then the entry is written to disk as normal.
    * (To exclude items from extraction, use the filter option described above.)
    */
  var transform: js.UndefOr[js.Function1[/* entry */ ReadEntry, js.UndefOr[WritableStream | `false` | Null]]] = js.native
  var `type`: js.UndefOr[String] = js.native
  /**
    * Set to a number to force ownership of all extracted files and folders,
    * and all implicitly created directories, to be owned by the specified
    * user id, regardless of the uid field in the archive. Cannot be used
    * along with preserveOwner. Requires also setting a gid option.
    */
  var uid: js.UndefOr[Double] = js.native
  /**
    * Unlink files before creating them. Without this option, tar overwrites
    * existing files, which preserves existing hardlinks. With this option,
    * existing hardlinks will be broken, as will any symlink that would
    * affect the location of an extracted file.
    */
  var unlink: js.UndefOr[Boolean] = js.native
}

object ExtractOptionsFileOptions {
  @scala.inline
  def apply(sync: `true`): ExtractOptionsFileOptions = {
    val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractOptionsFileOptions]
  }
  @scala.inline
  implicit class ExtractOptionsFileOptionsOps[Self <: ExtractOptionsFileOptions] (val x: Self) extends AnyVal {
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
    def withDirectory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Directory")(js.undefined)
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
    def withGid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(js.undefined)
        ret
    }
    @scala.inline
    def withK(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutK: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep")(js.undefined)
        ret
    }
    @scala.inline
    def `withKeep-existing`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep-existing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutKeep-existing`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep-existing")(js.undefined)
        ret
    }
    @scala.inline
    def `withKeep-newer`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep-newer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutKeep-newer`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep-newer")(js.undefined)
        ret
    }
    @scala.inline
    def `withKeep-newer-files`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep-newer-files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutKeep-newer-files`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep-newer-files")(js.undefined)
        ret
    }
    @scala.inline
    def withM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMetaEntrySize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMetaEntrySize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMetaEntrySize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMetaEntrySize")(js.undefined)
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
    def withNewer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newer")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-mtime`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-mtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-mtime`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-mtime")(js.undefined)
        ret
    }
    @scala.inline
    def withNoMtime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoMtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noMtime")(js.undefined)
        ret
    }
    @scala.inline
    def withOnentry(value: /* entry */ ReadEntry => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onentry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnentry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onentry")(js.undefined)
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
    def withP(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveOwner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveOwner")(js.undefined)
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
    def withStrip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip")(js.undefined)
        ret
    }
    @scala.inline
    def `withStrip-components`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip-components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStrip-components`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strip-components")(js.undefined)
        ret
    }
    @scala.inline
    def withStripComponents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripComponents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripComponents")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: /* entry */ ReadEntry => js.UndefOr[WritableStream | `false` | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlink")(js.undefined)
        ret
    }
  }
  
}

