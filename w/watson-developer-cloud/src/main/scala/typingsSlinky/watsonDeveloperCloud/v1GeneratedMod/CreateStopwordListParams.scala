package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import typingsSlinky.ibmCloudSdkCore.helperMod.FileObject
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createStopwordList` operation. */
@js.native
trait CreateStopwordListParams extends js.Object {
  /** The ID of the collection. */
  var collection_id: String = js.native
  /** The ID of the environment. */
  var environment_id: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
  /** The content of the stopword list to ingest. */
  var stopword_file: ReadableStream | FileObject | Buffer = js.native
  /** The filename for stopword_file. */
  var stopword_filename: String = js.native
}

object CreateStopwordListParams {
  @scala.inline
  def apply(
    collection_id: String,
    environment_id: String,
    stopword_file: ReadableStream | FileObject | Buffer,
    stopword_filename: String
  ): CreateStopwordListParams = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], stopword_file = stopword_file.asInstanceOf[js.Any], stopword_filename = stopword_filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStopwordListParams]
  }
  @scala.inline
  implicit class CreateStopwordListParamsOps[Self <: CreateStopwordListParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironment_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopword_file(value: ReadableStream | FileObject | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopword_file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopword_filename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopword_filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_response(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_response: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_response")(js.undefined)
        ret
    }
  }
  
}

