package typingsSlinky.typescript.mod

import typingsSlinky.typescript.anon.Affected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typescript.anon.Affected[T]
  - js.UndefOr[scala.Nothing]
*/
trait AffectedFileResult[T] extends js.Object

object AffectedFileResult {
  @scala.inline
  implicit def apply[T](value: Affected[T]): AffectedFileResult[T] = value.asInstanceOf[AffectedFileResult[T]]
  @scala.inline
  implicit def fromUndef[T, T_](value: js.UndefOr[T_])(implicit ev: T_ => AffectedFileResult[T]): AffectedFileResult[T] = value.asInstanceOf[AffectedFileResult[T]]
}

