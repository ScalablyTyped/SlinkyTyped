package typingsSlinky.snykComposerLockfileParser

import typingsSlinky.snykComposerLockfileParser.typesMod.ComposerParserResponse
import typingsSlinky.snykComposerLockfileParser.typesMod.SystemPackages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/composer-lockfile-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def buildDepTree(
    lockFileContent: String,
    manifestFileContent: String,
    defaultProjectName: String,
    systemVersions: SystemPackages
  ): ComposerParserResponse = js.native
  def buildDepTree(
    lockFileContent: String,
    manifestFileContent: String,
    defaultProjectName: String,
    systemVersions: SystemPackages,
    includeDev: Boolean
  ): ComposerParserResponse = js.native
  def buildDepTreeFromFiles(basePath: String, lockFileName: String, systemVersions: SystemPackages): ComposerParserResponse = js.native
  def buildDepTreeFromFiles(basePath: String, lockFileName: String, systemVersions: SystemPackages, includeDev: Boolean): ComposerParserResponse = js.native
}

