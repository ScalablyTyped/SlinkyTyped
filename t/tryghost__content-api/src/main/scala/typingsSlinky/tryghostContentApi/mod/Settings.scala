package typingsSlinky.tryghostContentApi.mod

import typingsSlinky.tryghostContentApi.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings
  extends SocialMedia
     with Metadata
     with CodeInjection
     with GhostData {
  
  var cover_image: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var facebook: js.UndefOr[String] = js.native
  
  var ghost_foot: js.UndefOr[Nullable[String]] = js.native
  
  var ghost_head: js.UndefOr[Nullable[String]] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var logo: js.UndefOr[String] = js.native
  
  var navigation: js.UndefOr[js.Array[Label]] = js.native
  
  var timezone: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var twitter: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object Settings {
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCover_image(value: String): Self = StObject.set(x, "cover_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover_imageUndefined: Self = StObject.set(x, "cover_image", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFacebook(value: String): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacebookUndefined: Self = StObject.set(x, "facebook", js.undefined)
    
    @scala.inline
    def setGhost_foot(value: Nullable[String]): Self = StObject.set(x, "ghost_foot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhost_footNull: Self = StObject.set(x, "ghost_foot", null)
    
    @scala.inline
    def setGhost_footUndefined: Self = StObject.set(x, "ghost_foot", js.undefined)
    
    @scala.inline
    def setGhost_head(value: Nullable[String]): Self = StObject.set(x, "ghost_head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhost_headNull: Self = StObject.set(x, "ghost_head", null)
    
    @scala.inline
    def setGhost_headUndefined: Self = StObject.set(x, "ghost_head", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setNavigation(value: js.Array[Label]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    @scala.inline
    def setNavigationVarargs(value: Label*): Self = StObject.set(x, "navigation", js.Array(value :_*))
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwitterUndefined: Self = StObject.set(x, "twitter", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
