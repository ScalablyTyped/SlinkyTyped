package typingsSlinky.yadda.libMod

import typingsSlinky.yadda.libLocalisationLanguageMod.^
import typingsSlinky.yadda.libParsersFeatureParserMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib", "parsers")
@js.native
object parsers extends js.Object {
  @js.native
  class FeatureFileParser ()
    extends typingsSlinky.yadda.libParsersMod.FeatureFileParser {
    def this(language: ^[typingsSlinky.yadda.libLocalisationLanguageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class FeatureParser ()
    extends typingsSlinky.yadda.libParsersMod.FeatureParser {
    def this(language: ^[typingsSlinky.yadda.libLocalisationLanguageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class StepParser ()
    extends typingsSlinky.yadda.libParsersMod.StepParser
  
}

