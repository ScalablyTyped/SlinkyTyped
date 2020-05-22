package typingsSlinky.snykGradlePlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DepTree = typingsSlinky.snykCliInterface.commonMod.DepTree
  type Options = typingsSlinky.snykCliInterface.pluginMod.InspectOptions with typingsSlinky.snykGradlePlugin.mod.GradleInspectOptions
  type ProjectsDict = org.scalablytyped.runtime.StringDictionary[typingsSlinky.snykGradlePlugin.mod.GradleProjectInfo]
  type VersionBuildInfo = typingsSlinky.snykCliInterface.pluginMod.VersionBuildInfo
}
