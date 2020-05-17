package typingsSlinky.storybookAddonJest.anon

import typingsSlinky.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@storybook/addon-jest.@storybook/addon-jest/dist/hoc/provideJestResult.HocProps> */
@js.native
trait ReadonlyHocProps extends js.Object {
  val active: js.UndefOr[Boolean] = js.native
  val api: API = js.native
}

object ReadonlyHocProps {
  @scala.inline
  def apply(api: API): ReadonlyHocProps = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyHocProps]
  }
  @scala.inline
  implicit class ReadonlyHocPropsOps[Self <: ReadonlyHocProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: API): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
  }
  
}

