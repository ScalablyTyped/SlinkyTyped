package typingsSlinky.vexdb.cacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheEntry[T] extends js.Object {
  
  var expires: Double = js.native
  
  var value: APIResponse[T] = js.native
}
object CacheEntry {
  
  @scala.inline
  def apply[T](expires: Double, value: APIResponse[T]): CacheEntry[T] = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheEntry[T]]
  }
  
  @scala.inline
  implicit class CacheEntryOps[Self <: CacheEntry[_], T] (val x: Self with CacheEntry[T]) extends AnyVal {
    
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
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: APIResponse[T]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
