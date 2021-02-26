package typingsSlinky.solutionCenterCommunicator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScCommunicator {
  
  @js.native
  trait Environment extends StObject {
    
    /**
      * Domain where to set a cookie in case it's needed for that environment
      */
    var DOMAIN: String = js.native
    
    /**
      * URL where to reach the GoodData service API
      */
    var GOODDATA_SERVICE: js.UndefOr[String] = js.native
    
    /**
      * URL where to reach the merchant management service API
      */
    var MERCHANT_SERVICE: js.UndefOr[String] = js.native
    
    /**
      * URL where to reach the module service API
      */
    var MODULE_SERVICE: js.UndefOr[String] = js.native
    
    /**
      * Name of the environment
      */
    var NAME: String = js.native
    
    /**
      * In case that the domain is localhost, a port can be also specified
      */
    var PORT: js.UndefOr[String] = js.native
    
    /**
      * URL where to reach the token management service API
      */
    var TOKEN_SERVICE: js.UndefOr[String] = js.native
    
    /**
      * URL where to reach the frontend of the environment
      */
    var URL: String = js.native
    
    /**
      * URL where to reach the user management service API
      */
    var USER_SERVICE: js.UndefOr[String] = js.native
    
    /**
      * URL where to reach the new user service API
      */
    var USER_SERVICE_NEW: js.UndefOr[String] = js.native
  }
  object Environment {
    
    @scala.inline
    def apply(DOMAIN: String, NAME: String, URL: String): Environment = {
      val __obj = js.Dynamic.literal(DOMAIN = DOMAIN.asInstanceOf[js.Any], NAME = NAME.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
      __obj.asInstanceOf[Environment]
    }
    
    @scala.inline
    implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDOMAIN(value: String): Self = StObject.set(x, "DOMAIN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGOODDATA_SERVICE(value: String): Self = StObject.set(x, "GOODDATA_SERVICE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGOODDATA_SERVICEUndefined: Self = StObject.set(x, "GOODDATA_SERVICE", js.undefined)
      
      @scala.inline
      def setMERCHANT_SERVICE(value: String): Self = StObject.set(x, "MERCHANT_SERVICE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMERCHANT_SERVICEUndefined: Self = StObject.set(x, "MERCHANT_SERVICE", js.undefined)
      
      @scala.inline
      def setMODULE_SERVICE(value: String): Self = StObject.set(x, "MODULE_SERVICE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMODULE_SERVICEUndefined: Self = StObject.set(x, "MODULE_SERVICE", js.undefined)
      
      @scala.inline
      def setNAME(value: String): Self = StObject.set(x, "NAME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPORT(value: String): Self = StObject.set(x, "PORT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPORTUndefined: Self = StObject.set(x, "PORT", js.undefined)
      
      @scala.inline
      def setTOKEN_SERVICE(value: String): Self = StObject.set(x, "TOKEN_SERVICE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOKEN_SERVICEUndefined: Self = StObject.set(x, "TOKEN_SERVICE", js.undefined)
      
      @scala.inline
      def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUSER_SERVICE(value: String): Self = StObject.set(x, "USER_SERVICE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUSER_SERVICEUndefined: Self = StObject.set(x, "USER_SERVICE", js.undefined)
      
      @scala.inline
      def setUSER_SERVICE_NEW(value: String): Self = StObject.set(x, "USER_SERVICE_NEW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUSER_SERVICE_NEWUndefined: Self = StObject.set(x, "USER_SERVICE_NEW", js.undefined)
    }
  }
  
  @js.native
  trait Environments extends StObject {
    
    /**
      * Development environment
      */
    var DEVELOPMENT: Environment = js.native
    
    /**
      * Integration environment
      */
    var INTEGRATION: Environment = js.native
    
    /**
      * Local environment
      */
    var LOCAL: Environment = js.native
    
    /**
      * Production environment
      */
    var PRODUCTION: Environment = js.native
    
    /**
      * Stage environment
      */
    var STAGE: Environment = js.native
    
    /**
      * Testing environment
      */
    var TESTING: Environment = js.native
  }
  object Environments {
    
    @scala.inline
    def apply(
      DEVELOPMENT: Environment,
      INTEGRATION: Environment,
      LOCAL: Environment,
      PRODUCTION: Environment,
      STAGE: Environment,
      TESTING: Environment
    ): Environments = {
      val __obj = js.Dynamic.literal(DEVELOPMENT = DEVELOPMENT.asInstanceOf[js.Any], INTEGRATION = INTEGRATION.asInstanceOf[js.Any], LOCAL = LOCAL.asInstanceOf[js.Any], PRODUCTION = PRODUCTION.asInstanceOf[js.Any], STAGE = STAGE.asInstanceOf[js.Any], TESTING = TESTING.asInstanceOf[js.Any])
      __obj.asInstanceOf[Environments]
    }
    
    @scala.inline
    implicit class EnvironmentsMutableBuilder[Self <: Environments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDEVELOPMENT(value: Environment): Self = StObject.set(x, "DEVELOPMENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINTEGRATION(value: Environment): Self = StObject.set(x, "INTEGRATION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLOCAL(value: Environment): Self = StObject.set(x, "LOCAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRODUCTION(value: Environment): Self = StObject.set(x, "PRODUCTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTAGE(value: Environment): Self = StObject.set(x, "STAGE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTESTING(value: Environment): Self = StObject.set(x, "TESTING", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScEnvironmentsProvider extends StObject {
    
    /**
      * Access to the public methods of the service
      */
    @JSName("$get")
    def $get(): js.Any = js.native
    
    /**
      * Get current environment
      * If environment was not previously configured, use default environment
      *
      * @public
      * @returns {Object} Current or default environment
      */
    def getCurrentEnvironment(): Environment = js.native
    
    /**
      * Get specific environment
      *
      * @public
      * @param {string} name - Environment name
      * @returns {Object} Specific or default environment
      */
    def getSpecificEnvironment(name: String): Environment = js.native
    
    /**
      * Set current environment
      *
      * @public
      * @param {string|Object} env - Environment name or custom environment object
      * @returns {Object} Named or custom environment
      */
    def setCurrentEnvironment(env: js.Any): Environment = js.native
  }
  object ScEnvironmentsProvider {
    
    @scala.inline
    def apply(
      $get: () => js.Any,
      getCurrentEnvironment: () => Environment,
      getSpecificEnvironment: String => Environment,
      setCurrentEnvironment: js.Any => Environment
    ): ScEnvironmentsProvider = {
      val __obj = js.Dynamic.literal($get = js.Any.fromFunction0($get), getCurrentEnvironment = js.Any.fromFunction0(getCurrentEnvironment), getSpecificEnvironment = js.Any.fromFunction1(getSpecificEnvironment), setCurrentEnvironment = js.Any.fromFunction1(setCurrentEnvironment))
      __obj.asInstanceOf[ScEnvironmentsProvider]
    }
    
    @scala.inline
    implicit class ScEnvironmentsProviderMutableBuilder[Self <: ScEnvironmentsProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$get(value: () => js.Any): Self = StObject.set(x, "$get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrentEnvironment(value: () => Environment): Self = StObject.set(x, "getCurrentEnvironment", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSpecificEnvironment(value: String => Environment): Self = StObject.set(x, "getSpecificEnvironment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCurrentEnvironment(value: js.Any => Environment): Self = StObject.set(x, "setCurrentEnvironment", js.Any.fromFunction1(value))
    }
  }
}
