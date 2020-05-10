package typingsSlinky.styletronReact.mod

import slinky.core.ReactComponentClass
import typingsSlinky.styletronReact.AnonStackIndex
import typingsSlinky.styletronStandard.mod.StandardEngine
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Styletron extends js.Object {
  var base: StyletronBase = js.native
  var debug: js.UndefOr[AnonStackIndex] = js.native
  var driver: StyletronDriver = js.native
  var getInitialStyle: StyletronGetInitialStyle = js.native
  var reducers: js.Array[ReducerContainer] = js.native
  var wrapper: StyletronWrapper = js.native
}

object Styletron {
  @scala.inline
  def apply(
    base: StyletronBase,
    driver: (/* style */ StyleObject, /* styletron */ StandardEngine) => String,
    getInitialStyle: () => StyleObject,
    reducers: js.Array[ReducerContainer],
    wrapper: /* fc */ ReactComponentClass[js.Any] => ReactComponentClass[js.Any]
  ): Styletron = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], driver = js.Any.fromFunction2(driver), getInitialStyle = js.Any.fromFunction0(getInitialStyle), reducers = reducers.asInstanceOf[js.Any], wrapper = js.Any.fromFunction1(wrapper))
    __obj.asInstanceOf[Styletron]
  }
  @scala.inline
  implicit class StyletronOps[Self <: Styletron] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseFunctionComponent(value: ReactComponentClass[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseComponentClass(value: ReactComponentClass[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: StyletronBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withReducers(value: js.Array[ReducerContainer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reducers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: /* fc */ ReactComponentClass[js.Any] => ReactComponentClass[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDebug(value: AnonStackIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
  }
  
}

