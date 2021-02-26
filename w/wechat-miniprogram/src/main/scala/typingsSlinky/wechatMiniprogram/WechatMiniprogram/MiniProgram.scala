package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.develop
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.release
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.trial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 小程序帐号信息 */
@js.native
trait MiniProgram extends StObject {
  
  /** 小程序 appId */
  var appId: String = js.native
  
  /** 小程序版本
    *
    * 可选值：
    * - 'develop': 开发版;
    * - 'trial': 体验版;
    * - 'release': 正式版;
    *
    * 最低基础库： `2.10.0` */
  var envVersion: develop | trial | release = js.native
  
  /** 线上小程序版本号
    *
    * 最低基础库： `2.10.2` */
  var version: String = js.native
}
object MiniProgram {
  
  @scala.inline
  def apply(appId: String, envVersion: develop | trial | release, version: String): MiniProgram = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], envVersion = envVersion.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiniProgram]
  }
  
  @scala.inline
  implicit class MiniProgramMutableBuilder[Self <: MiniProgram] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvVersion(value: develop | trial | release): Self = StObject.set(x, "envVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
