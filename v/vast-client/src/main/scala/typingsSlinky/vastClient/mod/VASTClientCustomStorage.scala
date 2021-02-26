package typingsSlinky.vastClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VASTClientCustomStorage
  extends /* key */ StringDictionary[js.Any | js.Function0[_]] {
  
  def getItem(key: String): String | Null = js.native
  
  def setItem(key: String, `val`: String): Unit = js.native
}
object VASTClientCustomStorage {
  
  @scala.inline
  def apply(getItem: String => String | Null, setItem: (String, String) => Unit): VASTClientCustomStorage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[VASTClientCustomStorage]
  }
  
  @scala.inline
  implicit class VASTClientCustomStorageMutableBuilder[Self <: VASTClientCustomStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetItem(value: String => String | Null): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItem(value: (String, String) => Unit): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
  }
}
