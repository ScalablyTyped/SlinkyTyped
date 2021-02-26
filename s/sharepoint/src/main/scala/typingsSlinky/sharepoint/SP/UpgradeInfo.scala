package typingsSlinky.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradeInfo extends ClientValueObject {
  
  def get_errorFile(): String = js.native
  
  def get_errors(): Double = js.native
  
  def get_lastUpdated(): js.Date = js.native
  
  def get_logFile(): String = js.native
  
  def get_requestDate(): js.Date = js.native
  
  def get_retryCount(): Double = js.native
  
  def get_startTime(): js.Date = js.native
  
  def get_status(): UpgradeStatus = js.native
  
  def get_upgradeType(): UpgradeType = js.native
  
  def get_warnings(): Double = js.native
}
object UpgradeInfo {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_errorFile: () => String,
    get_errors: () => Double,
    get_lastUpdated: () => js.Date,
    get_logFile: () => String,
    get_requestDate: () => js.Date,
    get_retryCount: () => Double,
    get_startTime: () => js.Date,
    get_status: () => UpgradeStatus,
    get_typeId: () => String,
    get_upgradeType: () => UpgradeType,
    get_warnings: () => Double,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): UpgradeInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_errorFile = js.Any.fromFunction0(get_errorFile), get_errors = js.Any.fromFunction0(get_errors), get_lastUpdated = js.Any.fromFunction0(get_lastUpdated), get_logFile = js.Any.fromFunction0(get_logFile), get_requestDate = js.Any.fromFunction0(get_requestDate), get_retryCount = js.Any.fromFunction0(get_retryCount), get_startTime = js.Any.fromFunction0(get_startTime), get_status = js.Any.fromFunction0(get_status), get_typeId = js.Any.fromFunction0(get_typeId), get_upgradeType = js.Any.fromFunction0(get_upgradeType), get_warnings = js.Any.fromFunction0(get_warnings), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[UpgradeInfo]
  }
  
  @scala.inline
  implicit class UpgradeInfoMutableBuilder[Self <: UpgradeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_errorFile(value: () => String): Self = StObject.set(x, "get_errorFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_errors(value: () => Double): Self = StObject.set(x, "get_errors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_lastUpdated(value: () => js.Date): Self = StObject.set(x, "get_lastUpdated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_logFile(value: () => String): Self = StObject.set(x, "get_logFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_requestDate(value: () => js.Date): Self = StObject.set(x, "get_requestDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_retryCount(value: () => Double): Self = StObject.set(x, "get_retryCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_startTime(value: () => js.Date): Self = StObject.set(x, "get_startTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_status(value: () => UpgradeStatus): Self = StObject.set(x, "get_status", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_upgradeType(value: () => UpgradeType): Self = StObject.set(x, "get_upgradeType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_warnings(value: () => Double): Self = StObject.set(x, "get_warnings", js.Any.fromFunction0(value))
  }
}
