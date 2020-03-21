package typingsSlinky.webgme.GmeConfig

import typingsSlinky.webgme.AnonAllowBrowserExecution
import typingsSlinky.webgme.AnonAllowDuplication
import typingsSlinky.webgme.AnonAllowGuests
import typingsSlinky.webgme.AnonAutoMerge
import typingsSlinky.webgme.AnonBasePaths
import typingsSlinky.webgme.AnonBehindSecureProxy
import typingsSlinky.webgme.AnonClearOldDataAtStartUp
import typingsSlinky.webgme.AnonClientOptions
import typingsSlinky.webgme.AnonComponents
import typingsSlinky.webgme.AnonDecoratorPaths
import typingsSlinky.webgme.AnonEnableCustomConstraints
import typingsSlinky.webgme.AnonLog
import typingsSlinky.webgme.AnonManager
import typingsSlinky.webgme.AnonUri
import typingsSlinky.webgme.Blobs.ObjectBlob
import typingsSlinky.webgme.GmeCommon.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmeConfig.GmeConfig")
@js.native
class GmeConfig () extends js.Object {
  /**  Add-on related settings. */
  var addOns: AnonBasePaths = js.native
  /**  Authentication related settings. */
  var authentication: AnonAllowGuests = js.native
  /** Bin script related settings. */
  var bin: AnonLog = js.native
  /** Blob related settings. */
  var blob: ObjectBlob = js.native
  /** Client related settings. */
  var client: ClientOptions = js.native
  /** Client related settings. */
  var core: AnonEnableCustomConstraints = js.native
  /**
    * If true will add extra debug messages and also 
    * enable experimental Visualizers, (URL equivalent (only on client side) ?debug=true).
    */
  var debug: Boolean = js.native
  /** Executor related settings. */
  var executor: AnonClearOldDataAtStartUp = js.native
  /** Mongo database related settings. */
  var mongo: AnonUri = js.native
  /** Plugin related settings. */
  var plugin: AnonAllowBrowserExecution = js.native
  /** Additional paths to for requirejs. 
    * Custom paths that will be added to the 
    * paths of requirejs configuration. 
    * Paths added here will also be served under the given key, 
    * i.e. {myPath: './aPath/aSubPath/'} 
    * will expose files via <host>/myPath/someFile.js.
    */
  var requirejsPaths: Dictionary[String] = js.native
  /** REST related settings. */
  var rest: AnonComponents = js.native
  /** Seed related settings. */
  var seedProjects: AnonAllowDuplication = js.native
  /** Server related settings. */
  var server: AnonBehindSecureProxy = js.native
  /** Socket IO related settings. */
  var socketIO: AnonClientOptions = js.native
  /** Storage related settings. */
  var storage: AnonAutoMerge = js.native
  /** Visualization related settings. */
  var visualization: AnonDecoratorPaths = js.native
  var webhooks: AnonManager = js.native
  /**
    *  Serialize the configuration.
    * @returns {*} 
    * @memberOf GmeConfig
    */
  def serialize(): js.Any = js.native
}

