package typingsSlinky.vinyl.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vinyl.vinyl.ConstructorOptions & {  contents :null} */
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
  var contents: (js.UndefOr[Buffer | ReadableStream | Null]) with Null = js.native
  
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
  def apply(contents: (js.UndefOr[Buffer | ReadableStream | Null]) with Null): ConstructorOptionscontent = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorOptionscontent]
  }
  
  @scala.inline
  implicit class ConstructorOptionscontentOps[Self <: ConstructorOptionscontent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContents(value: (js.UndefOr[Buffer | ReadableStream | Null]) with Null): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setHistoryVarargs(value: String*): Self = this.set("history", js.Array(value :_*))
    
    @scala.inline
    def setHistory(value: js.Array[String]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setStat(value: Stats): Self = this.set("stat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStat: Self = this.set("stat", js.undefined)
  }
}
