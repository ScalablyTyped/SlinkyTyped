package typingsSlinky.victory.mod

import typingsSlinky.victory.anon.XDomainTuple
import typingsSlinky.victory.anon.YDomainTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.victory.mod.DomainTuple
  - typingsSlinky.victory.anon.XDomainTuple
  - typingsSlinky.victory.anon.YDomainTuple
*/
trait DomainPropType extends js.Object

object DomainPropType {
  @scala.inline
  implicit def apply(value: DomainTuple): DomainPropType = value.asInstanceOf[DomainPropType]
  @scala.inline
  implicit def apply(value: XDomainTuple): DomainPropType = value.asInstanceOf[DomainPropType]
  @scala.inline
  implicit def apply(value: YDomainTuple): DomainPropType = value.asInstanceOf[DomainPropType]
}

