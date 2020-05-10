package typingsSlinky.styletronReact.mod

import slinky.core.ReactComponentClass
import typingsSlinky.styletronStandard.mod.StandardEngine
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStyledOptions extends js.Object {
  var driver: StyletronDriver = js.native
  var getInitialStyle: StyletronGetInitialStyle = js.native
  var wrapper: StyletronWrapper = js.native
}

object CreateStyledOptions {
  @scala.inline
  def apply(
    driver: (/* style */ StyleObject, /* styletron */ StandardEngine) => String,
    getInitialStyle: () => StyleObject,
    wrapper: /* fc */ ReactComponentClass[js.Any] => ReactComponentClass[js.Any]
  ): CreateStyledOptions = {
    val __obj = js.Dynamic.literal(driver = js.Any.fromFunction2(driver), getInitialStyle = js.Any.fromFunction0(getInitialStyle), wrapper = js.Any.fromFunction1(wrapper))
    __obj.asInstanceOf[CreateStyledOptions]
  }
  @scala.inline
  implicit class CreateStyledOptionsOps[Self <: CreateStyledOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDriver(value: (/* style */ StyleObject, /* styletron */ StandardEngine) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driver")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetInitialStyle(value: () => StyleObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInitialStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWrapper(value: /* fc */ ReactComponentClass[js.Any] => ReactComponentClass[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

