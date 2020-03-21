package typingsSlinky.uifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIcomponentMod {
  type IComponentStyles[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSlots ]:? @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
    */ typingsSlinky.uifabricFoundation.uifabricFoundationStrings.IComponentStyles with js.Any
  type IPropsWithChildren[TProps] = typingsSlinky.react.mod.PropsWithChildren[TProps]
  type IStateComponentType[TComponentProps, TViewProps] = js.Function1[/* props */ TComponentProps, TViewProps]
  type IStylesFunction[TViewProps, TTokens, TStyleSet /* <: typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet[TStyleSet] */] = js.Function3[
    /* props */ TViewProps, 
    /* theme */ typingsSlinky.uifabricStyling.ithemeMod.ITheme, 
    /* tokens */ TTokens, 
    TStyleSet
  ]
  type IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet /* <: typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet[TStyleSet] */] = (typingsSlinky.uifabricFoundation.libIcomponentMod.IStylesFunction[TViewProps, TTokens, TStyleSet]) | TStyleSet
  type IToken[TViewProps, TTokens] = (typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenBase[TViewProps, TTokens]) | (typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenBaseArray[TViewProps, TTokens])
  type ITokenBase[TViewProps, TTokens] = js.UndefOr[
    (typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject[TViewProps, TTokens]) | typingsSlinky.uifabricFoundation.uifabricFoundationBooleans.`false` | scala.Null
  ]
  type ITokenFunctionOrObject[TViewProps, TTokens] = (typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenFunction[TViewProps, TTokens]) | TTokens
  type IViewComponent[TViewProps] = js.Function1[
    /* props */ typingsSlinky.react.mod.PropsWithChildren[TViewProps], 
    typingsSlinky.std.ReturnType[slinky.core.ReactComponentClass[js.Object]]
  ]
}
