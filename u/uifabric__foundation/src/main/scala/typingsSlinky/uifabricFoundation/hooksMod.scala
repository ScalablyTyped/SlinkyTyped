package typingsSlinky.uifabricFoundation

import typingsSlinky.react.mod.Dispatch
import typingsSlinky.react.mod.SetStateAction
import typingsSlinky.uifabricFoundation.controlledMod.IControlledStateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/foundation/lib/hooks", JSImport.Namespace)
@js.native
object hooksMod extends js.Object {
  
  def getControlledDerivedProps[TProps, TProp /* <: /* keyof TProps */ String */](
    props: TProps,
    propName: TProp,
    derivedValue: /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any = js.native
  
  def useControlledState[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](props: TProps, propName: TProp): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = js.native
  def useControlledState[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](props: TProps, propName: TProp, options: IControlledStateOptions[TProps, TProp, TDefaultProp]): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = js.native
}
