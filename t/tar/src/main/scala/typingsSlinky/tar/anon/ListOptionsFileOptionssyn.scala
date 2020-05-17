package typingsSlinky.tar.anon

import typingsSlinky.tar.mod.FileStat
import typingsSlinky.tar.tarBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tar.tar.ListOptions & tar.tar.FileOptions & {  sync  :true} */
@js.native
trait ListOptionsFileOptionssyn extends js.Object {
  /**
    * Alias for cwd.
    */
  var C: js.UndefOr[String] = js.native
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
  var filter: js.UndefOr[js.Function2[/* path */ String, /* entry */ FileStat, Boolean]] = js.native
  /**
    * The maximum buffer size for fs.read() operations. Defaults to 16 MB.
    */
  var maxReadSize: js.UndefOr[Double] = js.native
  /**
    * By default, entry streams are resumed immediately after the call to
    * onentry. Set noResume: true to suppress this behavior. Note that by
    * opting into this, the stream will never complete until the entry
    * data is consumed.
    */
  var noResume: js.UndefOr[Boolean] = js.native
  /**
    * A function that gets called with (entry) for each entry that passes the
    * filter. This is important for when both file and sync are set, because
    * it will be called synchronously.
    */
  var onentry: js.UndefOr[js.Function1[/* entry */ FileStat, Unit]] = js.native
  /**
    * Treat warnings as crash-worthy errors. Default false.
    */
  var strict: js.UndefOr[Boolean] = js.native
  var sync: `true` = js.native
}

object ListOptionsFileOptionssyn {
  @scala.inline
  def apply(sync: `true`): ListOptionsFileOptionssyn = {
    val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOptionsFileOptionssyn]
  }
  @scala.inline
  implicit class ListOptionsFileOptionssynOps[Self <: ListOptionsFileOptionssyn] (val x: Self) extends AnyVal {
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
    def withFilter(value: (/* path */ String, /* entry */ FileStat) => Boolean): Self = {
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
    def withNoResume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoResume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResume")(js.undefined)
        ret
    }
    @scala.inline
    def withOnentry(value: /* entry */ FileStat => Unit): Self = {
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
  }
  
}

