package typingsSlinky.uifabricUtilities

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultRender[T] extends js.Object {
  var defaultRender: js.UndefOr[ReactComponentClass[T]] = js.native
}

object AnonDefaultRender {
  @scala.inline
  def apply[T](): AnonDefaultRender[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDefaultRender[T]]
  }
  @scala.inline
  implicit class AnonDefaultRenderOps[Self[t] <: AnonDefaultRender[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDefaultRenderFunctionComponent(value: ReactComponentClass[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRenderComponentClass(value: ReactComponentClass[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultRender(value: ReactComponentClass[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRender: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRender")(js.undefined)
        ret
    }
  }
  
}

