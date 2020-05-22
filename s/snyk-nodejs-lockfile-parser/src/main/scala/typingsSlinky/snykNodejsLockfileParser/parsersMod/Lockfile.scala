package typingsSlinky.snykNodejsLockfileParser.parsersMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.snykNodejsLockfileParser.packageLockParserMod.PackageLockDeps
import typingsSlinky.snykNodejsLockfileParser.parsersMod.LockfileType.npm
import typingsSlinky.snykNodejsLockfileParser.parsersMod.LockfileType.yarn
import typingsSlinky.snykNodejsLockfileParser.yarnLockParseMod.YarnLockDep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.snykNodejsLockfileParser.packageLockParserMod.PackageLock
  - typingsSlinky.snykNodejsLockfileParser.yarnLockParseMod.YarnLock
*/
trait Lockfile extends js.Object

object Lockfile {
  @scala.inline
  def PackageLock(
    lockfileVersion: Double,
    name: String,
    `type`: npm,
    version: String,
    dependencies: PackageLockDeps = null
  ): Lockfile = {
    val __obj = js.Dynamic.literal(lockfileVersion = lockfileVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lockfile]
  }
  @scala.inline
  def YarnLock(
    lockfileType: yarn,
    `object`: StringDictionary[YarnLockDep],
    `type`: String,
    dependencies: StringDictionary[YarnLockDep] = null
  ): Lockfile = {
    val __obj = js.Dynamic.literal(lockfileType = lockfileType.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lockfile]
  }
}

