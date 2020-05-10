package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionManifest extends js.Object {
  /**
    * Uri used as base for other relative uri's defined in extension
    */
  var baseUri: String = js.native
  /**
    * List of shared constraints defined by this extension
    */
  var constraints: js.Array[ContributionConstraint] = js.native
  /**
    * List of contribution types defined by this extension
    */
  var contributionTypes: js.Array[ContributionType] = js.native
  /**
    * List of contributions made by this extension
    */
  var contributions: js.Array[Contribution] = js.native
  /**
    * List of explicit demands required by this extension
    */
  var demands: js.Array[String] = js.native
  /**
    * Collection of endpoints that get called when particular extension events occur
    */
  var eventCallbacks: ExtensionEventCallbackCollection = js.native
  /**
    * Secondary location that can be used as base for other relative uri's defined in extension
    */
  var fallbackBaseUri: String = js.native
  /**
    * Language Culture Name set by the Gallery
    */
  var language: String = js.native
  /**
    * How this extension behaves with respect to licensing
    */
  var licensing: ExtensionLicensing = js.native
  /**
    * Version of the extension manifest format/content
    */
  var manifestVersion: Double = js.native
  /**
    * Default user claims applied to all contributions (except the ones which have been speficied restrictedTo explicitly) to control the visibility of a contribution.
    */
  var restrictedTo: js.Array[String] = js.native
  /**
    * List of all oauth scopes required by this extension
    */
  var scopes: js.Array[String] = js.native
  /**
    * The ServiceInstanceType(Guid) of the VSTS service that must be available to an account in order for the extension to be installed
    */
  var serviceInstanceType: String = js.native
}

object ExtensionManifest {
  @scala.inline
  def apply(
    baseUri: String,
    constraints: js.Array[ContributionConstraint],
    contributionTypes: js.Array[ContributionType],
    contributions: js.Array[Contribution],
    demands: js.Array[String],
    eventCallbacks: ExtensionEventCallbackCollection,
    fallbackBaseUri: String,
    language: String,
    licensing: ExtensionLicensing,
    manifestVersion: Double,
    restrictedTo: js.Array[String],
    scopes: js.Array[String],
    serviceInstanceType: String
  ): ExtensionManifest = {
    val __obj = js.Dynamic.literal(baseUri = baseUri.asInstanceOf[js.Any], constraints = constraints.asInstanceOf[js.Any], contributionTypes = contributionTypes.asInstanceOf[js.Any], contributions = contributions.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], eventCallbacks = eventCallbacks.asInstanceOf[js.Any], fallbackBaseUri = fallbackBaseUri.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], licensing = licensing.asInstanceOf[js.Any], manifestVersion = manifestVersion.asInstanceOf[js.Any], restrictedTo = restrictedTo.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], serviceInstanceType = serviceInstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionManifest]
  }
  @scala.inline
  implicit class ExtensionManifestOps[Self <: ExtensionManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstraints(value: js.Array[ContributionConstraint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContributionTypes(value: js.Array[ContributionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributionTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContributions(value: js.Array[Contribution]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contributions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDemands(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventCallbacks(value: ExtensionEventCallbackCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventCallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallbackBaseUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackBaseUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicensing(value: ExtensionLicensing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licensing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifestVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifestVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictedTo(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictedTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceInstanceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceInstanceType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

