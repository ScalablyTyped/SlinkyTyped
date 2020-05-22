package typingsSlinky.webgme.global

import typingsSlinky.webgme.Blobs.ObjectBlob
import typingsSlinky.webgme.GmeCommon.Dictionary
import typingsSlinky.webgme.GmeConfig.ClientOptions
import typingsSlinky.webgme.anon.AllowBrowserExecution
import typingsSlinky.webgme.anon.AllowDuplication
import typingsSlinky.webgme.anon.AllowGuests
import typingsSlinky.webgme.anon.AutoMerge
import typingsSlinky.webgme.anon.BasePaths
import typingsSlinky.webgme.anon.BehindSecureProxy
import typingsSlinky.webgme.anon.ClearOldDataAtStartUp
import typingsSlinky.webgme.anon.Components
import typingsSlinky.webgme.anon.DecoratorPaths
import typingsSlinky.webgme.anon.EnableCustomConstraints
import typingsSlinky.webgme.anon.Log
import typingsSlinky.webgme.anon.Manager
import typingsSlinky.webgme.anon.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each Plugin has a configuration specified via a metadata.json file.
  * This interface prescribes that configuration file.
  * 
  */
@JSGlobal("GmeConfig")
@js.native
object GmeConfig extends js.Object {
  @js.native
  class GmeConfig ()
    extends typingsSlinky.webgme.GmeConfig.GmeConfig {
    /**  Add-on related settings. */
    /* CompleteClass */
    override var addOns: BasePaths = js.native
    /**  Authentication related settings. */
    /* CompleteClass */
    override var authentication: AllowGuests = js.native
    /** Bin script related settings. */
    /* CompleteClass */
    override var bin: Log = js.native
    /** Blob related settings. */
    /* CompleteClass */
    override var blob: ObjectBlob = js.native
    /** Client related settings. */
    /* CompleteClass */
    override var client: ClientOptions = js.native
    /** Client related settings. */
    /* CompleteClass */
    override var core: EnableCustomConstraints = js.native
    /**
      * If true will add extra debug messages and also 
      * enable experimental Visualizers, (URL equivalent (only on client side) ?debug=true).
      */
    /* CompleteClass */
    override var debug: Boolean = js.native
    /** Executor related settings. */
    /* CompleteClass */
    override var executor: ClearOldDataAtStartUp = js.native
    /** Mongo database related settings. */
    /* CompleteClass */
    override var mongo: Uri = js.native
    /** Plugin related settings. */
    /* CompleteClass */
    override var plugin: AllowBrowserExecution = js.native
    /** Additional paths to for requirejs. 
      * Custom paths that will be added to the 
      * paths of requirejs configuration. 
      * Paths added here will also be served under the given key, 
      * i.e. {myPath: './aPath/aSubPath/'} 
      * will expose files via <host>/myPath/someFile.js.
      */
    /* CompleteClass */
    override var requirejsPaths: Dictionary[String] = js.native
    /** REST related settings. */
    /* CompleteClass */
    override var rest: Components = js.native
    /** Seed related settings. */
    /* CompleteClass */
    override var seedProjects: AllowDuplication = js.native
    /** Server related settings. */
    /* CompleteClass */
    override var server: BehindSecureProxy = js.native
    /** Socket IO related settings. */
    /* CompleteClass */
    override var socketIO: typingsSlinky.webgme.anon.ClientOptions = js.native
    /** Storage related settings. */
    /* CompleteClass */
    override var storage: AutoMerge = js.native
    /** Visualization related settings. */
    /* CompleteClass */
    override var visualization: DecoratorPaths = js.native
    /* CompleteClass */
    override var webhooks: Manager = js.native
    /**
      *  Serialize the configuration.
      * @returns {*} 
      * @memberOf GmeConfig
      */
    /* CompleteClass */
    override def serialize(): js.Any = js.native
  }
  
  @js.native
  class PluginConfig ()
    extends typingsSlinky.webgme.GmeConfig.PluginConfig {
    /**  Add-on related settings. */
    /* CompleteClass */
    override var addOns: BasePaths = js.native
    /**  Authentication related settings. */
    /* CompleteClass */
    override var authentication: AllowGuests = js.native
    /** Bin script related settings. */
    /* CompleteClass */
    override var bin: Log = js.native
    /** Blob related settings. */
    /* CompleteClass */
    override var blob: ObjectBlob = js.native
    /** Client related settings. */
    /* CompleteClass */
    override var client: ClientOptions = js.native
    /** Client related settings. */
    /* CompleteClass */
    override var core: EnableCustomConstraints = js.native
    /**
      * If true will add extra debug messages and also 
      * enable experimental Visualizers, (URL equivalent (only on client side) ?debug=true).
      */
    /* CompleteClass */
    override var debug: Boolean = js.native
    /** Executor related settings. */
    /* CompleteClass */
    override var executor: ClearOldDataAtStartUp = js.native
    /** Mongo database related settings. */
    /* CompleteClass */
    override var mongo: Uri = js.native
    /** Plugin related settings. */
    /* CompleteClass */
    override var plugin: AllowBrowserExecution = js.native
    /** Additional paths to for requirejs. 
      * Custom paths that will be added to the 
      * paths of requirejs configuration. 
      * Paths added here will also be served under the given key, 
      * i.e. {myPath: './aPath/aSubPath/'} 
      * will expose files via <host>/myPath/someFile.js.
      */
    /* CompleteClass */
    override var requirejsPaths: Dictionary[String] = js.native
    /** REST related settings. */
    /* CompleteClass */
    override var rest: Components = js.native
    /** Seed related settings. */
    /* CompleteClass */
    override var seedProjects: AllowDuplication = js.native
    /** Server related settings. */
    /* CompleteClass */
    override var server: BehindSecureProxy = js.native
    /** Socket IO related settings. */
    /* CompleteClass */
    override var socketIO: typingsSlinky.webgme.anon.ClientOptions = js.native
    /** Storage related settings. */
    /* CompleteClass */
    override var storage: AutoMerge = js.native
    /** Visualization related settings. */
    /* CompleteClass */
    override var visualization: DecoratorPaths = js.native
    /* CompleteClass */
    override var webhooks: Manager = js.native
    /**
      *  Serialize the configuration.
      * @returns {*} 
      * @memberOf GmeConfig
      */
    /* CompleteClass */
    override def serialize(): js.Any = js.native
  }
  
  var config: typingsSlinky.webgme.GmeConfig.PluginConfig = js.native
}

