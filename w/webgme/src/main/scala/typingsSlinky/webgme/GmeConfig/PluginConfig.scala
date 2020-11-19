package typingsSlinky.webgme.GmeConfig

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.webgme.Blobs.ObjectBlob
import typingsSlinky.webgme.GmeCommon.Dictionary
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
