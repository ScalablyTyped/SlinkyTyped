package typingsSlinky.weappApi.mod.wx

import typingsSlinky.weappApi.weappApiStrings.`2g`
import typingsSlinky.weappApi.weappApiStrings.`3g`
import typingsSlinky.weappApi.weappApiStrings.`4g`
import typingsSlinky.weappApi.weappApiStrings.wifi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkTypeData extends StObject {
  
  /** 返回网络类型2g，3g，4g，wifi */
  var networkType: `2g` | `3g` | `4g` | wifi = js.native
}
object NetworkTypeData {
  
  @scala.inline
  def apply(networkType: `2g` | `3g` | `4g` | wifi): NetworkTypeData = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkTypeData]
  }
  
  @scala.inline
  implicit class NetworkTypeDataMutableBuilder[Self <: NetworkTypeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkType(value: `2g` | `3g` | `4g` | wifi): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
  }
}
