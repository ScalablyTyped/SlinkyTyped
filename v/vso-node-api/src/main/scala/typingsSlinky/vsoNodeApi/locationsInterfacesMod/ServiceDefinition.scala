package typingsSlinky.vsoNodeApi.locationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceDefinition extends js.Object {
  var description: String = js.native
  var displayName: String = js.native
  var identifier: String = js.native
  var inheritLevel: InheritLevel = js.native
  var locationMappings: js.Array[LocationMapping] = js.native
  /**
    * Maximum api version that this resource supports (current server version for this resource). Copied from <c>ApiResourceLocation</c>.
    */
  var maxVersion: String = js.native
  /**
    * Minimum api version that this resource supports. Copied from <c>ApiResourceLocation</c>.
    */
  var minVersion: String = js.native
  var parentIdentifier: String = js.native
  var parentServiceType: String = js.native
  var properties: js.Any = js.native
  var relativePath: String = js.native
  var relativeToSetting: RelativeToSetting = js.native
  /**
    * The latest version of this resource location that is in "Release" (non-preview) mode. Copied from <c>ApiResourceLocation</c>.
    */
  var releasedVersion: String = js.native
  /**
    * The current resource version supported by this resource location. Copied from <c>ApiResourceLocation</c>.
    */
  var resourceVersion: Double = js.native
  /**
    * The service which owns this definition e.g. TFS, ELS, etc.
    */
  var serviceOwner: String = js.native
  var serviceType: String = js.native
  var status: ServiceStatus = js.native
  var toolId: String = js.native
}

object ServiceDefinition {
  @scala.inline
  def apply(
    description: String,
    displayName: String,
    identifier: String,
    inheritLevel: InheritLevel,
    locationMappings: js.Array[LocationMapping],
    maxVersion: String,
    minVersion: String,
    parentIdentifier: String,
    parentServiceType: String,
    properties: js.Any,
    relativePath: String,
    relativeToSetting: RelativeToSetting,
    releasedVersion: String,
    resourceVersion: Double,
    serviceOwner: String,
    serviceType: String,
    status: ServiceStatus,
    toolId: String
  ): ServiceDefinition = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], inheritLevel = inheritLevel.asInstanceOf[js.Any], locationMappings = locationMappings.asInstanceOf[js.Any], maxVersion = maxVersion.asInstanceOf[js.Any], minVersion = minVersion.asInstanceOf[js.Any], parentIdentifier = parentIdentifier.asInstanceOf[js.Any], parentServiceType = parentServiceType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any], relativeToSetting = relativeToSetting.asInstanceOf[js.Any], releasedVersion = releasedVersion.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], serviceOwner = serviceOwner.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], toolId = toolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDefinition]
  }
  @scala.inline
  implicit class ServiceDefinitionOps[Self <: ServiceDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInheritLevel(value: InheritLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocationMappings(value: js.Array[LocationMapping]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentServiceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentServiceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeToSetting(value: RelativeToSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeToSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleasedVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releasedVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ServiceStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

