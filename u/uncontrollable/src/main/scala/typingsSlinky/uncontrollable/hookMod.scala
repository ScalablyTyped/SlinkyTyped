package typingsSlinky.uncontrollable

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hookMod {
  
  @JSImport("uncontrollable/cjs/hook", JSImport.Default)
  @js.native
  def default[TProps /* <: js.Object */, TDefaults /* <: String */](props: TProps, config: ConfigMap[TProps]): Omit[TProps, TDefaults] = js.native
  
  @JSImport("uncontrollable/cjs/hook", "useUncontrolledProp")
  @js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  @JSImport("uncontrollable/cjs/hook", "useUncontrolledProp")
  @js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  @JSImport("uncontrollable/cjs/hook", "useUncontrolledProp")
  @js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp, defaultValue: TProp): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  @JSImport("uncontrollable/cjs/hook", "useUncontrolledProp")
  @js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp, defaultValue: TProp, handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  @JSImport("uncontrollable/cjs/hook", "useUncontrolledProp")
  @js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp, defaultValue: js.UndefOr[scala.Nothing], handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  @JSImport("uncontrollable/cjs/hook", "useUncontrolledProp")
  @js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: js.UndefOr[scala.Nothing], defaultValue: TProp): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  @JSImport("uncontrollable/cjs/hook", "useUncontrolledProp")
  @js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: js.UndefOr[scala.Nothing], defaultValue: TProp, handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  @JSImport("uncontrollable/cjs/hook", "useUncontrolledProp")
  @js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: js.UndefOr[scala.Nothing], defaultValue: js.UndefOr[scala.Nothing], handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  
  type AllowedNames[Base, Condition] = /* import warning: importer.ImportType#apply Failed type conversion: uncontrollable.uncontrollable/cjs/hook.FilterFlags<Base, Condition>[keyof Base] */ js.Any
  
  type ConfigMap[TProps /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ p in keyof TProps ]:? uncontrollable.uncontrollable/cjs/hook.AllowedNames<TProps, std.Function>}
    */ typingsSlinky.uncontrollable.uncontrollableStrings.ConfigMap with TopLevel[js.Any]
  
  type FilterFlags[Base, Condition] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in keyof Base ]: std.NonNullable<Base[Key]> extends Condition? Key : never}
    */ typingsSlinky.uncontrollable.uncontrollableStrings.FilterFlags with TopLevel[Base]
  
  type Handler = js.Function1[/* repeated */ js.Any, js.Any]
}
