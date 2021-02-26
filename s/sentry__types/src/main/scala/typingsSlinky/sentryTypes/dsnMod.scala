package typingsSlinky.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dsnMod {
  
  @js.native
  trait Dsn extends DsnComponents {
    
    /**
      * Renders the string representation of this Dsn.
      *
      * By default, this will render the public representation without the password
      * component. To get the deprecated private representation, set `withPassword`
      * to true.
      *
      * @param withPassword When set to true, the password will be included.
      */
    def toString(withPassword: Boolean): String = js.native
  }
  object Dsn {
    
    @scala.inline
    def apply(
      host: String,
      projectId: String,
      protocol: DsnProtocol,
      toString_ : Boolean => String,
      user: String
    ): Dsn = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
      __obj.asInstanceOf[Dsn]
    }
    
    @scala.inline
    implicit class DsnMutableBuilder[Self <: Dsn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToString_(value: Boolean => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait DsnComponents extends StObject {
    
    /** Hostname of the Sentry instance. */
    var host: String = js.native
    
    /** Private authorization key (deprecated, optional). */
    var pass: js.UndefOr[String] = js.native
    
    /** Sub path/ */
    var path: js.UndefOr[String] = js.native
    
    /** Port of the Sentry instance. */
    var port: js.UndefOr[String] = js.native
    
    /** Project ID */
    var projectId: String = js.native
    
    /** Protocol used to connect to Sentry. */
    var protocol: DsnProtocol = js.native
    
    /** Public authorization key. */
    var user: String = js.native
  }
  object DsnComponents {
    
    @scala.inline
    def apply(host: String, projectId: String, protocol: DsnProtocol, user: String): DsnComponents = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[DsnComponents]
    }
    
    @scala.inline
    implicit class DsnComponentsMutableBuilder[Self <: DsnComponents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: DsnProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  type DsnLike = String | DsnComponents
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sentryTypes.sentryTypesStrings.http
    - typingsSlinky.sentryTypes.sentryTypesStrings.https
  */
  trait DsnProtocol extends StObject
  object DsnProtocol {
    
    @scala.inline
    def http: typingsSlinky.sentryTypes.sentryTypesStrings.http = "http".asInstanceOf[typingsSlinky.sentryTypes.sentryTypesStrings.http]
    
    @scala.inline
    def https: typingsSlinky.sentryTypes.sentryTypesStrings.https = "https".asInstanceOf[typingsSlinky.sentryTypes.sentryTypesStrings.https]
  }
}
