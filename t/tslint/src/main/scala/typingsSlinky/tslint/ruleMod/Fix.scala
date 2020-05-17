package typingsSlinky.tslint.ruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tslint.ruleMod.Replacement
  - js.Array[typingsSlinky.tslint.ruleMod.Replacement]
*/
trait Fix extends js.Object

object Fix {
  @scala.inline
  implicit def apply(value: js.Array[Replacement]): Fix = value.asInstanceOf[Fix]
  @scala.inline
  implicit def apply(value: Replacement): Fix = value.asInstanceOf[Fix]
}

