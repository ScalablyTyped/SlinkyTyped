package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionFilterResultMetadata extends js.Object {
  /**
    * The metadata items for the category
    */
  var metadataItems: js.Array[MetadataItem] = js.native
  /**
    * Defines the category of metadata items
    */
  var metadataType: String = js.native
}

object ExtensionFilterResultMetadata {
  @scala.inline
  def apply(metadataItems: js.Array[MetadataItem], metadataType: String): ExtensionFilterResultMetadata = {
    val __obj = js.Dynamic.literal(metadataItems = metadataItems.asInstanceOf[js.Any], metadataType = metadataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionFilterResultMetadata]
  }
  @scala.inline
  implicit class ExtensionFilterResultMetadataOps[Self <: ExtensionFilterResultMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadataItems(value: js.Array[MetadataItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadataType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

