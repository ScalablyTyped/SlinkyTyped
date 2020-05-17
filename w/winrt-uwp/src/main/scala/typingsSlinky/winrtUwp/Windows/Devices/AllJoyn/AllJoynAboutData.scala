package typingsSlinky.winrtUwp.Windows.Devices.AllJoyn

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to set descriptive information about the app and the device it is running on. */
@js.native
trait AllJoynAboutData extends js.Object {
  /** A globally unique identifier associated with the app. */
  var appId: String = js.native
  /** A collection of language-specific app names. */
  var appNames: IMap[String, String] = js.native
  /** The date of manufacture. */
  var dateOfManufacture: js.Date = js.native
  /** The default app name assigned by the manufacturer- either the developer or the OEM. This property is a shortcut to the entry in the AppNames property for the DefaultLanguage . */
  var defaultAppName: String = js.native
  /** The default description of the app. This property is a shortcut to the entry in the Descriptions property for the DefaultLanguage . */
  var defaultDescription: String = js.native
  /** The name of the manufacturer of the app. This property is a shortcut to the entry in the Manufacturers property for the DefaultLanguage . */
  var defaultManufacturer: String = js.native
  /** A collection of language-specific app description strings. */
  var descriptions: IMap[String, String] = js.native
  /** Indicates if the service should advertise the provided AllJoynAboutData values. */
  var isEnabled: Boolean = js.native
  /** A collection of language-specific manufacturer name strings. */
  var manufacturers: IMap[String, String] = js.native
  /** The model number of the device running the app. */
  var modelNumber: String = js.native
  /** The version number of the app. Use of this property applies to Producer apps. */
  var softwareVersion: String = js.native
  /** A URL to the manufacturer or developer support portal. */
  var supportUrl: Uri = js.native
}

object AllJoynAboutData {
  @scala.inline
  def apply(
    appId: String,
    appNames: IMap[String, String],
    dateOfManufacture: js.Date,
    defaultAppName: String,
    defaultDescription: String,
    defaultManufacturer: String,
    descriptions: IMap[String, String],
    isEnabled: Boolean,
    manufacturers: IMap[String, String],
    modelNumber: String,
    softwareVersion: String,
    supportUrl: Uri
  ): AllJoynAboutData = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], appNames = appNames.asInstanceOf[js.Any], dateOfManufacture = dateOfManufacture.asInstanceOf[js.Any], defaultAppName = defaultAppName.asInstanceOf[js.Any], defaultDescription = defaultDescription.asInstanceOf[js.Any], defaultManufacturer = defaultManufacturer.asInstanceOf[js.Any], descriptions = descriptions.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], manufacturers = manufacturers.asInstanceOf[js.Any], modelNumber = modelNumber.asInstanceOf[js.Any], softwareVersion = softwareVersion.asInstanceOf[js.Any], supportUrl = supportUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynAboutData]
  }
  @scala.inline
  implicit class AllJoynAboutDataOps[Self <: AllJoynAboutData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppNames(value: IMap[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateOfManufacture(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateOfManufacture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultAppName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultManufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescriptions(value: IMap[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManufacturers(value: IMap[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoftwareVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softwareVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportUrl(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

