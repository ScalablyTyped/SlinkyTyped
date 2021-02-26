package typingsSlinky.storybookComponents

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.overlayscrollbars.mod.Extensions
import typingsSlinky.overlayscrollbars.mod.Options
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayScrollbarsComponentMod {
  
  @JSImport("@storybook/components/dist/ScrollArea/OverlayScrollbarsComponent", "OverlayScrollbarsComponent")
  @js.native
  val OverlayScrollbarsComponent: ReactComponentClass[OverlayScrollbarsComponentProps] = js.native
  
  @js.native
  trait OverlayScrollbarsComponentProps extends HTMLAttributes[HTMLDivElement] {
    
    @JSName("children")
    var children_OverlayScrollbarsComponentProps: js.UndefOr[js.Any] = js.native
    
    var extensions: js.UndefOr[Extensions] = js.native
    
    var options: js.UndefOr[Options] = js.native
  }
  object OverlayScrollbarsComponentProps {
    
    @scala.inline
    def apply(): OverlayScrollbarsComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlayScrollbarsComponentProps]
    }
    
    @scala.inline
    implicit class OverlayScrollbarsComponentPropsMutableBuilder[Self <: OverlayScrollbarsComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setExtensions(value: Extensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
