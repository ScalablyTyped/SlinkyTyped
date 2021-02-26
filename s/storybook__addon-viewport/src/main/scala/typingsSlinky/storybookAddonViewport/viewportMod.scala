package typingsSlinky.storybookAddonViewport

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.storybookAddonViewport.storybookAddonViewportStrings.desktop
import typingsSlinky.storybookAddonViewport.storybookAddonViewportStrings.mobile
import typingsSlinky.storybookAddonViewport.storybookAddonViewportStrings.other
import typingsSlinky.storybookAddonViewport.storybookAddonViewportStrings.tablet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewportMod {
  
  type Styles = ViewportStyles | (js.Function1[/* s */ ViewportStyles, ViewportStyles]) | Null
  
  @js.native
  trait Viewport extends StObject {
    
    var name: String = js.native
    
    var styles: Styles = js.native
    
    var `type`: desktop | mobile | tablet | other = js.native
  }
  object Viewport {
    
    @scala.inline
    def apply(name: String, `type`: desktop | mobile | tablet | other): Viewport = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Viewport]
    }
    
    @scala.inline
    implicit class ViewportMutableBuilder[Self <: Viewport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyles(value: Styles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: /* s */ ViewportStyles => ViewportStyles): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesNull: Self = StObject.set(x, "styles", null)
      
      @scala.inline
      def setType(value: desktop | mobile | tablet | other): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ViewportMap = StringDictionary[Viewport]
  
  @js.native
  trait ViewportStyles extends StObject {
    
    var height: String = js.native
    
    var width: String = js.native
  }
  object ViewportStyles {
    
    @scala.inline
    def apply(height: String, width: String): ViewportStyles = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewportStyles]
    }
    
    @scala.inline
    implicit class ViewportStylesMutableBuilder[Self <: ViewportStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
