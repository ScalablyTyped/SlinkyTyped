package typingsSlinky.winrt.Windows.Management.Core

import typingsSlinky.winrt.Windows.Storage.ApplicationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IApplicationDataManagerStatics extends js.Object {
  def createForPackageFamily(packageFamilyName: String): ApplicationData = js.native
}

object IApplicationDataManagerStatics {
  @scala.inline
  def apply(createForPackageFamily: String => ApplicationData): IApplicationDataManagerStatics = {
    val __obj = js.Dynamic.literal(createForPackageFamily = js.Any.fromFunction1(createForPackageFamily))
    __obj.asInstanceOf[IApplicationDataManagerStatics]
  }
  @scala.inline
  implicit class IApplicationDataManagerStaticsOps[Self <: IApplicationDataManagerStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateForPackageFamily(value: String => ApplicationData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createForPackageFamily")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

