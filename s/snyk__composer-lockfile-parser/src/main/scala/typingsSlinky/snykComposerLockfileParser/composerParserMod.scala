package typingsSlinky.snykComposerLockfileParser

import typingsSlinky.snykComposerLockfileParser.typesMod.ComposerJsonFile
import typingsSlinky.snykComposerLockfileParser.typesMod.ComposerLockFile
import typingsSlinky.snykComposerLockfileParser.typesMod.DepTreeDependencies
import typingsSlinky.snykComposerLockfileParser.typesMod.LockFilePackage
import typingsSlinky.snykComposerLockfileParser.typesMod.PackageRefCount
import typingsSlinky.snykComposerLockfileParser.typesMod.SystemPackages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/composer-lockfile-parser/dist/parsers/composer-parser", JSImport.Namespace)
@js.native
object composerParserMod extends js.Object {
  @js.native
  class ComposerParser () extends js.Object
  
  /* static members */
  @js.native
  object ComposerParser extends js.Object {
    val MAX_PACKAGE_REPEATS: js.Any = js.native
    def buildDependencies(
      composerJsonObj: ComposerJsonFile,
      composerLockObj: ComposerLockFile,
      depObj: ComposerJsonFile,
      systemPackages: SystemPackages
    ): DepTreeDependencies = js.native
    def buildDependencies(
      composerJsonObj: ComposerJsonFile,
      composerLockObj: ComposerLockFile,
      depObj: ComposerJsonFile,
      systemPackages: SystemPackages,
      includeDev: Boolean
    ): DepTreeDependencies = js.native
    def buildDependencies(
      composerJsonObj: ComposerJsonFile,
      composerLockObj: ComposerLockFile,
      depObj: ComposerJsonFile,
      systemPackages: SystemPackages,
      includeDev: Boolean,
      isDevTree: Boolean
    ): DepTreeDependencies = js.native
    def buildDependencies(
      composerJsonObj: ComposerJsonFile,
      composerLockObj: ComposerLockFile,
      depObj: ComposerJsonFile,
      systemPackages: SystemPackages,
      includeDev: Boolean,
      isDevTree: Boolean,
      depRecursiveArray: js.Array[String]
    ): DepTreeDependencies = js.native
    def buildDependencies(
      composerJsonObj: ComposerJsonFile,
      composerLockObj: ComposerLockFile,
      depObj: ComposerJsonFile,
      systemPackages: SystemPackages,
      includeDev: Boolean,
      isDevTree: Boolean,
      depRecursiveArray: js.Array[String],
      packageRefCount: PackageRefCount
    ): DepTreeDependencies = js.native
    def buildDependencies(
      composerJsonObj: ComposerJsonFile,
      composerLockObj: ComposerLockFile,
      depObj: LockFilePackage,
      systemPackages: SystemPackages
    ): DepTreeDependencies = js.native
    def buildDependencies(
      composerJsonObj: ComposerJsonFile,
      composerLockObj: ComposerLockFile,
      depObj: LockFilePackage,
      systemPackages: SystemPackages,
      includeDev: Boolean
    ): DepTreeDependencies = js.native
    def buildDependencies(
      composerJsonObj: ComposerJsonFile,
      composerLockObj: ComposerLockFile,
      depObj: LockFilePackage,
      systemPackages: SystemPackages,
      includeDev: Boolean,
      isDevTree: Boolean
    ): DepTreeDependencies = js.native
    def buildDependencies(
      composerJsonObj: ComposerJsonFile,
      composerLockObj: ComposerLockFile,
      depObj: LockFilePackage,
      systemPackages: SystemPackages,
      includeDev: Boolean,
      isDevTree: Boolean,
      depRecursiveArray: js.Array[String]
    ): DepTreeDependencies = js.native
    def buildDependencies(
      composerJsonObj: ComposerJsonFile,
      composerLockObj: ComposerLockFile,
      depObj: LockFilePackage,
      systemPackages: SystemPackages,
      includeDev: Boolean,
      isDevTree: Boolean,
      depRecursiveArray: js.Array[String],
      packageRefCount: PackageRefCount
    ): DepTreeDependencies = js.native
    def getVersion(depObj: ComposerJsonFile): String = js.native
    def getVersion(depObj: LockFilePackage): String = js.native
  }
  
}

