package typingsSlinky.vsoNodeApi.fileContainerInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileContainer extends js.Object {
  /**
    * Uri of the artifact associated with the container.
    */
  var artifactUri: String = js.native
  /**
    * Download Url for the content of this item.
    */
  var contentLocation: String = js.native
  /**
    * Owner.
    */
  var createdBy: String = js.native
  /**
    * Creation date.
    */
  var dateCreated: js.Date = js.native
  /**
    * Description.
    */
  var description: String = js.native
  /**
    * Id.
    */
  var id: Double = js.native
  /**
    * Location of the item resource.
    */
  var itemLocation: String = js.native
  /**
    * ItemStore Locator for this container.
    */
  var locatorPath: String = js.native
  /**
    * Name.
    */
  var name: String = js.native
  /**
    * Options the container can have.
    */
  var options: ContainerOptions = js.native
  /**
    * Project Id.
    */
  var scopeIdentifier: String = js.native
  /**
    * Security token of the artifact associated with the container.
    */
  var securityToken: String = js.native
  /**
    * Identifier of the optional encryption key.
    */
  var signingKeyId: String = js.native
  /**
    * Total size of the files in bytes.
    */
  var size: Double = js.native
}

object FileContainer {
  @scala.inline
  def apply(
    artifactUri: String,
    contentLocation: String,
    createdBy: String,
    dateCreated: js.Date,
    description: String,
    id: Double,
    itemLocation: String,
    locatorPath: String,
    name: String,
    options: ContainerOptions,
    scopeIdentifier: String,
    securityToken: String,
    signingKeyId: String,
    size: Double
  ): FileContainer = {
    val __obj = js.Dynamic.literal(artifactUri = artifactUri.asInstanceOf[js.Any], contentLocation = contentLocation.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemLocation = itemLocation.asInstanceOf[js.Any], locatorPath = locatorPath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], scopeIdentifier = scopeIdentifier.asInstanceOf[js.Any], securityToken = securityToken.asInstanceOf[js.Any], signingKeyId = signingKeyId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileContainer]
  }
  @scala.inline
  implicit class FileContainerOps[Self <: FileContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifactUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateCreated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocatorPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locatorPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: ContainerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigningKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signingKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

