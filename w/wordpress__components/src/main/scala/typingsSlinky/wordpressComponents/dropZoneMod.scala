package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.wordpressComponents.anon.X
import typingsSlinky.wordpressComponents.dropZoneMod.DropZone.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropZoneMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/drop-zone", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object DropZone {
    
    type HoverPosition = X | Null
    
    @js.native
    trait Props extends StObject {
      
      /**
        * A CSS class to be appended after the default components-drop-zone class.
        */
      var className: js.UndefOr[String] = js.native
      
      /**
        * A string to be shown within the drop zone area.
        * @defaultValue "Drop files to upload"
        */
      var label: js.UndefOr[String] = js.native
      
      /**
        * The function is generic drop handler called if the onFilesDrop or
        * onHTMLDrop are not called.
        *
        * @param event - Generic `onDrop` event.
        * @param position - Indicates whether the drop event happened closer
        *     to the top or bottom edges and left or right ones.
        */
      var onDrop: js.UndefOr[
            js.Function2[/* event */ DragEvent[HTMLDivElement], /* position */ HoverPosition, Unit]
          ] = js.native
      
      /**
        * The function is called when dropping a file into the DropZone.
        *
        * @param files - Array of dropped files.
        * @param position - Indicates whether the drop event happened closer
        *     to the top or bottom edges and left or right ones.
        */
      var onFilesDrop: js.UndefOr[js.Function2[/* files */ js.Array[File], /* position */ HoverPosition, Unit]] = js.native
      
      /**
        * The function is called when dropping an HTML file into the DropZone.
        *
        * @param html - The HTML string of the file being dropped.
        * @param position - Indicates whether the drop event happened closer
        *     to the top or bottom edges and left or right ones.
        */
      var onHTMLDrop: js.UndefOr[js.Function2[/* html */ String, /* position */ HoverPosition, Unit]] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        @scala.inline
        def setOnDrop(value: (/* event */ DragEvent[HTMLDivElement], /* position */ HoverPosition) => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
        
        @scala.inline
        def setOnFilesDrop(value: (/* files */ js.Array[File], /* position */ HoverPosition) => Unit): Self = StObject.set(x, "onFilesDrop", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnFilesDropUndefined: Self = StObject.set(x, "onFilesDrop", js.undefined)
        
        @scala.inline
        def setOnHTMLDrop(value: (/* html */ String, /* position */ HoverPosition) => Unit): Self = StObject.set(x, "onHTMLDrop", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnHTMLDropUndefined: Self = StObject.set(x, "onHTMLDrop", js.undefined)
      }
    }
  }
}
