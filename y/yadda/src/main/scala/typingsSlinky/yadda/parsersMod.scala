package typingsSlinky.yadda

import typingsSlinky.yadda.featureFileParserMod.^
import typingsSlinky.yadda.featureParserMod.Options
import typingsSlinky.yadda.languageMod.Library
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib/parsers", JSImport.Namespace)
@js.native
object parsersMod extends js.Object {
  @js.native
  class FeatureFileParser () extends ^ {
    def this(language: typingsSlinky.yadda.languageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class FeatureParser ()
    extends typingsSlinky.yadda.featureParserMod.^ {
    def this(language: typingsSlinky.yadda.languageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class StepParser ()
    extends typingsSlinky.yadda.stepParserMod.^
  
}

