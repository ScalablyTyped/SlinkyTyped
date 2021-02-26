package typingsSlinky.vegaLite.channeldefMod

import typingsSlinky.vegaLite.binMod.BinParams
import typingsSlinky.vegaLite.srcGuideMod.FormatMixins
import typingsSlinky.vegaLite.srcGuideMod.TitleMixins
import typingsSlinky.vegaLite.srcTypeMod.StandardType
import typingsSlinky.vegaLite.vegaLiteStrings.binned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringFieldDef[F /* <: Field */]
  extends FieldDefBase[F, Boolean | BinParams | binned | Null]
     with TitleMixins
     with TypeMixins[StandardType]
     with FormatMixins
object StringFieldDef {
  
  @scala.inline
  def apply[F /* <: Field */](): StringFieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringFieldDef[F]]
  }
}
