package typingsSlinky.vsoNodeApi.profileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileAttributeBase[T] extends js.Object {
  var descriptor: AttributeDescriptor
  var revision: Double
  var timeStamp: js.Date
  var value: T
}

object ProfileAttributeBase {
  @scala.inline
  def apply[T](descriptor: AttributeDescriptor, revision: Double, timeStamp: js.Date, value: T): ProfileAttributeBase[T] = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileAttributeBase[T]]
  }
}

