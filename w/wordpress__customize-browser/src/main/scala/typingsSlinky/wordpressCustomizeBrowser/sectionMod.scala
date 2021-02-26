package typingsSlinky.wordpressCustomizeBrowser

import typingsSlinky.wordpressCustomizeBrowser.containerMod.Container
import typingsSlinky.wordpressCustomizeBrowser.containerMod.ContainerParams
import typingsSlinky.wordpressCustomizeBrowser.controlMod.Control
import typingsSlinky.wordpressCustomizeBrowser.valueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sectionMod {
  
  @JSImport("@wordpress/customize-browser/Section", "Section")
  @js.native
  class Section protected () extends Container {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def attachEvents(): Unit = js.native
    
    var containerPaneParent: String = js.native
    
    var containerParent: String = js.native
    
    def controls(): js.Array[Control] = js.native
    
    def embed(): Unit = js.native
    
    var id: String = js.native
    
    def initialize(id: js.UndefOr[scala.Nothing], options: SectionParams): Unit = js.native
    def initialize(id: String, options: SectionParams): Unit = js.native
    
    var panel: Value[String] = js.native
  }
  
  @js.native
  trait SectionParams extends ContainerParams {
    
    var customizeAction: js.UndefOr[String] = js.native
    
    var panel: js.UndefOr[String | Null] = js.native
  }
  object SectionParams {
    
    @scala.inline
    def apply(title: String): SectionParams = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SectionParams]
    }
    
    @scala.inline
    implicit class SectionParamsMutableBuilder[Self <: SectionParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomizeAction(value: String): Self = StObject.set(x, "customizeAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomizeActionUndefined: Self = StObject.set(x, "customizeAction", js.undefined)
      
      @scala.inline
      def setPanel(value: String): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelNull: Self = StObject.set(x, "panel", null)
      
      @scala.inline
      def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    }
  }
}
