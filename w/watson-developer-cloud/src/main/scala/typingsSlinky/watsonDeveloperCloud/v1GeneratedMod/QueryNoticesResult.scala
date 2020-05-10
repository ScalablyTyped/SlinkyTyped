package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryNoticesResult. */
@js.native
trait QueryNoticesResult
  extends /** DialogNodeOutput accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  /** The internal status code returned by the ingestion subsystem indicating the overall result of ingesting the source document. */
  var code: js.UndefOr[Double] = js.native
  /** The collection ID of the collection containing the document for this result. */
  var collection_id: js.UndefOr[String] = js.native
  /** The type of the original source file. */
  var file_type: js.UndefOr[String] = js.native
  /** Name of the original source file (if available). */
  var filename: js.UndefOr[String] = js.native
  /** The unique identifier of the document. */
  var id: js.UndefOr[String] = js.native
  /** Metadata of the document. */
  var metadata: js.UndefOr[js.Object] = js.native
  /** Array of notices for the document. */
  var notices: js.UndefOr[js.Array[Notice]] = js.native
  /** Metadata of a query result. */
  var result_metadata: js.UndefOr[QueryResultMetadata] = js.native
  /** The SHA-1 hash of the original source file (formatted as a hexadecimal string). */
  var sha1: js.UndefOr[String] = js.native
  /** Automatically extracted result title. */
  var title: js.UndefOr[String] = js.native
}

object QueryNoticesResult {
  @scala.inline
  def apply(): QueryNoticesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryNoticesResult]
  }
  @scala.inline
  implicit class QueryNoticesResultOps[Self <: QueryNoticesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withCollection_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollection_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection_id")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_type")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withNotices(value: js.Array[Notice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notices")(js.undefined)
        ret
    }
    @scala.inline
    def withResult_metadata(value: QueryResultMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult_metadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result_metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withSha1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSha1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha1")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

