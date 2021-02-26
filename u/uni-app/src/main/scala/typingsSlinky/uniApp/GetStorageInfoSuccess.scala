package typingsSlinky.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStorageInfoSuccess extends StObject {
  
  /**
    * 当前占用的空间大小, 单位 kb
    */
  var currentSize: js.UndefOr[Double] = js.native
  
  /**
    * 当前storage中所有的 key
    */
  var keys: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * 限制的空间大小，单位kb
    */
  var limitSize: js.UndefOr[Double] = js.native
}
object GetStorageInfoSuccess {
  
  @scala.inline
  def apply(): GetStorageInfoSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStorageInfoSuccess]
  }
  
  @scala.inline
  implicit class GetStorageInfoSuccessMutableBuilder[Self <: GetStorageInfoSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentSize(value: Double): Self = StObject.set(x, "currentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSizeUndefined: Self = StObject.set(x, "currentSize", js.undefined)
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setLimitSize(value: Double): Self = StObject.set(x, "limitSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitSizeUndefined: Self = StObject.set(x, "limitSize", js.undefined)
  }
}
