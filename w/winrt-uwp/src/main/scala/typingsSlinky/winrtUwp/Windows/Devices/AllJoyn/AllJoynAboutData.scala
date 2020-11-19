package typingsSlinky.winrtUwp.Windows.Devices.AllJoyn

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import typingsSlinky.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppNames(value: IMap[String, String]): Self = this.set("appNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateOfManufacture(value: js.Date): Self = this.set("dateOfManufacture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAppName(value: String): Self = this.set("defaultAppName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDescription(value: String): Self = this.set("defaultDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultManufacturer(value: String): Self = this.set("defaultManufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptions(value: IMap[String, String]): Self = this.set("descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturers(value: IMap[String, String]): Self = this.set("manufacturers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelNumber(value: String): Self = this.set("modelNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareVersion(value: String): Self = this.set("softwareVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportUrl(value: Uri): Self = this.set("supportUrl", value.asInstanceOf[js.Any])
  }
}
