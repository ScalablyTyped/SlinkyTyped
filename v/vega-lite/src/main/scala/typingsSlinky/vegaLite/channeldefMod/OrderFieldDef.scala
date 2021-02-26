package typingsSlinky.vegaLite.channeldefMod

import typingsSlinky.vegaLite.binMod.BinParams
import typingsSlinky.vegaLite.sortMod.SortOrder
import typingsSlinky.vegaLite.srcGuideMod.TitleMixins
import typingsSlinky.vegaLite.srcTypeMod.StandardType
import typingsSlinky.vegaLite.vegaLiteStrings.binned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderFieldDef[F /* <: Field */]
  extends FieldDefBase[F, Boolean | BinParams | binned | Null]
     with TitleMixins
     with TypeMixins[StandardType] {
  
  /**
    * The sort order. One of `"ascending"` (default) or `"descending"`.
    */
  var sort: js.UndefOr[SortOrder] = js.native
}
object OrderFieldDef {
  
  @scala.inline
  def apply[F /* <: Field */](): OrderFieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderFieldDef[F]]
  }
  
  @scala.inline
  implicit class OrderFieldDefMutableBuilder[Self <: OrderFieldDef[_], F /* <: Field */] (val x: Self with OrderFieldDef[F]) extends AnyVal {
    
    @scala.inline
    def setSort(value: SortOrder): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
