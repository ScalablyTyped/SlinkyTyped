package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod

import typingsSlinky.ibmCloudSdkCore.helperMod.FileObject
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContainedContentType
import typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod.AddAudioConstants.ContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `addAudio` operation. */
@js.native
trait AddAudioParams extends js.Object {
  /** If `true`, the specified audio resource overwrites an existing audio resource with the same name. If `false`, the request fails if an audio resource with the same name already exists. The parameter has no effect if an audio resource with the same name does not already exist. */
  var allow_overwrite: js.UndefOr[Boolean] = js.native
  /** The name of the new audio resource for the custom acoustic model. Use a localized name that matches the language of the custom model and reflects the contents of the resource. * Include a maximum of 128 characters in the name. * Do not include spaces, slashes, or backslashes in the name. * Do not use the name of an audio resource that has already been added to the custom model. */
  var audio_name: String = js.native
  /** The audio resource that is to be added to the custom acoustic model, an individual audio file or an archive file. */
  var audio_resource: ReadableStream | FileObject | Buffer = js.native
  /** **For an archive-type resource,** specify the format of the audio files that are contained in the archive file if they are of type `audio/alaw`, `audio/basic`, `audio/l16`, or `audio/mulaw`. Include the `rate`, `channels`, and `endianness` parameters where necessary. In this case, all audio files that are contained in the archive file must be of the indicated type. For all other audio formats, you can omit the header. In this case, the audio files can be of multiple types as long as they are not of the types listed in the previous paragraph. The parameter accepts all of the audio formats that are supported for use with speech recognition. For more information, see **Content types for audio-type resources** in the method description. **For an audio-type resource,** omit the header. */
  var contained_content_type: js.UndefOr[ContainedContentType | String] = js.native
  /** For an audio-type resource, the format (MIME type) of the audio. For more information, see **Content types for audio-type resources** in the method description. For an archive-type resource, the media type of the archive file. For more information, see **Content types for archive-type resources** in the method description. */
  var content_type: js.UndefOr[ContentType | String] = js.native
  /** The customization ID (GUID) of the custom acoustic model that is to be used for the request. You must make the request with credentials for the instance of the service that owns the custom model. */
  var customization_id: String = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var return_response: js.UndefOr[Boolean] = js.native
}

object AddAudioParams {
  @scala.inline
  def apply(audio_name: String, audio_resource: ReadableStream | FileObject | Buffer, customization_id: String): AddAudioParams = {
    val __obj = js.Dynamic.literal(audio_name = audio_name.asInstanceOf[js.Any], audio_resource = audio_resource.asInstanceOf[js.Any], customization_id = customization_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAudioParams]
  }
  @scala.inline
  implicit class AddAudioParamsOps[Self <: AddAudioParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudio_resource(value: ReadableStream | FileObject | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio_resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomization_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customization_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_overwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_overwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_overwrite")(js.undefined)
        ret
    }
    @scala.inline
    def withContained_content_type(value: ContainedContentType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contained_content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContained_content_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contained_content_type")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_type(value: ContentType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(js.undefined)
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

