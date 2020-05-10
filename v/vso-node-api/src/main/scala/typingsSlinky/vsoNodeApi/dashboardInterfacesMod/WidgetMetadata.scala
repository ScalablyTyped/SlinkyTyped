package typingsSlinky.vsoNodeApi.dashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetMetadata extends js.Object {
  /**
    * Sizes supported by the Widget.
    */
  var allowedSizes: js.Array[WidgetSize] = js.native
  /**
    * Opt-in boolean that indicates if the widget requires the Analytics Service to function. Widgets requiring the analytics service are hidden from the catalog if the Analytics Service is not available.
    */
  var analyticsServiceRequired: Boolean = js.native
  /**
    * Resource for an icon in the widget catalog.
    */
  var catalogIconUrl: String = js.native
  /**
    * Opt-in URL string pointing at widget information. Defaults to extension marketplace URL if omitted
    */
  var catalogInfoUrl: String = js.native
  /**
    * The id of the underlying contribution defining the supplied Widget custom configuration UI. Null if custom configuration UI is not available.
    */
  var configurationContributionId: String = js.native
  /**
    * The relative id of the underlying contribution defining the supplied Widget custom configuration UI. Null if custom configuration UI is not available.
    */
  var configurationContributionRelativeId: String = js.native
  /**
    * Indicates if the widget requires configuration before being added to dashboard.
    */
  var configurationRequired: Boolean = js.native
  /**
    * Uri for the widget content to be loaded from .
    */
  var contentUri: String = js.native
  /**
    * The id of the underlying contribution defining the supplied Widget.
    */
  var contributionId: String = js.native
  /**
    * Optional default settings to be copied into widget settings.
    */
  var defaultSettings: String = js.native
  /**
    * Summary information describing the widget.
    */
  var description: String = js.native
  /**
    * Widgets can be disabled by the app store.  We'll need to gracefully handle for: - persistence (Allow) - Requests (Tag as disabled, and provide context)
    */
  var isEnabled: Boolean = js.native
  /**
    * Opt-out boolean that indicates if the widget supports widget name/title configuration. Widgets ignoring the name should set it to false in the manifest.
    */
  var isNameConfigurable: Boolean = js.native
  /**
    * Opt-out boolean indicating if the widget is hidden from the catalog. Commonly, this is used to allow developers to disable creation of a deprecated widget. A widget must have a functional default state, or have a configuration experience, in order to be visible from the catalog.
    */
  var isVisibleFromCatalog: Boolean = js.native
  /**
    * Opt-in properties for customizing widget presentation in a "lightbox" dialog.
    */
  var lightboxOptions: LightboxOptions = js.native
  /**
    * Resource for a loading placeholder image on dashboard
    */
  var loadingImageUrl: String = js.native
  /**
    * User facing name of the widget type. Each widget must use a unique value here.
    */
  var name: String = js.native
  /**
    * Publisher Name of this kind of widget.
    */
  var publisherName: String = js.native
  /**
    * Data contract required for the widget to function and to work in its container.
    */
  var supportedScopes: js.Array[WidgetScope] = js.native
  /**
    * Contribution target IDs
    */
  var targets: js.Array[String] = js.native
  /**
    * Deprecated: locally unique developer-facing id of this kind of widget. ContributionId provides a globally unique identifier for widget types.
    */
  var typeId: String = js.native
}

object WidgetMetadata {
  @scala.inline
  def apply(
    allowedSizes: js.Array[WidgetSize],
    analyticsServiceRequired: Boolean,
    catalogIconUrl: String,
    catalogInfoUrl: String,
    configurationContributionId: String,
    configurationContributionRelativeId: String,
    configurationRequired: Boolean,
    contentUri: String,
    contributionId: String,
    defaultSettings: String,
    description: String,
    isEnabled: Boolean,
    isNameConfigurable: Boolean,
    isVisibleFromCatalog: Boolean,
    lightboxOptions: LightboxOptions,
    loadingImageUrl: String,
    name: String,
    publisherName: String,
    supportedScopes: js.Array[WidgetScope],
    targets: js.Array[String],
    typeId: String
  ): WidgetMetadata = {
    val __obj = js.Dynamic.literal(allowedSizes = allowedSizes.asInstanceOf[js.Any], analyticsServiceRequired = analyticsServiceRequired.asInstanceOf[js.Any], catalogIconUrl = catalogIconUrl.asInstanceOf[js.Any], catalogInfoUrl = catalogInfoUrl.asInstanceOf[js.Any], configurationContributionId = configurationContributionId.asInstanceOf[js.Any], configurationContributionRelativeId = configurationContributionRelativeId.asInstanceOf[js.Any], configurationRequired = configurationRequired.asInstanceOf[js.Any], contentUri = contentUri.asInstanceOf[js.Any], contributionId = contributionId.asInstanceOf[js.Any], defaultSettings = defaultSettings.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isNameConfigurable = isNameConfigurable.asInstanceOf[js.Any], isVisibleFromCatalog = isVisibleFromCatalog.asInstanceOf[js.Any], lightboxOptions = lightboxOptions.asInstanceOf[js.Any], loadingImageUrl = loadingImageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], supportedScopes = supportedScopes.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetMetadata]
  }
  @scala.inline
  implicit class WidgetMetadataOps[Self <: WidgetMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedSizes(value: js.Array[WidgetSize]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnalyticsServiceRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analyticsServiceRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCatalogIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogIconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCatalogInfoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogInfoUrl")(value.asInstanceOf[js.Any])
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
    def withConfigurationRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationRequired")(value.asInstanceOf[js.Any])
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
    def withDefaultSettings(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
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
    def withIsVisibleFromCatalog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisibleFromCatalog")(value.asInstanceOf[js.Any])
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
    def withPublisherName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisherName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedScopes(value: js.Array[WidgetScope]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

