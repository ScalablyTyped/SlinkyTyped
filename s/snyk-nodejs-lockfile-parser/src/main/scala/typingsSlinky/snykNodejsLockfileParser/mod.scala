package typingsSlinky.snykNodejsLockfileParser

import typingsSlinky.snykNodejsLockfileParser.parsersMod.LockfileType
import typingsSlinky.snykNodejsLockfileParser.parsersMod.PkgTree
import typingsSlinky.snykNodejsLockfileParser.snykNodejsLockfileParserBooleans.`false`
import typingsSlinky.snykNodejsLockfileParser.snykNodejsLockfileParserStrings.npm
import typingsSlinky.snykNodejsLockfileParser.snykNodejsLockfileParserStrings.yarn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-nodejs-lockfile-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class InvalidUserInputError protected ()
    extends typingsSlinky.snykNodejsLockfileParser.errorsMod.InvalidUserInputError {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class OutOfSyncError protected ()
    extends typingsSlinky.snykNodejsLockfileParser.errorsMod.OutOfSyncError {
    def this(dependencyName: String, lockFileType: npm) = this()
    def this(dependencyName: String, lockFileType: yarn) = this()
  }
  
  @js.native
  class UnsupportedRuntimeError protected ()
    extends typingsSlinky.snykNodejsLockfileParser.errorsMod.UnsupportedRuntimeError {
    def this(args: js.Any*) = this()
  }
  
  def buildDepTree(manifestFileContents: String, lockFileContents: String): js.Promise[PkgTree] = js.native
  def buildDepTree(manifestFileContents: String, lockFileContents: String, includeDev: Boolean): js.Promise[PkgTree] = js.native
  def buildDepTree(
    manifestFileContents: String,
    lockFileContents: String,
    includeDev: Boolean,
    lockfileType: LockfileType
  ): js.Promise[PkgTree] = js.native
  def buildDepTree(
    manifestFileContents: String,
    lockFileContents: String,
    includeDev: Boolean,
    lockfileType: LockfileType,
    strict: Boolean
  ): js.Promise[PkgTree] = js.native
  def buildDepTree(
    manifestFileContents: String,
    lockFileContents: String,
    includeDev: Boolean,
    lockfileType: LockfileType,
    strict: Boolean,
    defaultManifestFileName: String
  ): js.Promise[PkgTree] = js.native
  def buildDepTreeFromFiles(root: String, manifestFilePath: String, lockFilePath: String): js.Promise[PkgTree] = js.native
  def buildDepTreeFromFiles(root: String, manifestFilePath: String, lockFilePath: String, includeDev: Boolean): js.Promise[PkgTree] = js.native
  def buildDepTreeFromFiles(root: String, manifestFilePath: String, lockFilePath: String, includeDev: Boolean, strict: Boolean): js.Promise[PkgTree] = js.native
  def getYarnWorkspaces(targetFile: String): js.Array[String] | `false` = js.native
  def getYarnWorkspacesFromFiles(root: js.Any, manifestFilePath: String): js.Array[String] | `false` = js.native
  @js.native
  object LockfileType extends js.Object {
    /* "npm" */ val npm: typingsSlinky.snykNodejsLockfileParser.parsersMod.LockfileType.npm with String = js.native
    /* "yarn" */ val yarn: typingsSlinky.snykNodejsLockfileParser.parsersMod.LockfileType.yarn with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.snykNodejsLockfileParser.parsersMod.LockfileType with String] = js.native
  }
  
  @js.native
  object Scope extends js.Object {
    /* "dev" */ val dev: typingsSlinky.snykNodejsLockfileParser.parsersMod.Scope.dev with String = js.native
    /* "prod" */ val prod: typingsSlinky.snykNodejsLockfileParser.parsersMod.Scope.prod with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.snykNodejsLockfileParser.parsersMod.Scope with String] = js.native
  }
  
}

