package typingsSlinky.vscode.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.UndefOr[scala.Nothing]
  - scala.Null
  - typingsSlinky.vscode.Thenable[js.UndefOr[T | scala.Null]]
*/
trait ProviderResult[T] extends js.Object

object ProviderResult {
  @scala.inline
  implicit def apply[T](value: Null): ProviderResult[T] = value.asInstanceOf[ProviderResult[T]]
  @scala.inline
  implicit def apply[T](value: T): ProviderResult[T] = value.asInstanceOf[ProviderResult[T]]
  @scala.inline
  implicit def apply[T](value: Thenable[js.UndefOr[T | Null]]): ProviderResult[T] = value.asInstanceOf[ProviderResult[T]]
  @scala.inline
  implicit def fromUndef[T, T_](value: js.UndefOr[T_])(implicit ev: T_ => ProviderResult[T]): ProviderResult[T] = value.asInstanceOf[ProviderResult[T]]
}

