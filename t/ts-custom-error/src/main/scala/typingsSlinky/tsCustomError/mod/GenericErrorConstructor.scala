package typingsSlinky.tsCustomError.mod

import typingsSlinky.std.ErrorConstructor
import typingsSlinky.std.EvalErrorConstructor
import typingsSlinky.std.RangeErrorConstructor
import typingsSlinky.std.ReferenceErrorConstructor
import typingsSlinky.std.SyntaxErrorConstructor
import typingsSlinky.std.TypeErrorConstructor
import typingsSlinky.std.URIErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.ErrorConstructor
  - typingsSlinky.std.EvalErrorConstructor
  - typingsSlinky.std.RangeErrorConstructor
  - typingsSlinky.std.ReferenceErrorConstructor
  - typingsSlinky.std.SyntaxErrorConstructor
  - typingsSlinky.std.TypeErrorConstructor
  - typingsSlinky.std.URIErrorConstructor
  - typingsSlinky.tsCustomError.mod.CustomErrorConstructor[typingsSlinky.tsCustomError.mod.CustomErrorProperties]
*/
trait GenericErrorConstructor extends js.Object

object GenericErrorConstructor {
  @scala.inline
  implicit def apply(value: CustomErrorConstructor[CustomErrorProperties]): GenericErrorConstructor = value.asInstanceOf[GenericErrorConstructor]
  @scala.inline
  implicit def apply(value: ErrorConstructor): GenericErrorConstructor = value.asInstanceOf[GenericErrorConstructor]
  @scala.inline
  implicit def apply(value: EvalErrorConstructor): GenericErrorConstructor = value.asInstanceOf[GenericErrorConstructor]
  @scala.inline
  implicit def apply(value: RangeErrorConstructor): GenericErrorConstructor = value.asInstanceOf[GenericErrorConstructor]
  @scala.inline
  implicit def apply(value: ReferenceErrorConstructor): GenericErrorConstructor = value.asInstanceOf[GenericErrorConstructor]
  @scala.inline
  implicit def apply(value: SyntaxErrorConstructor): GenericErrorConstructor = value.asInstanceOf[GenericErrorConstructor]
  @scala.inline
  implicit def apply(value: TypeErrorConstructor): GenericErrorConstructor = value.asInstanceOf[GenericErrorConstructor]
  @scala.inline
  implicit def apply(value: URIErrorConstructor): GenericErrorConstructor = value.asInstanceOf[GenericErrorConstructor]
}

