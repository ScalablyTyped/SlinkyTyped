package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import typingsSlinky.vsoNodeApi.anon.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionDraft extends js.Object {
  var assets: js.Array[ExtensionDraftAsset] = js.native
  var createdDate: js.Date = js.native
  var draftState: DraftStateType = js.native
  var extensionName: String = js.native
  var id: String = js.native
  var lastUpdated: js.Date = js.native
  var payload: ExtensionPayload = js.native
  var product: String = js.native
  var publisherName: String = js.native
  var validationErrors: js.Array[KeyValue] = js.native
  var validationWarnings: js.Array[KeyValue] = js.native
}

object ExtensionDraft {
  @scala.inline
  def apply(
    assets: js.Array[ExtensionDraftAsset],
    createdDate: js.Date,
    draftState: DraftStateType,
    extensionName: String,
    id: String,
    lastUpdated: js.Date,
    payload: ExtensionPayload,
    product: String,
    publisherName: String,
    validationErrors: js.Array[KeyValue],
    validationWarnings: js.Array[KeyValue]
  ): ExtensionDraft = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], draftState = draftState.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], validationErrors = validationErrors.asInstanceOf[js.Any], validationWarnings = validationWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionDraft]
  }
  @scala.inline
  implicit class ExtensionDraftOps[Self <: ExtensionDraft] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssets(value: js.Array[ExtensionDraftAsset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraftState(value: DraftStateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draftState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: ExtensionPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProduct(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublisherName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationErrors(value: js.Array[KeyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidationWarnings(value: js.Array[KeyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationWarnings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

