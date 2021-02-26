package typingsSlinky.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressBlockEditor.alignmentToolbarMod.AlignmentToolbar.Props
import typingsSlinky.wordpressBlockEditor.anon.Align
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignmentToolbarMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/alignment-toolbar", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object AlignmentToolbar {
    
    @js.native
    trait Props extends StObject {
      
      var alignmentControls: js.UndefOr[js.Array[Align]] = js.native
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      def onChange(): Unit = js.native
      def onChange(newValue: String): Unit = js.native
      
      var value: js.UndefOr[String] = js.native
    }
  }
}
