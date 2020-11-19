package typingsSlinky.storybookAddonKnobs

import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.Component
import typingsSlinky.storybookAddonKnobs.anon.OnChange
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-knobs/dist/components/types/Text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
  
  @js.native
  trait TextType
    extends Component[TextTypeProps, js.Object, js.Any] {
    
    def handleChange(event: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTextType(nextProps: TextTypeProps): Boolean = js.native
  }
  
  @js.native
  class default () extends TextType
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: TextTypeProps = js.native
    
    def deserialize(value: String): String = js.native
    
    var propTypes: OnChange = js.native
    
    def serialize(value: String): String = js.native
  }
  
  type TextTypeKnob = KnobControlConfig[TextTypeKnobValue]
  
  type TextTypeKnobValue = String
  
  type TextTypeProps = KnobControlProps[TextTypeKnobValue]
}
