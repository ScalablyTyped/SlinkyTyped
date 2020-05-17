package typingsSlinky.uifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIcomponentMod {
  type IComponentStyles[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSlots ]:? @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
    */ typingsSlinky.uifabricFoundation.uifabricFoundationStrings.IComponentStyles with org.scalablytyped.runtime.TopLevel[js.Any]
  type IPropsWithChildren[TProps] = typingsSlinky.react.mod.PropsWithChildren[TProps]
  type IStateComponentType[TComponentProps, TViewProps] = js.Function1[/* props */ TComponentProps, TViewProps]
  type IStylesFunction[TViewProps, TTokens, TStyleSet /* <: typingsSlinky.uifabricMergeStyles.istylesetMod.IStyleSet[TStyleSet] */] = js.Function3[
    /* props */ TViewProps, 
    /* theme */ typingsSlinky.uifabricStyling.ithemeMod.ITheme, 
    /* tokens */ TTokens, 
    TStyleSet
  ]
  type IViewComponent[TViewProps] = js.Function1[
    /* props */ typingsSlinky.react.mod.PropsWithChildren[TViewProps], 
    typingsSlinky.std.ReturnType[slinky.core.ReactComponentClass[js.Object]]
  ]
}
