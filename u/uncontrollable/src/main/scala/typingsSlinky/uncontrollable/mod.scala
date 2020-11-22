package typingsSlinky.uncontrollable

import typingsSlinky.std.Omit
import typingsSlinky.uncontrollable.hookMod.ConfigMap
import typingsSlinky.uncontrollable.hookMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("uncontrollable/esm", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def useUncontrolled[TProps /* <: js.Object */, TDefaults /* <: String */](props: TProps, config: ConfigMap[TProps]): Omit[TProps, TDefaults] = js.native
  
  def useUncontrolledProp[TProp, THandler /* <: Handler */](): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp, defaultValue: TProp): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp, defaultValue: TProp, handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: TProp, defaultValue: js.UndefOr[scala.Nothing], handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: js.UndefOr[scala.Nothing], defaultValue: TProp): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: js.UndefOr[scala.Nothing], defaultValue: TProp, handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
  def useUncontrolledProp[TProp, THandler /* <: Handler */](propValue: js.UndefOr[scala.Nothing], defaultValue: js.UndefOr[scala.Nothing], handler: THandler): js.Tuple2[js.UndefOr[TProp], THandler] = js.native
}
