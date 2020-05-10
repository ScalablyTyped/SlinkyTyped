package typingsSlinky.vinyl

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined vinyl.vinyl.ConstructorOptions & {  contents  :null} */
@js.native
trait ConstructorOptionscontent
  extends /* customProperty */ StringDictionary[js.Any] {
  /**
    * Used for relative pathing. Typically where a glob starts. Default: options.cwd
    */
  var base: js.UndefOr[String] = js.native
  /**
    * File contents.
    * Type: `Buffer`, `Stream`, or null
    * Default: null
    */
  var contents: js.UndefOr[(Buffer | ReadableStream | Null) with Null] = js.native
  /**
    * The current working directory of the file. Default: process.cwd()
    */
  var cwd: js.UndefOr[String] = js.native
  /**
    * Stores the path history. If `options.path` and `options.history` are both passed,
    * `options.path` is appended to `options.history`. All `options.history` paths are
    * normalized by the `file.path` setter.
    * Default: `[]` (or `[options.path]` if `options.path` is passed)
    */
  var history: js.UndefOr[js.Array[String]] = js.native
  /**
    * Full path to the file.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The result of an fs.stat call. This is how you mark the file as a directory or
    * symbolic link. See `isDirectory()`, `isSymbolic()` and `fs.Stats` for more information.
    * http://nodejs.org/api/fs.html#fs_class_fs_stats
    */
  var stat: js.UndefOr[Stats] = js.native
}

object ConstructorOptionscontent {
  @scala.inline
  def apply(): ConstructorOptionscontent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorOptionscontent]
  }
  @scala.inline
  implicit class ConstructorOptionscontentOps[Self <: ConstructorOptionscontent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withContents(value: (Buffer | ReadableStream | Null) with Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(js.undefined)
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
    def withHistory(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
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
    def withStat(value: Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(js.undefined)
        ret
    }
  }
  
}

