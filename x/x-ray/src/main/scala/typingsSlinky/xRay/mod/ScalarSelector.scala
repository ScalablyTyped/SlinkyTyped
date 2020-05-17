package typingsSlinky.xRay.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// circularly references itself
// https://stackoverflow.com/a/41826582
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.xRay.mod.InstanceInvocation
  - org.scalablytyped.runtime.StringDictionary[typingsSlinky.xRay.mod.Selector]
*/
trait ScalarSelector extends Selector

object ScalarSelector {
  @scala.inline
  implicit def apply(value: InstanceInvocation): ScalarSelector = value.asInstanceOf[ScalarSelector]
  @scala.inline
  implicit def apply(value: String): ScalarSelector = value.asInstanceOf[ScalarSelector]
  @scala.inline
  implicit def apply(value: StringDictionary[Selector]): ScalarSelector = value.asInstanceOf[ScalarSelector]
}

