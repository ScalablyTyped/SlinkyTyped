package typingsSlinky.uifabricFoundation.libIslotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
*/
trait ExtractShorthand[TUnion] extends js.Object

object ExtractShorthand {
  @scala.inline
  implicit def apply[TUnion](value: Boolean): ExtractShorthand[TUnion] = value.asInstanceOf[ExtractShorthand[TUnion]]
  @scala.inline
  implicit def apply[TUnion](value: Double): ExtractShorthand[TUnion] = value.asInstanceOf[ExtractShorthand[TUnion]]
  @scala.inline
  implicit def apply[TUnion](value: String): ExtractShorthand[TUnion] = value.asInstanceOf[ExtractShorthand[TUnion]]
}

