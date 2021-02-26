package typingsSlinky.walkSync

import typingsSlinky.minimatch.mod.IMinimatch
import typingsSlinky.minimatch.mod.IOptions
import typingsSlinky.std.Omit
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import typingsSlinky.walkSync.anon.OptionalizeOptionsfs
import typingsSlinky.walkSync.anon.TypeoffsNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("walk-sync", JSImport.Namespace)
  @js.native
  def apply(baseDir: String): js.Array[String] = js.native
  @JSImport("walk-sync", JSImport.Namespace)
  @js.native
  def apply(baseDir: String, inputOptions: js.Array[String | IMinimatch]): js.Array[String] = js.native
  @JSImport("walk-sync", JSImport.Namespace)
  @js.native
  def apply(baseDir: String, inputOptions: OptionalizeOptionsfs): js.Array[String] = js.native
  
  @JSImport("walk-sync", "Entry")
  @js.native
  class Entry protected () extends StObject {
    def this(relativePath: String, basePath: String, mode: Double, size: Double, mtime: Double) = this()
    
    var basePath: String = js.native
    
    def fullPath: String = js.native
    
    def isDirectory(): Boolean = js.native
    
    var mode: Double = js.native
    
    var mtime: Double = js.native
    
    var relativePath: String = js.native
    
    var size: Double = js.native
  }
  
  @JSImport("walk-sync", "entries")
  @js.native
  def entries(baseDir: String): js.Array[Entry] = js.native
  @JSImport("walk-sync", "entries")
  @js.native
  def entries(baseDir: String, inputOptions: js.Array[String | IMinimatch]): js.Array[Entry] = js.native
  @JSImport("walk-sync", "entries")
  @js.native
  def entries(baseDir: String, inputOptions: Options): js.Array[Entry] = js.native
  
  type Optionalize[T, K /* <: /* keyof T */ String */] = (Omit[T, K]) with (Partial[Pick[T, K]])
  
  @js.native
  trait Options extends StObject {
    
    var directories: js.UndefOr[Boolean] = js.native
    
    var fs: TypeoffsNode = js.native
    
    var globOptions: js.UndefOr[IOptions] = js.native
    
    var globs: js.UndefOr[js.Array[String | IMinimatch]] = js.native
    
    var ignore: js.UndefOr[js.Array[String | IMinimatch]] = js.native
    
    var includeBasePath: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(fs: TypeoffsNode): Options = {
      val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectories(value: Boolean): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      @scala.inline
      def setFs(value: TypeoffsNode): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobOptions(value: IOptions): Self = StObject.set(x, "globOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobOptionsUndefined: Self = StObject.set(x, "globOptions", js.undefined)
      
      @scala.inline
      def setGlobs(value: js.Array[String | IMinimatch]): Self = StObject.set(x, "globs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobsUndefined: Self = StObject.set(x, "globs", js.undefined)
      
      @scala.inline
      def setGlobsVarargs(value: (String | IMinimatch)*): Self = StObject.set(x, "globs", js.Array(value :_*))
      
      @scala.inline
      def setIgnore(value: js.Array[String | IMinimatch]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: (String | IMinimatch)*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setIncludeBasePath(value: Boolean): Self = StObject.set(x, "includeBasePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeBasePathUndefined: Self = StObject.set(x, "includeBasePath", js.undefined)
    }
  }
}
