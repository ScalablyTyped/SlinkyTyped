package typingsSlinky.viewerjs

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.viewerjs.Viewer.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("viewerjs", JSImport.Default)
  @js.native
  class default protected () extends Viewer {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: Options) = this()
  }
  object default {
    
    @JSImport("viewerjs", "default.ToolbarButtonSize")
    @js.native
    object ToolbarButtonSize extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.viewerjs.Viewer.ToolbarButtonSize with String] = js.native
      
      /* "large" */ val Large: typingsSlinky.viewerjs.Viewer.ToolbarButtonSize.Large with String = js.native
      
      /* "medium" */ val Medium: typingsSlinky.viewerjs.Viewer.ToolbarButtonSize.Medium with String = js.native
      
      /* "small" */ val Small: typingsSlinky.viewerjs.Viewer.ToolbarButtonSize.Small with String = js.native
    }
    
    @JSImport("viewerjs", "default.Visibility")
    @js.native
    object Visibility extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.viewerjs.Viewer.Visibility with Double] = js.native
      
      /* 0 */ val Hidden: typingsSlinky.viewerjs.Viewer.Visibility.Hidden with Double = js.native
      
      /* 1 */ val Visible: typingsSlinky.viewerjs.Viewer.Visibility.Visible with Double = js.native
      
      /* 4 */ val VisibleOnExtraLargeOrWiderScreen: typingsSlinky.viewerjs.Viewer.Visibility.VisibleOnExtraLargeOrWiderScreen with Double = js.native
      
      /* 3 */ val VisibleOnLargeOrWiderScreen: typingsSlinky.viewerjs.Viewer.Visibility.VisibleOnLargeOrWiderScreen with Double = js.native
      
      /* 2 */ val VisibleOnMediumOrWiderScreen: typingsSlinky.viewerjs.Viewer.Visibility.VisibleOnMediumOrWiderScreen with Double = js.native
    }
    
    /* static member */
    @JSImport("viewerjs", "default.noConflict")
    @js.native
    def noConflict(): Viewer = js.native
    
    /* static member */
    @JSImport("viewerjs", "default.setDefaults")
    @js.native
    def setDefaults(options: Options): Unit = js.native
  }
}
