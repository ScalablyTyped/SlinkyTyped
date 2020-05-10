package typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiResourceLocation extends js.Object {
  /**
    * Area name for this resource
    */
  var area: String = js.native
  /**
    * Unique Identifier for this location
    */
  var id: String = js.native
  /**
    * Maximum api version that this resource supports (current server version for this resource)
    */
  var maxVersion: String = js.native
  /**
    * Minimum api version that this resource supports
    */
  var minVersion: String = js.native
  /**
    * The latest version of this resource location that is in "Release" (non-preview) mode
    */
  var releasedVersion: String = js.native
  /**
    * Resource name
    */
  var resourceName: String = js.native
  /**
    * The current resource version supported by this resource location
    */
  var resourceVersion: Double = js.native
  /**
    * This location's route template (templated relative path)
    */
  var routeTemplate: String = js.native
}

object ApiResourceLocation {
  @scala.inline
  def apply(
    area: String,
    id: String,
    maxVersion: String,
    minVersion: String,
    releasedVersion: String,
    resourceName: String,
    resourceVersion: Double,
    routeTemplate: String
  ): ApiResourceLocation = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxVersion = maxVersion.asInstanceOf[js.Any], minVersion = minVersion.asInstanceOf[js.Any], releasedVersion = releasedVersion.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], routeTemplate = routeTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiResourceLocation]
  }
  @scala.inline
  implicit class ApiResourceLocationOps[Self <: ApiResourceLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
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
    def withReleasedVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releasedVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouteTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeTemplate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

