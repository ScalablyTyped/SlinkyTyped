package typingsSlinky.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageInfo extends ClientValueObject {
  
  def get_bandwidth(): Double = js.native
  
  def get_discussionStorage(): Double = js.native
  
  def get_hits(): Double = js.native
  
  def get_storage(): Double = js.native
  
  def get_storagePercentageUsed(): Double = js.native
  
  def get_visits(): Double = js.native
}
object UsageInfo {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_bandwidth: () => Double,
    get_discussionStorage: () => Double,
    get_hits: () => Double,
    get_storage: () => Double,
    get_storagePercentageUsed: () => Double,
    get_typeId: () => String,
    get_visits: () => Double,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): UsageInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_bandwidth = js.Any.fromFunction0(get_bandwidth), get_discussionStorage = js.Any.fromFunction0(get_discussionStorage), get_hits = js.Any.fromFunction0(get_hits), get_storage = js.Any.fromFunction0(get_storage), get_storagePercentageUsed = js.Any.fromFunction0(get_storagePercentageUsed), get_typeId = js.Any.fromFunction0(get_typeId), get_visits = js.Any.fromFunction0(get_visits), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[UsageInfo]
  }
  
  @scala.inline
  implicit class UsageInfoMutableBuilder[Self <: UsageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_bandwidth(value: () => Double): Self = StObject.set(x, "get_bandwidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_discussionStorage(value: () => Double): Self = StObject.set(x, "get_discussionStorage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_hits(value: () => Double): Self = StObject.set(x, "get_hits", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_storage(value: () => Double): Self = StObject.set(x, "get_storage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_storagePercentageUsed(value: () => Double): Self = StObject.set(x, "get_storagePercentageUsed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_visits(value: () => Double): Self = StObject.set(x, "get_visits", js.Any.fromFunction0(value))
  }
}
