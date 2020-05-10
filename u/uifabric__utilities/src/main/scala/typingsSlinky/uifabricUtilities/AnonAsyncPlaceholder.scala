package typingsSlinky.uifabricUtilities

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAsyncPlaceholder extends js.Object {
  var asyncPlaceholder: js.UndefOr[ReactElement] = js.native
}

object AnonAsyncPlaceholder {
  @scala.inline
  def apply(): AnonAsyncPlaceholder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAsyncPlaceholder]
  }
  @scala.inline
  implicit class AnonAsyncPlaceholderOps[Self <: AnonAsyncPlaceholder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncPlaceholderFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncPlaceholderComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsyncPlaceholder(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsyncPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncPlaceholder")(js.undefined)
        ret
    }
  }
  
}

