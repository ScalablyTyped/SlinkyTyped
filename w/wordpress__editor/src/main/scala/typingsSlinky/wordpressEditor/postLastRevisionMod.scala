package typingsSlinky.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressEditor.postLastRevisionMod.PostLastRevision.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postLastRevisionMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/post-last-revision", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PostLastRevision {
    
    @js.native
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.native
    }
  }
}
