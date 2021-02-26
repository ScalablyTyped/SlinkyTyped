package typingsSlinky.uifabricFoundation

import slinky.core.ReactComponentClass
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.std.Required
import typingsSlinky.std.ReturnType
import typingsSlinky.uifabricFoundation.libIcomponentMod.IFactoryOptions
import typingsSlinky.uifabricFoundation.libIcomponentMod.IStateComponentType
import typingsSlinky.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlotDefinition
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlots
import typingsSlinky.uifabricFoundation.libIslotsMod.ISlottableProps
import typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object icomponentMod {
  
  /* Inlined std.Required<@uifabric/foundation.@uifabric/foundation/lib/next/IComponent.IComponentOptions<TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics>> */
  @js.native
  trait IComponent[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics] extends StObject {
    
    var displayName: String = js.native
    
    var factoryOptions: IFactoryOptions[TComponentProps] = js.native
    
    var fields: js.Array[String] = js.native
    
    var slots: ISlotComponent[TComponentProps, TComponentSlots] = js.native
    
    var state: IStateComponentType[TComponentProps, TViewProps] = js.native
    
    var statics: TStatics = js.native
    
    var styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet] = js.native
    
    var tokens: ITokenFunctionOrObject[TViewProps, TTokens] = js.native
    
    var view: IViewComponent[TViewProps, TComponentSlots] = js.native
  }
  object IComponent {
    
    @scala.inline
    def apply[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics](
      displayName: String,
      factoryOptions: IFactoryOptions[TComponentProps],
      fields: js.Array[String],
      slots: ISlotComponent[TComponentProps, TComponentSlots],
      state: TComponentProps => TViewProps,
      statics: TStatics,
      styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet],
      tokens: ITokenFunctionOrObject[TViewProps, TTokens],
      view: (/* props */ PropsWithChildren[TViewProps], /* slots */ ISlots[Required[TComponentSlots]]) => ReturnType[ReactComponentClass[js.Object]]
    ): IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], factoryOptions = factoryOptions.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], state = js.Any.fromFunction1(state), statics = statics.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], view = js.Any.fromFunction2(view))
      __obj.asInstanceOf[IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]]
    }
    
    @scala.inline
    implicit class IComponentMutableBuilder[Self <: IComponent[_, _, _, _, _, _], TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics] (val x: Self with (IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics])) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactoryOptions(value: IFactoryOptions[TComponentProps]): Self = StObject.set(x, "factoryOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setSlots(value: ISlotComponent[TComponentProps, TComponentSlots]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotsFunction1(value: TComponentProps => ISlotDefinition[Required[TComponentSlots]]): Self = StObject.set(x, "slots", js.Any.fromFunction1(value))
      
      @scala.inline
      def setState(value: TComponentProps => TViewProps): Self = StObject.set(x, "state", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStatics(value: TStatics): Self = StObject.set(x, "statics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyles(value: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction3(value: (TViewProps, /* theme */ ITheme, TTokens) => TStyleSet): Self = StObject.set(x, "styles", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTokens(value: ITokenFunctionOrObject[TViewProps, TTokens]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(
        value: (/* props */ PropsWithChildren[TViewProps], /* slots */ ISlots[Required[TComponentSlots]]) => ReturnType[ReactComponentClass[js.Object]]
      ): Self = StObject.set(x, "view", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait IComponentOptions[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics]
    extends typingsSlinky.uifabricFoundation.libIcomponentMod.IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] {
    
    /**
      * Slot definition object defining the slot component for each slot.
      */
    var slots: js.UndefOr[ISlotComponent[TComponentProps, TComponentSlots]] = js.native
    
    /**
      * Stateless pure function that receives props to render the output of the component.
      */
    var view: js.UndefOr[IViewComponent[TViewProps, TComponentSlots]] = js.native
  }
  object IComponentOptions {
    
    @scala.inline
    def apply[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics](): IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]]
    }
    
    @scala.inline
    implicit class IComponentOptionsMutableBuilder[Self <: IComponentOptions[_, _, _, _, _, _], TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics] (val x: Self with (IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics])) extends AnyVal {
      
      @scala.inline
      def setSlots(value: ISlotComponent[TComponentProps, TComponentSlots]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotsFunction1(value: TComponentProps => ISlotDefinition[Required[TComponentSlots]]): Self = StObject.set(x, "slots", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      @scala.inline
      def setView(
        value: (/* props */ PropsWithChildren[TViewProps], /* slots */ ISlots[Required[TComponentSlots]]) => ReturnType[ReactComponentClass[js.Object]]
      ): Self = StObject.set(x, "view", js.Any.fromFunction2(value))
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  type IPartialSlotComponent[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots] = ISlotDefinition[TComponentSlots] | (js.Function1[/* props */ TComponentProps, ISlotDefinition[TComponentSlots]])
  
  @js.native
  trait IRecompositionComponentOptions[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics]
    extends typingsSlinky.uifabricFoundation.libIcomponentMod.IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] {
    
    /**
      * Slot definition object defining the slot component for each slot.
      */
    var slots: js.UndefOr[IPartialSlotComponent[TComponentProps, TComponentSlots]] = js.native
    
    /**
      * Stateless pure function that receives props to render the output of the component.
      */
    var view: js.UndefOr[IViewComponent[TViewProps, TComponentSlots]] = js.native
  }
  object IRecompositionComponentOptions {
    
    @scala.inline
    def apply[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics](): IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]]
    }
    
    @scala.inline
    implicit class IRecompositionComponentOptionsMutableBuilder[Self <: IRecompositionComponentOptions[_, _, _, _, _, _], TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics] (val x: Self with (IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics])) extends AnyVal {
      
      @scala.inline
      def setSlots(value: IPartialSlotComponent[TComponentProps, TComponentSlots]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotsFunction1(value: TComponentProps => ISlotDefinition[TComponentSlots]): Self = StObject.set(x, "slots", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      @scala.inline
      def setView(
        value: (/* props */ PropsWithChildren[TViewProps], /* slots */ ISlots[Required[TComponentSlots]]) => ReturnType[ReactComponentClass[js.Object]]
      ): Self = StObject.set(x, "view", js.Any.fromFunction2(value))
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  type ISlotComponent[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots] = ISlotDefinition[Required[TComponentSlots]] | (js.Function1[/* props */ TComponentProps, ISlotDefinition[Required[TComponentSlots]]])
  
  type IViewComponent[TViewProps, TComponentSlots] = js.Function2[
    /* props */ PropsWithChildren[TViewProps], 
    /* slots */ ISlots[Required[TComponentSlots]], 
    ReturnType[ReactComponentClass[js.Object]]
  ]
}
