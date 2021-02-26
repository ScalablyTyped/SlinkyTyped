package typingsSlinky.viewerjs

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.viewerjs.Viewer.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Viewer")
  @js.native
  class Viewer protected ()
    extends typingsSlinky.viewerjs.Viewer {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: Options) = this()
  }
  object Viewer {
    
    @JSGlobal("Viewer.ToolbarButtonSize")
    @js.native
    object ToolbarButtonSize extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.viewerjs.Viewer.ToolbarButtonSize with String] = js.native
      
      /* "large" */ val Large: typingsSlinky.viewerjs.Viewer.ToolbarButtonSize.Large with String = js.native
      
      /* "medium" */ val Medium: typingsSlinky.viewerjs.Viewer.ToolbarButtonSize.Medium with String = js.native
      
      /* "small" */ val Small: typingsSlinky.viewerjs.Viewer.ToolbarButtonSize.Small with String = js.native
    }
    
    @JSGlobal("Viewer.Visibility")
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
    @JSGlobal("Viewer.noConflict")
    @js.native
    def noConflict(): typingsSlinky.viewerjs.Viewer = js.native
    
    /* static member */
    @JSGlobal("Viewer.setDefaults")
    @js.native
    def setDefaults(options: Options): Unit = js.native
  }
}
