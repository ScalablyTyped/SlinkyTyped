package typingsSlinky.yadda.mod

import typingsSlinky.yadda.featureParserMod.Options
import typingsSlinky.yadda.languageMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yadda", "parsers")
@js.native
object parsers extends js.Object {
  
  @js.native
  class FeatureFileParser ()
    extends typingsSlinky.yadda.libMod.parsers.FeatureFileParser {
    def this(language: ^[typingsSlinky.yadda.languageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class FeatureParser ()
    extends typingsSlinky.yadda.libMod.parsers.FeatureParser {
    def this(language: ^[typingsSlinky.yadda.languageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class StepParser ()
    extends typingsSlinky.yadda.libMod.parsers.StepParser
}
