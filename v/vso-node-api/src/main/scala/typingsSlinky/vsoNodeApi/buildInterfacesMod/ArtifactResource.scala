package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactResource extends js.Object {
  var _links: js.Any = js.native
  /**
    * Type-specific data about the artifact.
    */
  var data: String = js.native
  /**
    * A link to download the resource.
    */
  var downloadUrl: String = js.native
  /**
    * Type-specific properties of the artifact.
    */
  var properties: StringDictionary[String] = js.native
  /**
    * The type of the resource: File container, version control folder, UNC path, etc.
    */
  var `type`: String = js.native
  /**
    * The full http link to the resource.
    */
  var url: String = js.native
}

object ArtifactResource {
  @scala.inline
  def apply(
    _links: js.Any,
    data: String,
    downloadUrl: String,
    properties: StringDictionary[String],
    `type`: String,
    url: String
  ): ArtifactResource = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], downloadUrl = downloadUrl.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactResource]
  }
  @scala.inline
  implicit class ArtifactResourceOps[Self <: ArtifactResource] (val x: Self) extends AnyVal {
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
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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

