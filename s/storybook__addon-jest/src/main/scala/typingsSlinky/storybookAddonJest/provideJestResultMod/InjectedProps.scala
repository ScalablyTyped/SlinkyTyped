package typingsSlinky.storybookAddonJest.provideJestResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedProps extends js.Object {
  var tests: js.UndefOr[js.Array[Test]] = js.native
}

object InjectedProps {
  @scala.inline
  def apply(): InjectedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectedProps]
  }
  @scala.inline
  implicit class InjectedPropsOps[Self <: InjectedProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTests(value: js.Array[Test]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tests")(js.undefined)
        ret
    }
  }
  
}

