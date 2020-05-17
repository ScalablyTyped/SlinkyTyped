package typingsSlinky.unistUtilIs.mod

import typingsSlinky.unist.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Union of all the types of tests
  *
  * @typeParam T type of node that passes test
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.unistUtilIs.mod.TestType[T]
  - typingsSlinky.unistUtilIs.mod.TestObject[T]
  - typingsSlinky.unistUtilIs.mod.TestFunction[T]
*/
trait Test[T /* <: Node */] extends js.Object

object Test {
  @scala.inline
  implicit def apply[T](value: TestFunction[T]): Test[T] = value.asInstanceOf[Test[T]]
  @scala.inline
  implicit def apply[T](value: TestObject[T]): Test[T] = value.asInstanceOf[Test[T]]
  @scala.inline
  implicit def apply[T](value: TestType[T]): Test[T] = value.asInstanceOf[Test[T]]
}

