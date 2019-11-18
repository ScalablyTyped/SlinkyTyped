package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stored map from non-relative module name to a table: directory -> result of module lookup in this directory
  * We support only non-relative module names because resolution of relative module names is usually more deterministic and thus less expensive.
  */
@js.native
trait NonRelativeModuleNameResolutionCache extends js.Object {
  def getOrCreateCacheForModuleName(nonRelativeModuleName: String): PerModuleNameCache = js.native
  def getOrCreateCacheForModuleName(nonRelativeModuleName: String, redirectedReference: ResolvedProjectReference): PerModuleNameCache = js.native
}

