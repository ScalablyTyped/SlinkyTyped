package typingsSlinky.snykNodejsLockfileParser

import typingsSlinky.snykNodejsLockfileParser.snykNodejsLockfileParserStrings.npm
import typingsSlinky.snykNodejsLockfileParser.snykNodejsLockfileParserStrings.yarn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-nodejs-lockfile-parser/dist/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class InvalidUserInputError protected ()
    extends typingsSlinky.snykNodejsLockfileParser.invalidUserInputErrorMod.InvalidUserInputError {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class OutOfSyncError protected ()
    extends typingsSlinky.snykNodejsLockfileParser.outOfSyncErrorMod.OutOfSyncError {
    def this(dependencyName: String, lockFileType: npm) = this()
    def this(dependencyName: String, lockFileType: yarn) = this()
  }
  
  @js.native
  class TreeSizeLimitError ()
    extends typingsSlinky.snykNodejsLockfileParser.treeSizeLimitErrorMod.TreeSizeLimitError
  
  @js.native
  class UnsupportedRuntimeError protected ()
    extends typingsSlinky.snykNodejsLockfileParser.unsupportedRuntimeErrorMod.UnsupportedRuntimeError {
    def this(args: js.Any*) = this()
  }
  
}

