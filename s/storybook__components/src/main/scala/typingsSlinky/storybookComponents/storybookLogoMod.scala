package typingsSlinky.storybookComponents

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storybookLogoMod {
  
  @JSImport("@storybook/components/dist/brand/StorybookLogo", "StorybookLogo")
  @js.native
  val StorybookLogo: ReactComponentClass[StorybookLogoProps] = js.native
  
  @js.native
  trait StorybookLogoProps extends StObject {
    
    var alt: String = js.native
  }
  object StorybookLogoProps {
    
    @scala.inline
    def apply(alt: String): StorybookLogoProps = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorybookLogoProps]
    }
    
    @scala.inline
    implicit class StorybookLogoPropsMutableBuilder[Self <: StorybookLogoProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    }
  }
}
