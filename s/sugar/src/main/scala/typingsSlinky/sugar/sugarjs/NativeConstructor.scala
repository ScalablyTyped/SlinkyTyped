package typingsSlinky.sugar.sugarjs

import typingsSlinky.std.BooleanConstructor
import typingsSlinky.std.ErrorConstructor
import typingsSlinky.std.FunctionConstructor
import typingsSlinky.sugar.ArrayConstructor
import typingsSlinky.sugar.DateConstructor
import typingsSlinky.sugar.NumberConstructor
import typingsSlinky.sugar.ObjectConstructor
import typingsSlinky.sugar.RegExpConstructor
import typingsSlinky.sugar.StringConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sugar.ArrayConstructor
  - typingsSlinky.sugar.DateConstructor
  - typingsSlinky.std.FunctionConstructor
  - typingsSlinky.sugar.NumberConstructor
  - typingsSlinky.sugar.ObjectConstructor
  - typingsSlinky.sugar.RegExpConstructor
  - typingsSlinky.sugar.StringConstructor
  - typingsSlinky.std.BooleanConstructor
  - typingsSlinky.std.ErrorConstructor
*/
trait NativeConstructor extends js.Object

object NativeConstructor {
  @scala.inline
  implicit def apply(value: ArrayConstructor): NativeConstructor = value.asInstanceOf[NativeConstructor]
  @scala.inline
  implicit def apply(value: BooleanConstructor): NativeConstructor = value.asInstanceOf[NativeConstructor]
  @scala.inline
  implicit def apply(value: DateConstructor): NativeConstructor = value.asInstanceOf[NativeConstructor]
  @scala.inline
  implicit def apply(value: ErrorConstructor): NativeConstructor = value.asInstanceOf[NativeConstructor]
  @scala.inline
  implicit def apply(value: FunctionConstructor): NativeConstructor = value.asInstanceOf[NativeConstructor]
  @scala.inline
  implicit def apply(value: NumberConstructor): NativeConstructor = value.asInstanceOf[NativeConstructor]
  @scala.inline
  implicit def apply(value: ObjectConstructor): NativeConstructor = value.asInstanceOf[NativeConstructor]
  @scala.inline
  implicit def apply(value: RegExpConstructor): NativeConstructor = value.asInstanceOf[NativeConstructor]
  @scala.inline
  implicit def apply(value: StringConstructor): NativeConstructor = value.asInstanceOf[NativeConstructor]
}

