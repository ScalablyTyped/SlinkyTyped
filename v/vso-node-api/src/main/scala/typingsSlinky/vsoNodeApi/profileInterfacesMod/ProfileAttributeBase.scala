package typingsSlinky.vsoNodeApi.profileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileAttributeBase[T] extends js.Object {
  var descriptor: AttributeDescriptor = js.native
  var revision: Double = js.native
  var timeStamp: js.Date = js.native
  var value: T = js.native
}

object ProfileAttributeBase {
  @scala.inline
  def apply[T](descriptor: AttributeDescriptor, revision: Double, timeStamp: js.Date, value: T): ProfileAttributeBase[T] = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileAttributeBase[T]]
  }
  @scala.inline
  implicit class ProfileAttributeBaseOps[Self[t] <: ProfileAttributeBase[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDescriptor(value: AttributeDescriptor): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevision(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeStamp(value: js.Date): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeStamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

