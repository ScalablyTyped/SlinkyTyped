package typingsSlinky.viewerjs

import org.scalajs.dom.raw.Element
import typingsSlinky.viewerjs.Viewer.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class Viewer protected ()
    extends typingsSlinky.viewerjs.Viewer {
    def this(element: Element) = this()
    def this(element: Element, options: Options) = this()
  }
  /* static members */
  @js.native
  object Viewer extends js.Object {
    
    def noConflict(): typingsSlinky.viewerjs.Viewer = js.native
    
    def setDefaults(options: Options): Unit = js.native
    
    @js.native
    object ToolbarButtonSize extends js.Object {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsSlinky.viewerjs.Viewer.ToolbarButtonSize with String] = js.native
      
      /* "large" */ val Large: typingsSlinky.viewerjs.Viewer.ToolbarButtonSize.Large with String = js.native
      
      /* "medium" */ val Medium: typingsSlinky.viewerjs.Viewer.ToolbarButtonSize.Medium with String = js.native
      
      /* "small" */ val Small: typingsSlinky.viewerjs.Viewer.ToolbarButtonSize.Small with String = js.native
    }
    
    @js.native
    object Visibility extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.viewerjs.Viewer.Visibility with Double] = js.native
      
      /* 0 */ val Hidden: typingsSlinky.viewerjs.Viewer.Visibility.Hidden with Double = js.native
      
      /* 1 */ val Visible: typingsSlinky.viewerjs.Viewer.Visibility.Visible with Double = js.native
      
      /* 4 */ val VisibleOnExtraLargeOrWiderScreen: typingsSlinky.viewerjs.Viewer.Visibility.VisibleOnExtraLargeOrWiderScreen with Double = js.native
      
      /* 3 */ val VisibleOnLargeOrWiderScreen: typingsSlinky.viewerjs.Viewer.Visibility.VisibleOnLargeOrWiderScreen with Double = js.native
      
      /* 2 */ val VisibleOnMediumOrWiderScreen: typingsSlinky.viewerjs.Viewer.Visibility.VisibleOnMediumOrWiderScreen with Double = js.native
    }
  }
}
