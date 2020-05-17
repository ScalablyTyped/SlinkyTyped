package typingsSlinky.sequelize.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A hash of attributes to describe your search. See above for examples.
  *
  * We did put Object in the end, because there where query might be a JSON Blob. It cripples a bit the
  * typesafety, but there is no way to pass the tests if we just remove it.
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - typingsSlinky.node.Buffer
*/
trait Primitives extends js.Object

object Primitives {
  @scala.inline
  implicit def apply(value: Boolean): Primitives = value.asInstanceOf[Primitives]
  @scala.inline
  implicit def apply(value: Buffer): Primitives = value.asInstanceOf[Primitives]
  @scala.inline
  implicit def apply(value: Double): Primitives = value.asInstanceOf[Primitives]
  @scala.inline
  implicit def apply(value: String): Primitives = value.asInstanceOf[Primitives]
}

