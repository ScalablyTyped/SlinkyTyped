package typingsSlinky.uifabricUtilities.createRefMod

import slinky.core.facade.ReactRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.RefObject[T]
  - typingsSlinky.uifabricUtilities.createRefMod.RefObject[T]
  - js.Function1[/ * ref * / T | scala.Null, scala.Unit]
*/
trait IRefObject[T] extends js.Object

object IRefObject {
  @scala.inline
  implicit def apply[T](value: js.Function1[/* ref */ T | Null, Unit]): IRefObject[T] = value.asInstanceOf[IRefObject[T]]
  @scala.inline
  implicit def apply[T](value: RefObject[T]): IRefObject[T] = value.asInstanceOf[IRefObject[T]]
  @scala.inline
  implicit def apply[T](value: ReactRef[T]): IRefObject[T] = value.asInstanceOf[IRefObject[T]]
}

