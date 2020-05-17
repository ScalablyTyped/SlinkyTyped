package typingsSlinky.uiBox.typesEnhancersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
*/
trait PropEnhancerValueType extends js.Object

object PropEnhancerValueType {
  @scala.inline
  implicit def apply(value: Double): PropEnhancerValueType = value.asInstanceOf[PropEnhancerValueType]
  @scala.inline
  implicit def apply(value: String): PropEnhancerValueType = value.asInstanceOf[PropEnhancerValueType]
}

