package typingsSlinky.wordpressNux

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressNux.anon.TypeofimportedActions
import typingsSlinky.wordpressNux.anon.TypeofimportedSelectors
import typingsSlinky.wordpressNux.dotTipMod.DotTip.Props
import typingsSlinky.wordpressNux.wordpressNuxStrings.coreSlashnux
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object DotTip extends Shortcut {
    
    @JSImport("@wordpress/nux", "DotTip")
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `DotTip.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  /* augmented module */
  object wordpressDataAugmentingMod {
    
    @JSImport("@wordpress/data", "dispatch")
    @js.native
    def dispatch_corenux(key: coreSlashnux): TypeofimportedActions = js.native
    
    @JSImport("@wordpress/data", "select")
    @js.native
    def select_corenux(key: coreSlashnux): TypeofimportedSelectors = js.native
  }
}
