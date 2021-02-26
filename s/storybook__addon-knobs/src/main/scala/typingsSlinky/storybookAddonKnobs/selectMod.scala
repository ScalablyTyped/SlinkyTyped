package typingsSlinky.storybookAddonKnobs

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.std.Extract
import typingsSlinky.std.PropertyKey
import typingsSlinky.std.Record
import typingsSlinky.storybookAddonKnobs.anon.PartialSelectTypePropsSel
import typingsSlinky.storybookAddonKnobs.anon.WeakValidationMapSelectTy
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typingsSlinky.storybookAddonKnobs.typesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  /* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeProps<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>> & {  serialize :(value : @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue): @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue,   deserialize :(value : @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue): @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue} */
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Select", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[SelectTypeProps[SelectTypeKnobValue]]): ReactElement | Null = js.native
    @JSImport("@storybook/addon-knobs/dist/components/types/Select", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[SelectTypeProps[SelectTypeKnobValue]], context: js.Any): ReactElement | Null = js.native
    @JSImport("@storybook/addon-knobs/dist/components/types/Select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Select", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Select", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialSelectTypePropsSel] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialSelectTypePropsSel]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Select", "default.deserialize")
    @js.native
    def deserialize: js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue] = js.native
    @scala.inline
    def deserialize_=(x: js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Select", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Select", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapSelectTy] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapSelectTy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Select", "default.serialize")
    @js.native
    def serialize: js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue] = js.native
    @scala.inline
    def serialize_=(x: js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SelectTypeKnob[T /* <: SelectTypeKnobValue */] extends KnobControlConfig[T] {
    
    var options: SelectTypeOptionsProp[T] = js.native
  }
  object SelectTypeKnob {
    
    @scala.inline
    def apply[T /* <: SelectTypeKnobValue */](name: String, options: SelectTypeOptionsProp[T], value: T): SelectTypeKnob[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectTypeKnob[T]]
    }
    
    @scala.inline
    implicit class SelectTypeKnobMutableBuilder[Self <: SelectTypeKnob[_], T /* <: SelectTypeKnobValue */] (val x: Self with SelectTypeKnob[T]) extends AnyVal {
      
      @scala.inline
      def setOptions(value: SelectTypeOptionsProp[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
  
  type SelectTypeKnobValue = js.UndefOr[String | Double | Boolean | Null | js.Array[PropertyKey]]
  
  type SelectTypeOptionsProp[T /* <: SelectTypeKnobValue */] = (Record[
    (Extract[T, PropertyKey]) | PropertyKey, 
    (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
  ]) | js.Array[T]
  
  @js.native
  trait SelectTypeProps[T /* <: SelectTypeKnobValue */] extends KnobControlProps[T] {
    
    @JSName("knob")
    var knob_SelectTypeProps: SelectTypeKnob[T] = js.native
  }
  object SelectTypeProps {
    
    @scala.inline
    def apply[T /* <: SelectTypeKnobValue */](knob: SelectTypeKnob[T], onChange: T => T): SelectTypeProps[T] = {
      val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[SelectTypeProps[T]]
    }
    
    @scala.inline
    implicit class SelectTypePropsMutableBuilder[Self <: SelectTypeProps[_], T /* <: SelectTypeKnobValue */] (val x: Self with SelectTypeProps[T]) extends AnyVal {
      
      @scala.inline
      def setKnob(value: SelectTypeKnob[T]): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    }
  }
}
