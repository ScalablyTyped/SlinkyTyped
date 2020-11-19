package typingsSlinky.sugar.sugarjs

import typingsSlinky.std.ArrayLike
import typingsSlinky.sugar.sugarjs.Array.Chainable
import typingsSlinky.sugar.sugarjs.Array.Constructor
import typingsSlinky.sugar.sugarjs.Date.DateCreateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sugar extends js.Object {
  
  def apply(): Sugar = js.native
  def apply(opts: ExtendOptions): Sugar = js.native
  
  def Array[T](): Chainable[T, typingsSlinky.sugar.Array[T]] = js.native
  def Array[T](obj: js.UndefOr[scala.Nothing], clone: Boolean): Chainable[T, typingsSlinky.sugar.Array[T]] = js.native
  def Array[T](obj: Double): Chainable[T, typingsSlinky.sugar.Array[T]] = js.native
  def Array[T](obj: Double, clone: Boolean): Chainable[T, typingsSlinky.sugar.Array[T]] = js.native
  def Array[T](obj: ArrayLike[T]): Chainable[T, typingsSlinky.sugar.Array[T]] = js.native
  def Array[T](obj: ArrayLike[T], clone: Boolean): Chainable[T, typingsSlinky.sugar.Array[T]] = js.native
  @JSName("Array")
  var Array_Original: Constructor = js.native
  
  def Date(): typingsSlinky.sugar.sugarjs.Date.Chainable[typingsSlinky.sugar.Date] = js.native
  def Date(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): typingsSlinky.sugar.sugarjs.Date.Chainable[typingsSlinky.sugar.Date] = js.native
  def Date(d: java.lang.String): typingsSlinky.sugar.sugarjs.Date.Chainable[typingsSlinky.sugar.Date] = js.native
  def Date(d: java.lang.String, options: DateCreateOptions): typingsSlinky.sugar.sugarjs.Date.Chainable[typingsSlinky.sugar.Date] = js.native
  def Date(d: Double): typingsSlinky.sugar.sugarjs.Date.Chainable[typingsSlinky.sugar.Date] = js.native
  def Date(d: Double, options: DateCreateOptions): typingsSlinky.sugar.sugarjs.Date.Chainable[typingsSlinky.sugar.Date] = js.native
  def Date(d: typingsSlinky.sugar.Date): typingsSlinky.sugar.sugarjs.Date.Chainable[typingsSlinky.sugar.Date] = js.native
  def Date(d: typingsSlinky.sugar.Date, options: DateCreateOptions): typingsSlinky.sugar.sugarjs.Date.Chainable[typingsSlinky.sugar.Date] = js.native
  @JSName("Date")
  var Date_Original: typingsSlinky.sugar.sugarjs.Date.Constructor = js.native
  
  def Function(): typingsSlinky.sugar.sugarjs.Function.Chainable[typingsSlinky.sugar.Function] = js.native
  def Function(raw: typingsSlinky.sugar.Function): typingsSlinky.sugar.sugarjs.Function.Chainable[typingsSlinky.sugar.Function] = js.native
  @JSName("Function")
  var Function_Original: typingsSlinky.sugar.sugarjs.Function.Constructor = js.native
  
  def Number(): typingsSlinky.sugar.sugarjs.Number.Chainable[Double] = js.native
  def Number(raw: Double): typingsSlinky.sugar.sugarjs.Number.Chainable[Double] = js.native
  @JSName("Number")
  var Number_Original: typingsSlinky.sugar.sugarjs.Number.Constructor = js.native
  
  def Object(): typingsSlinky.sugar.sugarjs.Object.Chainable[js.Object] = js.native
  def Object(raw: js.Object): typingsSlinky.sugar.sugarjs.Object.Chainable[js.Object] = js.native
  @JSName("Object")
  var Object_Original: typingsSlinky.sugar.sugarjs.Object.Constructor = js.native
  
  def RegExp(): typingsSlinky.sugar.sugarjs.RegExp.Chainable[typingsSlinky.sugar.RegExp] = js.native
  def RegExp(raw: typingsSlinky.sugar.RegExp): typingsSlinky.sugar.sugarjs.RegExp.Chainable[typingsSlinky.sugar.RegExp] = js.native
  @JSName("RegExp")
  var RegExp_Original: typingsSlinky.sugar.sugarjs.RegExp.Constructor = js.native
  
  def String(): typingsSlinky.sugar.sugarjs.String.Chainable[java.lang.String] = js.native
  def String(raw: java.lang.String): typingsSlinky.sugar.sugarjs.String.Chainable[java.lang.String] = js.native
  @JSName("String")
  var String_Original: typingsSlinky.sugar.sugarjs.String.Constructor = js.native
  
  def createNamespace(name: java.lang.String): SugarNamespace = js.native
  
  def extend(): Sugar = js.native
  def extend(opts: ExtendOptions): Sugar = js.native
}
