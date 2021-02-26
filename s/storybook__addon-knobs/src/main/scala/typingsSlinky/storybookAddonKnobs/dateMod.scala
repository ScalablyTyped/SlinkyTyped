package typingsSlinky.storybookAddonKnobs

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.Component
import typingsSlinky.storybookAddonKnobs.anon.KnobOnChange
import typingsSlinky.storybookAddonKnobs.anon.Valid
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Date", JSImport.Default)
  @js.native
  class default () extends DateType
  /* static members */
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Date", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Date", "default.defaultProps")
    @js.native
    def defaultProps: DateTypeProps = js.native
    @scala.inline
    def defaultProps_=(x: DateTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Date", "default.deserialize")
    @js.native
    def deserialize(value: DateTypeKnobValue): Double = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Date", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(): Valid = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Date", "default.propTypes")
    @js.native
    def propTypes: KnobOnChange = js.native
    @scala.inline
    def propTypes_=(x: KnobOnChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Date", "default.serialize")
    @js.native
    def serialize(value: DateTypeKnobValue): Double = js.native
  }
  
  @js.native
  trait DateType
    extends Component[DateTypeProps, DateTypeState, js.Any] {
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDateType(): Unit = js.native
    
    var dateInput: HTMLInputElement = js.native
    
    var onDateChange: js.Any = js.native
    
    var onTimeChange: js.Any = js.native
    
    var timeInput: HTMLInputElement = js.native
  }
  
  type DateTypeKnob = KnobControlConfig[DateTypeKnobValue]
  
  type DateTypeKnobValue = Double
  
  type DateTypeProps = KnobControlProps[DateTypeKnobValue]
  
  @js.native
  trait DateTypeState extends StObject {
    
    var valid: js.UndefOr[Boolean] = js.native
  }
  object DateTypeState {
    
    @scala.inline
    def apply(): DateTypeState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTypeState]
    }
    
    @scala.inline
    implicit class DateTypeStateMutableBuilder[Self <: DateTypeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
}
