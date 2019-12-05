package typingsSlinky.streamDashJson

import typingsSlinky.streamDashJson.parserMod.ParserOptions
import typingsSlinky.streamDashJson.parserMod.^
import typingsSlinky.streamDashJson.streamDashJsonMod.ParserClass
import typingsSlinky.streamDashJson.streamDashJsonMod.ParserType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-json", JSImport.Namespace)
@js.native
object streamDashJsonMod extends js.Object {
  val Parser: ParserType = js.native
  def apply(): typingsSlinky.streamDashJson.streamDashJsonMod.Parser = js.native
  def apply(options: ParserOptions): typingsSlinky.streamDashJson.streamDashJsonMod.Parser = js.native
  def parser(): typingsSlinky.streamDashJson.streamDashJsonMod.Parser = js.native
  def parser(options: ParserOptions): typingsSlinky.streamDashJson.streamDashJsonMod.Parser = js.native
  type Parser = ParserClass
  type ParserClass = ^
  type ParserType = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias stream-json.stream-json.ParserType */ js.Object
}

