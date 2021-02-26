package typingsSlinky.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tsconfigPaths.tsconfigLoaderMod.TsConfigLoaderParams
import typingsSlinky.tsconfigPaths.tsconfigLoaderMod.TsConfigLoaderResult
import typingsSlinky.tsconfigPaths.tsconfigPathsStrings.failed
import typingsSlinky.tsconfigPaths.tsconfigPathsStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configLoaderMod {
  
  @JSImport("tsconfig-paths/lib/config-loader", "configLoader")
  @js.native
  def configLoader(hasCwdExplicitParamsTsConfigLoader: ConfigLoaderParams): ConfigLoaderResult = js.native
  
  @JSImport("tsconfig-paths/lib/config-loader", "loadConfig")
  @js.native
  def loadConfig(): ConfigLoaderResult = js.native
  @JSImport("tsconfig-paths/lib/config-loader", "loadConfig")
  @js.native
  def loadConfig(cwd: String): ConfigLoaderResult = js.native
  
  @js.native
  trait ConfigLoaderFailResult extends ConfigLoaderResult {
    
    var message: String = js.native
    
    var resultType: failed = js.native
  }
  object ConfigLoaderFailResult {
    
    @scala.inline
    def apply(message: String, resultType: failed): ConfigLoaderFailResult = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigLoaderFailResult]
    }
    
    @scala.inline
    implicit class ConfigLoaderFailResultMutableBuilder[Self <: ConfigLoaderFailResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultType(value: failed): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConfigLoaderParams extends StObject {
    
    var cwd: String = js.native
    
    var explicitParams: js.UndefOr[ExplicitParams] = js.native
    
    var tsConfigLoader: js.UndefOr[TsConfigLoader] = js.native
  }
  object ConfigLoaderParams {
    
    @scala.inline
    def apply(cwd: String): ConfigLoaderParams = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigLoaderParams]
    }
    
    @scala.inline
    implicit class ConfigLoaderParamsMutableBuilder[Self <: ConfigLoaderParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitParams(value: ExplicitParams): Self = StObject.set(x, "explicitParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitParamsUndefined: Self = StObject.set(x, "explicitParams", js.undefined)
      
      @scala.inline
      def setTsConfigLoader(value: /* params */ TsConfigLoaderParams => TsConfigLoaderResult): Self = StObject.set(x, "tsConfigLoader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTsConfigLoaderUndefined: Self = StObject.set(x, "tsConfigLoader", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tsconfigPaths.configLoaderMod.ConfigLoaderSuccessResult
    - typingsSlinky.tsconfigPaths.configLoaderMod.ConfigLoaderFailResult
  */
  trait ConfigLoaderResult extends StObject
  object ConfigLoaderResult {
    
    @scala.inline
    def ConfigLoaderFailResult(message: String, resultType: failed): typingsSlinky.tsconfigPaths.configLoaderMod.ConfigLoaderFailResult = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.tsconfigPaths.configLoaderMod.ConfigLoaderFailResult]
    }
    
    @scala.inline
    def ConfigLoaderSuccessResult(
      absoluteBaseUrl: String,
      baseUrl: String,
      configFileAbsolutePath: String,
      paths: StringDictionary[js.Array[String]],
      resultType: success
    ): typingsSlinky.tsconfigPaths.configLoaderMod.ConfigLoaderSuccessResult = {
      val __obj = js.Dynamic.literal(absoluteBaseUrl = absoluteBaseUrl.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], configFileAbsolutePath = configFileAbsolutePath.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.tsconfigPaths.configLoaderMod.ConfigLoaderSuccessResult]
    }
  }
  
  @js.native
  trait ConfigLoaderSuccessResult extends ConfigLoaderResult {
    
    var absoluteBaseUrl: String = js.native
    
    var addMatchAll: js.UndefOr[Boolean] = js.native
    
    var baseUrl: String = js.native
    
    var configFileAbsolutePath: String = js.native
    
    var mainFields: js.UndefOr[js.Array[String]] = js.native
    
    var paths: StringDictionary[js.Array[String]] = js.native
    
    var resultType: success = js.native
  }
  object ConfigLoaderSuccessResult {
    
    @scala.inline
    def apply(
      absoluteBaseUrl: String,
      baseUrl: String,
      configFileAbsolutePath: String,
      paths: StringDictionary[js.Array[String]],
      resultType: success
    ): ConfigLoaderSuccessResult = {
      val __obj = js.Dynamic.literal(absoluteBaseUrl = absoluteBaseUrl.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], configFileAbsolutePath = configFileAbsolutePath.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigLoaderSuccessResult]
    }
    
    @scala.inline
    implicit class ConfigLoaderSuccessResultMutableBuilder[Self <: ConfigLoaderSuccessResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsoluteBaseUrl(value: String): Self = StObject.set(x, "absoluteBaseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddMatchAll(value: Boolean): Self = StObject.set(x, "addMatchAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddMatchAllUndefined: Self = StObject.set(x, "addMatchAll", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigFileAbsolutePath(value: String): Self = StObject.set(x, "configFileAbsolutePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
      
      @scala.inline
      def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value :_*))
      
      @scala.inline
      def setPaths(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultType(value: success): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExplicitParams extends StObject {
    
    var addMatchAll: js.UndefOr[Boolean] = js.native
    
    var baseUrl: String = js.native
    
    var mainFields: js.UndefOr[js.Array[String]] = js.native
    
    var paths: StringDictionary[js.Array[String]] = js.native
  }
  object ExplicitParams {
    
    @scala.inline
    def apply(baseUrl: String, paths: StringDictionary[js.Array[String]]): ExplicitParams = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitParams]
    }
    
    @scala.inline
    implicit class ExplicitParamsMutableBuilder[Self <: ExplicitParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddMatchAll(value: Boolean): Self = StObject.set(x, "addMatchAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddMatchAllUndefined: Self = StObject.set(x, "addMatchAll", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
      
      @scala.inline
      def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value :_*))
      
      @scala.inline
      def setPaths(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    }
  }
  
  type TsConfigLoader = js.Function1[/* params */ TsConfigLoaderParams, TsConfigLoaderResult]
}
