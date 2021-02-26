package typingsSlinky.y18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("y18n", JSImport.Namespace)
  @js.native
  /**
    * Create an instance of y18n with the config provided
    */
  class ^ () extends Y18N {
    def this(config: Config) = this()
  }
  
  @js.native
  trait Config extends StObject {
    
    /**
      * The locale directory, default ./locales.
      */
    var directory: String = js.native
    
    /**
      * Should fallback to a language-only file (e.g. en.json) be allowed
      * if a file matching the locale does not exist (e.g. en_US.json), default true.
      */
    var fallbackToLanguage: Boolean = js.native
    
    /**
      * What locale should be used.
      */
    var locale: String = js.native
    
    /**
      * Should newly observed strings be updated in file, default true.
      */
    var updateFiles: Boolean = js.native
  }
  object Config {
    
    @scala.inline
    def apply(directory: String, fallbackToLanguage: Boolean, locale: String, updateFiles: Boolean): Config = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], fallbackToLanguage = fallbackToLanguage.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], updateFiles = updateFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackToLanguage(value: Boolean): Self = StObject.set(x, "fallbackToLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateFiles(value: Boolean): Self = StObject.set(x, "updateFiles", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Y18N extends StObject {
    
    /**
      * Print a localized string, %s will be replaced with args.
      */
    def __(str: String): String = js.native
    def __(str: String, arg1: js.UndefOr[scala.Nothing], arg2: js.UndefOr[scala.Nothing], arg3: String): String = js.native
    def __(str: String, arg1: js.UndefOr[scala.Nothing], arg2: String): String = js.native
    def __(str: String, arg1: js.UndefOr[scala.Nothing], arg2: String, arg3: String): String = js.native
    def __(str: String, arg1: String): String = js.native
    def __(str: String, arg1: String, arg2: js.UndefOr[scala.Nothing], arg3: String): String = js.native
    def __(str: String, arg1: String, arg2: String): String = js.native
    def __(str: String, arg1: String, arg2: String, arg3: String): String = js.native
    
    /**
      * Print a localized string with appropriate pluralization.
      * If %d is provided in the string, the count will replace this placeholder.
      */
    def __n(singularString: String, pluralString: String, count: Double): String = js.native
    def __n(
      singularString: String,
      pluralString: String,
      count: Double,
      arg1: js.UndefOr[scala.Nothing],
      arg2: js.UndefOr[scala.Nothing],
      arg3: String
    ): String = js.native
    def __n(
      singularString: String,
      pluralString: String,
      count: Double,
      arg1: js.UndefOr[scala.Nothing],
      arg2: String
    ): String = js.native
    def __n(
      singularString: String,
      pluralString: String,
      count: Double,
      arg1: js.UndefOr[scala.Nothing],
      arg2: String,
      arg3: String
    ): String = js.native
    def __n(singularString: String, pluralString: String, count: Double, arg1: String): String = js.native
    def __n(
      singularString: String,
      pluralString: String,
      count: Double,
      arg1: String,
      arg2: js.UndefOr[scala.Nothing],
      arg3: String
    ): String = js.native
    def __n(singularString: String, pluralString: String, count: Double, arg1: String, arg2: String): String = js.native
    def __n(
      singularString: String,
      pluralString: String,
      count: Double,
      arg1: String,
      arg2: String,
      arg3: String
    ): String = js.native
    
    /**
      * What locale is currently being used?
      */
    def getLocale(): String = js.native
    
    /**
      * Set the current locale being used.
      */
    def setLocale(str: String): Unit = js.native
    
    /**
      * Update the current locale with the key value pairs in obj.
      */
    def updateLocale(obj: js.Object): Unit = js.native
  }
}
