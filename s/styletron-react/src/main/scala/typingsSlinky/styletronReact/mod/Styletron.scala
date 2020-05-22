package typingsSlinky.styletronReact.mod

import slinky.core.ReactComponentClass
import typingsSlinky.styletronStandard.mod.StandardEngine
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Styletron extends js.Object {
  var base: StyletronBase
  var debug: js.UndefOr[typingsSlinky.styletronReact.anon.StackIndex] = js.undefined
  var driver: StyletronDriver
  var getInitialStyle: StyletronGetInitialStyle
  var reducers: js.Array[ReducerContainer]
  var wrapper: StyletronWrapper
}

object Styletron {
  @scala.inline
  def apply(
    base: StyletronBase,
    driver: (/* style */ StyleObject, /* styletron */ StandardEngine) => String,
    getInitialStyle: () => StyleObject,
    reducers: js.Array[ReducerContainer],
    wrapper: /* fc */ ReactComponentClass[js.Any] => ReactComponentClass[js.Any],
    debug: typingsSlinky.styletronReact.anon.StackIndex = null
  ): Styletron = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], driver = js.Any.fromFunction2(driver), getInitialStyle = js.Any.fromFunction0(getInitialStyle), reducers = reducers.asInstanceOf[js.Any], wrapper = js.Any.fromFunction1(wrapper))
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styletron]
  }
}

