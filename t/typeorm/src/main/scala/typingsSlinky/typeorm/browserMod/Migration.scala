package typingsSlinky.typeorm.browserMod

import typingsSlinky.typeorm.migrationInterfaceMod.MigrationInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "Migration")
@js.native
class Migration protected ()
  extends typingsSlinky.typeorm.migrationMod.Migration {
  def this(id: js.UndefOr[scala.Nothing], timestamp: scala.Double, name: String) = this()
  def this(id: scala.Double, timestamp: scala.Double, name: String) = this()
  def this(id: js.UndefOr[scala.Nothing], timestamp: scala.Double, name: String, instance: MigrationInterface) = this()
  def this(id: scala.Double, timestamp: scala.Double, name: String, instance: MigrationInterface) = this()
}
