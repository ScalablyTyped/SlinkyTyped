package typingsSlinky.yadda

import typingsSlinky.yadda.featureFileParserMod.^
import typingsSlinky.yadda.featureParserMod.Options
import typingsSlinky.yadda.languageMod.Library
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parsersMod {
  
  @JSImport("yadda/lib/parsers", "FeatureFileParser")
  @js.native
  class FeatureFileParser () extends ^ {
    def this(language: typingsSlinky.yadda.languageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @JSImport("yadda/lib/parsers", "FeatureParser")
  @js.native
  class FeatureParser ()
    extends typingsSlinky.yadda.featureParserMod.^ {
    def this(language: typingsSlinky.yadda.languageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @JSImport("yadda/lib/parsers", "StepParser")
  @js.native
  class StepParser ()
    extends typingsSlinky.yadda.stepParserMod.^
}
