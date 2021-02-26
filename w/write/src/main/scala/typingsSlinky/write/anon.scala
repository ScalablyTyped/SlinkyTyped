package typingsSlinky.write

import typingsSlinky.node.anon.EmitClose
import typingsSlinky.node.fsMod.Mode
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): WriteStream = js.native
    def apply(path: PathLike, options: String): WriteStream = js.native
    def apply(path: PathLike, options: EmitClose): WriteStream = js.native
  }
  
  /* Inlined std.Omit<node.fs.MakeDirectoryOptions, 'recursive'> */
  @js.native
  trait OmitMakeDirectoryOptionsr extends StObject {
    
    var mode: js.UndefOr[Mode] = js.native
  }
  object OmitMakeDirectoryOptionsr {
    
    @scala.inline
    def apply(): OmitMakeDirectoryOptionsr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitMakeDirectoryOptionsr]
    }
    
    @scala.inline
    implicit class OmitMakeDirectoryOptionsrMutableBuilder[Self <: OmitMakeDirectoryOptionsr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
