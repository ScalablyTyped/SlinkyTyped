package typingsSlinky.storybookUi

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.Dispatch
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.react.mod.SetStateAction
import typingsSlinky.storybookUi.sidebarTypesMod.CombinedDataset
import typingsSlinky.storybookUi.sidebarTypesMod.Highlight
import typingsSlinky.storybookUi.sidebarTypesMod.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useHighlightedMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/useHighlighted", "useHighlighted")
  @js.native
  def useHighlighted(hasContainerRefIsLoadingIsBrowsingDatasetSelected: HighlightedProps): js.Tuple3[Highlight, Dispatch[SetStateAction[Highlight]], MutableRefObject[Highlight]] = js.native
  
  @js.native
  trait HighlightedProps extends StObject {
    
    var containerRef: MutableRefObject[HTMLElement] = js.native
    
    var dataset: CombinedDataset = js.native
    
    var isBrowsing: Boolean = js.native
    
    var isLoading: Boolean = js.native
    
    var selected: Selection = js.native
  }
  object HighlightedProps {
    
    @scala.inline
    def apply(
      containerRef: MutableRefObject[HTMLElement],
      dataset: CombinedDataset,
      isBrowsing: Boolean,
      isLoading: Boolean
    ): HighlightedProps = {
      val __obj = js.Dynamic.literal(containerRef = containerRef.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], isBrowsing = isBrowsing.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightedProps]
    }
    
    @scala.inline
    implicit class HighlightedPropsMutableBuilder[Self <: HighlightedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerRef(value: MutableRefObject[HTMLElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataset(value: CombinedDataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBrowsing(value: Boolean): Self = StObject.set(x, "isBrowsing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Selection): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedNull: Self = StObject.set(x, "selected", null)
    }
  }
}
