package typingsSlinky.testingLibraryReactHooks.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderHookOptions[P] extends js.Object {
  var initialProps: js.UndefOr[P] = js.native
  var wrapper: js.UndefOr[ReactComponentClass[js.Object]] = js.native
}

object RenderHookOptions {
  @scala.inline
  def apply[P](): RenderHookOptions[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderHookOptions[P]]
  }
  @scala.inline
  implicit class RenderHookOptionsOps[Self[p] <: RenderHookOptions[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withInitialProps(value: P): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialProps: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialProps")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperFunctionComponent(value: ReactComponentClass[js.Object]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapperComponentClass(value: ReactComponentClass[js.Object]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: ReactComponentClass[js.Object]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapper: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.undefined)
        ret
    }
  }
  
}

