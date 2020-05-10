package typingsSlinky.singleSpaReact.mod

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import typingsSlinky.singleSpaReact.TypeofReact
import typingsSlinky.singleSpaReact.TypeofReactDOM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var React: TypeofReact = js.native
  var ReactDOM: TypeofReactDOM = js.native
  var domElementGetter: js.UndefOr[js.Function0[Element]] = js.native
  var loadRootComponent: js.UndefOr[js.Function0[js.Promise[ReactComponentClass[_]]]] = js.native
  var parcelCanUpdate: js.UndefOr[Boolean] = js.native
  var rootComponent: js.UndefOr[ReactComponentClass[_]] = js.native
  var suppressComponentDidCatchWarning: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(React: TypeofReact, ReactDOM: TypeofReactDOM): Options = {
    val __obj = js.Dynamic.literal(React = React.asInstanceOf[js.Any], ReactDOM = ReactDOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReact(value: TypeofReact): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("React")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReactDOM(value: TypeofReactDOM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReactDOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomElementGetter(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domElementGetter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDomElementGetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domElementGetter")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadRootComponent(value: () => js.Promise[ReactComponentClass[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadRootComponent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutLoadRootComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadRootComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withParcelCanUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parcelCanUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParcelCanUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parcelCanUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withRootComponentFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootComponentComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressComponentDidCatchWarning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressComponentDidCatchWarning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressComponentDidCatchWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressComponentDidCatchWarning")(js.undefined)
        ret
    }
  }
  
}

