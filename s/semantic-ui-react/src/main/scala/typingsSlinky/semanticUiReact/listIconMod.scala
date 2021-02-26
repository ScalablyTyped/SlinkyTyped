package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticUiReact.iconIconMod.StrictIconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listIconMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/List/ListIcon", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ListIconProps] = js.native
  
  @js.native
  trait ListIconProps
    extends StrictListIconProps
       with /* key */ StringDictionary[js.Any]
  object ListIconProps {
    
    @scala.inline
    def apply(): ListIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListIconProps]
    }
  }
  
  @js.native
  trait StrictListIconProps extends StrictIconProps {
    
    /** An element inside a list can be vertically aligned. */
    var verticalAlign: js.UndefOr[SemanticVERTICALALIGNMENTS] = js.native
  }
  object StrictListIconProps {
    
    @scala.inline
    def apply(): StrictListIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictListIconProps]
    }
    
    @scala.inline
    implicit class StrictListIconPropsMutableBuilder[Self <: StrictListIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVerticalAlign(value: SemanticVERTICALALIGNMENTS): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ListIconProps]
  
  /* This means you don't have to write `default`, but can instead just say `listIconMod.foo` */
  override def _to: ReactComponentClass[ListIconProps] = default
}
