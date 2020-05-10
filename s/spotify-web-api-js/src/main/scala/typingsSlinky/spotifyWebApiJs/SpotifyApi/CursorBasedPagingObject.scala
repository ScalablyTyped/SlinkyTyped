package typingsSlinky.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class CursorBasedPagingObjectOps[Self[t] <: CursorBasedPagingObject[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCursors(value: CursorObject): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHref(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNext(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

