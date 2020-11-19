package typingsSlinky.toughCookie.mod.Cookie

import typingsSlinky.toughCookie.toughCookieStrings.Infinity
import typingsSlinky.toughCookie.toughCookieStrings.`-Infinity`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Properties extends js.Object {
  
  var creation: js.UndefOr[js.Date] = js.native
  
  var creationIndex: js.UndefOr[Double] = js.native
  
  var domain: js.UndefOr[String] = js.native
  
  var expires: js.UndefOr[js.Date] = js.native
  
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  var hostOnly: js.UndefOr[Boolean] = js.native
  
  var httpOnly: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var lastAccessed: js.UndefOr[js.Date] = js.native
  
  var maxAge: js.UndefOr[Double | Infinity | `-Infinity`] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var pathIsDefault: js.UndefOr[Boolean] = js.native
  
  var sameSite: js.UndefOr[String] = js.native
  
  var secure: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object Properties {
  
  @scala.inline
  def apply(): Properties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Properties]
  }
  
  @scala.inline
  implicit class PropertiesOps[Self <: Properties] (val x: Self) extends AnyVal {
    
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
    def setCreation(value: js.Date): Self = this.set("creation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreation: Self = this.set("creation", js.undefined)
    
    @scala.inline
    def setCreationIndex(value: Double): Self = this.set("creationIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationIndex: Self = this.set("creationIndex", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setExpires(value: js.Date): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setHostOnly(value: Boolean): Self = this.set("hostOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostOnly: Self = this.set("hostOnly", js.undefined)
    
    @scala.inline
    def setHttpOnly(value: Boolean): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpOnly: Self = this.set("httpOnly", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLastAccessed(value: js.Date): Self = this.set("lastAccessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAccessed: Self = this.set("lastAccessed", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double | Infinity | `-Infinity`): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPathIsDefault(value: Boolean): Self = this.set("pathIsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathIsDefault: Self = this.set("pathIsDefault", js.undefined)
    
    @scala.inline
    def setSameSite(value: String): Self = this.set("sameSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSameSite: Self = this.set("sameSite", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
