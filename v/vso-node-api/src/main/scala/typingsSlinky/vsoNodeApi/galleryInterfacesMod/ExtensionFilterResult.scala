package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionFilterResult extends js.Object {
  /**
    * This is the set of appplications that matched the query filter supplied.
    */
  var extensions: js.Array[PublishedExtension] = js.native
  /**
    * The PagingToken is returned from a request when more records exist that match the result than were requested or could be returned. A follow-up query with this paging token can be used to retrieve more results.
    */
  var pagingToken: String = js.native
  /**
    * This is the additional optional metadata for the given result. E.g. Total count of results which is useful in case of paged results
    */
  var resultMetadata: js.Array[ExtensionFilterResultMetadata] = js.native
}

object ExtensionFilterResult {
  @scala.inline
  def apply(
    extensions: js.Array[PublishedExtension],
    pagingToken: String,
    resultMetadata: js.Array[ExtensionFilterResultMetadata]
  ): ExtensionFilterResult = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], pagingToken = pagingToken.asInstanceOf[js.Any], resultMetadata = resultMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionFilterResult]
  }
  @scala.inline
  implicit class ExtensionFilterResultOps[Self <: ExtensionFilterResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensions(value: js.Array[PublishedExtension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPagingToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultMetadata(value: js.Array[ExtensionFilterResultMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultMetadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

