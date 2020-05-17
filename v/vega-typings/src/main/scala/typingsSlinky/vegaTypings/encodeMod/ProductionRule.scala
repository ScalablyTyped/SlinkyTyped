package typingsSlinky.vegaTypings.encodeMod

import typingsSlinky.vegaTypings.anon.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - js.Array[typingsSlinky.vegaTypings.anon.Test with T]
*/
trait ProductionRule[T] extends js.Object

object ProductionRule {
  @scala.inline
  implicit def apply[T](value: js.Array[Test with T]): ProductionRule[T] = value.asInstanceOf[ProductionRule[T]]
  @scala.inline
  implicit def apply[T](value: T): ProductionRule[T] = value.asInstanceOf[ProductionRule[T]]
}

