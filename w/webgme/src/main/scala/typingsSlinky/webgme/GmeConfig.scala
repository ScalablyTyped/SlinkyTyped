package typingsSlinky.webgme

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webgme.Blobs.ObjectBlob
import typingsSlinky.webgme.GmeCommon.Dictionary
import typingsSlinky.webgme.GmeCommon.Name
import typingsSlinky.webgme.anon.AllowBrowserExecution
import typingsSlinky.webgme.anon.AllowDuplication
import typingsSlinky.webgme.anon.AllowGuests
import typingsSlinky.webgme.anon.AutoMerge
import typingsSlinky.webgme.anon.BasePaths
import typingsSlinky.webgme.anon.BehindSecureProxy
import typingsSlinky.webgme.anon.ClearOldDataAtStartUp
import typingsSlinky.webgme.anon.Components
import typingsSlinky.webgme.anon.DSN
import typingsSlinky.webgme.anon.DecoratorPaths
import typingsSlinky.webgme.anon.EnableCustomConstraints
import typingsSlinky.webgme.anon.LevelString
import typingsSlinky.webgme.anon.Log
import typingsSlinky.webgme.anon.Manager
import typingsSlinky.webgme.anon.Uri
import typingsSlinky.webgme.webgmeStrings.basic
import typingsSlinky.webgme.webgmeStrings.basic2
import typingsSlinky.webgme.webgmeStrings.basic3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Each Plugin has a configuration specified via a metadata.json file.
  * This interface prescribes that configuration file.
  * 
  */
object GmeConfig {
  
  @js.native
  trait ClientOptions extends StObject {
    
    /**
      * Directory from where to serve the static files for the webapp. 
      * This should only be modified if you are using a custom UI.
      *  e.g. './src/client'
      */
    var appDir: String = js.native
    
    /**
      * Default connection router to use when opening up a new model, 
      * available options (ordered by level of complexity 
      * and sophistication) are: 'basic', 'basic2' and 'basic3'.
      */
    var defaultConnectionRouter: basic | basic2 | basic3 = js.native
    
    /**
      * Enable [raven-js](https://docs.sentry.io/clients/javascript/)
      * to automatically send reports to the provided url. 
      * [Sentry.io](https://sentry.io/) 
      * provides free plans and comes with an 
      * easy ui that supports releases, source maps etc.
      * 
      * Url like endpoint for raven-js e.g. 'https:// ****@sentry.io/999999'.
      * null indicates that it is unused.
      * 
      * Options passed to the raven-client, if not specified {release: } will be passed.
      */
    var errorReporting: DSN = js.native
    
    /**
      * When debug is activated in the browser 
      * (type localStorage.debug = gme* in the 
      * console and refresh the page) messages below 
      * this level will not be printed.
      * e.g. debug, info, warn, error
      */
    var log: LevelString = js.native
  }
  object ClientOptions {
    
