package typingsSlinky.virtualDom.VirtualDOM

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VPatchOptions[T /* <: Element */] extends js.Object {
  
  var patch: js.UndefOr[PatchFn[T]] = js.native
}
object VPatchOptions {
  
  @scala.inline
  def apply[T /* <: Element */](): VPatchOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPatchOptions[T]]
  }
  
  @scala.inline
  implicit class VPatchOptionsOps[Self <: VPatchOptions[_], T /* <: Element */] (val x: Self with VPatchOptions[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPatch(value: (T, /* patches */ js.Array[VPatch], /* renderOptions */ VPatchOptions[T]) => T): Self = this.set("patch", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
  }
}
