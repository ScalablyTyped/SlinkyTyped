package typingsSlinky.storybookAddonA11y

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visionDeficiencyMod {
  
  @JSImport("@storybook/addon-a11y/dist/components/VisionDeficiency", "VisionDeficiency")
  @js.native
  val VisionDeficiency: ReactComponentClass[js.Object] = js.native
  
  @js.native
  trait Link extends StObject {
    
    var active: Boolean = js.native
    
    var id: String = js.native
    
    def onClick(): Unit = js.native
    
    var right: js.UndefOr[ReactElement] = js.native
    
    var title: ReactElement = js.native
  }
  object Link {
    
    @scala.inline
    def apply(active: Boolean, id: String, onClick: () => Unit): Link = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick))
      __obj.asInstanceOf[Link]
    }
    
    @scala.inline
    implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRight(value: ReactElement): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightReactElement(value: ReactElement): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
