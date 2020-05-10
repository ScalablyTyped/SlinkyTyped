package typingsSlinky.virtualDom.VirtualDOM

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VPatchOptions[T /* <: Element */] extends js.Object {
  var patch: js.UndefOr[PatchFn[T]] = js.native
}

object VPatchOptions {
  @scala.inline
  def apply[T](): VPatchOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPatchOptions[T]]
  }
  @scala.inline
  implicit class VPatchOptionsOps[Self[t] <: VPatchOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPatch(value: (T, /* patches */ js.Array[VPatch], /* renderOptions */ VPatchOptions[T]) => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutPatch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.undefined)
        ret
    }
  }
  
}

