package typingsSlinky.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get a list of categories
  * 
  * GET /v1/browse/categories
  * https://developer.spotify.com/web-api/get-list-categories/
  */
@js.native
trait MultipleCategoriesResponse extends js.Object {
  var categories: PagingObject[CategoryObject] = js.native
}

object MultipleCategoriesResponse {
  @scala.inline
  def apply(categories: PagingObject[CategoryObject]): MultipleCategoriesResponse = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleCategoriesResponse]
  }
  @scala.inline
  implicit class MultipleCategoriesResponseOps[Self <: MultipleCategoriesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: PagingObject[CategoryObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

