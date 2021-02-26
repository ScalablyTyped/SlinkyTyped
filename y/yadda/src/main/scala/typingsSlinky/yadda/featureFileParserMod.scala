package typingsSlinky.yadda

import typingsSlinky.yadda.featureParserMod.SpecificationExport
import typingsSlinky.yadda.languageMod.Library
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureFileParserMod {
  
  @JSImport("yadda/lib/parsers/FeatureFileParser", JSImport.Namespace)
  @js.native
  class ^ () extends FeatureFileParser {
    def this(language: typingsSlinky.yadda.languageMod.^[Library]) = this()
    def this(options: typingsSlinky.yadda.featureParserMod.Options) = this()
  }
  
  @js.native
  trait FeatureFileParser extends StObject {
    
    def parse(file: String): SpecificationExport = js.native
    def parse(file: String, next: js.Function1[/* specification */ SpecificationExport, Unit]): Unit = js.native
  }
  
  type Options = typingsSlinky.yadda.featureParserMod.Options
}
