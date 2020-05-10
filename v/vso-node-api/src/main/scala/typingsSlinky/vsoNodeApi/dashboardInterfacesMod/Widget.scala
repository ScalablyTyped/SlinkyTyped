package typingsSlinky.vsoNodeApi.dashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Widget extends js.Object {
  var _links: js.Any = js.native
  /**
    * Refers to the allowed sizes for the widget. This gets populated when user wants to configure the widget
    */
  var allowedSizes: js.Array[WidgetSize] = js.native
  /**
    * Refers to unique identifier of a feature artifact. Used for pinning+unpinning a specific artifact.
    */
  var artifactId: String = js.native
  var configurationContributionId: String = js.native
  var configurationContributionRelativeId: String = js.native
  var contentUri: String = js.native
  /**
    * The id of the underlying contribution defining the supplied Widget Configuration.
    */
  var contributionId: String = js.native
  /**
    * Optional partial dashboard content, to support exchanging dashboard-level version ETag for widget-level APIs
    */
  var dashboard: Dashboard = js.native
  var eTag: String = js.native
  var id: String = js.native
  var isEnabled: Boolean = js.native
  var isNameConfigurable: Boolean = js.native
  var lightboxOptions: LightboxOptions = js.native
  var loadingImageUrl: String = js.native
  var name: String = js.native
  var position: WidgetPosition = js.native
  var settings: String = js.native
  var settingsVersion: SemanticVersion = js.native
  var size: WidgetSize = js.native
  var typeId: String = js.native
  var url: String = js.native
}

object Widget {
  @scala.inline
  def apply(
    _links: js.Any,
    allowedSizes: js.Array[WidgetSize],
    artifactId: String,
    configurationContributionId: String,
    configurationContributionRelativeId: String,
    contentUri: String,
    contributionId: String,
    dashboard: Dashboard,
    eTag: String,
    id: String,
    isEnabled: Boolean,
    isNameConfigurable: Boolean,
    lightboxOptions: LightboxOptions,
    loadingImageUrl: String,
    name: String,
    position: WidgetPosition,
    settings: String,
    settingsVersion: SemanticVersion,
    size: WidgetSize,
    typeId: String,
    url: String
  ): Widget = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], allowedSizes = allowedSizes.asInstanceOf[js.Any], artifactId = artifactId.asInstanceOf[js.Any], configurationContributionId = configurationContributionId.asInstanceOf[js.Any], configurationContributionRelativeId = configurationContributionRelativeId.asInstanceOf[js.Any], contentUri = contentUri.asInstanceOf[js.Any], contributionId = contributionId.asInstanceOf[js.Any], dashboard = dashboard.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isNameConfigurable = isNameConfigurable.asInstanceOf[js.Any], lightboxOptions = lightboxOptions.asInstanceOf[js.Any], loadingImageUrl = loadingImageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], settingsVersion = settingsVersion.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Widget]
  }
  @scala.inline
  implicit class WidgetOps[Self <: Widget] (val x: Self) extends AnyVal {
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
    def withAllowedSizes(value: js.Array[WidgetSize]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtifactId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifactId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationContributionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationContributionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationContributionRelativeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationContributionRelativeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContributionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDashboard(value: Dashboard): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withETag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNameConfigurable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNameConfigurable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightboxOptions(value: LightboxOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightboxOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadingImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: WidgetPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettingsVersion(value: SemanticVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settingsVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: WidgetSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeId")(value.asInstanceOf[js.Any])
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

