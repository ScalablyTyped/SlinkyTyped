package typingsSlinky.xmlCore

import typingsSlinky.xmlCore.typesMod.IConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core/dist/types/converters", JSImport.Namespace)
@js.native
object convertersMod extends js.Object {
  val XmlBase64Converter: IConverter[js.typedarray.Uint8Array] = js.native
  val XmlBooleanConverter: IConverter[Boolean] = js.native
  val XmlNumberConverter: IConverter[Double] = js.native
}

