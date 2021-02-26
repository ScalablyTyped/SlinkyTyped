package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.reResizable.mod.ResizableProps
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressComponents.resizableBoxMod.ResizableBox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizableBoxMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/resizable-box", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ResizableBox {
    
    type Props = ResizableProps
  }
}
