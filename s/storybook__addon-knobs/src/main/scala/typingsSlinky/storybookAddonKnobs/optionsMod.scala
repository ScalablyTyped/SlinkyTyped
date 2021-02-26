package typingsSlinky.storybookAddonKnobs

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.std.NonNullable
import typingsSlinky.storybookAddonKnobs.anon.FnCall
import typingsSlinky.storybookAddonKnobs.anon.PartialOptionsTypePropsan
import typingsSlinky.storybookAddonKnobs.anon.WeakValidationMapOptionsT
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  /* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Options.OptionsTypeProps<any>> & {  serialize :{None <T>(value : T): T},   deserialize :{None <T>(value : T): T}} */
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Options", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[OptionsTypeProps[_]]): ReactElement | Null = js.native
    @JSImport("@storybook/addon-knobs/dist/components/types/Options", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[OptionsTypeProps[_]], context: js.Any): ReactElement | Null = js.native
    @JSImport("@storybook/addon-knobs/dist/components/types/Options", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Options", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Options", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialOptionsTypePropsan] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialOptionsTypePropsan]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Options", "default.deserialize")
    @js.native
    def deserialize: FnCall = js.native
    @scala.inline
    def deserialize_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Options", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Options", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapOptionsT] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapOptionsT]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Options", "default.serialize")
    @js.native
    def serialize: FnCall = js.native
    @scala.inline
    def serialize_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait OptionsKnobOptions extends StObject {
    
    var display: OptionsKnobOptionsDisplay = js.native
  }
  object OptionsKnobOptions {
    
    @scala.inline
    def apply(display: OptionsKnobOptionsDisplay): OptionsKnobOptions = {
      val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsKnobOptions]
    }
    
    @scala.inline
    implicit class OptionsKnobOptionsMutableBuilder[Self <: OptionsKnobOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: OptionsKnobOptionsDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.radio
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.`inline-radio`
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.check
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.`inline-check`
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.select
    - typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.`multi-select`
  */
  trait OptionsKnobOptionsDisplay extends StObject
  object OptionsKnobOptionsDisplay {
    
    @scala.inline
    def check: typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.check = "check".asInstanceOf[typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.check]
    
    @scala.inline
    def `inline-check`: typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.`inline-check` = "inline-check".asInstanceOf[typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.`inline-check`]
    
    @scala.inline
    def `inline-radio`: typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.`inline-radio` = "inline-radio".asInstanceOf[typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.`inline-radio`]
    
    @scala.inline
    def `multi-select`: typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.`multi-select` = "multi-select".asInstanceOf[typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.`multi-select`]
    
    @scala.inline
    def radio: typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.radio = "radio".asInstanceOf[typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.radio]
    
    @scala.inline
    def select: typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.select = "select".asInstanceOf[typingsSlinky.storybookAddonKnobs.storybookAddonKnobsStrings.select]
  }
  
  @js.native
  trait OptionsTypeKnob[T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */] extends KnobControlConfig[T] {
    
    var options: OptionsTypeOptionsProp[T] = js.native
    
    var optionsObj: OptionsKnobOptions = js.native
  }
  object OptionsTypeKnob {
    
    @scala.inline
    def apply[T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */](name: String, options: OptionsTypeOptionsProp[T], optionsObj: OptionsKnobOptions, value: T): OptionsTypeKnob[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], optionsObj = optionsObj.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsTypeKnob[T]]
    }
    
    @scala.inline
    implicit class OptionsTypeKnobMutableBuilder[Self <: OptionsTypeKnob[_], T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */] (val x: Self with OptionsTypeKnob[T]) extends AnyVal {
      
      @scala.inline
      def setOptions(value: OptionsTypeOptionsProp[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsObj(value: OptionsKnobOptions): Self = StObject.set(x, "optionsObj", value.asInstanceOf[js.Any])
    }
  }
  
  type OptionsTypeKnobSingleValue = js.UndefOr[String | Double | Null | (js.Array[Double | String])]
  
  type OptionsTypeKnobValue[T /* <: OptionsTypeKnobSingleValue */] = T | js.Array[NonNullable[T]]
  
  type OptionsTypeOptionsProp[T] = StringDictionary[T]
  
  @js.native
  trait OptionsTypeProps[T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */] extends KnobControlProps[T] {
    
    var display: OptionsKnobOptionsDisplay = js.native
    
    @JSName("knob")
    var knob_OptionsTypeProps: OptionsTypeKnob[T] = js.native
  }
  object OptionsTypeProps {
    
    @scala.inline
    def apply[T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */](display: OptionsKnobOptionsDisplay, knob: OptionsTypeKnob[T], onChange: T => T): OptionsTypeProps[T] = {
      val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[OptionsTypeProps[T]]
    }
    
    @scala.inline
    implicit class OptionsTypePropsMutableBuilder[Self <: OptionsTypeProps[_], T /* <: OptionsTypeKnobValue[OptionsTypeKnobSingleValue] */] (val x: Self with OptionsTypeProps[T]) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: OptionsKnobOptionsDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKnob(value: OptionsTypeKnob[T]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    }
  }
}
