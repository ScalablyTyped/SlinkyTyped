package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.semanticUiReact.checkboxCheckboxMod.StrictCheckboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioRadioMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Radio/Radio", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RadioProps] = js.native
  
  @js.native
  trait RadioProps
    extends StrictRadioProps
       with /* key */ StringDictionary[js.Any]
  object RadioProps {
    
    @scala.inline
    def apply(): RadioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioProps]
    }
  }
  
  @js.native
  trait StrictRadioProps extends StrictCheckboxProps
  object StrictRadioProps {
    
    @scala.inline
    def apply(): StrictRadioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictRadioProps]
    }
  }
  
  type _To = ReactComponentClass[RadioProps]
  
  /* This means you don't have to write `default`, but can instead just say `radioRadioMod.foo` */
  override def _to: ReactComponentClass[RadioProps] = default
}
