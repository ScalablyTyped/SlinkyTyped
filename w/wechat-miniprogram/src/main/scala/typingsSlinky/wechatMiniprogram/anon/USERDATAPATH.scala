package typingsSlinky.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USERDATAPATH extends StObject {
  
  var USER_DATA_PATH: String = js.native
}
object USERDATAPATH {
  
  @scala.inline
  def apply(USER_DATA_PATH: String): USERDATAPATH = {
    val __obj = js.Dynamic.literal(USER_DATA_PATH = USER_DATA_PATH.asInstanceOf[js.Any])
    __obj.asInstanceOf[USERDATAPATH]
  }
  
  @scala.inline
  implicit class USERDATAPATHMutableBuilder[Self <: USERDATAPATH] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUSER_DATA_PATH(value: String): Self = StObject.set(x, "USER_DATA_PATH", value.asInstanceOf[js.Any])
  }
}
