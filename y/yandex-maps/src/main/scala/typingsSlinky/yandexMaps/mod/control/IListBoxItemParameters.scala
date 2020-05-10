package typingsSlinky.yandexMaps.mod.control

import typingsSlinky.yandexMaps.AnonContentString
import typingsSlinky.yandexMaps.AnonLayout
import typingsSlinky.yandexMaps.AnonSelected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListBoxItemParameters extends js.Object {
  var data: js.UndefOr[AnonContentString] = js.native
  var options: js.UndefOr[AnonLayout] = js.native
  var state: js.UndefOr[AnonSelected] = js.native
}

object IListBoxItemParameters {
  @scala.inline
  def apply(): IListBoxItemParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListBoxItemParameters]
  }
  @scala.inline
  implicit class IListBoxItemParametersOps[Self <: IListBoxItemParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: AnonContentString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: AnonLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: AnonSelected): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

