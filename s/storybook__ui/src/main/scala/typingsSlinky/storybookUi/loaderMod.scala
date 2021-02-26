package typingsSlinky.storybookUi

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.storybookTheming.typesMod.Theme
import typingsSlinky.storybookUi.anon.PickDetailedHTMLPropsHTML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/Loader", "Contained")
  @js.native
  val Contained: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    PickDetailedHTMLPropsHTML, 
    Theme
  ] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/Loader", "Loader")
  @js.native
  val Loader: ReactComponentClass[LoaderProps] = js.native
  
  @js.native
  trait LoaderProps extends StObject {
    
    /**
      * The number of lines to display in the loader.
      * These are indented according to a pre-defined sequence of depths.
      */
    var size: Double = js.native
  }
  object LoaderProps {
    
    @scala.inline
    def apply(size: Double): LoaderProps = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoaderProps]
    }
    
    @scala.inline
    implicit class LoaderPropsMutableBuilder[Self <: LoaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
