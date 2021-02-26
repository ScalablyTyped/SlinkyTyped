package typingsSlinky.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressBlockEditor.blockAlignmentToolbarMod.BlockAlignmentToolbar.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockAlignmentToolbarMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/block-alignment-toolbar", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object BlockAlignmentToolbar {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.center
      - typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.full
      - typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.left
      - typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.right
      - typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.wide
    */
    trait Control extends StObject
    object Control {
      
      @scala.inline
      def center: typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.center = "center".asInstanceOf[typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.center]
      
      @scala.inline
      def full: typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.full = "full".asInstanceOf[typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.full]
      
      @scala.inline
      def left: typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.left = "left".asInstanceOf[typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.left]
      
      @scala.inline
      def right: typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.right = "right".asInstanceOf[typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.right]
      
      @scala.inline
      def wide: typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.wide = "wide".asInstanceOf[typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.wide]
    }
    
    @js.native
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      var controls: js.UndefOr[js.Array[Control]] = js.native
      
      var isCollapsed: js.UndefOr[Boolean] = js.native
      
      def onChange(): Unit = js.native
      def onChange(newValue: Control): Unit = js.native
      
      var value: js.UndefOr[Control] = js.native
    }
  }
}
