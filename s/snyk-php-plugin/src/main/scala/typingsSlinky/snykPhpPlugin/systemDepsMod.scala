package typingsSlinky.snykPhpPlugin

import typingsSlinky.snykComposerLockfileParser.typesMod.SystemPackages
import typingsSlinky.snykPhpPlugin.typesMod.PhpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-php-plugin/dist/system-deps", JSImport.Namespace)
@js.native
object systemDepsMod extends js.Object {
  def systemDeps(basePath: String, options: PhpOptions): SystemPackages = js.native
}

