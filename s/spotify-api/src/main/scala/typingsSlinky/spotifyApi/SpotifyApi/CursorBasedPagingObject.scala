package typingsSlinky.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cursor Based Paging Object wrappers used for retrieving collections from the Spotify API.
  * [](https://developer.spotify.com/web-api/object-model/#cursor-based-paging-object)
  */
@js.native
trait CursorBasedPagingObject[T] extends js.Object {
  
  var cursors: CursorObject = js.native
  
  var href: String = js.native
  
  var items: js.Array[T] = js.native
  
  var limit: Double = js.native
  
  var next: String = js.native
  
  var total: js.UndefOr[Double] = js.native
}
object CursorBasedPagingObject {
  
  @scala.inline
  def apply[T](cursors: CursorObject, href: String, items: js.Array[T], limit: Double, next: String): CursorBasedPagingObject[T] = {
    val __obj = js.Dynamic.literal(cursors = cursors.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorBasedPagingObject[T]]
  }
  
  @scala.inline
  implicit class CursorBasedPagingObjectOps[Self <: CursorBasedPagingObject[_], T] (val x: Self with CursorBasedPagingObject[T]) extends AnyVal {
    
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
    def setCursors(value: CursorObject): Self = this.set("cursors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: T*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[T]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
