package typingsSlinky.walk

import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.walk.walkStrings.FIFO
import typingsSlinky.walk.walkStrings.blockDevice
import typingsSlinky.walk.walkStrings.characterDevice
import typingsSlinky.walk.walkStrings.directory
import typingsSlinky.walk.walkStrings.end
import typingsSlinky.walk.walkStrings.file
import typingsSlinky.walk.walkStrings.names
import typingsSlinky.walk.walkStrings.socket
import typingsSlinky.walk.walkStrings.symbolicLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("walk", "walk")
  @js.native
  def walk(path: String): Walker = js.native
  @JSImport("walk", "walk")
  @js.native
  def walk(path: String, options: WalkOptions): Walker = js.native
  
  @JSImport("walk", "walkSync")
  @js.native
  def walkSync(path: String): Walker = js.native
  @JSImport("walk", "walkSync")
  @js.native
  def walkSync(path: String, options: WalkOptions): Walker = js.native
  
  type WalkNamesEventCallback = js.Function3[/* base */ String, /* names */ js.Array[String], /* next */ WalkNext, Unit]
  
  type WalkNext = js.Function0[Unit]
  
  @js.native
  trait WalkOptions extends StObject {
    
    var filters: js.UndefOr[js.Array[String]] = js.native
    
    var followLinks: js.UndefOr[Boolean] = js.native
    
    var listeners: js.UndefOr[WalkOptionsListeners] = js.native
  }
  object WalkOptions {
    
    @scala.inline
    def apply(): WalkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkOptions]
    }
    
    @scala.inline
    implicit class WalkOptionsMutableBuilder[Self <: WalkOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[String]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: String*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setFollowLinks(value: Boolean): Self = StObject.set(x, "followLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowLinksUndefined: Self = StObject.set(x, "followLinks", js.undefined)
      
      @scala.inline
      def setListeners(value: WalkOptionsListeners): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    }
  }
  
  @js.native
  trait WalkOptionsListeners extends StObject {
    
    var directories: js.UndefOr[WalkStatArrayEventCallback] = js.native
    
    var directory: js.UndefOr[WalkStatEventCallback] = js.native
    
    var directoryError: js.UndefOr[WalkStatArrayEventCallback] = js.native
    
    var end: js.UndefOr[WalkStatArrayEventCallback] = js.native
    
    var errors: js.UndefOr[WalkStatArrayEventCallback] = js.native
    
    var file: js.UndefOr[WalkStatEventCallback] = js.native
    
    var files: js.UndefOr[WalkStatArrayEventCallback] = js.native
    
    var names: js.UndefOr[WalkNamesEventCallback] = js.native
    
    var nodeError: js.UndefOr[WalkStatArrayEventCallback] = js.native
  }
  object WalkOptionsListeners {
    
    @scala.inline
    def apply(): WalkOptionsListeners = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkOptionsListeners]
    }
    
    @scala.inline
    implicit class WalkOptionsListenersMutableBuilder[Self <: WalkOptionsListeners] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectories(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = StObject.set(x, "directories", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      @scala.inline
      def setDirectory(value: (/* base */ String, /* names */ WalkStats, /* next */ WalkNext) => Unit): Self = StObject.set(x, "directory", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDirectoryError(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = StObject.set(x, "directoryError", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDirectoryErrorUndefined: Self = StObject.set(x, "directoryError", js.undefined)
      
      @scala.inline
      def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      @scala.inline
      def setEnd(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = StObject.set(x, "end", js.Any.fromFunction3(value))
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setErrors(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = StObject.set(x, "errors", js.Any.fromFunction3(value))
      
      @scala.inline
      def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      @scala.inline
      def setFile(value: (/* base */ String, /* names */ WalkStats, /* next */ WalkNext) => Unit): Self = StObject.set(x, "file", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setFiles(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = StObject.set(x, "files", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setNames(value: (/* base */ String, /* names */ js.Array[String], /* next */ WalkNext) => Unit): Self = StObject.set(x, "names", js.Any.fromFunction3(value))
      
      @scala.inline
      def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
      
      @scala.inline
      def setNodeError(value: (/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext) => Unit): Self = StObject.set(x, "nodeError", js.Any.fromFunction3(value))
      
      @scala.inline
      def setNodeErrorUndefined: Self = StObject.set(x, "nodeError", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.walk.walkStrings.files
    - typingsSlinky.walk.walkStrings.directories
    - typingsSlinky.walk.walkStrings.errors
    - typingsSlinky.walk.walkStrings.nodeError
    - typingsSlinky.walk.walkStrings.directoryError
  */
  trait WalkStatArrayEvent extends StObject
  object WalkStatArrayEvent {
    
    @scala.inline
    def directories: typingsSlinky.walk.walkStrings.directories = "directories".asInstanceOf[typingsSlinky.walk.walkStrings.directories]
    
    @scala.inline
    def directoryError: typingsSlinky.walk.walkStrings.directoryError = "directoryError".asInstanceOf[typingsSlinky.walk.walkStrings.directoryError]
    
    @scala.inline
    def errors: typingsSlinky.walk.walkStrings.errors = "errors".asInstanceOf[typingsSlinky.walk.walkStrings.errors]
    
    @scala.inline
    def files: typingsSlinky.walk.walkStrings.files = "files".asInstanceOf[typingsSlinky.walk.walkStrings.files]
    
    @scala.inline
    def nodeError: typingsSlinky.walk.walkStrings.nodeError = "nodeError".asInstanceOf[typingsSlinky.walk.walkStrings.nodeError]
  }
  
  type WalkStatArrayEventCallback = js.Function3[/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.walk.walkStrings.file
    - typingsSlinky.walk.walkStrings.directory
  */
  trait WalkStatEvent extends StObject
  object WalkStatEvent {
    
    @scala.inline
    def directory: typingsSlinky.walk.walkStrings.directory = "directory".asInstanceOf[typingsSlinky.walk.walkStrings.directory]
    
    @scala.inline
    def file: typingsSlinky.walk.walkStrings.file = "file".asInstanceOf[typingsSlinky.walk.walkStrings.file]
  }
  
  type WalkStatEventCallback = js.Function3[/* base */ String, /* names */ WalkStats, /* next */ WalkNext, Unit]
  
  @js.native
  trait WalkStats extends Stats {
    
    var error: js.UndefOr[ErrnoException] = js.native
    
    var name: String = js.native
    
    var `type`: file | directory | symbolicLink | blockDevice | characterDevice | FIFO | socket = js.native
  }
  
  @js.native
  trait Walker extends StObject {
    
    def on(event: WalkStatArrayEvent, cb: WalkStatArrayEventCallback): Unit = js.native
    def on(event: WalkStatEvent, cb: WalkStatEventCallback): Unit = js.native
    @JSName("on")
    def on_end(event: end, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_names(event: names, cb: WalkNamesEventCallback): Unit = js.native
    
    def pause(): Unit = js.native
    
    def resume(): Unit = js.native
  }
}
