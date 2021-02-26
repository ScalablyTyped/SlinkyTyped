package typingsSlinky.tizenTvWebapis

import typingsSlinky.tizenTvWebapis.webapisMod.ErrorCallback
import typingsSlinky.tizenTvWebapis.webapisMod.SuccessCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetdataMod {
  
  @js.native
  trait WidgetDataManager extends StObject {
    
    /**
      * Retrieves the plugin version number.
      * @returns string value of plugin's version
      * @throw WebAPIException with error type SecurityError, if the application does not have the privilege to call this method.
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/widgetdata
      * @since 2.3
      */
    def getVersion(): String = js.native
    
    /**
      * Reads encrypted data.
      * @param onsuccess Callback method to invoke when the data is successfully read
      * @param onerror Callback method to invoke if an error occurs
      * NotFoundError, if no file was found in the local path.
      * SecurityError, if the application does not have the privilege to call this method.
      * UnknownError, if any other error occurs.
      * @return void
      * @throw WebAPIException TypeMismatchError
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/widgetdata
      * @since 4.0
      * @note If you need to share a file created by the widgetdata api with another c or c# app, you need to use one more privilege(http://tizen.org/privilege/appdir.shareddata)
      */
    def read(onsuccess: SuccessCallback): Unit = js.native
    def read(onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
    
    /**
      * Removes encrypted data.
      * @param onsuccess Callback method to invoke when the data is successfully removed
      * @param onerror Callback method to invoke if an error occurs
      * NotFoundError, if no file was found in the local path.
      * SecurityError, if the application does not have the privilege to call this method.
      * UnknownError, if any other error occurs.
      * @return void
      * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/widgetdata
      * @since 4.0
      * @note If you need to share a file created by the widgetdata api with another c or c# app, you need to use one more privilege(http://tizen.org/privilege/appdir.shareddata)
      */
    def remove(): Unit = js.native
    def remove(onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
    def remove(onsuccess: SuccessCallback): Unit = js.native
    def remove(onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
    
    /**
      * Writes encrypted data.
      * @param data Data, up to 20000 characters
      * @param onsuccess Callback method to invoke when the data is successfully written
      * @param onerror Callback method to invoke if an error occurs
      * DOMStringSizeError, if any of the input parameters exceeds the limited size.
      * SecurityError, if the application does not have the privilege to call this method.
      * UnknownError, if any other error occurs.
      * @return void
      * @throw WebAPIException with error type TypeMismatchError, if an input parameter is not compatible with its expected type.
      * @privilegeLevel Public
      * @privilegeName http://developer.samsung.com/privilege/widgetdata
      * @since 4.0
      * @note If you need to share a file created by the widgetdata api with another c or c# app, you need to use one more privilege(http://tizen.org/privilege/appdir.shareddata)
      */
    def write(data: String): Unit = js.native
    def write(data: String, onsuccess: js.UndefOr[scala.Nothing], onerror: ErrorCallback): Unit = js.native
    def write(data: String, onsuccess: SuccessCallback): Unit = js.native
    def write(data: String, onsuccess: SuccessCallback, onerror: ErrorCallback): Unit = js.native
  }
}
