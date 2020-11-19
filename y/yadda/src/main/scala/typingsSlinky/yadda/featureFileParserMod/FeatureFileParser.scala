package typingsSlinky.yadda.featureFileParserMod

import typingsSlinky.yadda.featureParserMod.SpecificationExport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureFileParser extends js.Object {
  
  def parse(file: String): SpecificationExport = js.native
  def parse(file: String, next: js.Function1[/* specification */ SpecificationExport, Unit]): Unit = js.native
}
