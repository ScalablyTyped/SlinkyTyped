package typingsSlinky.snykComposerLockfileParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@snyk/composer-lockfile-parser/dist/errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  @js.native
  class InvalidUserInputError protected ()
    extends typingsSlinky.snykComposerLockfileParser.invalidUserInputErrorMod.InvalidUserInputError {
    def this(message: String) = this()
  }
  
  @js.native
  class ParseError protected ()
    extends typingsSlinky.snykComposerLockfileParser.parseErrorMod.ParseError {
    def this(message: String) = this()
  }
  
}

