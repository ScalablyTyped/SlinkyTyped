package typingsSlinky.yargs.mod

import typingsSlinky.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gives string[] if T is an array type, otherwise string. Preserves | undefined. */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - typingsSlinky.std.Extract[T, js.UndefOr[scala.Nothing]]
*/
trait ToString[T] extends js.Object

object ToString {
  @scala.inline
  implicit def apply[T](value: js.Array[String]): ToString[T] = value.asInstanceOf[ToString[T]]
  @scala.inline
  implicit def apply[T](value: Extract[T, js.UndefOr[scala.Nothing]]): ToString[T] = value.asInstanceOf[ToString[T]]
  @scala.inline
  implicit def apply[T](value: String): ToString[T] = value.asInstanceOf[ToString[T]]
}

