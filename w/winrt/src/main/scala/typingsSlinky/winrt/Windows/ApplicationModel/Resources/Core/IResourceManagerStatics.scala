package typingsSlinky.winrt.Windows.ApplicationModel.Resources.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResourceManagerStatics extends js.Object {
  var current: ResourceManager = js.native
  def isResourceReference(resourceReference: String): Boolean = js.native
}

object IResourceManagerStatics {
  @scala.inline
  def apply(current: ResourceManager, isResourceReference: String => Boolean): IResourceManagerStatics = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], isResourceReference = js.Any.fromFunction1(isResourceReference))
    __obj.asInstanceOf[IResourceManagerStatics]
  }
  @scala.inline
  implicit class IResourceManagerStaticsOps[Self <: IResourceManagerStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: ResourceManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsResourceReference(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResourceReference")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

