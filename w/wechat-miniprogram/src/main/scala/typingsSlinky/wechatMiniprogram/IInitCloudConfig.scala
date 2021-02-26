package typingsSlinky.wechatMiniprogram

import typingsSlinky.wechatMiniprogram.anon.Database
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInitCloudConfig extends StObject {
  
  var env: js.UndefOr[String | Database] = js.native
  
  var traceUser: js.UndefOr[Boolean] = js.native
}
object IInitCloudConfig {
  
  @scala.inline
  def apply(): IInitCloudConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInitCloudConfig]
  }
  
  @scala.inline
  implicit class IInitCloudConfigMutableBuilder[Self <: IInitCloudConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnv(value: String | Database): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setTraceUser(value: Boolean): Self = StObject.set(x, "traceUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceUserUndefined: Self = StObject.set(x, "traceUser", js.undefined)
  }
}
