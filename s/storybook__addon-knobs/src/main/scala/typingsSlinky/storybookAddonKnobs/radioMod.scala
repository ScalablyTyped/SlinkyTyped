package typingsSlinky.storybookAddonKnobs

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Validator
import typingsSlinky.std.Record
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioMod {
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Radio", JSImport.Default)
  @js.native
  class default () extends RadiosType
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Radio", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@storybook/addon-knobs/dist/components/types/Radio", "default.defaultProps")
    @js.native
    def defaultProps: RadiosTypeProps = js.native
    @scala.inline
    def defaultProps_=(x: RadiosTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@storybook/addon-knobs/dist/components/types/Radio", "default.deserialize")
    @js.native
    def deserialize: js.Function1[/* value */ RadiosTypeKnobValue, js.UndefOr[String | Double | Null]] = js.native
    @scala.inline
    def deserialize_=(x: js.Function1[/* value */ RadiosTypeKnobValue, js.UndefOr[String | Double | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("@storybook/addon-knobs/dist/components/types/Radio", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@storybook/addon-knobs/dist/components/types/Radio", "default.propTypes.isInline")
      @js.native
      def isInline: Validator[Boolean] = js.native
      @scala.inline
      def isInline_=(x: Validator[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInline")(x.asInstanceOf[js.Any])
      
      @JSImport("@storybook/addon-knobs/dist/components/types/Radio", "default.propTypes.knob")
      @js.native
      def knob: Validator[RadiosTypeKnob] = js.native
      @scala.inline
      def knob_=(x: Validator[RadiosTypeKnob]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("knob")(x.asInstanceOf[js.Any])
      
      @JSImport("@storybook/addon-knobs/dist/components/types/Radio", "default.propTypes.onChange")
      @js.native
      def onChange: Validator[
            js.Function1[/* value */ js.UndefOr[String | Double | Null], js.UndefOr[String | Double | Null]]
          ] = js.native
      @scala.inline
      def onChange_=(
        x: Validator[
              js.Function1[/* value */ js.UndefOr[String | Double | Null], js.UndefOr[String | Double | Null]]
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("@storybook/addon-knobs/dist/components/types/Radio", "default.serialize")
    @js.native
    def serialize: js.Function1[/* value */ RadiosTypeKnobValue, js.UndefOr[String | Double | Null]] = js.native
    @scala.inline
    def serialize_=(x: js.Function1[/* value */ RadiosTypeKnobValue, js.UndefOr[String | Double | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait RadiosType
    extends Component[RadiosTypeProps, js.Object, js.Any] {
    
    var renderRadioButton: js.Any = js.native
    
    var renderRadioButtonList: js.Any = js.native
  }
  
  @js.native
  trait RadiosTypeKnob extends KnobControlConfig[RadiosTypeKnobValue] {
    
    var options: RadiosTypeOptionsProp[RadiosTypeKnobValue] = js.native
  }
  object RadiosTypeKnob {
    
    @scala.inline
    def apply(name: String, options: RadiosTypeOptionsProp[RadiosTypeKnobValue]): RadiosTypeKnob = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadiosTypeKnob]
    }
    
    @scala.inline
    implicit class RadiosTypeKnobMutableBuilder[Self <: RadiosTypeKnob] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: RadiosTypeOptionsProp[RadiosTypeKnobValue]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  type RadiosTypeKnobValue = js.UndefOr[String | Double | Null]
  
  type RadiosTypeOptionsProp[T /* <: RadiosTypeKnobValue */] = Record[String | Double, T]
  
  @js.native
  trait RadiosTypeProps
    extends KnobControlProps[RadiosTypeKnobValue]
       with RadiosWrapperProps {
    
    @JSName("knob")
    var knob_RadiosTypeProps: RadiosTypeKnob = js.native
  }
  object RadiosTypeProps {
    
    @scala.inline
    def apply(isInline: Boolean, knob: RadiosTypeKnob, onChange: RadiosTypeKnobValue => RadiosTypeKnobValue): RadiosTypeProps = {
      val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[RadiosTypeProps]
    }
    
    @scala.inline
    implicit class RadiosTypePropsMutableBuilder[Self <: RadiosTypeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKnob(value: RadiosTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RadiosWrapperProps extends StObject {
    
    var isInline: Boolean = js.native
  }
  object RadiosWrapperProps {
    
    @scala.inline
    def apply(isInline: Boolean): RadiosWrapperProps = {
      val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadiosWrapperProps]
    }
    
    @scala.inline
    implicit class RadiosWrapperPropsMutableBuilder[Self <: RadiosWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    }
  }
}
