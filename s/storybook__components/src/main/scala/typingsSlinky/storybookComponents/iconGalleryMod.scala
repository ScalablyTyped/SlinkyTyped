package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconGalleryMod {
  
  @JSImport("@storybook/components/dist/blocks/IconGallery", "IconGallery")
  @js.native
  val IconGallery: ReactComponentClass[js.Object] = js.native
  
  @JSImport("@storybook/components/dist/blocks/IconGallery", "IconItem")
  @js.native
  val IconItem: ReactComponentClass[IconItemProps] = js.native
  
  @js.native
  trait IconItemProps extends StObject {
    
    var name: String = js.native
  }
  object IconItemProps {
    
    @scala.inline
    def apply(name: String): IconItemProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconItemProps]
    }
    
    @scala.inline
    implicit class IconItemPropsMutableBuilder[Self <: IconItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
