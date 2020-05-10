package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemModel extends js.Object {
  var _links: js.Any = js.native
  var contentMetadata: FileContentMetadata = js.native
  var isFolder: Boolean = js.native
  var isSymLink: Boolean = js.native
  var path: String = js.native
  var url: String = js.native
}

object ItemModel {
  @scala.inline
  def apply(
    _links: js.Any,
    contentMetadata: FileContentMetadata,
    isFolder: Boolean,
    isSymLink: Boolean,
    path: String,
    url: String
  ): ItemModel = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], contentMetadata = contentMetadata.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], isSymLink = isSymLink.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemModel]
  }
  @scala.inline
  implicit class ItemModelOps[Self <: ItemModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentMetadata(value: FileContentMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFolder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSymLink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSymLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

