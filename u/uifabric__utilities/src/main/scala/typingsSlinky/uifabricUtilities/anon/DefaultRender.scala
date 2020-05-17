package typingsSlinky.uifabricUtilities.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultRender[T] extends js.Object {
  var defaultRender: js.UndefOr[ReactComponentClass[T]] = js.native
}

object DefaultRender {
  @scala.inline
  def apply[T](): DefaultRender[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultRender[T]]
  }
  @scala.inline
  implicit class DefaultRenderOps[Self[t] <: DefaultRender[t], T] (val x: Self[T]) extends AnyVal {
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

