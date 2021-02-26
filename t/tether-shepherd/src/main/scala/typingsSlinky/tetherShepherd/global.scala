package typingsSlinky.tetherShepherd

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.tetherShepherd.TetherShepherd.IShepherdTour
import typingsSlinky.tetherShepherd.TetherShepherd.IShepherdTourOptions
import typingsSlinky.tetherShepherd.TetherShepherd.ShepherdStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Shepherd extends Shortcut {
    
    @JSGlobal("Shepherd")
    @js.native
    val ^ : ShepherdStatic = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Shepherd.Tour")
    @js.native
    class Tour () extends IShepherdTour {
      def this(options: IShepherdTourOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Shepherd.activeTour")
    @js.native
    class activeTour () extends IShepherdTour {
      def this(options: IShepherdTourOptions) = this()
    }
    
    type _To = ShepherdStatic
    
    /* This means you don't have to write `^`, but can instead just say `Shepherd.foo` */
    override def _to: ShepherdStatic = ^
  }
}
