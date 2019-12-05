package typingsSlinky.atUifabricFoundation

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.atUifabricFoundation.libHooksControlledMod.IControlledStateOptions
import typingsSlinky.atUifabricFoundation.libIComponentMod.IComponentOptions
import typingsSlinky.atUifabricFoundation.libIComponentMod.IFactoryOptions
import typingsSlinky.atUifabricFoundation.libIComponentMod.IViewComponent
import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlot
import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlotDefinition
import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlotFactory
import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlots
import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlottableProps
import typingsSlinky.atUifabricFoundation.libISlotsMod.ValidProps
import typingsSlinky.atUifabricFoundation.libISlotsMod.ValidShorthand
import typingsSlinky.atUifabricFoundation.libThemeProviderMod.IThemeProviderProps
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricMergeDashStyles.libIStyleSetMod.IStyleSet
import typingsSlinky.atUifabricUtilities.libStyledMod.ICustomizableProps
import typingsSlinky.atUifabricUtilities.libStyledMod.IPropsWithStyles
import typingsSlinky.react.reactMod.Attributes
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.Dispatch
import typingsSlinky.react.reactMod.FunctionComponent
import typingsSlinky.react.reactMod.ReactNode
import typingsSlinky.react.reactMod.SetStateAction
import typingsSlinky.react.reactMod.StatelessComponent
import typingsSlinky.std.Partial
import typingsSlinky.std.Required
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation", JSImport.Namespace)
@js.native
object atUifabricFoundationMod extends js.Object {
  val ThemeProvider: ReactComponentClass[IThemeProviderProps] = js.native
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](view: IViewComponent[TViewProps]): ReactComponentClass[TComponentProps] with TStatics = js.native
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](
    view: IViewComponent[TViewProps],
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]
  ): ReactComponentClass[TComponentProps] with TStatics = js.native
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ReactComponentClass[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ReactComponentClass[TProps], options: IFactoryOptions[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def getControlledDerivedProps[TProps, TProp /* <: String */](
    props: TProps,
    propName: TProp,
    derivedValue: /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any = js.native
  def getSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](userProps: TComponentProps, slots: ISlotDefinition[Required[TComponentSlots]]): ISlots[Required[TComponentSlots]] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): ReactComponentClass[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): ReactComponentClass[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): ReactComponentClass[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ReactComponentClass[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: StatelessComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): ReactComponentClass[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: StatelessComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): ReactComponentClass[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: StatelessComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): ReactComponentClass[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: StatelessComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ReactComponentClass[TComponentProps] = js.native
  def useControlledState[TProps, TProp /* <: String */, TDefaultProp /* <: String */](props: TProps, propName: TProp): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = js.native
  def useControlledState[TProps, TProp /* <: String */, TDefaultProp /* <: String */](props: TProps, propName: TProp, options: IControlledStateOptions[TProps, TProp, TDefaultProp]): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = js.native
  def withSlots[P](`type`: String): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: String, children: ReactNode*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: String, props: Attributes with P, children: TagMod[Any]*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: ISlot[P]): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: ISlot[P], children: ReactNode*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: ISlot[P], props: Attributes with P, children: TagMod[Any]*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P]): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], children: ReactNode*): ReturnType[ReactComponentClass[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], props: Attributes with P, children: TagMod[Any]*): ReturnType[ReactComponentClass[P]] = js.native
}