    @scala.inline
    def apply(
      appDir: String,
      defaultConnectionRouter: basic | basic2 | basic3,
      errorReporting: DSN,
      log: LevelString
    ): ClientOptions = {
      val __obj = js.Dynamic.literal(appDir = appDir.asInstanceOf[js.Any], defaultConnectionRouter = defaultConnectionRouter.asInstanceOf[js.Any], errorReporting = errorReporting.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultConnectionRouter(value: basic | basic2 | basic3): Self = StObject.set(x, "defaultConnectionRouter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorReporting(value: DSN): Self = StObject.set(x, "errorReporting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLog(value: LevelString): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConfigItem extends StObject {
    
    // a detailed description fo the item
    var description: String = js.native
    
    // a human comprehensible name
    var displayName: String = js.native
    
    // a unique name for the configuration item
    var name: Name = js.native
    
    // can the value be changed?
    var readOnly: js.UndefOr[Boolean] = js.native
    
    // a regular expression limiting the values allowed.
    // e.g. '^[a-zA-Z]+$'
    var regex: js.UndefOr[js.RegExp] = js.native
    
    // a description of the regex grammar
    // e.g. 'Name can only contain English characters!'
    var regexMessage: js.UndefOr[String] = js.native
    
    // the value of the item: if valueItem is provided it must be one of those values.
    var value: String = js.native
    
    // an enumeration of the allowed values for the value field
    var valueItems: js.UndefOr[js.Array[String]] = js.native
    
    // the datatype of the value: 'string', 'integer', ...
    var valueType: String = js.native
  }
  object ConfigItem {
    
    @scala.inline
    def apply(description: String, displayName: String, name: Name, value: String, valueType: String): ConfigItem = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigItem]
    }
    
    @scala.inline
    implicit class ConfigItemMutableBuilder[Self <: ConfigItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexMessage(value: String): Self = StObject.set(x, "regexMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexMessageUndefined: Self = StObject.set(x, "regexMessage", js.undefined)
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueItems(value: js.Array[String]): Self = StObject.set(x, "valueItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueItemsUndefined: Self = StObject.set(x, "valueItems", js.undefined)
      
      @scala.inline
      def setValueItemsVarargs(value: String*): Self = StObject.set(x, "valueItems", js.Array(value :_*))
      
      @scala.inline
      def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GmeConfig extends StObject {
    
    /**  Add-on related settings. */
    var addOns: BasePaths = js.native
    
    /**  Authentication related settings. */
    var authentication: AllowGuests = js.native
    
    /** Bin script related settings. */
    var bin: Log = js.native
    
    /** Blob related settings. */
    var blob: ObjectBlob = js.native
    
    /** Client related settings. */
    var client: ClientOptions = js.native
    
    /** Client related settings. */
    var core: EnableCustomConstraints = js.native
    
    /**
      * If true will add extra debug messages and also 
      * enable experimental Visualizers, (URL equivalent (only on client side) ?debug=true).
      */
    var debug: Boolean = js.native
    
    /** Executor related settings. */
    var executor: ClearOldDataAtStartUp = js.native
    
    /** Mongo database related settings. */
    var mongo: Uri = js.native
    
    /** Plugin related settings. */
    var plugin: AllowBrowserExecution = js.native
    
    /** Additional paths to for requirejs. 
      * Custom paths that will be added to the 
      * paths of requirejs configuration. 
      * Paths added here will also be served under the given key, 
      * i.e. {myPath: './aPath/aSubPath/'} 
      * will expose files via <host>/myPath/someFile.js.
      */
    var requirejsPaths: Dictionary[String] = js.native
    
    /** REST related settings. */
    var rest: Components = js.native
    
    /** Seed related settings. */
    var seedProjects: AllowDuplication = js.native
    
    /**
      *  Serialize the configuration.
      * @returns {*} 
      * @memberOf GmeConfig
      */
    def serialize(): js.Any = js.native
    
    /** Server related settings. */
    var server: BehindSecureProxy = js.native
    
    /** Socket IO related settings. */
    var socketIO: typingsSlinky.webgme.anon.ClientOptions = js.native
    
    /** Storage related settings. */
    var storage: AutoMerge = js.native
    
    /** Visualization related settings. */
    var visualization: DecoratorPaths = js.native
    
    var webhooks: Manager = js.native
  }
  object GmeConfig {
    
    @scala.inline
    def apply(
      addOns: BasePaths,
      authentication: AllowGuests,
      bin: Log,
      blob: ObjectBlob,
      client: ClientOptions,
      core: EnableCustomConstraints,
      debug: Boolean,
      executor: ClearOldDataAtStartUp,
      mongo: Uri,
      plugin: AllowBrowserExecution,
      requirejsPaths: Dictionary[String],
      rest: Components,
      seedProjects: AllowDuplication,
      serialize: () => js.Any,
      server: BehindSecureProxy,
      socketIO: typingsSlinky.webgme.anon.ClientOptions,
      storage: AutoMerge,
      visualization: DecoratorPaths,
      webhooks: Manager
    ): typingsSlinky.webgme.GmeConfig.GmeConfig = {
      val __obj = js.Dynamic.literal(addOns = addOns.asInstanceOf[js.Any], authentication = authentication.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], core = core.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], mongo = mongo.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], requirejsPaths = requirejsPaths.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], seedProjects = seedProjects.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), server = server.asInstanceOf[js.Any], socketIO = socketIO.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.webgme.GmeConfig.GmeConfig]
    }
    
    @scala.inline
    implicit class GmeConfigMutableBuilder[Self <: typingsSlinky.webgme.GmeConfig.GmeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddOns(value: BasePaths): Self = StObject.set(x, "addOns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthentication(value: AllowGuests): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBin(value: Log): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlob(value: ObjectBlob): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient(value: ClientOptions): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCore(value: EnableCustomConstraints): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutor(value: ClearOldDataAtStartUp): Self = StObject.set(x, "executor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMongo(value: Uri): Self = StObject.set(x, "mongo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugin(value: AllowBrowserExecution): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequirejsPaths(value: Dictionary[String]): Self = StObject.set(x, "requirejsPaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRest(value: Components): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedProjects(value: AllowDuplication): Self = StObject.set(x, "seedProjects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialize(value: () => js.Any): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setServer(value: BehindSecureProxy): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketIO(value: typingsSlinky.webgme.anon.ClientOptions): Self = StObject.set(x, "socketIO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorage(value: AutoMerge): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisualization(value: DecoratorPaths): Self = StObject.set(x, "visualization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebhooks(value: Manager): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LogOptions extends StObject {
    
    var log: LevelString = js.native
  }
  object LogOptions {
    
    @scala.inline
    def apply(log: LevelString): LogOptions = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogOptions]
    }
    
    @scala.inline
    implicit class LogOptionsMutableBuilder[Self <: LogOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLog(value: LevelString): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PluginConfig
    extends typingsSlinky.webgme.GmeConfig.GmeConfig
       with /* propName */ StringDictionary[js.Any]
  object PluginConfig {
    
    @scala.inline
    def apply(
      addOns: BasePaths,
      authentication: AllowGuests,
      bin: Log,
      blob: ObjectBlob,
      client: ClientOptions,
      core: EnableCustomConstraints,
      debug: Boolean,
      executor: ClearOldDataAtStartUp,
      mongo: Uri,
      plugin: AllowBrowserExecution,
      requirejsPaths: Dictionary[String],
      rest: Components,
      seedProjects: AllowDuplication,
      serialize: () => js.Any,
      server: BehindSecureProxy,
      socketIO: typingsSlinky.webgme.anon.ClientOptions,
      storage: AutoMerge,
      visualization: DecoratorPaths,
      webhooks: Manager
    ): PluginConfig = {
      val __obj = js.Dynamic.literal(addOns = addOns.asInstanceOf[js.Any], authentication = authentication.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], core = core.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], mongo = mongo.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], requirejsPaths = requirejsPaths.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], seedProjects = seedProjects.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), server = server.asInstanceOf[js.Any], socketIO = socketIO.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginConfig]
    }
  }
}
