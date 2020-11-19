package typingsSlinky.wordpressBlockEditor

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.wordpressBlockEditor.alignmentToolbarMod.AlignmentToolbar.Props
import typingsSlinky.wordpressBlockEditor.anon.Align
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/block-editor/components/alignment-toolbar", JSImport.Namespace)
@js.native
object alignmentToolbarMod extends js.Object {
  
  @js.native
  object AlignmentToolbar extends js.Object {
    
    @js.native
    trait Props extends js.Object {
      
      var alignmentControls: js.UndefOr[js.Array[Align]] = js.native
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      def onChange(): Unit = js.native
      def onChange(newValue: String): Unit = js.native
      
      var value: js.UndefOr[String] = js.native
    }
  }
  
  @js.native
  object default extends TopLevel[ReactComponentClass[Props]]
}
