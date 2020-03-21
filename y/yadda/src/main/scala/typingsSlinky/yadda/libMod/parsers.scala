package typingsSlinky.yadda.libMod

import typingsSlinky.yadda.featureParserMod.Options
import typingsSlinky.yadda.languageMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib", "parsers")
@js.native
object parsers extends js.Object {
  @js.native
  class FeatureFileParser ()
    extends typingsSlinky.yadda.parsersMod.FeatureFileParser {
    def this(language: ^[typingsSlinky.yadda.languageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class FeatureParser ()
    extends typingsSlinky.yadda.parsersMod.FeatureParser {
    def this(language: ^[typingsSlinky.yadda.languageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class StepParser ()
    extends typingsSlinky.yadda.parsersMod.StepParser
  
}

