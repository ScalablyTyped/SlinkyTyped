package typingsSlinky.yadda

import typingsSlinky.yadda.libLocalisationLanguageMod.Library
import typingsSlinky.yadda.libParsersFeatureFileParserMod.^
import typingsSlinky.yadda.libParsersFeatureParserMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib/parsers", JSImport.Namespace)
@js.native
object libParsersMod extends js.Object {
  @js.native
  class FeatureFileParser () extends ^ {
    def this(language: typingsSlinky.yadda.libLocalisationLanguageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class FeatureParser ()
    extends typingsSlinky.yadda.libParsersFeatureParserMod.^ {
    def this(language: typingsSlinky.yadda.libLocalisationLanguageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class StepParser ()
    extends typingsSlinky.yadda.libParsersStepParserMod.^
  
}

