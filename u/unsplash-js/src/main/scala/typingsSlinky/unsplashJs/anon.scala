package typingsSlinky.unsplashJs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.unsplashJs.mod.CollectionIds
import typingsSlinky.unsplashJs.mod.ContentSafety
import typingsSlinky.unsplashJs.mod.Languages
import typingsSlinky.unsplashJs.unsplashJsStrings.black
import typingsSlinky.unsplashJs.unsplashJsStrings.black_and_white
import typingsSlinky.unsplashJs.unsplashJsStrings.blue
import typingsSlinky.unsplashJs.unsplashJsStrings.green
import typingsSlinky.unsplashJs.unsplashJsStrings.latest
import typingsSlinky.unsplashJs.unsplashJsStrings.magenta
import typingsSlinky.unsplashJs.unsplashJsStrings.orange
import typingsSlinky.unsplashJs.unsplashJsStrings.purple
import typingsSlinky.unsplashJs.unsplashJsStrings.red
import typingsSlinky.unsplashJs.unsplashJsStrings.relevant
import typingsSlinky.unsplashJs.unsplashJsStrings.teal
import typingsSlinky.unsplashJs.unsplashJsStrings.white
import typingsSlinky.unsplashJs.unsplashJsStrings.yellow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AccessKey extends StObject {
    
    var accessKey: String = js.native
    
    var apiUrl: js.UndefOr[String] = js.native
    
    var apiVersion: js.UndefOr[String] = js.native
    
    var bearerToken: js.UndefOr[String] = js.native
    
    var callbackUrl: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var secret: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object AccessKey {
    
    @scala.inline
    def apply(accessKey: String): AccessKey = {
      val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessKey]
    }
    
    @scala.inline
    implicit class AccessKeyMutableBuilder[Self <: AccessKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiUrl(value: String): Self = StObject.set(x, "apiUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiUrlUndefined: Self = StObject.set(x, "apiUrl", js.undefined)
      
      @scala.inline
      def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setBearerToken(value: String): Self = StObject.set(x, "bearerToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBearerTokenUndefined: Self = StObject.set(x, "bearerToken", js.undefined)
      
      @scala.inline
      def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait Bio extends StObject {
    
    var bio: js.UndefOr[String] = js.native
    
    var email: js.UndefOr[String] = js.native
    
    var firstName: js.UndefOr[String] = js.native
    
    var instagramUsername: js.UndefOr[String] = js.native
    
    var lastName: js.UndefOr[String] = js.native
    
    var location: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var username: js.UndefOr[String] = js.native
  }
  object Bio {
    
    @scala.inline
    def apply(): Bio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bio]
    }
    
    @scala.inline
    implicit class BioMutableBuilder[Self <: Bio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBio(value: String): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBioUndefined: Self = StObject.set(x, "bio", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
      
      @scala.inline
      def setInstagramUsername(value: String): Self = StObject.set(x, "instagramUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstagramUsernameUndefined: Self = StObject.set(x, "instagramUsername", js.undefined)
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  @js.native
  trait Body extends StObject {
    
    var body: js.Object = js.native
    
    var headers: js.Object = js.native
    
    var method: String = js.native
    
    var oauth: Boolean = js.native
    
    var query: js.Object = js.native
    
    var url: String = js.native
  }
  object Body {
    
    @scala.inline
    def apply(body: js.Object, headers: js.Object, method: String, oauth: Boolean, query: js.Object, url: String): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], oauth = oauth.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth(value: Boolean): Self = StObject.set(x, "oauth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait C extends StObject {
    
    var c: js.UndefOr[String] = js.native
    
    var collections: js.UndefOr[CollectionIds] = js.native
    
    var count: js.UndefOr[Double] = js.native
    
    var featured: js.UndefOr[Boolean] = js.native
    
    var orientation: js.UndefOr[typingsSlinky.unsplashJs.mod.Orientation] = js.native
    
    var query: js.UndefOr[String] = js.native
    
    var username: js.UndefOr[String] = js.native
  }
  object C {
    
    @scala.inline
    def apply(): C = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[C]
    }
    
    @scala.inline
    implicit class CMutableBuilder[Self <: C] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: String): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCUndefined: Self = StObject.set(x, "c", js.undefined)
      
      @scala.inline
      def setCollections(value: CollectionIds): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectionsUndefined: Self = StObject.set(x, "collections", js.undefined)
      
      @scala.inline
      def setCollectionsVarargs(value: (Double | String)*): Self = StObject.set(x, "collections", js.Array(value :_*))
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setFeatured(value: Boolean): Self = StObject.set(x, "featured", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturedUndefined: Self = StObject.set(x, "featured", js.undefined)
      
      @scala.inline
      def setOrientation(value: typingsSlinky.unsplashJs.mod.Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  @js.native
  trait Collections extends StObject {
    
    var collections: js.UndefOr[CollectionIds] = js.native
    
    var color: js.UndefOr[
        black_and_white | black | white | yellow | orange | red | purple | magenta | green | teal | blue
      ] = js.native
    
    var contentFilter: js.UndefOr[ContentSafety] = js.native
    
    var lang: js.UndefOr[Languages] = js.native
    
    var orderBy: js.UndefOr[latest | relevant] = js.native
    
    var orientation: js.UndefOr[typingsSlinky.unsplashJs.mod.Orientation] = js.native
  }
  object Collections {
    
    @scala.inline
    def apply(): Collections = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Collections]
    }
    
    @scala.inline
    implicit class CollectionsMutableBuilder[Self <: Collections] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollections(value: CollectionIds): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectionsUndefined: Self = StObject.set(x, "collections", js.undefined)
      
      @scala.inline
      def setCollectionsVarargs(value: (Double | String)*): Self = StObject.set(x, "collections", js.Array(value :_*))
      
      @scala.inline
      def setColor(
        value: black_and_white | black | white | yellow | orange | red | purple | magenta | green | teal | blue
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContentFilter(value: ContentSafety): Self = StObject.set(x, "contentFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFilterUndefined: Self = StObject.set(x, "contentFilter", js.undefined)
      
      @scala.inline
      def setLang(value: Languages): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setOrderBy(value: latest | relevant): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
      
      @scala.inline
      def setOrientation(value: typingsSlinky.unsplashJs.mod.Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
  
  @js.native
  trait Downloadlocation extends StObject {
    
    var download_location: String = js.native
  }
  object Downloadlocation {
    
    @scala.inline
    def apply(download_location: String): Downloadlocation = {
      val __obj = js.Dynamic.literal(download_location = download_location.asInstanceOf[js.Any])
      __obj.asInstanceOf[Downloadlocation]
    }
    
    @scala.inline
    implicit class DownloadlocationMutableBuilder[Self <: Downloadlocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownload_location(value: String): Self = StObject.set(x, "download_location", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Links extends StObject {
    
    var links: Downloadlocation = js.native
  }
  object Links {
    
    @scala.inline
    def apply(links: Downloadlocation): Links = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
      __obj.asInstanceOf[Links]
    }
    
    @scala.inline
    implicit class LinksMutableBuilder[Self <: Links] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinks(value: Downloadlocation): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Orientation extends StObject {
    
    var orientation: js.UndefOr[typingsSlinky.unsplashJs.mod.Orientation] = js.native
  }
  object Orientation {
    
    @scala.inline
    def apply(): Orientation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Orientation]
    }
    
    @scala.inline
    implicit class OrientationMutableBuilder[Self <: Orientation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrientation(value: typingsSlinky.unsplashJs.mod.Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
  
  @js.native
  trait OrientationOrientation extends StObject {
    
    var orientation: typingsSlinky.unsplashJs.mod.Orientation = js.native
  }
  object OrientationOrientation {
    
    @scala.inline
    def apply(orientation: typingsSlinky.unsplashJs.mod.Orientation): OrientationOrientation = {
      val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrientationOrientation]
    }
    
    @scala.inline
    implicit class OrientationOrientationMutableBuilder[Self <: OrientationOrientation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrientation(value: typingsSlinky.unsplashJs.mod.Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Stats extends StObject {
    
    var orientation: js.UndefOr[typingsSlinky.unsplashJs.mod.Orientation] = js.native
    
    var stats: js.UndefOr[Boolean] = js.native
  }
  object Stats {
    
    @scala.inline
    def apply(): Stats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Stats]
    }
    
    @scala.inline
    implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrientation(value: typingsSlinky.unsplashJs.mod.Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    }
  }
}
