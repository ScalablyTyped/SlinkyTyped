package typingsSlinky.yeomanTest.mod

import typingsSlinky.yeomanGenerator.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Tuple2[typingsSlinky.yeomanGenerator.mod.^, java.lang.String]
*/
trait Dependency extends js.Object

object Dependency {
  @scala.inline
  implicit def apply(value: String): Dependency = value.asInstanceOf[Dependency]
  @scala.inline
  implicit def apply(value: js.Tuple2[^, String]): Dependency = value.asInstanceOf[Dependency]
}

