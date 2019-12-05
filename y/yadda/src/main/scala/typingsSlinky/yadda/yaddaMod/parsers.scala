package typingsSlinky.yadda.yaddaMod

import typingsSlinky.yadda.libLocalisationLanguageMod.^
import typingsSlinky.yadda.libParsersFeatureParserMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda", "parsers")
@js.native
object parsers extends js.Object {
  @js.native
  class FeatureFileParser ()
    extends typingsSlinky.yadda.libMod.parsers.FeatureFileParser {
    def this(language: ^[typingsSlinky.yadda.libLocalisationLanguageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class FeatureParser ()
    extends typingsSlinky.yadda.libMod.parsers.FeatureParser {
    def this(language: ^[typingsSlinky.yadda.libLocalisationLanguageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class StepParser ()
    extends typingsSlinky.yadda.libMod.parsers.StepParser
  
}

