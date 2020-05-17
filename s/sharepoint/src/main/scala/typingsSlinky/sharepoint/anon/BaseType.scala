package typingsSlinky.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseType extends js.Object {
  var BaseType: Double = js.native
  var DefaultItemOpen: Double = js.native
  var Direction: String = js.native
  var EnableVesioning: Boolean = js.native
  var Id: String = js.native
}

object BaseType {
  @scala.inline
  def apply(BaseType: Double, DefaultItemOpen: Double, Direction: String, EnableVesioning: Boolean, Id: String): BaseType = {
    val __obj = js.Dynamic.literal(BaseType = BaseType.asInstanceOf[js.Any], DefaultItemOpen = DefaultItemOpen.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], EnableVesioning = EnableVesioning.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseType]
  }
  @scala.inline
  implicit class BaseTypeOps[Self <: BaseType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultItemOpen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultItemOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableVesioning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableVesioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

